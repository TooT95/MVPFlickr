package mrj.example.mvpflickr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import mrj.example.mvpflickr.main.FlickrMedia;

/**
 * Created by JavohirAI
 */

public class FlickrPhoto implements Serializable {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("date_taken")
    @Expose
    private String date_taken;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("published")
    @Expose
    private String published;

    @SerializedName("author")
    @Expose
    private String author;

    @SerializedName("author_id")
    @Expose
    private String author_id;

    @SerializedName("media")
    @Expose
    private FlickrMedia media;

    public FlickrMedia getMedia() {
        return media;
    }

    public void setMedia(FlickrMedia media) {
        this.media = media;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate_taken() {
        return date_taken;
    }

    public void setDate_taken(String date_taken) {
        this.date_taken = date_taken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }
}
