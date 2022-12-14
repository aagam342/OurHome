package com.example.loginactivity;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {


    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm,Context context,int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;

    }

    public int getCount(){
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 1:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;

            case 0:
                SignupTabFragment signupTabFragment = new SignupTabFragment();
                return signupTabFragment;
            default:
                return null;
        }
    }
}
