//package Sorting;
public class HeapSort {

    // Returns the left node of a parent node i
    int Left(int i){return 2*i;}

    // Returns the Right node of a parent node i
    int Right(int i){return 2*i+1;}

    // This function makes sure that the Max Heap rule is Satisfied
    void MaxHeapify(int a[],int i,int heapsize){
        int l,r;
        int largest,temp;
        l=Left(i);
        r=Right(i);
        if (l<=heapsize && a[l]>a[i]){
            largest=l;
        }
        else{
            largest=i;
        }
        if(r<=heapsize && a[r]>a[largest]){
            largest=r;
        }
        if(largest!=i){
            temp=a[largest];
            a[largest]=a[i];
            a[i]=temp;
            MaxHeapify(a,largest,heapsize);
        }
    }

    // This function buils the max heap
    void BuildMaxHeap(int a[]){
        int n=a.length-1;
        int heapsize=n;
        for(int i=n/2;i>=0;i--){
            MaxHeapify(a, i, heapsize);
        }
    }

    // Here we build the max heap and sort the elements in an array by swaping the first element of the array
    // (which is the max element as we built a max heap ) to the last element of the array and check if the rest of the array
    // (size of heap) satisfies the max heap condition
    void HeapSorting(int a[]){

        BuildMaxHeap(a);
        
        int n= a.length-1;
        int heapsize=n;
        for(int i=n;i>0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapsize=heapsize-1;
            MaxHeapify(a, 0, heapsize);

        }
    }

    // to display all the values in the array
    void Display(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }


}
