package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    String text;
    Third(){
        text = "";
    }

    // Ввод текста.
    public void setText(String text) {
        this.text = text;
    }

    // Найти в тексте большие числа и записать их в традиционной форме
    public void delDots(){
        String tmp = "";
        Pattern pattern = Pattern.compile("\\d\\d\\d[.,]");
        Matcher match = pattern.matcher(text);
        while(match.find()){
            tmp += text.substring(match.start(), match.end()-1);
        }
        tmp += text.substring(text.length()-3);
        System.out.println(tmp);
    }
}
