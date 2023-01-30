package com.example.sesion02_dama.ui.main;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sesion02_dama.R;
public class fragmentoUno extends Fragment {
    Button btnValor;
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
        // Inflate the layout for this fragment
        btnValor = (Button) view.findViewById(R.id.btnValor);
        btnValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = "Hola, un gusto saludarte";
                String numeroTelefono = "+50372227498";
                /*Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(numeroTelefono) + "@s.whatsapp.net");
                sendIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
                 */
                Intent intent = new Intent(Intent.ACTION_VIEW);
                String uri = "whatsapp://send?phone=" + numeroTelefono + "&text=" + mensaje;
                intent.setData(Uri.parse(uri));
                try {
                    startActivity(intent);
                } catch (android.content.ActivityNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        return view;
    }
}