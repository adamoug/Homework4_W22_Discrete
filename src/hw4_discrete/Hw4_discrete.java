/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4_discrete;

/**
 *
 * @author Lazarus
 */
public class Hw4_discrete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(EuclidGCD(2, 7));
        //System.out.println(EuclidGCD_old(12, 2));
        //System.out.println("d" + 33519 % 5);
    }

    /**
     * EuclidGCD algorithm. Takes the larger number and subtracts the smaller
     * number. Takes into account which number is larger and smaller. See code
     * for detailed steps. After the subtraction, the algorithm reassigns what
     * values to subtract, and loops until the numbers equal themselves. When
     * that's the case, it is the GCD.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int EuclidGCD(int num1, int num2) {
        //Initializing variables. 
        //a -> Larger number ; b -> smaller number ; c -> substraction value from a and b
        int a = 0;
        int b = 0;
        int c = -1; //c is -1 by default since we will loop while c != 0 (C does not equal 2).

        //1. Checking which number is greater. For ever is greater, will be assigned A, then the other B.
        boolean is1GreaterThan2 = num1 > num2;
        if (num1 == num2) {
            return num2;
        } else if (is1GreaterThan2) {
            a = num1;
            b = num2;
        } else if (!is1GreaterThan2) {
            b = num1;
            a = num2;
        }
        //2. Substracting loop (Euclid's Algorithm):

        while ((c != 0)) { //We keep looping as long as the subtraction is not zero, since a GCD cannot be zero. 
            c = a - b; //Substract both numbers, and store as c. 
            if (b < c) { //If b is smaller then c, we assign C to be the larger number. We can keep b as itself.
                a = c;
            } else if (b > c) { //If b is greater than c, b will be set as the larger number (a), while c will be the smaller number (assign to b).
                a = b;
                b = c;
            } else if (b == c) { //If both values are the same, the substraction will be zero, thus its value is the GCD ~ we return the numbers as GCD.
                return c;
            }
        }

        return c;

    }

    /**
     * Function to convert a number with base m to base n.
     *
     * @param basei
     * @param number
     * @param basef
     * @return
     */
    public static int TransformBase(int basei, int number, int basef) {
//        if (basei >= 2 && basei <= 16 && basef >= 2 && basef <= 16 && basei != basef) {
//
//        }

        String[] hexTable = {"a", "b", "c", "d", "e", "f"}; //index 0 is 10dec -> index 5 is 15dec.  
        
        //1. Convert base n to base 10. 
        //1.a Check if that base is already in base 10
        if (basei != 10) { //Convert from base i to 10. If its false, we know its already in base 10. 
            
        }return 0;
    }

}
