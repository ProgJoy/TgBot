package tg.bot.tgbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import tg.bot.tgbot.data.ChannelData;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class KNOService {
    private final String filePath = "src/main/java/result.json";

    private ChannelData channelData;
    private List<ChannelData.Messages> messages;

    public KNOService(){

        try {
            //byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            ObjectMapper objectMapper = new ObjectMapper();
            channelData = objectMapper.readValue(new File(filePath), ChannelData.class);
            if (channelData != null && channelData.getMessages() != null) {
                messages = channelData.getMessages();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String GetRandomMessage(){
        return messages.get(new Random().nextInt(0, messages.size() -1)).getText();
    }
}
