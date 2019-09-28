package com.example.mainlands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    int check=4;
    String[] Mainland ={"America","Africa","Asia","Europe"};
    String[] Country = new String[7];
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv =(ListView) findViewById(R.id.lv);
        ArrayAdapter <String> adp = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Mainland);
        lv.setAdapter(adp);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, Mainland[position], Toast.LENGTH_SHORT).show();
        check=position;
        switch(position){
            case 0:
                Country = new String[]{"Unites States", "Brazil", "Mexico", "Argentina", "Colombia", "Canada", "Chile",};
                break;
            case 1:
                Country = new String[]{"Nigeria","Marrocco","Ghana","Ethiopia","Sudan","Uganda","Madagaskar"};
                break;
            case 2:
                Country = new String[]{"India","Japan","China","Israel","Thailand","Hong Kong","Vietnam"};
                break;
            case 3:
                Country = new String[]{"Germany","French","Spain","Greece","Italy","Poland","Belgium"};
                break;
        }
    }

    public void Countries(View view) {
        if(check==4){
            Toast.makeText(this, "Please choose a mainland", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent si = new Intent(this,Countries_2.class);
            si.putExtra("Madina",Country);
            si.putExtra("Bdika",check);
            startActivity(si);
        }
    }
}
