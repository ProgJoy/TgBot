package tg.bot.tgbot.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ChannelData {
    private String name;
    private String type;
    private long id;

    @JsonProperty("messages")
    private List<Messages> messages;

    //@JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Messages {
        private int id;
        private String type;
        private String date;
        private String date_unixtime;
        private String from;
        private String from_id;
        private String edited;
        private String edited_unixtime;
        private String photo;
        private int width;
        private int height;
        private String file;
        private String thumbnail;
        private String media_type;
        private String sticker_emoji;
        private String actor;
        private String actor_id;
        private String action;
        private String title;
        @JsonProperty("text")
        private String text;
        private List<TextEntity> text_entities;

        // Геттеры и сеттеры

        @Data
        public static class TextEntity {
            private String type;
            private String text;

            // Геттеры и сеттеры
        }
    }


}
