#include<stdio.h>

struct pcb {
    int at, bt, tat, pid;
};

void pline(int x);

int main() {
    int i, num, j;
    int avg = 0, sum = 0;
    struct pcb p[10], temp;
    
    printf("Enter the total number of processes: ");
    scanf("%d", &num);
    
    for (i = 0; i < num; i++) { 
        printf("Enter Arrival time and Burst time for process %d : ", i + 1);
        scanf("%d %d", &p[i].at, &p[i].bt);
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

    for (i = 0; i < num; i++) {
        sum += p[i].bt;
        p[i].tat = sum - p[i].at; 
    }

    sum = 0;
    pline(44);
    printf("PID\tArrival\tBurst\tTurnAround\n");
    pline(44);
    for (i = 0; i < num; i++) {
        printf("%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].tat);
        sum += p[i].tat;
    }

    pline(44);
    avg = sum / num;
    printf("\nTotal TurnAround Time : %.2f", sum); 
    printf("\nAverage TurnAround Time : %.3f", avg);

    return 0;
}

void pline(int x) {
    for (int k = 0; k < x; k++) {
        printf("-");
    }
    printf("\n");
}
