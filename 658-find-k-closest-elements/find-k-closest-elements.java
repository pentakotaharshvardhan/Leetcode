class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int num : arr) temp.add(num); // Convert arr to List<Integer>

        Collections.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int diffA = Math.abs(a - x);
                int diffB = Math.abs(b - x);
                if (diffA != diffB) return Integer.compare(diffA, diffB); // Sort by absolute difference
                return Integer.compare(a, b); // If equal, sort by value
            }
        });

        for (int i = 0; i < k; i++) {
            ans.add(temp.get(i));
        }
        Collections.sort(ans); // Sort final answer in ascending order
        return ans;
    }
}
