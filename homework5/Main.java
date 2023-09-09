package homework5;

import homework5.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList train = new LinkedList(10);
        train.push(20);
        train.push(30);
        train.push(40);
        train.removeByIndex(2);
        System.out.println(train.next.value);
        System.out.println(train.length());
        System.out.println(train.value);
    }
}
