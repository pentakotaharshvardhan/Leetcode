class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);

        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        // Triangle inequality
        if (a + b <= c) {
            return new double[]{};
        }

        double angleA = getAngle(a, b, c);
        double angleB = getAngle(b, a, c);
        double angleC = getAngle(c, a, b);

        double[] ans = {angleA, angleB, angleC};
        Arrays.sort(ans);

        return ans;
    }

    private double getAngle(double opposite, double side1, double side2) {
        double cosValue = (side1 * side1 + side2 * side2 - opposite * opposite) 
                          / (2.0 * side1 * side2);

        return Math.acos(cosValue) * 180.0 / Math.PI;
    }
}