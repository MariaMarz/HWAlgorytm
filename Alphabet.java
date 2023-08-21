package Algorithmus6;

public class Alphabet {
    public static void main(String[] args) {
        String text = "как прекрасен этот мир";
        int[] lettersQuantity = new int[33];


        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if ('а' <= letter && letter <= 'я') {
                lettersQuantity[letter - 'а']++;
            }
        }

        for (int i = 0; i < lettersQuantity.length; i++) {
            char letter = (char) (i + 'а');
            System.out.println(letter + ": " + lettersQuantity[i]);
        }
    }
}
