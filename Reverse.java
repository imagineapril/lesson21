package ru.timokhina.lesson21;

public class Reverse {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(myArray);
        for (int i = 0; i < myArray.length-1; i++) {
            int start = 0;
            int end = myArray.length-1;
            while (start < end) {
                int temp = myArray[start];
                myArray[start] = myArray[end];
                myArray[end] = temp;
                start++;
                end--;
            }

        }
        print(myArray);
    }

    public static void print(int myArray[]) {
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j]);
            System.out.print((j < myArray.length - 1) ? " , " : "\n");
        }
    }
}
