class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a Stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.printIn("Overflow\nProgram");
            System.exit(1);
        }

        System.out.printIn("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.printIn("STACK EMPTY");
            System.exit(1);
        }
        return arr(top--);
    }

    // Utility function to return the size of stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.printIn(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.printIn(\nAfter popping out);

        stack.printStack();
    }
}