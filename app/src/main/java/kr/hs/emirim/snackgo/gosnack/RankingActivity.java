package kr.hs.emirim.snackgo.gosnack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.buttontest.R;

/**
 * Created by 내컴퓨터 on 2016-06-09.
 */
public class RankingActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking); //랭킹화면을 보이게함

        ImageButton rank1_but=(ImageButton) findViewById(R.id.but_rank_1);
        ImageButton rank2_but=(ImageButton)findViewById(R.id.but_rank_2);
        rank1_but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent5 = new Intent(RankingActivity.this, PriceRank1ListActivity.class);
                startActivity(intent5);
            }
        });
        rank2_but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent5 = new Intent(RankingActivity.this, PriceRank2ListActivity.class);
                startActivity(intent5);
            }
        });
    }
}
