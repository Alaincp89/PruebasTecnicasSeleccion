package Tecnicas;

public class EncuentraNumero {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 2, 7, 0}; // el arreglo de ejemplo
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == 10) {// encuentra dos numeros de mi arreglo que sumen 10
                    System.out.println(myArray[i] + " " + myArray[j]);
                }
            }
        }
    }

}
