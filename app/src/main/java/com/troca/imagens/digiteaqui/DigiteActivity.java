package com.troca.imagens.digiteaqui;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class DigiteActivity extends AppCompatActivity {

    private EditText editDigite;
    private Button btnClique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digite);

        editDigite = (EditText)findViewById(R.id.editDigite);
        btnClique = (Button)findViewById(R.id.btnClique);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        btnClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(DigiteActivity.this);
                dlg.setMessage(editDigite.getText().toString());
                dlg.setNeutralButton("Ok", null);
                dlg.show();
            }
        });


    }
}
