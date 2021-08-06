package com.ipast.viewpageradapter.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;



import java.util.List;

/**
 * @author gang.cheng
 * @description :
 * @date :2021/7/8
 */
public abstract class BaseFragmentStateAdapter extends FragmentStateAdapter {
    protected Context context;
    protected List<Fragment> fragments;


    public BaseFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, List<Fragment> fragments) {
        super(fragmentActivity);
        this.context = fragmentActivity.getBaseContext();
        this.fragments = fragments;
    }

    public abstract View getCustomView(int position);

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
