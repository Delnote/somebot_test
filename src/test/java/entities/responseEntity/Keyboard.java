
package entities.responseEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Keyboard {

    @SerializedName("text")
    @Expose
    public String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Keyboard() {
    }

    /**
     * 
     * @param text
     */
    public Keyboard(String text) {
        super();
        this.text = text;
    }

}
