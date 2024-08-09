
package entities.requestEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entity {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("offset")
    @Expose
    public Integer offset;
    @SerializedName("length")
    @Expose
    public Integer length;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entity() {
    }

    /**
     * 
     * @param offset
     * @param length
     * @param type
     */
    public Entity(String type, Integer offset, Integer length) {
        super();
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

}
