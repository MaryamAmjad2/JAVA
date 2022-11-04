package dsmidlab;

import java.util.Scanner;

public class DSMIDLAb {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    int size;

    public void addAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;

        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.print(current.data + " ,");

                current = current.next;

            }
            System.out.println("");
        }
    }

    public void delPreOfSearch() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int search;
        if (size <= 1) {
            System.out.println("Underflow");
        } else {
            Node p = head;
            Node q = head.next;
            Node r = head.next.next;
            System.out.println("enter data to search");
            search = s.nextInt();
            if (search == head.data) {
                System.out.println("Can't del head previous");
                a = 1;
            } else if (search == head.next.data) {
                head = head.next;
                size--;
                a = 1;
            } else {
                while (r != null) {
                    if (r.data == search) {
                        a = 1;
                        p.next = q.next;
                        size--;
                    }
                    p = p.next;
                    q = q.next;
                    r = r.next;
                }
            }
            if (a == 0) {
                System.out.println("No data found");
            }

        }
    }

    public static void main(String[] args) {
        DSMIDLAb l = new DSMIDLAb();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add" + "\n"
                    + "Enter 2 to delete" + "\n"
                    + "Enter 3 to display" + "\n"
                    + "Enter 0 to exit"+"\n"+
                    "__________________");
            int inp = s.nextInt();
            switch (inp) {
                case 1:
                    System.out.println("Enter data");
                    int si = s.nextInt();
                    l.addAtEnd(si);
                    break;
                case 2:
                    l.delPreOfSearch();
                    break;
                case 3:
                    l.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
