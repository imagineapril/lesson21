package ru.timokhina.lesson21;

public class Shift {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(myArray);
        for (int i = 0; i < myArray.length-1; i++) {
            myArray[i] = myArray[i+1];
        }
        myArray[myArray.length-1] = 0;
        print(myArray);
    }

    public static void print(int myArray[]) {
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j]);
            System.out.print((j < myArray.length - 1) ? " , " : "\n");
        }
    }




}
