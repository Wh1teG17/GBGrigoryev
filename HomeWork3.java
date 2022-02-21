/**
 * @name Homework 3
 * @author Grigoryev
 * @date 21.02.2022
 * */
import java.util.Arrays;
class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println(Arrays.toString(fillArray()));
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        fillDiagonal(5);
    }

// Задание 1
        static void invertArray() {
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++)
                array[i] = 1 - array[i];
            System.out.println(Arrays.toString(array));
        }

// Задание 2
        static int[] fillArray () {
            int[] array = new int[101];
            for (int i = 0, j = 1; i < array.length; i++, j += 1)
                array[i] = j;
            return array;
        }

// Задание 3
        static int[] changeArray ( int[] array){
            for (int i = 0; i < array.length; i++)
                if (array[i] < 6)
                    array[i] *= 2;
            return array;
        }

// Задание 4
        static void fillDiagonal ( int size){
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                matrix[i][i] = 1;
                matrix[i][size - i - 1] = 1;
            }
            System.out.println(Arrays.deepToString(matrix));
            for (int i = 0; i < size; i++)
                System.out.println(Arrays.toString(matrix[i]));
        }
    }

