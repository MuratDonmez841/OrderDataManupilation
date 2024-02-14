package request;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Post {
   public static String url = "https://dummyjson.com/posts/add";
    public static void postRequest(){
        JsonObject data = buildJsonObject();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("response code: " + response.statusCode());
            System.out.println("response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JsonObject buildJsonObject() {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("title", "murat");
        builder.add("userId", 5);
        return builder.build();
    }

}
