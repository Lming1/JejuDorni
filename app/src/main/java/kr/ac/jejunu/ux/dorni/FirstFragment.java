package kr.ac.jejunu.ux.dorni;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by iminhyeok on 2017. 9. 17..
 */

public class FirstFragment extends Fragment {
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
