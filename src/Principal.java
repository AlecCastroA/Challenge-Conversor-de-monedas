public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();

        ConvertirMoneda convertirMoneda = new ConvertirMoneda();

        while (true) {
            String opcion = menu.mostrarMenu();

            switch (opcion) {
                case "1":
                    convertirMoneda.realizarCambio("USD", "ARS");
                    break;
                case "2":
                    convertirMoneda.realizarCambio("ARS", "USD");
                    break;
                case "3":
                    convertirMoneda.realizarCambio("USD", "BRL");
                    break;
                case "4":
                    convertirMoneda.realizarCambio("BRL", "USD");
                    break;
                case "5":
                    convertirMoneda.realizarCambio("USD", "COP");
                    break;
                case "6":
                    convertirMoneda.realizarCambio("COP", "USD");
                    break;
                case "7":
                    System.out.println("Saliendo del programa. ¡Gracias por usar el conversor!");
                    return;
                default:
                    System.out.println("Opción incorrecta. Inténtelo nuevamente.");
                    break;
            }
        }
    }
}
