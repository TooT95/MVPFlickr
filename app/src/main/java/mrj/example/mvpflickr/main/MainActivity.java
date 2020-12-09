package mrj.example.mvpflickr.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mrj.example.mvpflickr.R;
import mrj.example.mvpflickr.model.FlickrPhoto;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    RecyclerView mRecyclerView;
    FlickPhotoAdapter mPhotoAdapter;
    MainContract.MainPresenter mPresenter;
    ArrayList<FlickrPhoto> photos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_photos);

        mPhotoAdapter = new FlickPhotoAdapter(this, photos);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mPhotoAdapter);

        mPresenter = new MainPresenter(this);
        mPresenter.getAllPhotos();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAllPhotos(List<FlickrPhoto> photos) {
        mPhotoAdapter.setPhotos(photos);
        mPhotoAdapter.notifyDataSetChanged();
    }
}