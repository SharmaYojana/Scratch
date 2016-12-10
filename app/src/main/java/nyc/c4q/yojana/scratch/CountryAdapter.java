package nyc.c4q.yojana.scratch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yojanasharma on 12/9/16.
 */

public class CountryAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Example> list;

    public CountryAdapter(List<Example> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new CountryViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CountryViewHolder vh = (CountryViewHolder) holder;
        vh.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
