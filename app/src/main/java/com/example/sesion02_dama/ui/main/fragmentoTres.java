package com.example.sesion02_dama.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sesion02_dama.R;

public class fragmentoTres extends Fragment {
    Button btnCorreo;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
        btnCorreo = (Button) view.findViewById(R.id.btnCorreo);
        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{ "andersonamaya61@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Me interesan tus servicios");
                emailIntent.setType("message/rfc822");
                startActivity(emailIntent);
            }
        });
        // Inflate the layout for this fragment

        return view;
    }
}