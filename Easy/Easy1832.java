package LeetCode;

import java.util.HashSet;

class Solution1832 {
    public boolean checkIfPangram(String sentence) {
//        HashSet check=new HashSet<>();
//        int sum=2847;
//        for (int k: sentence.toCharArray()){
//            if(!check.contains(k)) {
//                check.add(k);
//                sum -= k;
//                if(sum==0)
//                    return true;
//            }
//        }
//        return false;

        HashSet alphabet = new HashSet();
        for (int i : sentence.toCharArray())
            if (alphabet.add(i))
//                above code automatically add distinct alphabets,
//                also if distinct alphabet is added then
//                it will enter the if-condition and checks if total size of set is 26 or not
//                if size is 26 that means all 26 characters of english alphabets are present
//                if not then after loop ends then it will return false
                if (alphabet.size() == 26)
                    return true;
        return false;

//        return sentence.chars().distinct().count()==26;

    }
}

public class Easy1832 {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydoo";
        Solution1832 obj = new Solution1832();
        System.out.println(obj.checkIfPangram(s));
    }
}
