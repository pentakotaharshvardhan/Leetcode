class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(part);
            }
        }

        StringBuilder simplified = new StringBuilder();
        for (String dir : stack) {
            simplified.append("/").append(dir);
        }

        return simplified.length() > 0 ? simplified.toString() : "/";
    }
}
