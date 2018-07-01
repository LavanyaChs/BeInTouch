#include <stdio.h>
//Insertion sort in C
//O(n^2) ; Omega(n^2)
int main()
{
    int n = 0;
    int i,j,key,array[50];
    int counter = 0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    printf("Before Sort : ");
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
    for(j=1;j<n;j++){
        key = array[j];
        i= j-1;
        while(i>=0 && key<array[i]){
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = key;
    }
    printf("\nSorted List ");
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
    return 0;
}
/* 
Input 1:
5
5 3 6 0 2
Output 1:
Before Sort : 5 3 6 0 2 
Sorted List 0 2 3 5 6 
Input 2:
9
9 6 5 0 8 2 7 1 3
Output 2:
Before Sort : 9 6 5 0 8 2 7 1 3 
Sorted List 0 1 2 3 5 6 7 8 9
*/
