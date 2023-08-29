package tg.bot.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import tg.bot.tgbot.Controller.TgController;
import tg.bot.tgbot.config.BotConfig;

@SpringBootApplication
public class TgBotApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TgController.class, args);
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new TgController());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
