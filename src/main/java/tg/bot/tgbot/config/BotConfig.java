package tg.bot.tgbot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

    public static String botName = "SayMeAWordBot";
    public static String token = "6361391982:AAFDuWLjZoego0oka7R2c608wkIOyTCjceE";

}
