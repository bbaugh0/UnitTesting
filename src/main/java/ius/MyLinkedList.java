package ius;

public class MyLinkedList<T> implements ILinkedList<T> {

    T val;
    ILinkedList<T> next;

    /**
     * Get the next list element
     *
     * @return the next element
     */
    public ILinkedList<T> next() {
        return next;
    }

    /**
     * Gets the last element in the list
     *
     * @return the node at the end of the list
     */
    public ILinkedList<T> last() {
        while (next.next() != null) {
            next = next.next();
        }
        return next;
    }

    /**
     * Get the element n elements down the list
     *
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n) {
        ILinkedList temp = this;
        for (int i = 0; i < n - 1; i++) {
            temp = this.next();
        }
        return temp;
    }

    /**
     * Removes the next element (sets null)
     *
     * @return the previously next element
     */
    public ILinkedList<T> detach() {
        ILinkedList temp = next;
        this.next = null;
        return temp;
    }

    /**
     * Gets the current value
     *
     * @return the current value
     */
    public T get() {
        return val;
    }

    /**
     * Sets the value of this node
     *
     * @param value the new value
     */
    public void set(T value) {
        this.val = value;
    }

    /**
     * Sets the next element in the list
     *
     * @param next the next element
     *             <p>
     *             Example: (1->2->3).setNext(4) => 1->4
     */
    public void setNext(ILinkedList<T> next) {
        this.next = next;
    }

    /**
     * Sets the next element after this current element
     *
     * @param next the next element
     *             <p>
     *             Example: (1->2->3).append(4) => 1->2->3->4
     */
    public void append(ILinkedList<T> next) {
        this.next = next;
    }

    /**
     * Adds the current list as the next of newFirst
     *
     * @param newFirst the new head of the list
     *                 <p>
     *                 Example: (1->2->3).insert(4) => 4->1->2->3
     */
    public void insert(ILinkedList<T> newFirst) {
        newFirst.setNext(this);


    }
} // class
