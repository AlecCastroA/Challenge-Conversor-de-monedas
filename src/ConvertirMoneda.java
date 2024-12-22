import java.util.Scanner;

public class ConvertirMoneda {
    ConsultarCambio consulta = new ConsultarCambio();

    Scanner lectura = new Scanner(System.in);

    void realizarCambio(String tasaOrigen, String tasaSalida) {
        try {
            System.out.println("Ingrese el valor que deseas convertir:");
            double valor = Double.parseDouble(lectura.nextLine());

            if (valor <= 0) {
                System.out.println("Por favor, ingrese un valor mayor a 0.");
                return;
            }

            Cambio cambio = consulta.buscarCambio(tasaOrigen, tasaSalida);

            if (cambio == null || cambio.conversion_rate() == 0) {
                System.out.println("No se pudo obtener la tasa de cambio de " + tasaOrigen + " a " + tasaSalida + ". Por favor, verifica e inténtalo más tarde.");
                return;
            }

            System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]\n\n",
                    valor, cambio.base_code(), valor * cambio.conversion_rate(), cambio.target_code());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}