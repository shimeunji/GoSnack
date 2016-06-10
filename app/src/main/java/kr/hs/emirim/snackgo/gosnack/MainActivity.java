package kr.hs.emirim.snackgo.gosnack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.buttontest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button home_but=(Button)findViewById(R.id.but_home);
        Button rank_but=(Button)findViewById(R.id.but_rank);
        Button lab_but=(Button)findViewById(R.id.but_lab);
        Button random_but=(Button)findViewById(R.id.but_random);


        rank_but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RankingActivity.class);
                startActivity(intent);
           }
        });
        lab_but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, LabActivity.class);
                startActivity(intent2);
            }
        });
        random_but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, LottoActivity.class);
                startActivity(intent3);
            }
        });


    }
}
