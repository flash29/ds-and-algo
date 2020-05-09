public class HeapSort {

    int Left(int i){return 2*i;}

    int Right(int i){return 2*i+1;}

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

    void BuildMaxHeap(int a[]){
        int n=a.length-1;
        int heapsize=n;
        for(int i=n/2;i>=0;i--){
            MaxHeapify(a, i, heapsize);
        }
    }

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

    void Display(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }


}