import java.util.LinkedList;

class MinStack {

    LinkedList<Integer[]> list;
    //int min = Integer.MAX_VALUE;

    public MinStack() {
        this.list = new LinkedList<>();
    }

    public void push(int val) {
        Integer[] i = new Integer[]{val, val};
        if(this.list.isEmpty())
            this.list.add(i);
        else{
            this.list.add(new Integer[]{val, this.list.get(list.size() - 1)[1] > val ? val : this.list.get(list.size() - 1)[1]});
        }
    }

    public void pop() {
        this.list.remove(this.list.size() - 1);
    }

    public int top() {
        return this.list.get(this.list.size() - 1)[0];
    }

    public int getMin() {
        return this.list.get(this.list.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */