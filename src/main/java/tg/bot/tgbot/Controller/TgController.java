package tg.bot.tgbot.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import tg.bot.tgbot.config.BotConfig;
import tg.bot.tgbot.service.KNOService;

@Slf4j
@Component
public class TgController extends TelegramLongPollingBot{

    private BotConfig botConfig;
    KNOService knoService;

    @Autowired
    public TgController() {
        this.botConfig = botConfig;
        knoService = new KNOService();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            Message msg = update.getMessage();
            String chatId = msg.getChatId().toString();

            String response = parseMessage(msg.getText());

            SendMessage sendMsg = new SendMessage();

            sendMsg.setChatId(chatId);
            sendMsg.setText(response);

            try {
                execute(sendMsg);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String parseMessage(String textMsg){
        String response;

        if (textMsg.equals("/start"))
            response = "Ты куда жмешь, попуск ебаный";
        else if (textMsg.equals("/get"))
            response = "бля, ну функционал я еще не придумал";
        //else response = "fsdfa";
        else if(textMsg.equals("228"))
            response = "о, нигер, салам,че там слейвс?";
        else response = knoService.GetRandomMessage();
        return response;
    }

    @Override
    public String getBotUsername() {
        return botConfig.botName;
    }

    @Override
    public String getBotToken() {
        return botConfig.token;
    }
}
