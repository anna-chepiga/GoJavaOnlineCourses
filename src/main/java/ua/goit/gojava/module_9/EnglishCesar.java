package ua.goit.gojava.module_9;

import java.util.ArrayList;
import java.util.List;

public class EnglishCesar {

    private static final List<Character> ALPHABET = new ArrayList<>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-', ' ', '\n', '\t', '='};

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            ALPHABET.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            ALPHABET.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            ALPHABET.add(c);
        }
        for (char c : PUNCTUATION) {
            ALPHABET.add(c);
        }
    }

    // закоментированные строки нужны для аффинного шифра,
    // тогда к параметрам методов надо добавить int m, которое будет взаимно простым числом к размеру алфавита

    public static String encrypt(String text, int key) {
        int n = ALPHABET.size();
        //m = m % n;
        key = key % n;

        /*if (gcd(n, m) != 1) {
            return null;
        }*/
        StringBuilder cryptogram = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = ALPHABET.indexOf(c);
            index = (index + key) % n;
            cryptogram.append(ALPHABET.get(index));
        }
        return cryptogram.toString();
    }

    public static String decrypt(String text, int key) {
        int n = ALPHABET.size();
        //m = m % n;
        key = key % n;
        //int reversedM = -1;
        /*for (int i = 0; i < n; i++) {
            if ((i % n == 1)) {
                reversedM = i;
                break;
            }
        }*/
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = ALPHABET.indexOf(c);
            index = ((index - key) % n + n) % n;
            newText.append(ALPHABET.get(index));
        }
        return newText.toString();
    }
}
