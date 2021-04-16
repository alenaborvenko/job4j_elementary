package ru.job4j.condition;

public class Club {
    /** Метод, проверяющий пустят ли нас в клуб
     * логика: если у нас есть деньги или наш друг, то нас пускают в клуб
     * @param hasMoney - есть деньги
     * @param beFriend - друг или нет
     */
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
