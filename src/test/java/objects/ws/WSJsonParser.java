package objects.ws;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WSJsonParser {
    ObjectMapper objectMapper = new ObjectMapper();

    public Object rangaradjangoo() throws IOException {
        return objectMapper.readValue(new File("src/test/resources/ws/responseWithRangaradjangoo.json"), MyResponse.class);
    }

    public Object allUsers() throws IOException {
        return objectMapper.readValue(new File("src/test/resources/ws/allusers.json"), MyResponse.class);
    }





    public void getUserBerta() throws IOException {
        User userA = objectMapper.readValue(new File("src/test/resources/ws/berta.json"), User.class);
    }

    public void getUserJohn() throws IOException {
        User userA = objectMapper.readValue(new File("src/test/resources/ws/john.json"), User.class);
    }

    public void getUserRangaradjangoo() throws IOException {
        User userA = objectMapper.readValue(new File("src/test/resources/ws/rangaradjangoo.json"), User.class);
    }

    public void getUserSaldo() throws IOException {
        User userA = objectMapper.readValue(new File("src/test/resources/ws/saldo.json"), User.class);
    }

    public void getUserSimon() throws IOException {
        User userA = objectMapper.readValue(new File("src/test/resources/ws/simon.json"), User.class);
    }
}
