package DivideAndConquer;

public class MaxSubArray {
    static double[] MaxCrossingArray(int a[],int l,int mid,int h){
        Double rightsum = Double.NEGATIVE_INFINITY ;
        Double leftsum = Double.NEGATIVE_INFINITY ;
        double maxleft=0,maxright=h;
        double sum=0;
        for(int i=mid;i>=l;i--){
            sum=sum+a[i];
            if(sum>leftsum){
                leftsum=sum;
                maxleft=i;
            }
        }

        double rsum=0;
        for(int j=(mid+1);j<=h;j++){
            rsum=rsum+a[j];
            if(rsum>rightsum){
                rightsum=rsum;
                maxright=j;
            }
        }
        double[] ans = new double[3];
        ans[0]=maxleft;
        ans[1]=maxright;
        ans[2]=leftsum+rightsum;
    return ans;


    }

    static double[] MaxArray(int a[],int l, int h){
        double[] ans= new double[3];
        double[] left= new double[3];
        double[] right= new double[3];
        double[] cross= new double[3];
        if (h==l){
            ans[0]=l;
            ans[1]=h;
            ans[2]=a[l];
            return ans;
        }
       else{
           int mid=(l+h)/2;
           left=MaxArray(a,l,mid);
           right=MaxArray(a, mid+1, h);
           cross=MaxCrossingArray(a,l,mid,h);
           if(left[2]>=right[2] && left[2]>=cross[2] ){
            return left;
           }
           else if(right[2]>=left[2] && right[2]>=cross[2]){
            return right;
           }
           else{
               return cross;
           }

       }
    }
    public static void main(String[] args){
        int[] array= {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        double[] result = new double[3];
        int l=0,h=array.length;
        result=MaxArray(array,l,h-1);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);


    }
}