class Solution {
   public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> valid = new ArrayList<>();
        Map<String, Integer> businessOrder = new HashMap<>();
        businessOrder.put("electronics", 1);
        businessOrder.put("grocery", 2);
        businessOrder.put("pharmacy", 3);
        businessOrder.put("restaurant", 4);

        for (int i = 0; i < code.length; i++) {
            String c = code[i];
            String bl = businessLine[i];
            if (!isActive[i]) continue;
            if (!businessOrder.containsKey(bl)) continue;
            if (c == null || c.isEmpty()) continue;
            boolean isValid = true;
            for (int j = 0; j < c.length(); j++) {
                char ch = c.charAt(j);
                if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                valid.add(new String[]{c, bl});
            }
        }
        valid.sort((a, b) -> {
            int cmp = businessOrder.get(a[1]) - businessOrder.get(b[1]);
            if (cmp != 0) return cmp;
            return a[0].compareTo(b[0]);
        });
        List<String> result = new ArrayList<>();
        for (String[] v : valid) {
            result.add(v[0]);
        }

        return result;
    }
}
