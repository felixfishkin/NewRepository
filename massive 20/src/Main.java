import java.util.Arrays;

/* 1. Дан массив интов длиной 20


а. Найти максимальное среди них
б. Найти сумму интов
в. напечсатать массив. развернуть(отзеркалить). Напечатать заново
г. удалить из массива все повторяющиеся значения

2. Доделать джава раш до 10 уровня включительно

 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        // Заполнить случайными значениями от 0 до 1000
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        //Найти максимальное среди них
        int max = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива:");
        System.out.println(max);
        System.out.println();
        // Найти сумму интов
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма всех значений массива:");
        System.out.println(sum);
        System.out.println();
        // напечсатать массив.
        System.out.println("Последовательность значений в массиве:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        //развернуть(отзеркалить).
        int[] arrayTemp = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayTemp[(array.length - 1) - i];
        }
        //Напечатать заново
        System.out.println("Последовательность значений в массиве после отзеркаливания:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        //г. удалить из массива все повторяющиеся значения
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.println("Последовательность значений в массиве после удаления дубликатов:");
        System.out.println(Arrays.toString(array));
        System.out.println();


    }
}