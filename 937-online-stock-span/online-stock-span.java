class StockSpanner {
    ArrayList<Integer> stk=new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=1;
        int i=stk.size()-1;
        while(i>=0 && price>=stk.get(i)){
            count++;
            i--;
        }
        stk.add(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */