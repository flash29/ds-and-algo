public class MergeSort {
    
    
    void merge(int a[],int leftstart,int rightend){
        
        if(leftstart<rightend){
            int m= (leftstart+rightend)/2;
       
        merge(a,leftstart,m);
        merge(a,m+1,rightend);
        merge1(a,leftstart,rightend,m);
        }
        
        
    }
    void merge1(int a[],int leftstart,int rightend,int m){
          int n1= m-leftstart+1;
          int n2 =rightend-m;
          int[] l = new int[n1];
          int[] r = new int[n2];
          
          for(int i=0;i<n1;++i){
              l[i]=a[leftstart+i];
          }
          for(int i=0;i<n2;++i){
            r[i]=a[m+1+i];
        }

        int i=0,j=0,k=leftstart;
        while(i<n1 && j<n2){
                if(l[i]<=r[j]){
                    a[k]=l[i];
                    i++;
                    k++;
                }
                else{
                    a[k]=r[j];
                    j++;
                    k++;
                }
        }
        while(i<n1){
                a[k]=l[i];
                i++;
                k++;

        }

        while(j<n2){
            a[k]=r[j];
            j++;
            k++;
            
    }

    }

    void Display(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}