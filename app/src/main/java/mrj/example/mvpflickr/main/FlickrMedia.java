package mrj.example.mvpflickr.main;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by JavohirAI
 */

public class FlickrMedia implements Serializable {
    @SerializedName("m")
    @Expose
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
