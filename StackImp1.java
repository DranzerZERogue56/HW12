class StackImpl implements StackInterface {
    private Node top;

    public StackImpl() {
        top = null;
    }

    @Override
    public void push(String item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String item = top.data;
        top = top.next;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}