package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* меняем 5 и 1. запомним цифру 5*/
        array[0] = array[3]; /* вместо 5 запишем 1*/
        array[3] = temp; /* вместо 1 запишем цифру 5. массив после перестановки {1, 3, 2, 5, 4} */
        temp = array[1]; /* меняем 3 и 2. запомним цифру 3*/
        array[1] = array[2]; /* вместо 3 запишем цифру 2. */
        array[2] = temp; /* вместо 2 запишем циуфру 3. массив после перестановки {1, 2, 3, 5, 4} */
        temp = array[3]; /* меняем 5 и 4. Запомним цифру 5 */
        array[3] = array[4]; /* вместо 5 запишем 4 */
        array[4] = temp; /* вместо 4 запишем циуфру 5. массив после перестановки {1, 2, 3, 4, 5} */
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
