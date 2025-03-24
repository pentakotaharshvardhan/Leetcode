class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int[][] ans=new int[mat.length][mat[0].length];
        //upper side
        for(int i=1;i<mat[0].length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            int k=0;
            int j=i+k;
            int l=0;
            k++;
            while(j<mat[0].length && l<mat.length){
                //System.out.println(l+" "+(j));
                arr.add(mat[l++][j]);
                j++;
            }
            Collections.sort(arr);
            //System.out.println(arr);
            k=0;
            j=i+k;
            l=0;
            k++;
            int m=0;
            while(j<mat[0].length && l<mat.length){
                //System.out.println(l+" "+(j)+" *"+arr.get(m));
                ans[l++][j]=arr.get(m++);
                j++;
            }
        }
        //System.out.println(Arrays.toString(ans));

        //middle
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<mat.length && i<mat[0].length;i++){
            ls.add(mat[i][i]);
        }
        Collections.sort(ls);
        int a=0;
        for(int i=0;i<mat.length && i<mat[0].length;i++){
            ans[i][i]=ls.get(a++);
        }

        //down
        for(int i=1;i<mat.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            int k=0;
            int j=i+k;
            int l=0;
            k++;
            while(j<mat.length && l<mat[0].length){
               // System.out.println(j+" "+(l));
                arr.add(mat[j][l++]);
                j++;
            }
            Collections.sort(arr);
            //System.out.println(arr);
            k=0;
            j=i+k;
            l=0;
            k++;
            int m=0;
            while(j<mat.length && l<mat[0].length){
               // System.out.println(j+" "+(l)+" *"+arr.get(m));
                ans[j][l++]=arr.get(m++);
                j++;
            }
        }
        return ans;

    }
}