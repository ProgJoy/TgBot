package tg.bot.tgbot.Controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import tg.bot.tgbot.config.BotConfig;

@Component
public class TgController extends TelegramLongPollingBot{

    private final BotConfig botConfig;

    public TgController() {
        botConfig = new BotConfig();
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
        else response = "че ты спизданул";
        return response;
    }

    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }
}
