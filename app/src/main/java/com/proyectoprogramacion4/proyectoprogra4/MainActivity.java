package com.proyectoprogramacion4.proyectoprogra4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.proyectoprogramacion4.proyectoprogra4.Objetos.ReferenciasDeFirebase;
import com.proyectoprogramacion4.proyectoprogra4.Objetos.Usuarios;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner Sexos;
    Spinner Paises;
    Spinner Ciudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sexos = (Spinner) findViewById(R.id.spinnerSexo);
        Paises = (Spinner) findViewById(R.id.SpinnerPais);
        Ciudades = (Spinner) findViewById(R.id.SpinnerCiudad);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference miReferencia = database.getReference(ReferenciasDeFirebase.REFERENCIAS);
        Button Registrarse = (Button) findViewById(R.id.btnRegistrarse);
        Registrarse.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuarios usuario = new Usuarios();
            }
        });




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Sexo, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sexos.setAdapter(adapter);

        ArrayAdapter<CharSequence> AdaptadorPaises = ArrayAdapter.createFromResource(this, R.array.Pais, android.R.layout.simple_spinner_item);
        AdaptadorPaises.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Paises.setAdapter(AdaptadorPaises);
        Paises.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int[] ciudadesDistintas = {R.array.CiudadesEstadosUnidos, R.array.CiudadesMexico, R.array.CiudadesElSalvador};
        ArrayAdapter<CharSequence> AdaptadorCiudades = ArrayAdapter.createFromResource(this, ciudadesDistintas[position], android.R.layout.simple_spinner_item);
        AdaptadorCiudades.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Ciudades.setAdapter(AdaptadorCiudades);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
