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
public class MultiDimensionArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[1][0]=3;
        matrix[1][1]=4;
        
        System.out.println("Element at second row and first column is: "+
                matrix[1][0]);
        System.out.println("Number of rows: "+matrix.length);
        System.out.println("Number of columns: "+matrix[0].length);
    }
}
