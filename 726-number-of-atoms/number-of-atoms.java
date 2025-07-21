class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        int i = 0, n = formula.length();
        stack.push(new HashMap<>());

        while (i < n) {
            char ch = formula.charAt(i);

            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (ch == ')') {
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int mul = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> top = stack.pop();
                Map<String, Integer> prev = stack.peek();
                for (String name : top.keySet()) {
                    prev.put(name, prev.getOrDefault(name, 0) + top.get(name) * mul);
                }
            } else {
                int start = i;
                i++; // start with capital letter
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);

                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                Map<String, Integer> top = stack.peek();
                top.put(name, top.getOrDefault(name, 0) + count);
            }
        }

        Map<String, Integer> result = stack.pop();
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        StringBuilder sb = new StringBuilder();
        for (String atom : sorted.keySet()) {
            sb.append(atom);
            int cnt = sorted.get(atom);
            if (cnt > 1) sb.append(cnt);
        }
        return sb.toString();
    }
}
