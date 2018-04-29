package fr.weefle.studav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class EleveAdapter extends BaseAdapter {

    private Context context;
    private List<Eleve> elevelist;
    private LayoutInflater inflater;
    private Algorithm algo = new Algorithm();

    public EleveAdapter(Context context, List<Eleve> elevelist){
        this.context = context;
        this.elevelist = elevelist;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return elevelist.size();
    }

    @Override
    public Object getItem(int position) {
        return elevelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.adapter_item, null);
        final Eleve currentEleve = (Eleve) getItem(position);
        final String itemName = currentEleve.getName();
        final List<Double> itemNotes = currentEleve.getNotes();
        TextView itemNameView = convertView.findViewById(R.id.item_name);
        itemNameView.setText(itemName);
        TextView itemPriceView = convertView.findViewById(R.id.item_price);
        itemPriceView.setText(itemNotes.toString());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "La moyenne de " + itemName + " est de: " + algo.calcul(currentEleve), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
