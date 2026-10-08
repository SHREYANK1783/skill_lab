public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            System.out.println("Node is Inserted");
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        System.out.println("Node is Inserted");
    }

    static void pop() {
        if (head == null) {
            System.out.println("EMPTY STACK");
            return;
        }
        int val = head.data;
        System.out.println("Popped Element: " + val);
        head = head.next;
    }

    static void display() {
        if (head == null) {
            System.out.println("EMPTY STACK");
            return;
        }
        System.out.print("The stack is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        pop();
        display();
    }
}
