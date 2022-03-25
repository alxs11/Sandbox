package org.example.linkedlist;

import org.w3c.dom.Node;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            head = newNode;
        }

    }

    @Override
    public void addLast(E element) {

        Node NewNode = new Node(element, null);
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public E pollFirst() {

        E element;
        if (head == null) {
            element = null;
        } else {

            element = head.element;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node next = head.next;
                head.next = null;
                head = next;
            }
        }
        return element;
    }

    @Override
    public E pollLast() {
        E element;
        if (head == null) {
            element = null;
        } else {
            element = tail.element;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;
            }

            return element;
        }

        @Override
        public E peekFirst() {
            return head.element;
        }

        @Override
        public E peekLast() {
            return tail.element;
        }

        @Override
        public void clear() {
            Node current = head;
            while (current.next != null) {
                Node next = current.next;
                current.next = null;
                current = next;
            }
            head = null;
            tail = null;
        }

        @Override
        public boolean contains(E element){
            boolean contains = false;
            Node current = head;
            while (current != null) {
                Node next = current.next;
                if (current.element == element) {
                    contains = true;
                    break;
                }

                current = next;
            }

            @Override
            public int size() {
                int counter = 0;
                if (head != null) {
                    if (head == tail) {
                        counter++;
                    } else {
                        Node current = head;
                        while (current != null) {
                            counter++;
                            current = current.next;
                        }
                    }
                }
            }



    /*

    addLast()
        Node NewNode = new Node(element, null);
        tail.next = newNode;
        tail = newNode;


    peekFirst() {
      return head.element;
      }

    peekLast() {
      return tail.element;
    }

    pollFirst() {
      E element;
      if (head == null) {
          element = null;
      } else {

          element = head.element;
          if(head == tail) {
               head = null;
               tail = null;
           } else {
                Node next = head.next;
                head.next = null;
                head = next;
           }
      }
      return element;

      pollLast()

        E element;
        if (head == null) {
            element = null;
         } else {
            element = tail.element;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;
         }

         return element;

      public String toString() {

            StringBuilder builder = new StringBuilder("[");
            StringJoiner joiner = new StringJoiner(", ");
            Node current = head;
            if (current != null) {

                while (current != null) {
                    joiner.add(current.element.toString());
                    current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");

        return builder.toString();

        clear()

            Node current = head;
            while (current.next != null) {
                Node next = current.next;
                current.next = null;
                current = next;
            }
            head = null;
            tail = null;



        contains()
            boolean contains = false;
            Node current = head;
            while (current != null) {
                Node next = current.next;
                if (current.element == element) {
                    contains = true;
                    break;
                }

                current = next;

         size()
            int counter = 0;
            if(head != null) {
                if (head == tail) {
                    counter++;
                } else {
                    Node current = head;
                    while (current != null) {
                        counter++;
                        current = current.next;
                    }
                }
            }

            return counter;

           */
        }
    }
}