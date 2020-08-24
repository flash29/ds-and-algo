package Sorting;
public class UsingSort {
    public static void main(String[] args){
     //Initialising Variables
        int a[] ={5,2,4,6,1,3,2,5,3};
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


   // 3. For Using Heap sort
        HeapSort hs = new HeapSort();
        hs.HeapSorting(a);
        System.out.println("Sorted Using heap Sort");
        hs.Display(a, n);

    // 4. For using quick sort
        QuickSort q1= new QuickSort();
        int l=0;
        int h=n-1;
        q1.Partition(a, l, h);
        System.out.println("Sorted Using Quick Sort");
        q1.Display(a, n);

    // 5. Selection Sort

        SelectionSort ss= new SelectionSort();
        System.out.println("Sorted Using Selection Sort");
        ss.Sorting(a, n);
        ss.Display(a, n);

    // 6. Quick Sort
        BubbleSort bs = new BubbleSort();
        System.out.println("Sorted Using bubble Sort");
        bs.Sorting(a);
        bs.Display(a, n);

        CountingSort cs = new CountingSort();
        System.out.println("Sorted Using Counting Sort");
        cs.Sorting(a);
        cs.Display(a, n);


    }

}
