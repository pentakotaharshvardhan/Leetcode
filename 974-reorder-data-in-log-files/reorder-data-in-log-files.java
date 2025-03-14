class Solution {
    public String[] reorderLogFiles(String[] logs) {
        String[] ans = new String[logs.length];
        List<List<String>> alpha = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String str : logs) {
            if (!Character.isDigit(str.charAt(str.length() - 1))) {
                String[] arr = str.split(" ", 2);
                List<String> st = new ArrayList<>();
                st.add(arr[0]);
                st.add(arr[1]);
                alpha.add(st);
            } else {
                digitLogs.add(str);
            }
        }

        Collections.sort(alpha, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> a, List<String> b) {
                if (!a.get(1).equals(b.get(1))) return a.get(1).compareTo(b.get(1));
                return a.get(0).compareTo(b.get(0));
            }
        });

        int i = 0;
        for (List<String> log : alpha) ans[i++] = log.get(0) + " " + log.get(1);
        for (String log : digitLogs) ans[i++] = log;

        return ans;
    }
}
