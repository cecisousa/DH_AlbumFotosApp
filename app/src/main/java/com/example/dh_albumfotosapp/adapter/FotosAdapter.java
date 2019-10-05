package com.example.dh_albumfotosapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.dh_albumfotosapp.model.Fotos;

import java.util.List;

public class FotosAdapter extends FragmentStatePagerAdapter {

    private List<Fotos> fotosList;

    public FotosAdapter(FragmentManager fm, List<Fotos> fotosList){
        super(fm);
        this.fotosList = fotosList;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fotosList.get(position).getNome();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fotosList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return fotosList.size();
    }
}
