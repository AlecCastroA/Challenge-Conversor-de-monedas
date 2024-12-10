import java.util.Scanner;

public class ConvertirMoneda {
    ConsultarCambio consulta = new ConsultarCambio();

    Scanner lectura = new Scanner(System.in);

    void realizarCambio(String tasaOrigen, String tasaSalida) {
        System.out.println("Ingrese el valor que deseas convertir:");
        double valor = Double.parseDouble(lectura.nextLine());

        Cambio cambio = consulta.buscarCambio(tasaOrigen, tasaSalida);

        System.out.println("El valor " + valor + " [" + cambio.base_code() + "] corresponde al valor final de =>>> "
                + valor*cambio.conversion_rate() + " [" + cambio.target_code() + "]\n");
    }
}
