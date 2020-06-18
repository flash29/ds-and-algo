//package Sorting;
public class InsertionSort {
    //sorting in increasing order
    void sort(int a[]){
        int n= a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        //printing the sorted array
        System.out.println("The sorted increasing order is :");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
// sorting in decreasing order
    void SortReverse(int a[]){
        int n= a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]<key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        //printing the sorted array
        System.out.println("The sorted decreasing order is :");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
