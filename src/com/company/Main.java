package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        third.delDots();
        int command = -1;
        Scanner in = new Scanner(System.in);
        outputMenu();
        while(command != 0){
            System.out.print("Введите команду: ");
            command = in.nextInt();
            switch (command){
                case 1:
                    outputMenu();
                    break;
                case 2: {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите текст: ");
                    first.setText(in2.nextLine());
                }
                    break;
                case 3:
                    first.vowelWords();
                    break;
                case 4: {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите слово: ");
                    first.longerThan(in2.nextLine());
                }
                    break;
                case 5:
                    first.upperPrePri();
                    break;
                case 6: {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите диапазон: ");
                    first.numberRange(in2.nextInt(), in.nextInt());
                }
                    break;
                case 7: {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите текст: ");
                    second.setText(in2.nextLine());
                }
                    break;
                case 8:
                    second.removePrePri();
                    break;
                case 9:
                    second.divSev();
                    break;
                case 10:
                    second.addZeros();
                    break;
                case 11: {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите текст: ");
                    third.setText(in2.nextLine());
                }
                    break;
                case 12:
                    third.delDots();
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
        System.out.println("1 - Вывести меню повторно");
        System.out.println("2 - Ввести предложения(Задание №1)");
        System.out.println("3 - Сформировать предложение из слов, которые начинаются и заканчиваются гласной буквой.");
        System.out.println("4 - Сколько в сформированном предложении слов, больше заданного слова.");
        System.out.println("5 - Все слова исходного текста, которые начинаются с приставок пре и при записать прописными буквами.");
        System.out.println("6 - Определить, сколько чисел текста принадлежат заданному диапазону.");
        System.out.println("7 - Ввести предложения(Задание №2)");
        System.out.println("8 - Удалить из текста все слова, которые начинаются с приставок пре и при.");
        System.out.println("9 - Целые числа, которые не кратны 7, заменить результатом этого деления.");
        System.out.println("10 - Добавить строку из семи нулей, перед каждым словом не числом.");
        System.out.println("11 - Ввести 3 цифры с точкой/запятой(Задание №3)");
        System.out.println("12 - Найти в тексте большие числа и записать их в традиционной форме");
        System.out.println("0 - Выход");
    }
}
