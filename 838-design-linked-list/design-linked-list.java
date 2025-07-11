class MyLinkedList {
    Node head = null;
    Node tail = null;
    private int size = 0;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (head != null) {
            temp.next = head;
        } else {
            tail = temp;
        }
        head = temp;
        size++;
    }

    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node temp = new Node(val);
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;  
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if (index == size - 1) {
                tail = prev;  
            }
        }
        size--;
    }

    private class Node {
        private int val;
        private Node next;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */