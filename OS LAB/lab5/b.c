#include<stdio.h>
struct Process {
    int pid;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
};

int main() {
    int i, j, temp = 0, n = 5;
    struct Process p[5]; 
    int atarr[] = {0, 1, 2, 4, 3};
    int btarr[] = {2, 5, 7, 12, 6};

    for (i = 0; i < n; i++) {
        p[i].pid = i + 1;
    }

    for (i = 0; i < n; i++) {
        for (j = 0; j < (n - i - 1); j++) {
            if (atarr[j] > atarr[j + 1]) {
                temp = atarr[j + 1];
                atarr[j + 1] = atarr[j];
                atarr[j] = temp;

                temp = btarr[j + 1];
                btarr[j + 1] = btarr[j];
                btarr[j] = temp;

                temp = p[j + 1].pid;
                p[j + 1].pid = p[j].pid;
                p[j].pid = temp;
            }
        }
    }



    
    return 0;
}
