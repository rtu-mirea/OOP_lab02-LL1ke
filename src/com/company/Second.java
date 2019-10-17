package com.company;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Second {
    StringBuffer text = new StringBuffer();
    StringBuffer temp = new StringBuffer();
    StringBuffer result = new StringBuffer();

    Second(){
        text = new StringBuffer("");
    }

    // Ввод текста.
    public void setText(String text) {
        this.text = new StringBuffer(text);
    }

    // Удалить из текста все слова, которые начинаются с приставок пре и при.
    public void removePrePri(){
        temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){
            if(i.toLowerCase().indexOf("пре") == 0 || i.toLowerCase().indexOf("при") == 0 ){
                continue;
            } else{
                temp.append(i).append(" ");
            }
        }
        System.out.print("Текст без слов, которые начинаются с приставок пре и при: ");
        System.out.println(temp);
    }

    // Целые числа, которые не кратны 7, заменить результатом этого деления.
    public void divSev(){
        temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){try{
            if(Integer.parseInt(i) % 7 != 0){
                temp.append(Integer.parseInt(i) / 7).append(" ");
            } else{
                temp.append(i).append(" ");
            }
        }catch(NumberFormatException e) {
            temp.append(i).append(" ");
        }
        }
        System.out.print("Текст с разделенными на 7 числами(не кратными 7): ");
        System.out.println(temp);
    }

    // Добавить строку из семи нулей, перед каждым словом не числом, разделяя слова пробелами.
    public void addZeros(){
        temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){try{
            Integer.parseInt(i);
            temp.append(i).append(" ");
        }catch(NumberFormatException e) {
            temp.append("0000000").append(" ").append(i).append(" ");
        }
        }
        System.out.println("Текст с добавленными строками из семи нулей, перед каждым словом не числом: ");
        System.out.println(temp);
    }

}
