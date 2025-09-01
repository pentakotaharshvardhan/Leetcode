class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int[] c : classes) {
            int p = c[0], t = c[1];
            double gain = (double)(p + 1) / (t + 1) - (double)p / t;
            pq.add(new double[]{gain, p, t});
        }
        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int p = (int) top[1];
            int t = (int) top[2];
            p++;
            t++;
            double newGain = (double)(p + 1) / (t + 1) - (double)p / t;
            pq.add(new double[]{newGain, p, t});
        }
        double total = 0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            total += cur[1] / cur[2];
        }
        return total / classes.length;
    }
}
//0.5+0.3333+0.8+0.2
//0.38461+0.5+0.4+0.8