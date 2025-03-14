import java.util.*;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });
        PriorityQueue<Integer> pr = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(trips[a][2], trips[b][2]);
            }
        });

        int cap = trips[0][0]; 
        int end = trips[0][1];
        if(cap>capacity) return false;
        pr.add(0); 

        for (int i = 1; i < trips.length; i++) {
            while (!pr.isEmpty() && trips[pr.peek()][2] <= trips[i][1]) {
                cap -= trips[pr.poll()][0]; 
            }

            pr.add(i);
            cap += trips[i][0];

            end = trips[i][2]; 

            if (cap > capacity) return false;
        }
        return true;
    }
}
