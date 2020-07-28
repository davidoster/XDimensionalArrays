/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdimensionalarrays;

/**
 *
 * @author mac
 */
public class XDimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][][] = new int[2][2][2]; // [0][0] [0][1]
        // [1][0] [1][1]

        System.out.println("array length" + array.length); // 1st dimension
//        System.out.println("array[0] length " + array[1][2].length); // 2nd dimension

//        int array2[] = new int[5];
//        
//        array2[0] = 100;
//        array2[1] = 100;
//        for (int i = 0; i < 4; i++) {
//            array2[i] = 100;
//        }
//        
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                for (int k = 0; k < array[0][0].length; k++) {
//                    array[i][j][k] = 100;
//                    System.out.println(array[i][j][k]);
//                    
//                }
//                
//            }
//            
//        }
        initArray(100,array);
        printArray(array, false);
        int max = findMaxNumber(array);
        System.out.println(max);
        System.out.println(findMaxNumber(array));
        
    }

    // initArray <--- array, int value
    public static void initArray(int value, int array[][][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = value + (i * j) + (k * j);
                }
            }
        }
    }

    // printArray <--- array
    public static void printArray(int array[][][], boolean sort) {
        
        if (sort == true) {
            System.out.println("true");
             for (int i = array.length - 1; i >= 0; i--) { // i = 2-1, 
                for (int j = array[0].length - 1; j >= 0; j--) {
                    for (int k = array[0][0].length - 1; k >= 0; k--) {
                        String s = "array["+ i + "]["+ j +"]["+ k +"] = ";
                        System.out.println(s + array[i][j][k]);
                    }
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    for (int k = 0; k < array[0][0].length; k++) {
                        String s = "array["+ i + "]["+ j +"]["+ k +"] = ";
                        System.out.println(s + array[i][j][k]);
                    }
                }
            }
        }
    }
    
    public static int findMaxNumber(int array[][][]){
        int tempMax = array[0][0][0];
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    for (int k = 0; k < array[0][0].length; k++) {
                        if (tempMax < array[i][j][k]) {
                            tempMax = array[i][j][k];
                            
                        }
                    }
                }
            }
        return tempMax;
    }
    

    // create a method that asks from the user 4 numbers
    // store these numbers to an array
    // then create the following methods:
    // findMaxNo
    // findMinNo
    // findAverage, 1,2,3,4 = average() = (1+2+3+4)/4
    // without using an array variable within main()
    
}
