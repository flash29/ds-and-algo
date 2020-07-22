package DivideAndConquer;

public class BinarySearch {
    static int index=-1;
    static int FindKey(int[] a,int l,int h,int k){
        int mid=(l+h)/2;
        
        if(a[mid]==k){
            index=mid;
        }
        else if(k>a[mid]){
            FindKey(a,mid+1,h,k);
        }
        else{
            FindKey(a,l,mid,k);
        }
        return index;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i;
        int x=7;
        int l=0,h=10;
        i=FindKey(arr,l,h,x);
        System.out.println(i);
    }
}