package Tecnicas;

public class TableroDamas {
    public static void main(String[] args) {
        int n = 5; // Tamaño predeterminado del tablero de damas

        // Si se proporciona un argumento en la línea de comandos, se utiliza como el tamaño del tablero
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("El argumento debe ser un número entero. Se utilizará el tamaño predeterminado.");
            }
        }

        // Imprimir el tablero de damas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Si la suma de los índices de fila y columna es par, imprimir una "X" para representar el color negro
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else { // De lo contrario, imprimir un "_" para representar el color blanco
                    System.out.print("_");
                }
            }
            // Imprimir una nueva línea después de cada fila del tablero
            System.out.println();
        }
    }


}
