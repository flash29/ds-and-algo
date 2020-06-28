package Sorting;
//repeatedley swapping adjacent elements that are out of order 
public class BubbleSort {
   void Sorting(int a[]){
       int n= a.length;
        for(int i=0;i<n-2;i++){
            for(int j=n-1;j>=i+1;j--){
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
   }
   void Display(int a[],int n) {
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }
} 
}