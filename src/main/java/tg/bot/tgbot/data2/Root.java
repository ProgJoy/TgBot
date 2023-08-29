package tg.bot.tgbot.data2;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
 import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import java.util.ArrayList;
import java.util.Date;
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

public class Root{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("id")
    public int getId() {
        return this.id; }
    public void setId(int id) {
        this.id = id; }
    int id;
    @JsonProperty("messages")
    public ArrayList<Message> getMessages() {
        return this.messages; }
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages; }
    ArrayList<Message> messages;
}

