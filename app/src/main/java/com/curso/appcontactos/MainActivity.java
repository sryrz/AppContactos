package com.curso.appcontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Contacto contacto;
    EditText nombreEditable;
    DatePicker fechaEditable;
    int dia,mes,anyo;
    EditText telefonoEditable;
    EditText emailEditable;
    EditText descripcionEditable;
    Button boton;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle = getIntent().getExtras();

        //Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        nombreEditable = (EditText) findViewById(R.id.tilNombre);
        fechaEditable = (DatePicker) findViewById(R.id.dpFecha);
        telefonoEditable = (EditText) findViewById(R.id.tilTelefono);
        emailEditable = (EditText) findViewById(R.id.tilEmail);
        descripcionEditable = (EditText) findViewById(R.id.tilDescripcion);

        if(getIntent().hasExtra("stored")){

            nombreEditable.setText(bundle.getString("nombre"));

            dia = bundle.getInt("dia");
            mes = bundle.getInt("mes");
            anyo = bundle.getInt("anyo");
            fechaEditable.updateDate(anyo,mes,dia);

            telefonoEditable.setText(bundle.getString("telefono"));

            emailEditable.setText(bundle.getString("email"));

            descripcionEditable.setText(bundle.getString("descripcion"));
        }

        contacto = new Contacto();

        boton = (Button)findViewById(R.id.btnSiguiente);

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){

                Intent i = new Intent(MainActivity.this, PantallaConfirmacion.class);

                contacto.setNombre(nombreEditable.getText().toString());
                i.putExtra("nombre", contacto.getNombre());

                contacto.setDia(fechaEditable.getDayOfMonth());
                i.putExtra("dia", contacto.getDia());

                contacto.setMes(fechaEditable.getMonth()+1);
                i.putExtra("mes", contacto.getMes());

                contacto.setAnyo(fechaEditable.getYear());
                i.putExtra("anyo", contacto.getAnyo());

                contacto.setTelefono(telefonoEditable.getText().toString());
                i.putExtra("telefono", contacto.getTelefono());

                contacto.setEmail(emailEditable.getText().toString());
                i.putExtra("email", contacto.getEmail());

                contacto.setDesripcion(descripcionEditable.getText().toString());
                i.putExtra("descripcion", contacto.getDesripcion());

                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    //Actividad corriendo

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}