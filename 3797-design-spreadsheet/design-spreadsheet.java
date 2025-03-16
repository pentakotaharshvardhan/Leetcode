class Spreadsheet {
    int[][] sheet;
    public Spreadsheet(int rows) {
        sheet=new int[26][rows];
    }
    
    public void setCell(String cell, int value) {
        int a=(int)cell.charAt(0)-'A';
        int b=Integer.parseInt(cell.substring(1)) - 1;
        //System.out.println(a+" "+b);
        sheet[a][b]=value;
    }
    
    public void resetCell(String cell) {
        int a=(int)cell.charAt(0)-'A';
        int b=Integer.parseInt(cell.substring(1)) - 1;
        sheet[a][b]=0;
    }
    
    public int getValue(String formula) {
        String sub=formula.substring(1);
        //System.out.println(sub);
        String[] arr = sub.split("\\+");
        int val=0;
        int val1=0;
        //System.out.println(arr[0]);
        if(!Character.isDigit(arr[0].charAt(0))){
            int a=(int)arr[0].charAt(0)-'A';
            int b=Integer.parseInt(arr[0].substring(1)) - 1;
            //System.out.println(a+" "+b);
            val=sheet[a][b];
        }
        else val=Integer.parseInt(arr[0]);
        if(!Character.isDigit(arr[1].charAt(0))){
            int a=(int)arr[1].charAt(0)-'A';
            int b=Integer.parseInt(arr[1].substring(1)) - 1;
            //System.out.println(a+" "+b);
            val1=sheet[a][b];
        }
        else val1=Integer.parseInt(arr[1]);
        //System.out.println(val+" "+val1);
        return val+val1;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */