import java.util.Scanner;
import java.lang.String;

public class First {
    String text;
    String temp;
    String result = "";

    First() {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
    }

    private boolean isVowel(char c) {
        return (c == 'а' || c == 'А' || c == 'е' || c == 'Е' || c == 'и' || c == 'И' || c == 'о' || c == 'О' || c == 'у' || c == 'У' || c == 'ы' || c == 'Ы' || c == 'э' || c == 'Э' || c == 'я' || c == 'Я' || c == 'Ю' || c == 'ю' || c == 'ё' || c == 'Ё');
    }

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

    /////!!!!!
    public void numberRange(int min, int max){
        int count = 0;
        temp = text;
        temp = temp.replaceAll("\\D", " ");
        String[] arr = temp.split(" ");
        for(String i : arr){
            if(i.equals("")){
                continue;
            }
            System.out.println(i);
            if(Integer.parseInt(i) >= min && Integer.parseInt(i) <= max){
                count++;
            }
        }
        System.out.println("Количество чисел в данном диапазоне: ");
        System.out.println(count);
        temp = null;
    }
}
