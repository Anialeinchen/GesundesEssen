package com.example.ania.gesundesessen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //TODO context
    //String[] EssenItems =
      //      context.getResources().getStringArray(R.array.EssenItems);

    public void goji_click(View view) {
        displayGoji(7777);
    }

    private void displayGoji(int number) {
        TextView goji_inhalt = (TextView) findViewById(
                R.id.goji_text);
        goji_inhalt.setText(""+number);
    }
    public void polenta_click(View view) {
        displayPolenta(7777);
    }

    private void displayPolenta(int number) {
        TextView polenta_inhalt = (TextView) findViewById(
                R.id.polenta_text);
        polenta_inhalt.setText(R.string.costam);
    }
    public void kuskus_click(View view) {
        displayKuskus(7777);
    }

    private void displayKuskus(int number) {
        TextView kuskus_inhalt = (TextView) findViewById(
                R.id.kuskus_text);
        kuskus_inhalt.setText("" + number);
    }
    public void spirulina_click(View view) {
        displaySpirulina(7777);
    }

    private void displaySpirulina(int number) {
        TextView spirulina_inhalt = (TextView) findViewById(
                R.id.spirulina_text);
        spirulina_inhalt.setText("" + number);
    }
    public void chia_click(View view) {
        displayChia(7777);
    }

    private void displayChia(int number) {
        TextView chia_inhalt = (TextView) findViewById(
                R.id.chia_text);
        chia_inhalt.setText("" + number);
    }
}


