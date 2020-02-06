//1. Сгенерировать и отсортировать по возрастанию обычный массив из целых чисел (встроенной функцией sort()).

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
