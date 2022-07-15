package org.example.lesson2;

import java.lang.reflect.Array;
import java.util.*;

public class MyList <T> implements List<T>  {
    private T[] array;
    private int size;

    public MyList(Class<T> clazz) {

        this.array = (T[]) Array.newInstance(clazz, 10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            };
        }

        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, ((int) (array.length * 1.5)));
        }

        array[size] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;

        for (int i=0; i < array.length; i++) {
            if (array[i].equals(o)) {
                result = true;
                if (i == size) {
                    array[i] = null;
                } else {
                    T[] firstPart = Arrays.copyOfRange(array, 0, i);
                    T[] secondPart = Arrays.copyOfRange(array, i+1, array.length);
                    for (int j = 0; j < firstPart.length; j++) {
                        array[j] = firstPart[j];
                    }
                    for (int j = 0; j < secondPart.length; j++) {
                        array[j + firstPart.length] = secondPart[j];
                    }
                    break;
                }
                size--;
            }
        }

        return result;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {

            if (!contains(o)) {
                return false;
            };
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (array.length - size >= c.size()) {
            for (T o :c) {
                add(o);
            }
            return true;
        }
        array = Arrays.copyOf(array, array.length + c.size());
        for (T o :c) {
            add(o);
        }
        return true;


    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Вышли за предела размера");
        }
        return array[index];
    }

    @Override
    public T set(int index, T element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Вышли за предела размера");
        }
        array[index] = element;
        return element;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (T t : array) {
            if (t != null) {
                result += t.toString() + " ";
            }
        }


        return "MyList{" +
                "array=" + result +
                '}';
    }
}
