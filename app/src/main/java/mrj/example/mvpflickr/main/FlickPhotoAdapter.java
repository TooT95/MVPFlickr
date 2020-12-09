package mrj.example.mvpflickr.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mrj.example.mvpflickr.R;
import mrj.example.mvpflickr.model.FlickrPhoto;

/**
 * Created by JavohirAI
 */

public class FlickPhotoAdapter extends RecyclerView.Adapter<FlickPhotoAdapter.FlickPhotoHolder> {

    private Context mContext;
    private List<FlickrPhoto> photos;

    public FlickPhotoAdapter(Context context, List<FlickrPhoto> photos) {
        mContext = context;
        this.photos = photos;
    }

    public void setPhotos(List<FlickrPhoto> photos){
        this.photos = photos;
    }

    @Override
    public void onBindViewHolder(@NonNull FlickPhotoHolder holder, int position) {
        FlickrPhoto photo = photos.get(position);
        holder.mFlickrPhoto = photo;

        holder.title.setText(photo.getTitle());
        holder.desc.setText(photo.getAuthor());

        Picasso.get().
                load(photo.getMedia().getLink())
                .error(R.drawable.pic_astra)
                .placeholder(R.drawable.pic_astra)
                .fit()
                .into(holder.photoView);

    }

    @NonNull
    @Override
    public FlickPhotoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_item,parent,false);
        return new FlickPhotoHolder(view);
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    static class FlickPhotoHolder extends RecyclerView.ViewHolder{
        FlickrPhoto mFlickrPhoto;
        ImageView photoView;
        TextView title,desc;

        FlickPhotoHolder(View itemView) {
            super(itemView);
            photoView = (ImageView) itemView.findViewById(R.id.photo_img);
            title = (TextView) itemView.findViewById(R.id.title_rus);
            desc = (TextView) itemView.findViewById(R.id.author_desc);
        }
    }
}
