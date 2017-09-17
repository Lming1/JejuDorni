package kr.ac.jejunu.ux.dorni;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iminhyeok on 2017. 9. 17..
 */

public class CustomList extends ArrayAdapter<String> {
    private Activity context;
    private String[] web;
    private Integer[] imageid;
    public CustomList(Activity context, String[] arrTxt, Integer[] arrImg){
        super(context, R.layout.multi_list, arrTxt);
        this.context = context;
        this.web = arrTxt;
        this.imageid = arrImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.multi_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageid[position]);
        return rowView;
    }
}
