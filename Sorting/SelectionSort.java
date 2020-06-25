package Sorting;
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