class Solution {
        public String decodeString(String s) {
        Stack<String> stk = new Stack<>();
        Stack<Integer> no = new Stack<>();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                n = n * 10 + (ch - '0');
            } else if (ch == '[') {
                no.push(n);
                n = 0;
                stk.push("[");
            } else if (ch == ']') {
                StringBuilder str = new StringBuilder();
                while (!stk.isEmpty() && !stk.peek().equals("[")) {
                    str.insert(0, stk.pop());
                }
                stk.pop();
                int k = no.pop();
                String temp = str.toString();
                for (int j = 1; j < k; j++) {
                    str.append(temp);
                }
                stk.push(str.toString());
            } else {
                stk.push(ch + "");
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.insert(0, stk.pop());
        }
        return result.toString();
    }

}