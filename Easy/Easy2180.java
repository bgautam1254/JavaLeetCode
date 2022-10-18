package LeetCode;

import java.util.ArrayList;

class Solution2180 {
    //    int n=0;
//    public int odd(int k){
//        while(k>0) {
//            if (k % 2 == 1)
//                n++;
//            k--;
//        }
//        return n;
//    }
//    public int even(int k){
//        while(k>1) {
//            if (k % 2 == 0)
//                n++;
//            k--;
//        }
//        return n;
//    }
//    public int even0(int k){
//        while(k>-1) {
//            if (k % 2 == 0)
//                n++;
//            k--;
//        }
//        return n;
//    }
    public int countEven(int num) {
////        1-e
////        2-oo,ee
////        3-eee,eoo,oeo,ooe
//        int ans=0;
//        ArrayList<Integer> ss=new ArrayList<>();
//        if(num==1000)
//            num = 998;
//        while(num>0){
//            ss.add(num%10);
//            num/=10;
//        }
//        System.out.println(ss);
//        if(ss.size()==1)
//            ans= even(num);
//
//        else if (ss.size()==2) {
//            if(ss.get(1)%2==1 && ss.get(0)%2==1)
//                ans= odd(ss.get(1))*odd(ss.get(0));
//            else if(ss.get(1)%2==0 && ss.get(0)%2==0)
//                ans= even(ss.get(1))*even0(ss.get(0));
//        }
//
//        else if (ss.size()==3) {
//            if(ss.get(2)%2==0 && ss.get(1)%2==0 && ss.get(0)==0)
//                ans= even0(ss.get(2))*even0(ss.get(1))*even(ss.get(0));
//
//            else if(ss.get(2)%2==0 && ss.get(1)%2==1 && ss.get(0)==1)
//                ans= even0(ss.get(2))*odd(ss.get(1))*odd(ss.get(0));
//
//            else if(ss.get(2)%2==1 && ss.get(1)%2==0 && ss.get(0)==1)
//                ans= odd(ss.get(2))*even0(ss.get(1))*odd(ss.get(0));
//
//            else if(ss.get(2)%2==1 && ss.get(1)%2==1 && ss.get(0)==0)
//                ans= odd(ss.get(2))*odd(ss.get(1))*even(ss.get(0));
//        }
//        return ans;

        String a;
        int n = 0;
        while (num > 0) {
            a = Integer.toString(num);
            if (a.matches("[02468]{1,3}"))
                n++;
            else if (a.matches("[13579][13579][02468]{0,1}"))
                n++;
            else if (a.matches("[02468][13579][13579]"))
                n++;
            else if (a.matches("[13579][02468][13579]"))
                n++;
            num--;
        }
        return n;
    }
}

public class Easy2180 {
    public static void main(String[] args) {
        int num = 30;
        Solution2180 obj = new Solution2180();
        System.out.println(obj.countEven(num));
    }
}
