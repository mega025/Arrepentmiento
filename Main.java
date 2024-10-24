import java.util.Random;

public class Main {
    
    static class Dado {
        public static String tirarDados(int... args) {
            Random random = new Random();
            
            if (args.length == 1) {
                int caras = args[0];
                int resultado = random.nextInt(caras) + 1;
                return String.format("Tiraste un dado de %d caras y obtuviste: %d", caras, resultado);
            } else if (args.length == 2) {
                int caras = args[0];
                int cantidad = args[1];
                int[] resultados = new int[cantidad];
                int suma = 0;

                for (int i = 0; i < cantidad; i++) {
                    resultados[i] = random.nextInt(caras) + 1;
                    suma += resultados[i];
                }

                return String.format("Tiraste %d dados de %d caras y obtuviste: %s (suma total: %d)",
                        cantidad, caras, java.util.Arrays.toString(resultados), suma);
            } else {
                throw new IllegalArgumentException("Debes proporcionar 1 o 2 argumentos.");
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                int caras = Integer.parseInt(args[0]);
                System.out.println(Dado.tirarDados(caras));
            } else if (args.length == 2) {
                int caras = Integer.parseInt(args[0]);
                int cantidad = Integer.parseInt(args[1]);
                System.out.println(Dado.tirarDados(caras, cantidad));
            } else {
                System.out.println("Debes proporcionar 1 o 2 argumentos.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar números válidos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
