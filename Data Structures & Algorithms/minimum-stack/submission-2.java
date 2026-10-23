class MinStack {

    private LinkedList<Integer> list;
    private LinkedList<Integer> min;

    public MinStack() {
        this.list = new LinkedList<>();
        this.min = new LinkedList<>();
    }
    
    public void push(int val) {
        if (list.isEmpty()) {
            min.addLast(val);
        } else {
            min.addLast(Math.min(min.getLast(), val));
        }
        list.addLast(val);
    }
    
    public void pop() {
        list.removeLast();
        min.removeLast();
    }
    
    public int top() {
        return list.getLast();
    }
    
    public int getMin() {
        return min.getLast();
    }
}
