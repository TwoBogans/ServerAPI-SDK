package au.twobbeetwotee.api;

import lombok.Cleanup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author <a href="https://github.com/tycrek/fcapi-java/blob/master/src/main/java/dev/jmoore/fcapi/api/Http.java">fcapi-java</a>
 * <p>
 * HTTP utility class.
 */
public class Http {
    static String GET(String url) throws IOException {
        var obj = new URL(url);
        var con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {

            @Cleanup var reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            var response = new StringBuilder();
            var inputLine = "";

            while ((inputLine = reader.readLine()) != null)
                response.append(inputLine);

            return response.toString();
        } else {
            System.out.println("GET request not worked");
            System.out.println("GET Response Code :: " + responseCode);
            System.out.println("GET Response Message :: " + con.getResponseMessage());
            throw new IOException("GET request not worked");
        }
    }
}