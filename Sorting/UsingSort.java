
public class UsingSort {
    public static void main(String[] args){
     
        int a[] ={5,2,4,6,1,3};
        int n=(a.length);
    /*
       1. FOR USING INSERTION SORT AND INSERTION SORT IN REVERSE ORDER
           InsertionSort IS = new InsertionSort();
           IS.sort(a);
          IS.SortReverse(a);
        */

        /*
     2.    For using merge sort

        MergeSort ms = new MergeSort();
        
     
        ms.merge(a,0,n-1);
        ms.Display(a,n-1);
        */

        // For Using Heap sort 
       // HeapSort hs = new HeapSort();
        //hs.HeapSorting(a);
        //hs.Display(a, n);

        QuickSort q1= new QuickSort();
        int l=0;
        int h=n-1;
        q1.Partition(a, l, h);
        q1.Display(a, n);

    }
    
}
