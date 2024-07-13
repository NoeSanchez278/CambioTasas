import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarDivisa {
    public TasaDeCambio buscaDivisa(String divisa,String divisa2){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6d5d7ef5dff3d50a7f9d4b4d/pair/"+ divisa +"/"+ divisa2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String>  response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),TasaDeCambio.class);
        } catch (Exception e) {
            throw new RuntimeException("Divisa no encontrada");
        }





    }
}
