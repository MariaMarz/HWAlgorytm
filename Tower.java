package Algorithmus2;

public class Tower {
    public static void main(String[] args) {
        int n = 3;
        String left = "Левый стержень";
        String middle = "Средний стержень";
        String right = "Правый стержень";


        moveDisks(n, left, middle, right);
    }

    public static void moveDisks(int n, String left, String middle, String right) {
        if (n > 0) {
            moveDisks(n - 1, left, middle, right);
            System.out.println("Перемещаем диск с " + left + " на " + right);
            moveDisks(n - 1, middle, right, left);
        }
    }
}
