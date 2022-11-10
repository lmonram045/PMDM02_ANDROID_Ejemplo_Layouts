package com.montoyaramirezluis.pmdm02_android_ejemplo_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        TextView tv = findViewById(R.id.tvTexto);
        tv.setText("Prueba \n " +
                "Prueba \n " +
                "Prueba \n" +
                "Prueba \n" +
                "Prueba \n" +
                "Prueba");
    }
}