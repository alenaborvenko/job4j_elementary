package ru.job4j.array;

public class Defragment {
    /**
     * Метод для того, чтобы поменять местами ячейки. Массивы - это ссылочный тип, поэтому return не нужен,
     * передача в метод будет по ссылке, поэтому при выходе из метода массив в вызывающем методе тоже изменится
     * @param array - массив
     * @param source - индекс, какую ячейку менять
     * @param dest - индекс с какой ячейкой менять
     */
    public static void swap(String[] array, int source, int dest) {
        String  tmp = array[dest];
        array[dest] = array[source];
        array[source] = tmp;
    }

    /**
     * Метод для дефрагментации массива (все пустые ячейки окажутся в конце массива).
     * 1. цикл по всему массиву
     * 2. if ( значение текущей ячейки == null)
     * 3.     цикл по оставшейся части массива, начиная со следующей ячейки после null
     * 4.     if ( значение текущей ячейки не null)
     * 5.         меняем местами null и не null - ячейки
     * 6. переходим к следующей ячейки после null
     * @param array - исходный массив
     * @return - возващает исходный массив.
     */
    public static String[] compress(String[] array) {
        for (int nullPoint = 0; nullPoint < array.length; nullPoint++) {
            if (array[nullPoint] == null) {
                for (int notNullPoint = nullPoint + 1; notNullPoint < array.length; notNullPoint++) {
                    if (array[notNullPoint] != null) {
                        swap(array, nullPoint, notNullPoint);
                        break;
                    }
                }

            }
        }
        return array;
    }
}
