
package entities.requestEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class From {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("first_name")
    @Expose
    public String firstName;
    @SerializedName("is_bot")
    @Expose
    public Boolean isBot;
    @SerializedName("last_name")
    @Expose
    public String lastName;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("language_code")
    @Expose
    public String languageCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public From() {
    }

    /**
     * 
     * @param firstName
     * @param isBot
     * @param lastName
     * @param id
     * @param languageCode
     * @param username
     */
    public From(Integer id, String firstName, Boolean isBot, String lastName, String username, String languageCode) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.isBot = isBot;
        this.lastName = lastName;
        this.username = username;
        this.languageCode = languageCode;
    }

}
