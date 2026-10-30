public class MyLinkedList {
    private int val;
    private int min;
    private MyLinkedList next;

    public MyLinkedList(int val, int min, MyLinkedList next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }

    public void add(int value) {
        int new_min = Math.min(min, value);
        MyLinkedList cur_list = this;
        this.next = cur_list;
        this.val = value;
        this.min = new_min;
    }
    public MyLinkedList get_next() { return this.next; }
    public Integer get_val() { return this.val; };
    public Integer get_min() { return this.min; }
}