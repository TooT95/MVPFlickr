package mrj.example.mvpflickr.main;

import java.util.List;

import mrj.example.mvpflickr.model.FlickrPhoto;

/**
 * Created by JavohirAI
 */

public interface MainContract {
    interface MainView{
        void showMessage(String message);
        void showAllPhotos(List<FlickrPhoto> photos);
    }

    interface MainPresenter{
        void getAllPhotos();
    }
}
