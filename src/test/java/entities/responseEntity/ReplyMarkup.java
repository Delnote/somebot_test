
package entities.responseEntity;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReplyMarkup {

    @SerializedName("inline_keyboard")
    @Expose
    public List<List<InlineKeyboard>> inlineKeyboard = new ArrayList<List<InlineKeyboard>>();
    @SerializedName("keyboard")
    @Expose
    public List<List<Keyboard>> keyboard = new ArrayList<List<Keyboard>>();
    @SerializedName("resize_keyboard")
    @Expose
    public Boolean resizeKeyboard;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReplyMarkup() {
    }

    /**
     * 
     * @param keyboard
     * @param inlineKeyboard
     * @param resizeKeyboard
     */
    public ReplyMarkup(List<List<InlineKeyboard>> inlineKeyboard, List<List<Keyboard>> keyboard, Boolean resizeKeyboard) {
        super();
        this.inlineKeyboard = inlineKeyboard;
        this.keyboard = keyboard;
        this.resizeKeyboard = resizeKeyboard;
    }

}
