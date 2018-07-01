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
        if(counter==0){
            printf("\nAlready List is sorted");
            //optimizing code comparisions
            break;
        }
    }
    printf("\nSorted List");
    for(i=0;i<n;i++){
        printf("%d ",array[i]);
    }
    return 0;
}