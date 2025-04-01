package it.heima;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);
    }
    private static String getCode() {
        ArrayList<Character> alphabetList = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            alphabetList.add((char)('a' + i));
            alphabetList.add((char)('A' + i));
        }

        System.out.println(alphabetList);
        Random r = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int alphabetIndex = r.nextInt(52);
            char c = alphabetList.get(alphabetIndex);
            sb.append(c);
        }

        int randomIndex = r.nextInt(10);
        sb.append(randomIndex);

        String code = sb.toString();

        char[] codeCharArr = code.toCharArray();
        for (int i = 0; i < codeCharArr.length; i++) {
            int index = r.nextInt(codeCharArr.length);

            char tmp = codeCharArr[i];
            codeCharArr[i] = codeCharArr[index];
            codeCharArr[index] = tmp;
        }

        String finalCode = new String(codeCharArr);
        return finalCode;
    }
}
