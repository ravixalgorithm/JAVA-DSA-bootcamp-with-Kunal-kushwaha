public class maxWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            int sum = 0;
            for(int acc = 0; acc<accounts[person].length; acc++){
                sum += accounts[person][acc];
            }
            if(sum>max){
                max = sum;
            }
        }

        return max;
    }
}
