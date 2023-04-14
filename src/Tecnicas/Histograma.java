package Tecnicas;

public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1,2,1,3,3,1,2,1,5,1};
        int[] frecuencia = new int[6];

        // Calcular frecuencia de cada número en myArray
        for (int i = 0; i < myArray.length; i++) {
            frecuencia[myArray[i]]++;
        }

        // Imprimir histograma
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
