package tg.bot.tgbot.data2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextEntity {
    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("text")
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text;
}
