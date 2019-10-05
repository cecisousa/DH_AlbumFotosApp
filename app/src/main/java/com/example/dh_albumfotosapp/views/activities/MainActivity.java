package com.example.dh_albumfotosapp.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dh_albumfotosapp.R;
import com.example.dh_albumfotosapp.adapter.FotosAdapter;
import com.example.dh_albumfotosapp.model.Fotos;
import com.example.dh_albumfotosapp.views.fragments.FotoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fotos> listaFotos = new ArrayList<>();

        listaFotos.add(new Fotos("França",
                FotoFragment.novaInstancia(R.drawable.franca, "França")));
        listaFotos.add(new Fotos("Itália",
                FotoFragment.novaInstancia(R.drawable.italia, "Itália")));
        listaFotos.add(new Fotos("UK",
                FotoFragment.novaInstancia(R.drawable.uk, "Reino Unido")));
        listaFotos.add(new Fotos("Grécia",
                FotoFragment.novaInstancia(R.drawable.grecia, "Grécia")));

        FotosAdapter adapter = new FotosAdapter(getSupportFragmentManager(), listaFotos);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        viewPager.setOffscreenPageLimit(listaFotos.size());

        tabLayout.setupWithViewPager(viewPager);
    }

}
