package exercise6;

import java.util.Scanner;
import java.lang.Character; 
import java.util.Arrays;

public class PasswordCheck {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        boolean length;
        boolean content;
        boolean check=false;

        while(!check)
        {
        System.out.println("Enter a password: ");
        String password = input.next();
        int passwordLength = password.length();

            if (passwordLength < 8) {
                length=false;
            }else{
                length = true;
            }

            char[] n = password.toCharArray();
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n.length; i++) {
                if (!Character.isLetterOrDigit(n[i])) {
                    count1++;
                }
            }
            for (int i = 0; i < n.length; i++) {
                if (Character.isDigit(n[i])) {
                    count2++;
                }
            }

            if (count1 > 0 || count2 < 2) {
                content = false;
            } else {
                content = true;
            }


            if (content && length) {
                System.out.println("Password valid!");
                check=true;
            }}
        }

    }