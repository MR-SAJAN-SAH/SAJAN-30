#!/bin/bash

echo "Enter the process ID:"
read process_id

# Check if the provided process ID is valid
if ! ps -p "$process_id" > /dev/null; then
    echo "Process with ID $process_id does not exist."
    exit 1
fi

echo "Process hierarchy of process with ID $process_id:"

# Start with the specified process ID
current_process_id=$process_id

# Loop until reaching the parent process with ID 1
while [ "$current_process_id" -ne 1 ]; do
    # Display the details of the current process
    ps -p "$current_process_id" -o pid,ppid,cmd --no-headers

    # Get the parent process ID of the current process
    parent_process_id=$(ps -o ppid= -p "$current_process_id")

    # Update the current process ID to the parent process ID
    current_process_id=$parent_process_id
done

