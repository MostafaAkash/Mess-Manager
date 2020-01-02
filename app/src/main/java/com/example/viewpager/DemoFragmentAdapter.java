package com.example.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DemoFragmentAdapter extends FragmentStatePagerAdapter {
    public DemoFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DemoFragment fragment = new DemoFragment();
        position = position + 1;
        Bundle bundle = new Bundle();
        bundle.putInt("message",position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
