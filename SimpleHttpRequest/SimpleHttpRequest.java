import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimpleHttpRequest {
    public static void main(String[] args) {
        try {
            // Creating an HTTP Client
            HttpClient client = HttpClient.newHttpClient();

            // Building an HTTP GET Request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts/1"))
                    .GET() // This is a GET request
                    .build();

            // Sending the request and getting the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Displaying the response
            System.out.println("HTTP Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
