package com.ipast.viewpageradapter.viewpager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

/**
 * author:chenggang
 * date:2020/7/28
 * description:
 */
public class SimpleFragmentStateAdapter extends FragmentStateAdapter {
    private Context context;
    private List<Fragment> fragments;

    public SimpleFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, List<Fragment> fragments) {
        super(fragmentActivity);
        this.context = fragmentActivity.getBaseContext();
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments == null ? 0 : fragments.size();
    }
}
