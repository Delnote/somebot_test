
package entities.requestEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
public class RequestEntity {

    @SerializedName("update_id")
    @Expose
    public Integer updateId;
    @SerializedName("message")
    @Expose
    public Message message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestEntity() {
    }

    /**
     * 
     * @param updateId
     * @param message
     */
    public RequestEntity(Integer updateId, Message message) {
        super();
        this.updateId = updateId;
        this.message = message;
    }

}
