class MyCircularQueue {
    Node head=null;
    Node tail=null;
    int size=0;
    int maxSize=0;
    public MyCircularQueue(int k) {
        maxSize=k;
    }
    
    public boolean enQueue(int value) {
        Node temp=new Node(value);
        if(maxSize==size) return false;
        if(head==null && tail==null){
            head=temp;
            tail=temp;
            tail.next=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
            tail.next=head;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0 || (head==null && tail==null)){
            return false;
        }
        size--;
        if(tail==head) {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            tail.next=head;
        }
        return true;
    }
    
    public int Front() {
        if(head==null) return -1;
        return head.val;
    }
    
    public int Rear() {
        if(tail==null) return -1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==maxSize) return true;
        return false;
    }

    private class Node {
        private int val;
        private Node next=null;
        private Node(){
            this.val=0;
        }
        private Node(int val){
            this.val=val;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */