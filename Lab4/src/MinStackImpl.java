public class MinStackImpl implements MinStack<Integer>{

    MyLinkedList head;

    @Override
    public void push(Integer value) {
        head.add(value);
    }

    @Override
    public Integer pop() {
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
