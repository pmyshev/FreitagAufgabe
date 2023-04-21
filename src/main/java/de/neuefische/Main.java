package de.neuefische;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String password = "12345";
        System.out.println(isPasswordValid(password));

    }

    public static boolean isPasswordLengthValid(String password){

        return password.length() > 8;
    }

    public static boolean isPasswordContainsNumber(String password){

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean isPasswordWeak(String password){
        String[] weakPassworExamples = new String[]{"01234", "12345", "76543",
                "87654", "54321", "qwerty", "asdfg", "abcde", "passwort", "password"};
        for (int i = 0; i < weakPassworExamples.length; i++) {
            if (password.contains(weakPassworExamples[i])){
                return true;

            }
        }
        return false;

    }

    public static boolean isPasswordValid(String password){
        return isPasswordLengthValid(password)
                && isPasswordContainsNumber(password)
                && !isPasswordWeak(password);
    }
}