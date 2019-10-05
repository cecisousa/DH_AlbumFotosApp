package com.example.dh_albumfotosapp.views.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dh_albumfotosapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {

    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView txtNomeDestino;
    private ImageView imgDestino;


    public FotoFragment() {
        // Required empty public constructor
    }

    public static Fragment novaInstancia(int imagem, String nomeDestino){

        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeDestino);
        fotoFragment.setArguments(bundle);
        return fotoFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foto, container, false);

        initViews(view);

        if (getArguments() != null) {

            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imgDestino.setImageDrawable(drawable);
            txtNomeDestino.setText(nomeRecebido);

        }

        return view;
    }

    private void initViews(View view){
        txtNomeDestino = view.findViewById(R.id.textViagens);
        imgDestino = view.findViewById(R.id.imagemDestino);
    }

}
