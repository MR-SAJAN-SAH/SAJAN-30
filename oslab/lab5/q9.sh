#!/bin/bash

# Execute the "ps -ef" command and capture its output
ps_ef_output=$(ps -ef)

# Execute the "ps -ux" command and capture its output
ps_ux_output=$(ps -ux)

# Find the process whose parent ID is 2 in the "ps -ef" output
process_details_ef=$(echo "$ps_ef_output" | awk '$3 == 2')

# Find the process whose parent ID is 2 in the "ps -ux" output
process_details_ux=$(echo "$ps_ux_output" | awk '$3 == 2')

# Display the process details
echo "Process details whose parent ID is 2 (from ps -ef output):"
echo "$process_details_ef"

echo "Process details whose parent ID is 2 (from ps -ux output):"
echo "$process_details_ux"

