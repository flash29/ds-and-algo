package Sorting;

class CountingSort{
  void Sorting(int a[]){
    int n= a.length;
    int k=0;
    for (int i=0;i<n;i++){
      if(a[i]>k){
        k=a[i];
      }
    }
    int[] b= new int[n];
    int[] c= new int[k+1];
    //initialising c to 0
    for(int i=0;i<k;i++){
      c[i]=0;
    }
    //counting the number of elements of a[i] in i
    for(int i=0;i<k;i++){
      c[a[i]]=c[a[i]]+1;
    }
    //for the number of elemnets smaller than or equal to the number i
    for(int i=1;i<k;i++){
      c[i]=c[i]+c[i-1];
    }

    for(int i=n-1;i>=0;i--){
      b[c[a[i]]]=a[i];
      c[a[i]]=c[a[i]]-1;
    }

  }
  void Display(int a[], int n){
      for(int i=0;i<n;i++){
          System.out.println(a[i]);
      }
  }
}
