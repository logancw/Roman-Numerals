//                                                Assignment #33 Roman Numerals
//                                                      Logan Weisgerber
//                                                          11/27/2023


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class App{
    private static int currentNumber = 0;
    private final static int[] ARR = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; // static final int[] array CANT BE CHANGED 
    private final static String[] ROMAN_NUMERAL = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; // static final int[] array CANT BE CHANGED 
    private static String s = ""; // Empty  string var

    public static String romanConversion(int og){ // Require the number you want to convert
        currentNumber = og; // current number is == to the val of og
        for(int i = 0; i < ARR.length; i++){
        // loop through the length of the int[] array
        //    System.out.println(currentNumber);
           while (currentNumber >= ARR[i]) { // While the currentNumber is greater than the value the loop is on [i]
             s = s + ROMAN_NUMERAL[i]; // String is equaled to the value of s + the roman number i is equaled too
             currentNumber = currentNumber - ARR[i]; // subtract i from the current number
           }
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int number; 
        System.out.println("Enter an integer you\'d like to convert to a roman numeral: ");
        number = kb.nextInt();
        System.out.println("The converted is " + romanConversion(number)); // Convert the base ten num to roman.
    }
}