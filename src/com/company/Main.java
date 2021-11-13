package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         String num  = "Введите ваше имя:";
        System.out.println(num);
	Scanner bum = new Scanner(System.in);
	System.out.println("Здраствуйте," + bum.nextLine());
    }
}
