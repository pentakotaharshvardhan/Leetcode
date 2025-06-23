class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int n = (s.length() + k - 1) / k;
        String[] ans=new String[n];
        //System.out.println(n);
        int i = 0;
        while (i < s.length()) {
            int end = Math.min(i + k, s.length());
            StringBuilder group = new StringBuilder(s.substring(i, end));
            while (group.length() < k) {
                group.append(fill);
            }
            result.add(group.toString());
            i += k;
        }
        //System.out.println(result);
        for(int j=0;j<result.size();j++){
            ans[j]=result.get(j);
        }

        return ans;
    }
}