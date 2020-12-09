package mrj.example.mvpflickr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JavohirAI
 */

public class FlickrResponse {
    @SerializedName("items")
    @Expose
    private List<FlickrPhoto> results;

    public FlickrResponse (List<FlickrPhoto> results){
        this.results = results;
    }

    public List<FlickrPhoto> getResults(){
        return results;
    }

}
