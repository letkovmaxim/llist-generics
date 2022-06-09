import Exception.NoSuchElementException;

public class LList<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
            this.data = null;
            this.next = null;
        }
    }


    private Node root;
    private int listSize = 0;


    public void add(T data) {
        Node node = new Node(data);

        if (root != null) {
            Node p = root;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        } else {
            root = node;
        }

        listSize++;
    }


    public T get(int n) {
        int i = 0;
        Node p = root;

        if ((n >= 0) && (n < listSize)) {
            while (i < n) {
                p = p.next;
                i++;
            }
        }
        else {
            throw new NoSuchElementException(" [ Ошибка: такого элемента нет ] ");
        }
        return p.data;
    }


    public void remove (int n) {
        int i = 0;
        Node p = root;
        Node prev = new Node();

        if ((n >= 0) && (n < listSize)) {
            while ( i < n ) {
                prev = p;
                p = p.next;
                i++;
            }

            if (n == 0) {
                root = p.next;
            } else {
                prev.next = p.next;
            }

            p = null;
            listSize--;
        }
        else {
            throw new NoSuchElementException(" [ Ошибка: такого элемента нет ] ");
        }
    }


    public int size() {
        return listSize;
    }
}
