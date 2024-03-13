#include<stdio.h>

struct pcb {
    int at, bt, priority, ct, tat, wt, pid; 
};

void pline(int x); 

int main() {
    int i, num, j;
    int avg_tat = 0, avg_wt = 0;
    struct pcb p[10], temp;
    
    printf("Enter the total number of processes: ");
    scanf("%d", &num);
    
    
    for (i = 0; i < num; i++) { 
        printf("Enter Arrival time, Burst time, and Priority for process %d : ", i + 1);
        scanf("%d %d %d", &p[i].at, &p[i].bt, &p[i].priority);
        p[i].pid = i + 1;
    }

    
    for (i = 0; i < num - 1; i++) {
        for (j = 0; j < num - i - 1; j++) {
            if (p[j].at > p[j + 1].at) {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    
    for (i = 0; i < num - 1; i++) {
        for (j = 0; j < num - i - 1; j++) {
            if (p[j].at == p[j + 1].at && p[j].priority > p[j + 1].priority) {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    
    for (i = 0; i < num; i++) {
        p[i].ct = (i == 0) ? p[i].at + p[i].bt : (p[i].at > p[i - 1].ct) ? p[i].at + p[i].bt : p[i - 1].ct + p[i].bt;
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt = p[i].tat - p[i].bt;
        avg_tat += p[i].tat;
        avg_wt += p[i].wt;
    }

   printf("Priority -Non Preemptive\n");
    pline(83);
    printf("PID\tArrival\tBurst\tPriority\tCompilation\tTurnaround\tWait\n");
    pline(83);
    for (i = 0; i < num; i++) {
        printf("%d\t%d\t%d\t%d\t\t%d\t\t%d\t\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].priority, p[i].ct, p[i].tat, p[i].wt);
    }

    pline(83);
    printf("\nAverage Turnaround Time : %.2f", (float)avg_tat / num);
    printf("\nAverage Wait Time : %.2f\n", (float)avg_wt / num);

    return 0;
}

void pline(int x) {
    for (int k = 0; k < x; k++) {
        printf("-");
    }
    printf("\n");
}

