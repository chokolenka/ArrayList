package Assertions;

import java.util.Arrays;

public class AE41 {
    //Дано: массив
    //Найти: два элемента
    public static void main(String[] args) {
        int arr[] = new int[]{5, 7, -8, 5, 14, 1};

        System.out.println(Arrays.toString(getSmallest(arr)));
        System.out.println(getSmallest2(arr));
        getSmallest3(arr);
    }

    public static int[] SE(int[] second_element) {
    /* System.out.println(second_element);
    return new int[]{second_element};*/
        return second_element;
    }

    //Универсальное решение
    public static int[] getSmallest(int[] arr){
        int[] result = new int[2];
        int first_element, second_element, arr_size = arr.length;

        first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first_element) {
                second_element = first_element;
                first_element = arr[i];
            } else if (arr[i] < second_element && arr[i] != first_element) second_element = arr[i];
        }
        result[0] = first_element;
        result[1] = second_element;
        return result;
    }

    //Вывести строку с результатом
    public static String getSmallest2(int[] arr){
        String result;
        int first_element, second_element, arr_size = arr.length;

        first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first_element) {
                second_element = first_element;
                first_element = arr[i];
            } else if (arr[i] < second_element && arr[i] != first_element) second_element = arr[i];
        }
        if (second_element == Integer.MAX_VALUE) result = "No second smallest element";
        else
            result = "The smallest number is " + first_element + " and the second smallest number is " + second_element + ".";

        return result;
    }

    //Вывести результат в консоль
    public static void getSmallest3(int[] arr){
        int first_element, second_element, arr_size = arr.length;

        first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first_element) {
                second_element = first_element;
                first_element = arr[i];
            } else if (arr[i] < second_element && arr[i] != first_element) second_element = arr[i];
        }
        if (second_element == Integer.MAX_VALUE) System.out.println("No second smallest element");
        else
            System.out.println("The smallest number is " + first_element + " and the second smallest number is " + second_element + ".");
    }
}