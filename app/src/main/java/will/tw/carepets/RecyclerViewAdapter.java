package will.tw.carepets;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pet, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        Picasso.with(context)
                .load(itemList.get(position).getImagename())
                .resize(150, 150)
                .into(holder.petimage);
        holder.songTitle.setText("名稱：" + itemList.get(position).getSongTitle());
        holder.songYear.setText("性別：" + itemList.get(position).getSongYear());
        holder.songAuthor.setText("種類：" + itemList.get(position).getSongAuthor());
        holder.build.setText("體型：" + itemList.get(position).getBuild());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
