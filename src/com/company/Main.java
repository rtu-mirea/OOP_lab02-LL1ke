package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        outputMenu(); // Вывод меню
        int command = -1;
        while(command != 0){
            System.out.print("Введите команду: ");
            command = in.nextInt();
            switch (command){
                case 1:
                    outputMenu();
                    break;
                case 2:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 7:
                    try{
                        //something
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("Завершение программы...");
                    break;
                default:
                    System.out.println("Введена неверная команда, повторите ввод;");
                    break;
            }
        }
    }

    public static void outputMenu(){
        System.out.println("1 ");
        System.out.println("2 ");
        System.out.println("3 ");
        System.out.println("4 ");
        System.out.println("5 ");
        System.out.println("6 ");
        System.out.println("7 ");
        System.out.println("0 - Выход.");
    }
}
