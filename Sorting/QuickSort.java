//package Sorting;

public class QuickSort {
    void Partition(final int arr[], final int l, final int h) {
        int q;
        if(l<h){
        q = QuickSorting(arr, l, h);
        Partition(arr, l, q-1);
        Partition(arr, q + 1, h);
        }
    }

    int QuickSorting(final int arr[], final int l, final int h) {
        final int x = arr[h];
        int temp;
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] <= x) {
                i = i + 1;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i + 1;
    }



    void Display(final int a[], final int n) {
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}