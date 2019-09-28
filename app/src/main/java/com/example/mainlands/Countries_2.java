package com.example.mainlands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Countries_2 extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String [] Countries = new String[7];
    int check;
    TextView cap;
    TextView pepole;
    ListView lv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_2);
        cap = (TextView)findViewById(R.id.cap);
        pepole = (TextView)findViewById(R.id.pepole);
        lv2 = (ListView)findViewById(R.id.lv2);
        Intent gi = getIntent();
        check=gi.getIntExtra("Bdika",4);
        Countries = gi.getStringArrayExtra("Madina");
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Countries);
        lv2.setAdapter(adp);
        lv2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv2.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(check==0){
            switch(position) {
                case 0:
                    cap.setText("Capital City: Washington D.C");
                    pepole.setText("Population: 327.2M");
                    break;
                case 1:
                    cap.setText("Capital City: Brasilia");
                    pepole.setText("Population: 209.3M");
                    break;
                case 2:
                    cap.setText("Capital City: Mexico City");
                    pepole.setText("Population: 129.2M");
                    break;
                case 3:
                    cap.setText("Capital City: Buenos Aires");
                    pepole.setText("Population: 44.27M");
                    break;
                case 4:
                    cap.setText("Capital City: Bogota");
                    pepole.setText("Population: 49.07M");
                    break;
                case 5:
                    cap.setText("Capital City: Ottawa");
                    pepole.setText("Population: 37.06M");
                    break;
                case 6:
                    cap.setText("Capital City: Santiago");
                    pepole.setText("Population: 18.05M");
                    break;
            }
        }
        if(check==1){
            switch(position) {
                case 0:
                    cap.setText("Capital City: Abuja");
                    pepole.setText("Population: 190.09M");
                    break;
                case 1:
                    cap.setText("Capital City: Rabat");
                    pepole.setText("Population: 35.74M");
                    break;
                case 2:
                    cap.setText("Capital City: Accra");
                    pepole.setText("Population: 28.83M");
                    break;
                case 3:
                    cap.setText("Capital City: Addis Abada");
                    pepole.setText("Population: 105M");
                    break;
                case 4:
                    cap.setText("Capital City: Khartoum");
                    pepole.setText("Population: 40.53M");
                    break;
                case 5:
                    cap.setText("Capital City: Kampala");
                    pepole.setText("Population: 42.86M");
                    break;
                case 6:
                    cap.setText("Capital City: Antanarivo");
                    pepole.setText("Population: 25.57M");
                    break;
            }
        }
        if(check==2){
            switch(position) {
                case 0:
                    cap.setText("Capital City: New Delhi");
                    pepole.setText("Population: 1.339B");
                    break;
                case 1:
                    cap.setText("Capital City: Tokyo");
                    pepole.setText("Population: 126.8M");
                    break;
                case 2:
                    cap.setText("Capital City: Beijing");
                    pepole.setText("Population: 1.386B");
                    break;
                case 3:
                    cap.setText("Capital City: Jerusalem");
                    pepole.setText("Population: 8.7M");
                    break;
                case 4:
                    cap.setText("Capital City: Bangkok");
                    pepole.setText("Population: 69M");
                    break;
                case 5:
                    cap.setText("Capital City: Victoria");
                    pepole.setText("Population: 7.392M");
                    break;
                case 6:
                    cap.setText("Capital City: Hanoi");
                    pepole.setText("Population: 95.54M");
                    break;
            }
        }
        if(check==3){
            switch(position) {
                case 0:
                    cap.setText("Capital City: Berlin");
                    pepole.setText("Population: 82.8M");
                    break;
                case 1:
                    cap.setText("Capital City: Paris");
                    pepole.setText("Population: 67M");
                    break;
                case 2:
                    cap.setText("Capital City: Madrid");
                    pepole.setText("Population: 46.72M");
                    break;
                case 3:
                    cap.setText("Capital City: Athens");
                    pepole.setText("Population: 10.77");
                    break;
                case 4:
                    cap.setText("Capital City: Rome");
                    pepole.setText("Population: 60.59M");
                    break;
                case 5:
                    cap.setText("Capital City: Warsaw");
                    pepole.setText("Population: 38.43M");
                    break;
                case 6:
                    cap.setText("Capital City: Brussels");
                    pepole.setText("Population: 11.35M");
                    break;
            }
        }
    }

    public void BackToMain(View view) {
        finish();
    }
}
