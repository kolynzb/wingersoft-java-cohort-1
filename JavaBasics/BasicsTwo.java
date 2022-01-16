/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class BasicsTwo {

    public static void main(String[] args) {
        // this is for printing to the console
        System.out.println("hello world");
        String firstName = "Joshua";
        int age = 12;
        float weight = 68.88f;
        boolean isAdult = true;

        System.out.println("My name is " + firstName + " i am " + age + "years old");

        //the arithmetic operators are + - * / % 
        int arith = 5 % 2;

        System.out.println(arith);

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;
        System.out.println(sum3);
        System.out.println(++sum3); //increment

        int x = 10;
        x += 5;
        System.out.println(x);
        //the comparison operators are == != > < >= <=

        System.out.println(18 < age);
        System.out.println(!isAdult);

        String username = "sherine";
        String password = "password";

        Scanner ui = new Scanner(System.in);
        Scanner pi = new Scanner(System.in);

        String userInput = ui.nextLine();
        String passInput = pi.nextLine();
        
        System.out.println( password.equals(passInput));
       
        if (username.equals(userInput) &&  password.equals(passInput)) {
            System.out.println("Welcome  " + username);

        } else if ( !username.equals(userInput)) {
            System.out.println("Wrong username");
        } else if (  !password.equals(passInput) ) {
            System.out.println("Wrong password");
        } else {
            System.out.println("Not Authorized");
        }
    }

}
