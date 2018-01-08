package com.doit.trya;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/1/8/008.
 */

public class Layout1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View bookshelfLayout = inflater.inflate(R.layout.layout1,
                container, false);
        return bookshelfLayout;
    }
}