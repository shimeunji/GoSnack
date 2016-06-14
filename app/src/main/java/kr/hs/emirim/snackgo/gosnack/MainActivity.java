package kr.hs.emirim.snackgo.gosnack;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.buttontest.R;

public class MainActivity extends AppCompatActivity {
    EditText edit01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button home_but = (Button) findViewById(R.id.but_home);
        Button rank_but = (Button) findViewById(R.id.but_rank);
        Button lab_but = (Button) findViewById(R.id.but_lab);
        Button random_but = (Button) findViewById(R.id.but_random);
        ImageButton link_imgbut = (ImageButton) findViewById(R.id.img_link);


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
        link_imgbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/snackgwaza/?fref=ts"));
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuItem item1 = menu.add(0, 1, 0, "설정").setIntent(new Intent(this, SettingActivity.class));
        MenuItem item2 = menu.add(0, 2, 0, "my Page").setIntent(new Intent(this, SettingActivity.class));


        return true;
    }
}
