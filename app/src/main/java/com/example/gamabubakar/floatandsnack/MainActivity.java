package com.example.gamabubakar.floatandsnack;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab;
Snackbar snack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=findViewById(R.id.floating);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snack=Snackbar.make(v,"Button Click",Snackbar.LENGTH_INDEFINITE);
                snack.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snack.dismiss();
                    }
                });
                snack.setActionTextColor(getResources().getColor(R.color.snackbaractioncolor));
                View sbview=snack.getView();
                sbview.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                TextView text=sbview.findViewById(android.support.design.R.id.snackbar_text);
                text.setTextColor(getResources().getColor(R.color.snackbartextcolor));
                text.setTextSize(18);
                snack.show();
            }
        });
    }
}
