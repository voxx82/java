package lesson4;


import java.util.*;

public class User {

    private String name;
    private int number;
    //    private int [] numbers_list;
    private List<Integer> numbers_list;

    public User(int number, List<Integer> numbers) {
//        this.name = name;
        this.number = number;
        this.numbers_list = numbers;
    }

    public User(int e) {
        this.number = e;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getNumbers() {
        return numbers_list;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers_list = numbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "number='" + number + '\'' +
                ", numbers_list=" + numbers_list +
                '}';
    }
}
