package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        System.out.println("3");
        System.out.println("Добавить фрукт:");
        orange.addFruit(new Orange(),13);
        orange1.addFruit(new Orange(),15);
        apple.addFruit(new Apple(),25);
        apple1.addFruit(new Apple(),20);
        System.out.println("Ящик 1: "+orange.getWeight());
        System.out.println("Ящик 2: "+orange1.getWeight());
        System.out.println("Ящик 3: "+apple.getWeight());
        System.out.println("Ящик 4: "+apple1.getWeight());
        System.out.println("Сравнить:");
        System.out.println("Ящик 1 равно Ящик 3:"+orange.compare(apple));
        System.out.println("Ящик 2 равно Ящик 4:"+orange1.compare(apple1));
        orange.pourTo(orange1);
        apple.pourTo(apple1);
        System.out.println("Вес");
        System.out.println("Ящик 1: "+orange.getWeight());
        System.out.println("Ящик 2: "+orange1.getWeight());
        System.out.println("Ящик 3: "+apple.getWeight());
        System.out.println("Ящик 4: "+apple1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Пусто"+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат: "+Arrays.toString(arr)+"\n================================");
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат"+alt+"\n================================");
    }
}
