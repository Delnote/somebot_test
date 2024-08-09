
package entities.responseEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseEntity {

    @SerializedName("chat_id")
    @Expose
    public String chatId;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("parse_mode")
    @Expose
    public String parseMode;
    @SerializedName("disable_web_page_preview")
    @Expose
    public Boolean disableWebPagePreview;
    @SerializedName("reply_markup")
    @Expose
    public ReplyMarkup replyMarkup;
    @SerializedName("method")
    @Expose
    public String method;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseEntity() {
    }

    /**
     * 
     * @param chatId
     * @param method
     * @param replyMarkup
     * @param text
     * @param parseMode
     * @param disableWebPagePreview
     */
    public ResponseEntity(String chatId, String text, String parseMode, Boolean disableWebPagePreview, ReplyMarkup replyMarkup, String method) {
        super();
        this.chatId = chatId;
        this.text = text;
        this.parseMode = parseMode;
        this.disableWebPagePreview = disableWebPagePreview;
        this.replyMarkup = replyMarkup;
        this.method = method;
    }

}
