package by.epam.linked;

public class LinkList<T> {

        private Node first = null;
        private  Node last = null;

        public void addFirst(T data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                first = newNode;
                last = newNode;

            } else {
                first.prev = newNode;
                newNode.next = first;
                first = newNode;
            }
        }

        public boolean isEmpty() {
            return (first == null);
        }

        public void removeFirst() {

            if (!isEmpty()) {
                Node temp = first;

                if (first.next == null) {
                    first = null;
                    last = null;
                } else {
                    first = first.next;
                    first.prev = null;
                }
                System.out.println(temp.toString() + " is popped from the list");
            }
        }

        public void removeLast() {
            Node temp = last;
            if (!isEmpty()) {

                if (first.next == null) {
                    first = null;
                    last = null;
                } else {
                    last = last.prev;
                    last.next = null;
                }
            }
            System.out.println(temp.toString() + " is popped from the list"); // ...was removed from...
        }

    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
