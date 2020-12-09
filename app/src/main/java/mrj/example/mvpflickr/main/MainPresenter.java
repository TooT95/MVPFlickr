package mrj.example.mvpflickr.main;

import mrj.example.mvpflickr.model.Apis;
import mrj.example.mvpflickr.model.FlickrApi;
import mrj.example.mvpflickr.model.FlickrResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by JavohirAI
 */

public class MainPresenter implements MainContract.MainPresenter{

    private MainContract.MainView mMainView;
    private FlickrApi mFlickrApi;

    public MainPresenter(MainContract.MainView mainView) {
        mMainView = mainView;
        mFlickrApi = Apis.getFlickrApi();
    }

    @Override
    public void getAllPhotos() {
        mFlickrApi.getAllphotos("any","en-us","json","1").enqueue(new Callback<FlickrResponse>() {
            @Override
            public void onResponse(Call<FlickrResponse> call, Response<FlickrResponse> response) {
                FlickrResponse flickrResponse = response.body();
                if(flickrResponse!=null){
                    mMainView.showAllPhotos(flickrResponse.getResults());
                }
            }

            @Override
            public void onFailure(Call<FlickrResponse> call, Throwable t) {
                mMainView.showMessage(t.getMessage());
            }
        });
    }
}
