package com.ingwilson.migranproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion  extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;
    Button btnmimodificar;
    int centinela=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        //VINCULANDO ELEMENTOS VISUALES
        btnmimodificar=findViewById(R.id.btnmodificar);
        btnejecutar=findViewById(R.id.btncambiar);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
               //AÑADIENDO ESCUCHADOR DE CLIC
        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + "Soles");
            }
        });
    }

    public void ocultar(View view) {
        if(centinela==0)
        {
            centinela=1;
            btnejecutar.setVisibility(View.GONE);
            btnmimodificar.setText("MOSTRAR");
        }
        else
        {
            centinela=0;
            btnejecutar.setVisibility(View.VISIBLE);
            btnmimodificar.setText("OCULTAR");
        }

    }
}
