package com.doit.trya;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    private Layout1 layout1 ;
    private Layout2 layout2;
    private Layout3 layout3;
    private Layout4 layout4;
    private Layout5 layout5;
    private List<View> bottomTabs;
    private View bookshelfLayout;
    private View searchBookLayout;
    private View bookStoreLayout;
    private View writerLayout;
    private View meLayout;
    private ImageView bookshelfImage;
    private ImageView searchbookImage;
    private ImageView bookstoreImage;
    private ImageView writerImage;
    private ImageView meImage;
    private TextView bookshelfText;
    private TextView searchBookText;
    private TextView bookStoreText;
    private TextView writerText;
    private TextView meText;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fragmentManager = getFragmentManager();
        setSelectTab(0);
    }

    private void initViews() {
        bookshelfLayout = findViewById(R.id.bookshelf_layout);
        searchBookLayout = findViewById(R.id.searchbook_layout);
        bookStoreLayout = findViewById(R.id.bookstore_layout);
        writerLayout = findViewById(R.id.writer_layout);
        meLayout = findViewById(R.id.me_layout);
        bookshelfImage = (ImageView) findViewById(R.id.home_bookshelf_image);
        searchbookImage = (ImageView) findViewById(R.id.home_searchbook_image);
        bookstoreImage = (ImageView) findViewById(R.id.home_bookstore_image);
        writerImage = (ImageView) findViewById(R.id.writer_image);
        meImage = (ImageView) findViewById(R.id.me_image);
        bookshelfText = (TextView) findViewById(R.id.home_bookshelf_text);
        searchBookText = (TextView) findViewById(R.id.searchbook_text);
        bookStoreText = (TextView) findViewById(R.id.bookstore_text);
        writerText = (TextView) findViewById(R.id.writer_text);
        meText = (TextView) findViewById(R.id.me_text);
        bookshelfLayout.setOnClickListener(this);
        searchBookLayout.setOnClickListener(this);
        bookStoreLayout.setOnClickListener(this);
        writerLayout.setOnClickListener(this);
        meLayout.setOnClickListener(this);
        bottomTabs = new ArrayList<>(5);
        bottomTabs.add(bookshelfLayout);
        bottomTabs.add(searchBookLayout);
        bottomTabs.add(bookStoreLayout);
        bottomTabs.add(writerLayout);
        bottomTabs.add(meLayout);
    }

    private void setSelectTab(int index) {
        clearSelection();
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                bookshelfImage.setImageResource(R.drawable.ic_dashboard_black_24dp);
                bookshelfText.setTextColor(Color.parseColor("#00c98d"));
                if (layout1 == null) {
                   layout1 = new Layout1();
                    transaction.add(R.id.content, layout1);
                } else {
                    transaction.show(layout1);
                }
                break;
            case 1:
                searchbookImage.setImageResource(R.drawable.ic_home_black_24dp);
                searchBookText.setTextColor(Color.parseColor("#00c98d"));
                if (layout2 == null) {
                    layout2 = new Layout2();
                    transaction.add(R.id.content, layout2);
                } else {
                    transaction.show(layout2);
                }
                break;
            case 2:
                bookstoreImage.setImageResource(R.drawable.ic_notifications_black_24dp);
                bookStoreText.setTextColor(Color.parseColor("#00c98d"));
                if (layout3== null) {
                    layout3 = new Layout3();
                    transaction.add(R.id.content, layout3);
                } else {
                    transaction.show(layout3);
                }
                break;
            case 3:
                writerImage.setImageResource(R.drawable.ic_dashboard_black_24dp);
                writerText.setTextColor(Color.parseColor("#00c98d"));
                if (layout4 == null) {
                    layout4 = new Layout4();
                    transaction.add(R.id.content, layout4);
                } else {
                    transaction.show(layout4);
                }
                break;
            case 4:
                meImage.setImageResource(R.drawable.ic_notifications_black_24dp);
                meText.setTextColor(Color.parseColor("#00c98d"));
                if (layout5 == null) {
                    layout5 = new Layout5();
                    transaction.add(R.id.content, layout5);
                } else {
                    transaction.show(layout5);
                }
                break;
            default:
                break;
        }
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bookshelf_layout:
                setSelectTab(0);
                break;
            case R.id.searchbook_layout:
                setSelectTab(1);
                break;
            case R.id.bookstore_layout:
                setSelectTab(2);
                break;
            case R.id.writer_layout:
                setSelectTab(3);
                break;
            case R.id.me_layout:
                setSelectTab(4);
                break;
            default:
                break;
        }
    }

    private void clearSelection() {
        bookshelfImage.setImageResource(R.drawable.ic_dashboard_black_24dp);
        bookshelfText.setTextColor(Color.parseColor("#82858b"));
        searchbookImage.setImageResource(R.drawable.ic_notifications_black_24dp);
        searchBookText.setTextColor(Color.parseColor("#82858b"));
        bookstoreImage.setImageResource(R.drawable.ic_dashboard_black_24dp);
        bookStoreText.setTextColor(Color.parseColor("#82858b"));
        writerImage.setImageResource(R.drawable.ic_notifications_black_24dp);
        writerText.setTextColor(Color.parseColor("#82858b"));
        meImage.setImageResource(R.drawable.ic_notifications_black_24dp);
        meText.setTextColor(Color.parseColor("#82858b"));
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (layout1 != null) {
            transaction.hide(layout1);
        }
        if (layout2 != null) {
            transaction.hide(layout2);
        }
        if (layout3!= null) {
            transaction.hide(layout3);
        }
        if (layout4!= null) {
            transaction.hide(layout4);
        }
        if (layout5 != null) {
            transaction.hide(layout5);
        }
    }
}

