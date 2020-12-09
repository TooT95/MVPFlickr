package mrj.example.mvpflickr.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by JavohirAI
 */

public interface FlickrApi {
    @GET("photos_public.gne")
    Call<FlickrResponse> getAllphotos(@Query("tagmode") String tagmode, @Query("lang") String lang, @Query("format") String format,@Query("nojsoncallback") String nojsoncallback);
}
