package LeetCode;
import java.util.Arrays;

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int e= numbers.length-1;        //here e-->is end of array
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]+numbers[e]==target){
                numbers=new int[2];
                numbers[0]=i+1;         //first number position
                numbers[1]=e+1;         //second number position
                break;
            }
            else if(numbers[i]+numbers[e]>target) {
                e--;        //if(target is lower than second number position will decreases by one
                i--;        //starting position remains same for loop
            }
        }
        return numbers;
    }
}

public class Medium167 {
    public static void main(String[] args) {
        int[] k = {3,24,50,79,88,150,345};
        int a = 200;
        Solution167 obj = new Solution167();
        System.out.println(Arrays.toString(obj.twoSum(k, a)));
    }
}
