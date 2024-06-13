//Leetcode problem link:- https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return digit(num)%2==0;
    }

    static int digit(int num) {
        if(num<0){
            num = num*-1;
        }
//        int digitCount = 0;
//        while(num>0){
//            digitCount++;
//            num = num/10;
//        }

//        return digitCount;
        return (int)(Math.log10(num)+1);
    }
}
