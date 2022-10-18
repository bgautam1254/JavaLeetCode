package LeetCode;

class Solution69 {
    public int mySqrt(int x) {
//        int[] a=new int[5];
//        int k=0,ans=0,n=-1,l=0,p,q;
//
//        for(int i=0;i<=4;i++){
//            a[i]=x%100;
//            n++;
//            x =x/100;
//            if(x<100){
//                a[i+1]=x;
//                l=a[i+1];
//                n++;
//                break;
//            }
//        }
//
//        for(int i=n;i>=0;i--)
//            for (int j = 9; j >= 0; j--) {
//                p = (10 * k) + j;
//                q=p*j;
//                if (q <= l) {
//                    l = l - q;
//                    k = p + j;
//                    ans = ans * 10 + j;
//                    if (i == 0) return ans;
//                    else {
//                        l = (l * 100) + a[i - 1];
//                        break;
//                    }
//                }
//            }
//        return ans;

        int a=x,b=x,c=0;
        a=b/2;
        while(0<x){
            if(a*a>x) {
                c = a;
                a = b / 2;
            }
            else if (a*a<x)
                a=c--;
            else
                return c;
        }

        return c;
    }
}
public class Easy69 {
    public static void main(String[] args) {
        int x=8123543;
        Solution69 obj = new Solution69();
        System.out.println(obj.mySqrt(x));
    }
}
