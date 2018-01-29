package com.example.anton.fragmenttablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by anton on 30/01/18.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    String tabTitles[] = new String[]{"Tab 1", "Tab 2", "Tab 3"};
    Context mContext;



    public TabsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }



    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new BlankFragment1();
            case 1:
                return new BlankFragment2();
            case 2:
                return new BlankFragment3();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    public View getTabView(int position){
        View tab = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);
        TextView tv = (TextView) tab.findViewById(R.id.custom_text);
        tv.setText(tabTitles[position]);
        return tab;
    }


}
