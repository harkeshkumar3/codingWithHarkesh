package org.example.company;

import  java.lang.*;

public class PhoneNumberWordDecoder {
    public static void main(String[] args) {
        String i = textToNum("123-647-EYES");
        System.out.println(i);
    }

     public static String textToNum(String phone){
         phone=phone.replaceAll("[ABC]", "2")
                 .replaceAll("[DEF]", "3")
                 .replaceAll("[GHI]", "4")
                 .replaceAll("[JKL]", "5")
                 .replaceAll("[MNO]", "6")
                 .replaceAll("[PQRS]","7")
                 .replaceAll("[TUV]","8")
                 .replaceAll("[WXYZ]","9");
         return phone;
     }

    public static String fullNumber(String phone) {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        String number = "";
        long strLen = phone.length();


        for (int currCharacter = 0; currCharacter < strLen; currCharacter++) {
            char ch = phone.charAt(currCharacter);
            // For A-Z & 0-9, multiply by 10, add the 'char' to number.
            // i.e., Shift existing value to the left by 1 digit, add current 'char' to it
            // Use long instead of int if the string will be longer than max int value (2147483647)

            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'A':
                    case 'B':
                    case 'C':
                        number += "2";
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        number+="3";
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        number += "4";
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        number += "5";
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        //number *= 10;
                        number += 6;
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                       // number *= 10;
                        number += 7;
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                      //  number *= 10;
                        number += 8;
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        number += 9;
                        break;
                }
            }  else {
                number += (ch);
            }

        } // End of for loop

        // Return actual number only at the end of the function
        return number;

    }//
}


///1236473937
//123-647-3937