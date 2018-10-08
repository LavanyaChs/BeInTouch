#include<stdio.h>
//int a[8] = {9,6,5,0,8,2,4,7};
int a[8] = {7,1,-2,2,-7,4,4,5};

int partition(int l,int h){
    int pivote = a[h];
    int i = l-1;
    for(int j=l;j<h;j++){
        if(a[j]<=pivote){
            i++;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    int t1 = a[i+1];
    a[i+1] =a[h];
    a[h] = t1;
    
    return i+1;
    
}
void QuickSort(int low,int high){
    if(low<high){
        int j  = partition(low,high);
    
    QuickSort(low,j-1);
    QuickSort(j+1,high);
    }
    
    }


int main(){
    for(int p = 0;p<8;p++){
        printf("%d ", a[p]);
    }
    int startIndex = 0;
    int endIndex = 7;
    QuickSort(startIndex,endIndex);
    printf("\nAfter");
    for(int p = 0;p<8;p++){
        printf("%d ", a[p]);
    }
    return 0;
}

/*
o/p:
7 1 -2 2 -7 4 4 5 
After-7 -2 1 2 4 4 5 7 
*/