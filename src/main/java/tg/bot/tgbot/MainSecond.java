package tg.bot.tgbot;

import com.fasterxml.jackson.databind.ObjectMapper;
import tg.bot.tgbot.data.ChannelData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainSecond {

    public static void main(String[] args) {
        String filePath = "D:\\JavaProject\\TgBot\\src\\main\\resources\\messages_from_Kogda_nechego_otvetit\\result.json";  // Замените на путь к вашему JSON файлу

/*
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            ObjectMapper objectMapper = new ObjectMapper();
            ChannelData channelData = objectMapper.readValue(jsonData, ChannelData.class);

            if (channelData != null && channelData.getMessage() != null) {
                List<ChannelData.Message> messages = channelData.getMessage();
                for (ChannelData.Message message : messages) {
                    System.out.println(message.getText());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

    }
}
