#include <stdio.h>
int array[] = {12, 11, 13, 5, 6, 7};
void merge(int array[],int p,int q,int r){
    //p to q are sorted and q+1 to r are sorted
    int sizeOfListOne = q-p+1;
    int sizeOfListTwo = r-q;
    int indexi=0,indexj=0,indexk=p;
    int leftList[sizeOfListOne];
    int rightList[sizeOfListTwo];
    for(indexi = 0 ; indexi<sizeOfListOne;indexi++){//copy 1st sorted part to sublist one
        leftList[indexi] = array[p+indexi];
    }
    for(indexi = 0 ;indexi<sizeOfListTwo;indexi++){//copy 2nd soretd part to sublist two
        rightList[indexi] = array[q+indexi+1];
    }
    indexi=0,indexj=0;indexk=p;
    while(indexi < sizeOfListOne &&  indexj < sizeOfListTwo ){
        if(leftList[indexi]<=rightList[indexj]){
            array[indexk] = leftList[indexi];
            indexi++;
        }
        else{
            array[indexk] = rightList[indexj];
            indexj++;
        }
        indexk++;
    }
    while(indexi<sizeOfListOne){  //copy remaining elements left after comparision
        array[indexk] = leftList[indexi];
        indexk++;indexi++;//All elements left here are greater than all other elements
    }
    while(indexj<sizeOfListTwo){
        array[indexk] = rightList[indexj];
        indexk++;indexj++;
    }
}

void mergeSort(int array[],int start,int end){
    int middle;
    if(start<end){
        middle= (start+end)/2;
        mergeSort(array,start,middle);
        mergeSort(array,middle+1,end);
        merge(array,start,middle,end);
    }
}

int main()
{
    int index;
    printf("\nBefore sort\n");
    for(index =0;index<6;index++){
        printf("%d ",array[index]);
    }
    printf("\nAfter sort\n");
    mergeSort(array,0,5); // array , startindex  ,endindex
    for(index =0;index<6;index++){
        printf("%d ",array[index]);
    }
}


/*
Before sort
12 11 13 5 6 7 
After sort
5 6 7 11 12 13
*/