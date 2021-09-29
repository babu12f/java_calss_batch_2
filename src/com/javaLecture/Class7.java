package com.javaLecture;

public class Class7 {
    public static void main(String[] args) {
//        int[][] data = new int[2][3];
        /*int[][] data = {{10, 22, 34},
                        {34, 52, 60}};

        int[] a = {1, 2, 3};

        int rs = data.length;
        int cs = data[0].length;

        for (int i = 0; i<rs; i++){
            for(int j = 0; j<cs; j++){
                System.out.print(data[i][j]+ " ");
            }
            System.out.println();
        }*/

        /*int[] myArray = {4, 56, 12, 567, 90};
        for (int i : myArray) {
            System.out.println(i);
        }
        int[][] data = {
                        {10, 22, 34},
                        {34, 52, 60}
        };
        for (int[] arr : data){
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }*/

        /*int[][] data = {
                {10, 22, 34},
                {340, 52}
        };

        int rs = data.length;
        for (int i = 0; i < rs; i++) {
            int cs = data[i].length;
            for(int j=0; j< cs; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }*/

        int[] dataArray = {7, 45, 12, 16, 99, 100};
        int[] anotherArray = new int[6];

        for (int i = 0; i < dataArray.length; i++) {
            anotherArray[i] = dataArray[i];
        }

       //System.arraycopy(dataArray, 0, anotherArray, 0, dataArray.length);

        anotherArray[0] = 90000;
        System.out.println(dataArray[0]);

        System.out.println(anotherArray[0]);



    }
}
