package nyc.c4q.yojana.scratch;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yojanasharma on 12/9/16.
 */

public class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView countryName;
        private TextView countryPopulation;

    public CountryViewHolder(ViewGroup parent) {
        super(inflate(parent));
        countryName = (TextView) itemView.findViewById(R.id.country_name);
        countryPopulation = (TextView) itemView.findViewById(R.id.country_population);
    }

    private static View inflate(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.countryview_holder, parent, false);
    }

    public void bind(final Example example){
        String name = example.getName();
        String population = String.valueOf(example.getPopulation());
        countryName.setText(name);
        countryPopulation.setText(population);
        countryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                String nativename = example.getNativeName();
                intent.putExtra("String", nativename);
                view.getContext().startActivity(intent);
            }
        });
    }

}
