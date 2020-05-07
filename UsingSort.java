public class UsingSort {
    public static void main(String[] args){
     
        int a[] ={5,2,4,6,1,3};
    // FOR USING INSERTION SORT AND INSERTION SORT IN REVERSE ORDER
         //   InsertionSort IS = new InsertionSort();
         //  IS.sort(a);
        //  IS.SortReverse(a);

        MergeSort ms = new MergeSort();
        int n=(a.length);
     
        ms.merge(a,0,n-1);
        ms.Display(a,n-1);

    }
    
}