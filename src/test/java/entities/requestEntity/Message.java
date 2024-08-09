
package entities.requestEntity;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
public class Message {

    @SerializedName("message_id")
    @Expose
    public Integer messageId;
    @SerializedName("from")
    @Expose
    public From from;
    @SerializedName("date")
    @Expose
    public Integer date;
    @SerializedName("chat")
    @Expose
    public Chat chat;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("entities")
    @Expose
    public List<Entity> entities = new ArrayList<Entity>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param date
     * @param entities
     * @param chat
     * @param messageId
     * @param from
     * @param text
     */
    public Message(Integer messageId, From from, Integer date, Chat chat, String text, List<Entity> entities) {
        super();
        this.messageId = messageId;
        this.from = from;
        this.date = date;
        this.chat = chat;
        this.text = text;
        this.entities = entities;
    }

}
