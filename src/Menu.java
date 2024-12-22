import java.util.Scanner;

public class Menu {
    public String mostrarMenu() {
        Scanner lectura = new Scanner(System.in);
        String opcion;

        while (true) {
            try {
                String asteriscos = "*".repeat(55);
                System.out.println(asteriscos);
                System.out.println(
                        "Sea bienvenido/a al Conversor de Moneda =]\n" +
                                "\n1) Dólar =>> Peso argentino" +
                                "\n2) Peso argentino =>> Dólar" +
                                "\n3) Dólar =>> Real brasileño" +
                                "\n4) Real brasileño =>> Dólar" +
                                "\n5) Dólar =>> Peso colombiano" +
                                "\n6) Peso colombiano =>> Dólar" +
                                "\n7) Salir" +
                                "\nElija una opción válida:"
                );
                System.out.println(asteriscos + "\n");

                opcion = lectura.nextLine();

                if (opcion.matches("[1-7]")) {
                    return opcion;
                } else {
                    System.out.println("Opción incorrecta. Por favor, elige un número del 1 al 7.");
                }
            } catch (Exception e) {
                System.out.println("Error en la entrada: " + e.getMessage());
            }
        }
    }
}