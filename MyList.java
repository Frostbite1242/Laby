package lab_7;

import java.util.*;

public class MyList implements List<Coffee> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }
    public MyList(Coffee coffee) {
        add(coffee);
    }
    public MyList(Collection<? extends Coffee> collection) {
        addAll(collection);
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Object o) {
        for (Coffee coffee : this) {
            if (coffee.equals(o)) {
                return true;
            }
        }

        return false;

    }

    public Iterator<Coffee> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Coffee> {
        protected Node currentNode = head;

        public boolean hasNext() {

            return currentNode != null;

        }

        public Coffee next() {
            try {
                Coffee coffee = currentNode.getcoffee();
                currentNode = currentNode.getNext();
                return coffee;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }
    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(Coffee coffee) {
        Node node = new Node(coffee, null, tail);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }
    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends Coffee> c) {
        boolean isCollectionChanged = false;
        for (Coffee coffee : c) {
            isCollectionChanged |= add(coffee);
        }
        return isCollectionChanged;
    }

    public boolean addAll(int index, Collection<? extends Coffee> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }



    public Coffee get(int index) {
        return null;
    }
    public Coffee set(int index, Coffee element) {
        return null;
    }


    public void add(int index, Coffee element) {
    }

    public Coffee remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<Coffee> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Coffee> {


        public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }


        public Coffee previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getcoffee();
        }


        public int nextIndex() {
            return 0;
        }

        public int previousIndex() {
            return 0;
        }


        public void remove() {

        }


        public void set(Coffee coffee) {

        }


        public void add(Coffee coffee) {

        }

    }


    public ListIterator<Coffee> listIterator(int index) {
        return null;
    }


    public List<Coffee> subList(int fromIndex, int toIndex) {

        return null;

    }

}