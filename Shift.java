package ru.timokhina.lesson21;

public class Shift {
    public static void main(String[] args) {
        int[] myArray = {2, 8, 0, 5, 9, 3, 5, 7, 1, 4};
        print(myArray);
        int tmp = myArray[0];
        for (int i = 0; i < myArray.length-1; i++) {
            myArray[i] = myArray[i+1];
        }
        myArray[myArray.length-1] = tmp;
        print(myArray);
    }

    public static void print(int myArray[]) {
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j]);
            System.out.print((j < myArray.length - 1) ? " , " : "\n");
        }
    }




}
