import java.util.Scanner;

public class Menu {
    public String mostrarMenu() {
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
        System.out.println(asteriscos+"\n");

        Scanner lectura = new Scanner(System.in);
        return lectura.nextLine();
    }
}
