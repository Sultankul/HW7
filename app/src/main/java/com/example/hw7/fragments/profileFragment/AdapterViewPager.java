package com.example.hw7.fragments.profileFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AdapterViewPager extends FragmentStateAdapter {

    private ArrayList<Fragment> list = new ArrayList<>();

    public void setList(ArrayList<Fragment> list) {
        this.list = list;
    }

    public AdapterViewPager(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
