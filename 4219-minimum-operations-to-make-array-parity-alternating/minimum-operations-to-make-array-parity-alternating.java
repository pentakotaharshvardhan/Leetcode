class Solution {

    private int[] solve(int[] nums, boolean even) {

        int op = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int num : nums){

            if((num % 2 != 0 && even) || (num % 2 == 0 && !even)){
                op++;
                maxi = Math.max(maxi, num - 1);
                mini = Math.min(mini, num + 1);
            } 
            else{
                maxi = Math.max(maxi, num);
                mini = Math.min(mini, num);
            }

            even = !even;
        }

        return new int[]{op, maxi - mini};
    }

    public int[] makeParityAlternating(int[] nums) {

        int n = nums.length;

        // Case when n == 1
        if(n == 1) return new int[]{0, 0};

        // Case when all numbers are same
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        if(set.size() == 1){
            return new int[]{n / 2, 1};
        }

        int[] res1 = solve(nums, false);
        int[] res2 = solve(nums, true);

        if(res1[0] == res2[0]){
            return res1[1] < res2[1] ? res1 : res2;
        }

        return res1[0] < res2[0] ? res1 : res2;
    }
}