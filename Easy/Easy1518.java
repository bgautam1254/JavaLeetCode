package LeetCode;

class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles, c;
        while(numBottles>=numExchange){
            c=numBottles%numExchange;
            numBottles/=numExchange;
            sum+=numBottles;
            numBottles+=c;
        }
        return sum;
    }
}
public class Easy1518 {
    public static void main(String[] args) {
        int a=9,b=3;
        Solution1518 obj = new Solution1518();
        System.out.println(obj.numWaterBottles(a,b));
    }
}