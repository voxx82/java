package org.example.lesson2;


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.UnaryOperator;

public class NumberList <T extends Number> implements List<T> {
    private T[] array;
    private int size;

    Integer sumIntegers() {
        Integer Sum = 0;
        if(getClass() != NumberList) {
            for(int i = 0; i < array.length; i++){
                array.;
            }
        }
        return Sum;
    }


    public NumberList(Class<T> clazz)  {
        this.array = (T[]) Array.newInstance(clazz, 10);
    }

    public int getLength() {
        return array.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        int count = 0;
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                count++;
                if (count == 2) {
                    result = true;
                    break;
                }
            }
        }
        return result;
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
        T[] oldPart = Arrays.copyOfRange(array, 0, size);

        array[0] = t;
        size++;

        if (size >= array.length) {
            array = Arrays.copyOf(array, ((int) (array.length * 1.5)));
        }

        for (int j=0; j < oldPart.length; j++) {
            array[j+1] = oldPart[j];
        }
        return true;
    }


    public boolean remove(Object o) {
        boolean result = false;

        for (int i=0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            } else if (array[i].equals(o)) {
                size--;
                result = true;
                T[] finalPart = Arrays.copyOfRange(array, i+1, array.length);
                for (int j = 0; j < finalPart.length; j++) {
                    array[i+j] = finalPart[j];
                }
            }
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
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
    public void replaceAll(UnaryOperator<T> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        for(int i=0; i < array.length; i++){
            NumberList l1 = (NumberList) o;
            if(l1.get(i) == array[i]) {
                continue;
            } else return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return array.length*2/array.length;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public T set(int index, T element) {
        array[index] = element;
        return null;
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
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
        T[] subArray = Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(subArray);
    }

    @Override
    public Spliterator<T> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public String toString() {
        return "NumberList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int SumIntegers() {

        return 0;
    };

}





