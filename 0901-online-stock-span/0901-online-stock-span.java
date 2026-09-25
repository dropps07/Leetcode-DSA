class StockSpanner {
    Stack<int[]> st = new Stack<>();
    int i =0;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        while(!st.isEmpty() && st.peek()[0]<=price){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span= i+1;
        }else{
            span = i - st.peek()[1];
        }
        st.push(new int[]{price, i});
        i++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */