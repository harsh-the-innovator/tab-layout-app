package com.example.tabapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tabapp.myfragments.CallsFragment;
import com.example.tabapp.myfragments.ChatsFragment;
import com.example.tabapp.myfragments.StatusFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private String[] tabTitles = new String[]{"Chats","Status","Calls"};

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
        }

        return new ChatsFragment();
    }

    @Override
    public int getItemCount() {
        return tabTitles.length;
    }
}
