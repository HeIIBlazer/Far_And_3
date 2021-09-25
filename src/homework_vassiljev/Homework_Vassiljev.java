/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_vassiljev;

import java.util.Scanner;


public class Homework_Vassiljev {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите темп. в Цельсиях: " );
    int cels = scanner.nextInt();
    int f = (cels*9/5) + 32 ;
    System.out.printf("Темп. в Фаренгейтах : %d%n", f);
    System.out.printf("---------%n");
    System.out.print("Введите трехзначное число: " );
    int number = scanner.nextInt();
    int x = number%10;
    System.out.printf("Число Единиц: %d%n", x);
    int z = number/10%10;
    System.out.printf("Число Десятков: %d%n", z);
    int c=number/100;
    int v=x+c+z;
    System.out.printf("Сумма цифр: %d%n",v);
    System.out.printf("---------%n");
    }
    
}
