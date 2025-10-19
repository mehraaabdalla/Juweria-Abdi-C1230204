import java.util.Arrays;
import java.util.EmptyStackException;
public class Arraystack<T> {
        private static final int DEFAULT_CAPACITY = 2;
        private int count;
        private T[] elements;

        // No-arg constructor
        public Arraystack() {
            this(DEFAULT_CAPACITY);
        }

        // Constructor with custom capacity
        public Arraystack(int initialCapacity) {
            count = 0;
            elements = (T[]) new Object[initialCapacity];
        }

        // Size method
        public int size() {
            return count;
        }

        // Push method
        public void push(T value) {
            if (size() == elements.length)
                increaseCapacity();
            elements[count] = value;
            count++;
        }

        // remove method
        public T pop() {
            if (isEmpty())
                throw new EmptyStackException();
            T removedValue = elements[--count];
            elements[count] = null;
            return removedValue;
        }

        // Top method
        public T peek() {
            if (isEmpty())
                throw new EmptyStackException();
            return elements[count - 1];
        }

        // isEmpty method
        public boolean isEmpty() {
            return count == 0;
        }

        // Method to expand capacity
        private void increaseCapacity() {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        // Display elements
        public void display() {
            if (isEmpty())
                throw new EmptyStackException();
            System.out.println("Stack contents:");
            for (int i = 0; i < count; i++) {
                System.out.println(elements[i] + " ");
            }
            System.out.println();
}
    }
