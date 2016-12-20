package will.tw.carepets;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public ImageView petimage;
    public TextView songTitle;
    public TextView songYear;
    public TextView songAuthor;
    public TextView build;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        petimage = (ImageView)itemView.findViewById(R.id.imageView);
        songTitle = (TextView)itemView.findViewById(R.id.song_title);
        songYear = (TextView)itemView.findViewById(R.id.song_year);
        songAuthor = (TextView)itemView.findViewById(R.id.song_author);
        build = (TextView)itemView.findViewById(R.id.build);
    }

    @Override
    public void onClick(View view) {

    }
}
