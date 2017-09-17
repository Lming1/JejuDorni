package kr.ac.jejunu.ux.dorni;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.zip.Inflater;

/**
 * Created by iminhyeok on 2017. 9. 17..
 */

public class FirstFragment extends Fragment {
    private ListView list;
    private String[] web = {"A", "B", "C", "D", "E"};
    private Integer[] imageId = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    public static FirstFragment newInstance() {
        FirstFragment newFragment = new FirstFragment();
        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootview = inflater.inflate(R.layout.main, container, false);
        return rootview;
    }
}
