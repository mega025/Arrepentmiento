import java.util.Random;

public class Main {

    static class Dado {

        public static String tirarDados(int... args) {
            Random random = new Random();
            if (args.length == 1) {
                int caras = args[0];
                int resultado = random.nextInt(caras) + 1; // Adjust for 1-based index
                return String.format("Tiraste un dado de %d caras y obtuviste: %d", caras, resultado);
            }
}
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
                int caras;
                int cantidad;
                if (args.length == 1) {
                    caras = Integer.parseInt(args[i]);
                    System.out.println(Dado.tirarDados(caras));
                }
                    i++;
                   
    }
}
}
}
