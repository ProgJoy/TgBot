package tg.bot.tgbot.data2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class Message {
    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("date")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;

    @JsonProperty("date_unixtime")
    public String getDate_unixtime() {
        return this.date_unixtime;
    }

    public void setDate_unixtime(String date_unixtime) {
        this.date_unixtime = date_unixtime;
    }

    String date_unixtime;

    @JsonProperty("actor")
    public String getActor() {
        return this.actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    String actor;

    @JsonProperty("actor_id")
    public String getActor_id() {
        return this.actor_id;
    }

    public void setActor_id(String actor_id) {
        this.actor_id = actor_id;
    }

    String actor_id;

    @JsonProperty("action")
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    String action;

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    @JsonProperty("text")
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text;

    @JsonProperty("text_entities")
    public ArrayList<TextEntity> getText_entities() {
        return this.text_entities;
    }

    public void setText_entities(ArrayList<TextEntity> text_entities) {
        this.text_entities = text_entities;
    }

    ArrayList<TextEntity> text_entities;

    @JsonProperty("from")
    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    String from;

    @JsonProperty("from_id")
    public String getFrom_id() {
        return this.from_id;
    }

    public void setFrom_id(String from_id) {
        this.from_id = from_id;
    }

    String from_id;

    @JsonProperty("edited")
    public Date getEdited() {
        return this.edited;
    }

    public void setEdited(Date edited) {
        this.edited = edited;
    }

    Date edited;

    @JsonProperty("edited_unixtime")
    public String getEdited_unixtime() {
        return this.edited_unixtime;
    }

    public void setEdited_unixtime(String edited_unixtime) {
        this.edited_unixtime = edited_unixtime;
    }

    String edited_unixtime;

    @JsonProperty("photo")
    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    String photo;

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int width;

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;
}
