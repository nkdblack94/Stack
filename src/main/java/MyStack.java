public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack (int size){
        this.size = size;
        arr = new int[size];
    }

    public void push (int e){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = e;
        index++;
    }

    public int pop(){
        if (isEmpty()){
            throw new StackOverflowError("Stack is full");
        }
        return arr[--index];
    }

    public int size(){
        return index;
    }

    private boolean isFull() {
        if (index == size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }
}
