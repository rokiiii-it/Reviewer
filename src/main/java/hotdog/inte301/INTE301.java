package hotdog.inte301;

import java.util.Arrays; //libraries

public class INTE301 { //class

    public static void main(String[] args) {//main
        int[] favNumbers = {1, 2, 3, 4, 5, 6, 7};
        String[] favFruits = {"Apple", "Orange", "Strawberry", "Banana"};
        
        System.out.println(Arrays.toString(favNumbers));
        System.out.println(favFruits[2]);
        
        System.out.println("============================================");
        int number = 0; //int is data type, number is variable name
        double doubleNumbers = 23.75;
        String personName = "Karl and Mariaane"; //String is data type, personName is variable name
        
        System.out.println(number);
        System.out.println(doubleNumbers);
        System.out.println(personName);
        
        System.out.println("============================================");
        
        //Type Casting converting int to double or double to int
        
        //Explicit Narrowing
        double toInt = 12.23; //can store decimal
        int fromDouble = (int) toInt; //can store whole numbers only
        
        System.out.println(fromDouble); //12 from 12.23 truncated
        
        //Implicit Widening
        int integer = 18;
        double implicit = integer;
        
        System.out.println(implicit); //expected value 18.0
        
        System.out.println("============================================");
        
        int a = 10; //value is 10
        int b = 5; //value is 5
        
        System.out.println(a + b); //addition
        System.out.println(a - b); //subtraction
        System.out.println(a * b); //multiplication
        System.out.println(a / b); //division
        System.out.println(10 % 3); //remainder
        
        System.out.println("============================================");
        
        int c = 5;
        int d = 25;
        
        System.out.println(c > d); //False correct
        System.out.println(d == c); //True wrong
        System.out.println(c != d); //False wrong
        System.out.println(d <= c); //True wrong
        
        String num1 = "25";
        String num2 = "10";
        System.out.print(num1.equals(num2)); //false
    }
}
