package com.company;

public class zad1 {

    public static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
        return count;

    }
    public static int countSubStr(String str, String subStr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(subStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        System.out.println(count);
        return count;
    }
    public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        System.out.println(str.substring(position, position + length));
        return str.substring(position, position + length);
    }
    public static String repeat(String str, int n) {
        String result = new String();
        for (int i=0; i<n;i++) {
            result += str;
        }
        System.out.println(result);
        return result;
    }
    public static int[] where(String str, String subStr) {
        int index = str.indexOf(subStr);
        int subStrLength = subStr.length();
        int[] res = new int[countSubStr(str, subStr)];
        int iter = 0;
        while (index != -1) {
            res[iter] = index;
            iter++;
            System.out.println(index);
            index = str.indexOf(subStr, index + subStrLength);

        }
        return res;
    }

    public static String change(String str)
    {
        StringBuffer newStr = new StringBuffer(str);

        for(int i = 0; i < str.length(); i++) {

            if(Character.isLowerCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(newStr);
        return newStr.toString();
    }
    public static String nice(String str){
        int zlicz = 0;
        char[] znaczek = str.toCharArray();
        StringBuffer nice = new StringBuffer();
        for (int i= znaczek.length-1; i>0; i--) {
            zlicz++;
            nice.append(znaczek[i]);
            if (zlicz % 3 == 0) {
                nice.append("`");
            }
        }
        nice.append(znaczek[0]);
        nice.reverse();
        System.out.println(nice.toString());
        return nice.toString();

    }


    public static void main(String[] args) {
        countChar("konstantynopolitanczykowianeczka", 'o');

        countSubStr("helloslkhellodjladfjhello", "hello");

        middle("middle");

        repeat("ho", 3);

        where("0123hello9012hello8901hello7890", "hello");

        change("Nameczylem sie robieniem");

        nice("11222233");
    }
}
