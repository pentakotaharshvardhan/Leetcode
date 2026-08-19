class Solution {

    public int maxNumberOfFamilies(int n, int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        int reservedRows = 0;
        int ans = 0;
        int i = 0;
        while (i < arr.length) {
            int row = arr[i][0];
            boolean istrueA = true; // CaseA
            boolean istrueB = true; // CaseB
            boolean istrueC = true; // CaseC
            reservedRows++;
            while (i < arr.length && arr[i][0] == row) {
                int seat = arr[i][1];
                if (seat >= 2 && seat <= 5)
                    istrueA = false;
                if (seat >= 6 && seat <= 9)
                    istrueB = false;
                if (seat >= 4 && seat <= 7)
                    istrueC = false;
                i++;
            }
            if (istrueA && istrueB) {
                ans += 2;
            }
            else if (istrueA || istrueB || istrueC) {
                ans += 1;
            }
        }
        ans += (n - reservedRows) * 2;

        return ans;
    }
}