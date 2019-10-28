package by.epam.linked;

public class Main {
    public static void main(String[] args) {
        LinkList newList = new LinkList();
        newList.addFirst("arun");
        newList.addFirst("prakash");
        newList.addFirst(70);
        newList.addFirst(80);
        newList.addFirst(30);
        newList.removeFirst();
        newList.removeFirst();
        newList.removeFirst();
        newList.removeLast();
    }
}
