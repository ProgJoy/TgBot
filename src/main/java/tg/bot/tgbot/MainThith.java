package tg.bot.tgbot;

import com.fasterxml.jackson.databind.ObjectMapper;
import tg.bot.tgbot.data.ChannelData;
import tg.bot.tgbot.data2.Root;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThith {

    public static void main(String[] args) throws IOException {
        String filePath = "result.json";

        try {
            File jsonFile = new File("D:\\JavaProject\\TgBot\\src\\main\\resources\\result.json"); // Замените на путь к вашему JSON файлу
            ObjectMapper objectMapper = new ObjectMapper();
            Root root = objectMapper.readValue(jsonFile, Root.class);

            // Теперь вы можете работать с данными в объекте Root
            System.out.println("Channel name: " + root.getName());
            System.out.println("Channel type: " + root.getType());
            System.out.println("Channel id: " + root.getId());

            // Пример вывода сообщения
            if (root.getMessages() != null && !root.getMessages().isEmpty()) {
                System.out.println("Message text: " + root.getMessages().get(0).getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            //String responseBody = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

            ObjectMapper om = new ObjectMapper();
            //RestTemplate restTemplate = new RestTemplate();

            //ResponseEntity<String> response = restTemplate.getForEntity(filePath, String.class);

            //ChannelData d = restTemplate.getForObject(filePath, ChannelData.class);

            //ChannelData d = om.readValue(responseBody, ChannelData.class);

            //System.out.println(d.getMessages().get(1).getText());
    }
}
