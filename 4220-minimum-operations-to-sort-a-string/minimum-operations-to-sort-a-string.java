class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n == 1) return 0;
        if(n == 2) return s.charAt(0) > s.charAt(1) ? -1 : 0;
        char min = 'z', max = 'a', first = s.charAt(0), last = s.charAt(n - 1), prev = 'a';
        int[] cnt = new int[26];
        boolean flag = true;
        for(char c : s.toCharArray()){
            flag = prev > c ? false : flag;
            min = min > c ? c : min;
            max = max < c ? c : max;
            prev = c;
            cnt[c - 'a']++;
        }
        if(flag) return 0;
        if(first == min || last == max) return 1;
        if(first == max && last == min){
            if(cnt[max - 'a'] > 1 || cnt[min - 'a'] > 1) return 2;
            return 3;
        }
        return 2;
    }
}