package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        int[] numbers =  {6, 2, 8, 4, 10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        int numdiff = max - min;
        System.out.println("La diferencia entre el mayor y el menor número del array es " + numdiff);

        //Task 2
        int secondMin = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                secondMin = min;
                min = number;
            } else if (number < secondMin && number != min) {
                secondMin =number;
            }
        }

        System.out.println("El número más pequeño del array es " + min + " y el segundo número más pequeño es " + secondMin);

        //Task 3
        double x = 2;
        double y = 5;

        double answer = Math.pow(x, 2) + Math.pow((4*y/5 - x), 2);

        System.out.println("El resultado de la ecuación es " + answer);
    }
}