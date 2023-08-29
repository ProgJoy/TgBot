package tg.bot.tgbot.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ChannelData {
    private String name;
    private String type;
    private long id;
    private List <Message> messages;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    public static class Message {
        @JsonProperty("id")
        private int id;
        @JsonProperty("type")
        private String type;
        @JsonProperty("date")
        private String date;
        @JsonProperty("date_unix_time")
        private String dateUnixTime;
        @JsonProperty("from")
        private String from;
        @JsonProperty("from_id")
        private String fromId;
        @JsonProperty("text")
        private String text;

        private TextEntity textEntity;

        @Data
        public static class TextEntity {
            private String type;
            private String text;

        }
            // Геттеры и сеттеры для всех полей


        @Override
        public String toString() {
            return "Message{" +
                    "id=" + id +
                    ", type='" + type + '\'' +
                    ", date='" + date + '\'' +
                    ", dateUnixTime='" + dateUnixTime + '\'' +
                    ", from='" + from + '\'' +
                    ", fromId='" + fromId + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }
}
