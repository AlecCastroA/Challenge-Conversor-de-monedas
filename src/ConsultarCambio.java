import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambio {

    String apiKey = "ea6fe2e7ebf9fa1f02fadbd0";

    Cambio buscarCambio(String tasaOrigen, String tasaSalida){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + tasaOrigen + "/" + tasaSalida);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: No se pudo conectar con el servicio de cambio de divisas. Por favor, verifica tu conexión a internet.");
            return null;
        }

        if (response.statusCode() != 200) {
            System.out.println("Error: La API devolvió un código de estado no exitoso (" + response.statusCode() + ").");
            return null;
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        return gson.fromJson(response.body(), Cambio.class);
    }
}
