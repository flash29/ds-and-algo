package Sorting;
// finding the smallest element in the list and swapping it with A[0] and sencond smallest with a[1] and so on...
public class SelectionSort {
    void Sorting(int a[],int n){
        int index=-1,temp;
        for(int j=0;j<n;j++){
            index=j;
            int min=a[j];
            for(int i=j+1;i<n;i++){
                if(a[i]<min){
                    index=i;
                    min =a[i];
                }
            }
            temp=a[j];
            a[j]=a[index];
            a[index]=temp;
        }
    }
    void Display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }   
    }
}