package Tecnicas;

public class Concurrencias {

    public static void main(String[] args) {
        int myArray [] = {1, 2, 2, 5, 4, 6, 7, 8, 8, 8}; // Puede editar este arreglo para probar otros valores

        int longest = 1;
        int numero = myArray[0];
        int current = 1;

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == myArray[i - 1]) {
                current++;
                if (current > longest) {
                    longest = current;
                    numero = myArray[i];
                }
            } else {
                current = 1;
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Numero: " + numero);
    }
}
