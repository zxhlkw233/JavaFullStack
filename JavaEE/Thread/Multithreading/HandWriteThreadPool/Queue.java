package JavaEE.Thread.Multithreading.HandWriteThreadPool;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item> {
    private int N;
    private Node first;
    private Node last;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public class Node {
        private Item item;
        private Node next;
    }

    public Queue() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int Size() {
        return N;
    }

    public Item peek() {
        return first.item;
    }

    public void enqueue(Item item) {
        Node x = new Node();
        x.item = item;
        if (isEmpty()) {
            first = x;
            last = x;
        } else {
            last.next = x;
            last = x;
        }
        N++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能出");
        }
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : this) {
            sb.append(item + " ");
        }
        return sb.toString();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}