package com.doit.trya;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/1/8/008.
 */

public class Layout3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View bookstoreLayout = inflater.inflate(R.layout.layout3,
                container, false);
        return bookstoreLayout;
    }
}