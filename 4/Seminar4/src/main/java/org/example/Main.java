package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    enum Color {
        RED("#FF0000"), GREEN("#00FF00");
        private String code;
        Color(String code){
            this.code = code;
        }

        public String getCode() {return code;}
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(Color.RED.getCode());

        Authenticator.checker("login1", "pass", "pass");
        Authenticator.checker("login1", "pass", "pass1");
        Authenticator.checker("login1;ljasfalsjfasfasfasfa", "pass", "pass");
    }
}