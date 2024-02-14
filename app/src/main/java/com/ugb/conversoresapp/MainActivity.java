package com.ugb.conversoresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tbh;
    Spinner spn, spnAlm, spnMon, spnMas, spnVol, spnTie, spnTransfe;
    TextView tempVal, tempValAlm, tempValMon, tempValMas, tempValVol, tempValTie, tempValTransfe;
    Button btn, btnAlm, btnMon, btnMas, btnVol, btnTie, btnTransfe;
    conversores miObj = new conversores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhConversores);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("longitud").setIndicator("LONGITUD").setContent(R.id.tabLongitud));
        tbh.addTab(tbh.newTabSpec("almacenamiento").setIndicator("ALMACENAMIENTO").setContent(R.id.tabAlmacenamiento));
        tbh.addTab(tbh.newTabSpec("monedas").setIndicator("MONEDAS").setContent(R.id.tabMonedas));
        tbh.addTab(tbh.newTabSpec("masa").setIndicator("MASA").setContent(R.id.tabMasa));
        tbh.addTab(tbh.newTabSpec("volumen").setIndicator("VOLUMEN").setContent(R.id.tabVolumen));
        tbh.addTab(tbh.newTabSpec("tiempo").setIndicator("TIEMPO").setContent(R.id.tabTiempo));
        tbh.addTab(tbh.newTabSpec("transferencia").setIndicator("TRANSFERENCIA DE DATOS").setContent(R.id.tabTransferenciaDatos));


        TabWidget tabWidget = tbh.getTabWidget();
        tabWidget.setStripEnabled(false);
        tabWidget.setShowDividers(TabWidget.SHOW_DIVIDER_NONE);


        btn = findViewById(R.id.btnLongitudConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spn = findViewById(R.id.spnLongitudDe);
                    int de = spn.getSelectedItemPosition();

                    spn = findViewById(R.id.spnLongitudA);
                    int a = spn.getSelectedItemPosition();

                    tempVal = findViewById(R.id.txtLongitudCantidad);
                    double cantidad = Double.parseDouble(tempVal.getText().toString());

                    double resp = miObj.convertirApp(0, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }

        });


        btnAlm = findViewById(R.id.btnAlmacenamientoConvertir);
        btnAlm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spnAlm = findViewById(R.id.spnAlmacenamientoDe);
                    int de = spnAlm.getSelectedItemPosition();

                    spnAlm = findViewById(R.id.spnAlmacenamientoA);
                    int a = spnAlm.getSelectedItemPosition();

                    tempValAlm = findViewById(R.id.txtAlmacenamientoCantidad);
                    double cantidad = Double.parseDouble(tempValAlm.getText().toString());

                    double respAlm = miObj.convertirApp(1, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respAlm, Toast.LENGTH_LONG).show();

            }
        });


        btnMon = findViewById(R.id.btnMonedasConvertir);
        btnMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    spnMon = findViewById(R.id.spnMonedasDe);
                    int de = spnMon.getSelectedItemPosition();

                    spnMon = findViewById(R.id.spnMonedasA);
                    int a = spnMon.getSelectedItemPosition();

                    tempValMon = findViewById(R.id.txtMonedasCantidad);
                    double cantidad = Double.parseDouble(tempValMon.getText().toString());

                    double respMon = miObj.convertirApp(2, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respMon, Toast.LENGTH_LONG).show();

            }
        });


        btnMas = findViewById(R.id.btnMasaConvertir);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spnMas = findViewById(R.id.spnMasaDe);
                    int de = spnMas.getSelectedItemPosition();

                    spnMas = findViewById(R.id.spnMasaA);
                    int a = spnMas.getSelectedItemPosition();

                    tempValMas = findViewById(R.id.txtMasaCantidad);
                    double cantidad = Double.parseDouble(tempValMas.getText().toString());

                    double respMas = miObj.convertirApp(3, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respMas, Toast.LENGTH_LONG).show();

            }
        });


        btnVol = findViewById(R.id.btnVolumenConvertir);
        btnVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spnVol = findViewById(R.id.spnVolumenDe);
                    int de = spnVol.getSelectedItemPosition();

                    spnVol = findViewById(R.id.spnVolumenA);
                    int a = spnVol.getSelectedItemPosition();

                    tempValVol = findViewById(R.id.txtVolumenCantidad);
                    double cantidad = Double.parseDouble(tempValVol.getText().toString());

                    double respVol = miObj.convertirApp(4, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respVol, Toast.LENGTH_LONG).show();

            }
        });


        btnTie = findViewById(R.id.btnTiempoConvertir);
        btnTie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spnTie = findViewById(R.id.spnTiempoDe);
                    int de = spnTie.getSelectedItemPosition();

                    spnTie = findViewById(R.id.spnTiempoA);
                    int a = spnTie.getSelectedItemPosition();

                    tempValTie = findViewById(R.id.txtTiempoCantidad);
                    double cantidad = Double.parseDouble(tempValTie.getText().toString());

                    double respTie = miObj.convertirApp(5, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respTie, Toast.LENGTH_LONG).show();

            }
        });


        btnTransfe = findViewById(R.id.btnTransferenciaDatosConvertir);
        btnTransfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    spnTransfe = findViewById(R.id.spnTransferenciaDatosDe);
                    int de = spnTransfe.getSelectedItemPosition();

                    spnTransfe = findViewById(R.id.spnTransferenciaDatosA);
                    int a = spnTransfe.getSelectedItemPosition();

                    tempValTransfe = findViewById(R.id.txtTransferenciaDatosCantidad);
                    double cantidad = Double.parseDouble(tempValTransfe.getText().toString());

                    double respTransf = miObj.convertirApp(6, de, a, cantidad);
                    Toast.makeText(getApplicationContext(), "Respuesta: " + respTransf, Toast.LENGTH_LONG).show();
            }
        });
    }
    class conversores{
        double[][] valores = {
                {1, 100, 39.3701, 3.28084, 1.193, 1.09361, 0.001, 0.000621371},
                {1, 0.001, 0.000001, 0.000000001, 1000, 1000000, 0.000000001, 0.000001, 0.008, 8},
                {1, 0.92, 7.86, 24.62, 36.56, 8.75, 535.14, 145.52, 83.32, 0.79},
                {1, 0.453592, 453.592, 0.000453592, 453592, 453600000, 0.000446429, 0.0005, 0.0714286, 16},
                {1, 0.264172, 1.05669, 2.11338, 4.16667, 33.814, 67.628, 202.884, 0.001, 1000},
                {1, 60, 0.0166667, 0.000694444, 0.000099206, 0.000022831, 0.0000019026, 0.00000019026, 0.00000001903, 60000},
                {1, 8, 7.62939, 8e+6, 8000, 1000, 7812.5, 0.008, 0.001, 0.00745058, 8e-6, 1e-6, 7.276e-6}

        };
        public double convertirApp(int opcion, int de, int a, double cantidad){
            return valores[opcion][a] / valores[opcion][de] * cantidad;
        }

    }
}