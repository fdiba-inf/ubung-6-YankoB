package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
     int number = input.nextInt();
     assert number>0;
     int revNumber=0;
     int eingNum=number;
     boolean P = false;

     while(eingNum > 0){
       revNumber= (revNumber*10)+(eingNum%10);
       eingNum /= 10;
       }
       if(revNumber==number){
         P=true;
         System.out.println("Palindrome: " + P);
       }else{
         System.out.println("Palindrome: " + P);
       }
     }
     }   