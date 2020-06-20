package Sorting;
public class UsingSort {
    public static void main(String[] args){
     //Initialising Variables
        int a[] ={5,2,4,6,1,3};
        int n=(a.length);
   
   //    1. FOR USING INSERTION SORT AND INSERTION SORT IN REVERSE ORDER
           InsertionSort IS = new InsertionSort();
           System.out.println("Sorted Using insertion Sort");
           IS.sort(a);
           System.out.println("Sorted Using insertion Sort in reverse order");
          IS.SortReverse(a);

   //  2.    For using merge sort

        MergeSort ms = new MergeSort();
        ms.merge(a,0,n-1);
        System.out.println("Sorted Using Merge Sort");
        ms.Display(a,n-1);
        

        // For Using Heap sort 
        HeapSort hs = new HeapSort();
        hs.HeapSorting(a);
        System.out.println("Sorted Using heap Sort");
        hs.Display(a, n);

        // For using quick sort
        QuickSort q1= new QuickSort();
        int l=0;
        int h=n-1;
        q1.Partition(a, l, h);
        System.out.println("Sorted Using Quick Sort");
        q1.Display(a, n);

    }
    
}
