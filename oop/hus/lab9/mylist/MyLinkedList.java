package oop.hus.lab9.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        checkBoundaries(index, this.size - 1);
        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public void add(Object payload) {
        if (this.size == 0) {
            this.head = new MyLinkedListNode(payload, null);
            this.size++;
            return;
        }

        MyLinkedListNode lastNode = getNodeByIndex(this.size - 1);
        lastNode.setNext(new MyLinkedListNode(payload, null));
        this.size++;
//        add(payload, size);
    }

    @Override
    public void add(Object payload, int index) {
//        checkBoundaries(index, size);
//        if (index == 0) {
//            head = new MyLinkedListNode(payload, head);
//        } else {
//            MyLinkedListNode current = getNodeByIndex(index - 1);
//            current.setNext(new MyLinkedListNode(payload, current.getNext()));
//        }
//        size++;

        checkBoundaries(index, this.size);

        if (index == 0) {
            if (this.size == 0) {
                this.head = new MyLinkedListNode(payload, null);
            } else {
                MyLinkedListNode currentNode = new MyLinkedListNode(payload, head);
                this.head = currentNode;
            }
            this.size++;
            return;
        }

        if (index == this.size) {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode lastNode = new MyLinkedListNode(payload, null);
            previousNode.setNext(lastNode);
            this.size++;
            return;
        }

        MyLinkedListNode previousNode = getNodeByIndex(index - 1);
        MyLinkedListNode nextNode = getNodeByIndex(index);
        MyLinkedListNode currentNode = new MyLinkedListNode(payload, nextNode);
        previousNode.setNext(currentNode);
        this.size++;

    }


    @Override
    public Object get(int index) {
        return getNodeByIndex(index);
    }

    public void remove(int index) {
        checkBoundaries(index, this.size - 1);

        if (index == 0) {
            if (this.size == 1) {
                this.head = null;
            } else {
                this.head = getNodeByIndex(1);
            }
            this.size--;
            return;
        }
        if (index == this.size - 1) {
            MyLinkedListNode previosNode = getNodeByIndex(index - 1);
            previosNode.setNext(null);
            this.size--;
            return;
        }

        MyLinkedListNode previosNodeIndex = getNodeByIndex(index - 1);
        MyLinkedListNode nextNode = getNodeByIndex(index + 1);
        previosNodeIndex.setNext(nextNode);
        this.size--;


    }

    @Override
    public int size() {
        return size;
    }
}
