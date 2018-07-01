#include <stdio.h>

int main()
{
    int n = 0;
    int i,j,temp,array[50];
    int counter = 0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
    for(i=(n-1);i>0;i--){
        counter = 0;
        for(j=0;j<(i);j++){
            if(array[j+1]<array[j]){
                counter++;
                temp = array[j];
                array[j] = array[j+1];
                array[j+1]=temp;
            }
        }
        if(counter==0 && i==(n-1)){
            printf("\nAlready List is sorted");
            break;
        }
    }
    printf("\nSorted List");
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
    return 0;
}
/* 
Input 1:
14
3 4 3 2 45 29 39 0 8 4 3 28 76 11
Output 1:
3 4 3 2 45 29 39 0 8 4 3 28 76 11 
Sorted List0 2 3 3 3 4 4 8 11 28 29 39 45 76 
Input 2:
5
5 7 33 56 88
Output 2:
5 7 33 56 88 
Already List is sorted
Sorted List5 7 33 56 88 
*/
