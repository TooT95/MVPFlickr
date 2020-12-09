package mrj.example.mvpflickr.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JavohirAI
 */

public class Apis {

    private static final String BASE_URL = "https://api.flickr.com/services/feeds/";

    private static Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static FlickrApi getFlickrApi(){
        return getRetrofitInstance().create(FlickrApi.class);
    }


}
