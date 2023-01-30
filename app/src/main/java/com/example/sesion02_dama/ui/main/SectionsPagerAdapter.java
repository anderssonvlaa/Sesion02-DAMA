package com.example.sesion02_dama.ui.main;

import android.content.Context;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.sesion02_dama.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragmento = null;
        try {
            if (position == 0) {
                fragmento = new fragmentoUno();
            } else if (position == 1) {
                fragmento = new fragmentoDos();
            } else if (position == 2) {
                fragmento = new fragmentoTres();
            }
        }catch (Exception error){
            Log.e("errorSectionPage", "Ocurrio un error: "+ error.getMessage());
        }
        return fragmento;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}