package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Function2 {
    public static void main(String args[]) {
        String asm = "^([A-Za-z0-9])@(.+)$"; //idk how to check for a dot, sry :)
        Pattern pattern = Pattern.compile(asm);
        for (String arg : args) {
            Matcher matcher = pattern.matcher(arg);
            System.out.println(arg + ": " + matcher.matches());
        }
    }
}