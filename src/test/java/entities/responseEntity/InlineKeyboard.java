
package entities.responseEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InlineKeyboard {

    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("url")
    @Expose
    public String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InlineKeyboard() {
    }

    /**
     * 
     * @param text
     * @param url
     */
    public InlineKeyboard(String text, String url) {
        super();
        this.text = text;
        this.url = url;
    }

}
