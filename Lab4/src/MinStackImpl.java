public class MinStackImpl implements MinStack<Integer>{

    MyLinkedList head;

    public MinStackImpl() {

    }
    @Override
    public void push(Integer value) {
        if (head == null) {
            head = new MyLinkedList(value, value, null);
        } else {
            head.add(value);
        }
    }

    @Override
    public Integer pop() {
        if (head == null) { return null; }
        int val = head.get_val();
        head = head.get_next();
        return val;
    }

    @Override
    public Integer top() {
        return head.get_val();
    }

    @Override
    public Integer min() {
        return head.get_min();
    }
}
