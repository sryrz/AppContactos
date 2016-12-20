package com.curso.appcontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaConfirmacion extends AppCompatActivity {

    TextView tvNombre;
    TextView tvFecha;
    TextView tvTelefono;
    TextView tvEmail;
    TextView tvDescripcion;
    String dia, mes, anyo;
    Button boton;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_confirmacion);

        bundle = getIntent().getExtras();

        tvNombre = (TextView)findViewById(R.id.tvNombreFinal);
        tvNombre.setText("Nombre: "+bundle.getString("nombre"));

        tvFecha = (TextView)findViewById(R.id.tvFechaFinal);
        dia = String.valueOf(bundle.getInt("dia"));
        mes = String.valueOf(bundle.getInt("mes"));
        anyo = String.valueOf(bundle.getInt("anyo"));
        tvFecha.setText("Fecha de nacimiento: "+dia+"/"+mes+"/"+anyo);

        tvTelefono = (TextView)findViewById(R.id.tvTelefonoFinal);
        tvTelefono.setText("Teléfono: "+bundle.getString("telefono"));

        tvEmail = (TextView)findViewById(R.id.tvEmailFinal);
        tvEmail.setText("Email: "+bundle.getString("email"));

        tvDescripcion = (TextView)findViewById(R.id.tvDescripcionFinal);
        tvDescripcion.setText("Descripción: "+bundle.getString("descripcion"));

        boton = (Button)findViewById(R.id.btnEditar);

        boton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent i = new Intent(PantallaConfirmacion.this, MainActivity.class);

                i.putExtra("nombre", bundle.getString("nombre"));

                i.putExtra("dia", bundle.getInt("dia"));
                i.putExtra("mes", bundle.getInt("mes")-1);
                i.putExtra("anyo", bundle.getInt("anyo"));

                i.putExtra("telefono", bundle.getString("telefono"));

                i.putExtra("email", bundle.getString("email"));

                i.putExtra("descripcion", bundle.getString("descripcion"));

                i.putExtra("stored", true);

                startActivity(i);
            }
        });
    }
}
