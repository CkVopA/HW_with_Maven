package gb.hw.skvortsov.level3.lesson6.testing_part;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


    }

    public Calculator(){
        System.out.println("Калькулятор создан");
    }

    public int add (int a, int b){
        System.out.println("Выполняется сложение");
        return a+b;
    }

    public int div (int a, int b){
        System.out.println("Выполняется деление");
        return a/b;
    }
}
