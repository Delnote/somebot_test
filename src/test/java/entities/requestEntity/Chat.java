
package entities.requestEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chat {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("first_name")
    @Expose
    public String firstName;
    @SerializedName("last_name")
    @Expose
    public String lastName;
    @SerializedName("username")
    @Expose
    public String username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Chat() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param id
     * @param type
     * @param username
     */
    public Chat(Integer id, String type, String firstName, String lastName, String username) {
        super();
        this.id = id;
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

}
