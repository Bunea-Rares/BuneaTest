package ro.info.uvt.buneatest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class BuneaTest {

    public static void main(String[] args) throws IOException {


        SpringApplication.run(BuneaTest.class, args);
        List<Message> messageList = new ObjectMapper().readValue(new URL("file:messages.json"), new TypeReference<List<Message>>() {
        });
        MessageDecoder a = new MessageDecoder();
        messageList.forEach(m -> System.out.println(a.decodeMessage(m.getMessage(), m.getHouse())));
    }

}