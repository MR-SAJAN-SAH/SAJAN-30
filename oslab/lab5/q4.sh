#!/bin/bash

# Check if the user provided a parent process ID
if [ -z "$1" ]; then
    echo "Usage: $0 <parent_process_id>"
    exit 1
fi

parent_pid="$1"
echo "Child processes of parent process $parent_pid:"

# Iterate over each process directory in /proc
for pid_dir in /proc/*/; do
    pid=$(basename "$pid_dir")
    
    # Skip non-numeric directories
    if ! [[ "$pid" =~ ^[0-9]+$ ]]; then
        continue
    fi
    
    # Get the parent process ID of the current process
    ppid=$(awk '$1 == "PPid:" {print $2}' "$pid_dir/status" 2>/dev/null)
    
    # If the parent process ID matches the given parent PID, print the child process ID
    if [ "$ppid" -eq "$parent_pid" ]; then
        echo "- Child process: $pid"
    fi
done

