/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author ASUS
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        
        System.out.println("Array length: "+arrayInt.length);
        
        System.out.println("Element at index 3 is: "+arrayInt[3]);
    }
}
