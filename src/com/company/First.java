package com.company;

import java.util.Scanner;
import java.lang.String;

public class First {
    String text;
    String temp;
    String result = "";

    First() {
        text = "";
    }

    // Ввод текста
    public void setText(String text) {
        this.text = text;
    }

    // Гласные буквы
    private boolean isVowel(char c) {
        return (c == 'а' || c == 'А' || c == 'е' || c == 'Е' || c == 'и' || c == 'И' || c == 'о' || c == 'О' || c == 'у' || c == 'У' || c == 'ы' || c == 'Ы' || c == 'э' || c == 'Э' || c == 'я' || c == 'Я' || c == 'Ю' || c == 'ю' || c == 'ё' || c == 'Ё');
    }

    // Сформировать предложение из слов, которые начинаются и заканчиваются гласной буквой
    public void vowelWords() {
        temp = text;
        for(String word:text.split(" ")){
            if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1))){
                result += word + " ";
            }
        }
        System.out.println("Строка из слов, начинающихся и заканчивающихся на гласную: ");
        System.out.println(result);
        temp = null;
        result = "";
    }

    // Сколько в сформированном предложении слов, больше заданного слова
    public void longerThan(String word){
        int count = 0, len = word.length();
        temp = text;
        for(String w:text.split(" ")){
            if(w.length() > len){
                count++;
            }
        }
        System.out.println("Количество слов длиннее " + word + ": ");
        System.out.println(count);
        temp = null;
    }

    // Все слова исходного текста, которые начинаются с приставок пре и при записать прописными буквами
    public void upperPrePri(){
        for(String word:text.split(" ")){
            if(word.startsWith("пре")){
                result += "ПРЕ" + word.substring(3) + " ";
            }else{
                if(word.startsWith("при")){
                    result += "ПРИ" + word.substring(3) + " ";
                }else{
                    result += word + " ";
                }
            }
        }
        System.out.println("Строка со словами на \"пре-\" и \"при-\", записанными прописными буквами: ");
        System.out.println(result);
        temp = null;
        result = "";
    }

    // Определить, сколько чисел текста принадлежат заданному диапазону
    public void numberRange(int min, int max){
        int count = 0;
        temp = text;
        temp = temp.replaceAll("\\D", "");
        String[] arr = temp.split(" ");
        for(String i : arr){
            System.out.println(i);
            if(Integer.parseInt(i) >= min && Integer.parseInt(i) <= max){
                count++;
            }
        }
        System.out.print("Количество чисел в данном диапазоне: ");
        System.out.println(count);
        temp = null;
    }
}
