package com.ipast.simpleviewpageradapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.ipast.viewpageradapter.viewpager2.BaseFragmentStateAdapter;

import java.util.List;

/**
 * @author gang.cheng
 * @description :
 * @date :2021/8/6
 */
public class CustomFragmentStateAdapter extends BaseFragmentStateAdapter {
    public CustomFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, List<Fragment> fragments) {
        super(fragmentActivity, fragments);
    }

    @Override
    public View getCustomView(int position) {
        return null;
    }
}
