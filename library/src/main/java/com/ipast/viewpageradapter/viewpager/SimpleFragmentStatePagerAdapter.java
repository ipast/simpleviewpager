package com.ipast.viewpageradapter.viewpager;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * author:chenggang
 * date:2020/7/31
 * description:
 */
public class SimpleFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;

    public SimpleFragmentStatePagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    /**
     * .java.lang.IllegalStateException: Fragement no longer exists for key f0: index 0
     * @return
     */
    @Nullable
    @Override
    public Parcelable saveState() {
        return null;
    }
}
