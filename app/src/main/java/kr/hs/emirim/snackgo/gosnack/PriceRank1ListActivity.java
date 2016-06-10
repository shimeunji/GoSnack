package kr.hs.emirim.snackgo.gosnack;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.example.buttontest.R;

import java.util.ArrayList;

/**
 * Created by 내컴퓨터 on 2016-06-10.
 */
public class PriceRank1ListActivity extends ActionBarActivity {
    public ListView listView;
    ArrayList<Snack> h_info_list;
    SnackAdapter myadapter;
    Snack snack1,snack2,snack3,snack4,snack5,snack6,snack7,snack8,snack9,snack10,snack11,snack12,snack13,snack14,snack15,snack16,snack17,snack18, snack19,snack20,snack21,snack22,snack23,snack24,snack25,scnack26,snack27,snack28,snack29,snack30;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_rank1_list);

            listView = (ListView)findViewById(R.id.list);
            snack1 = new Snack("양파링", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza1));
            snack2 = new Snack("포테토칩",BitmapFactory.decodeResource(getResources(), R.drawable.gwaza2));
            snack3 = new Snack("새우깡", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza3));
            snack4 = new Snack("갈릭새우칩", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza4));
            snack5 = new Snack("허니버터칩", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza5));
            snack6 = new Snack("오징어땅콩", BitmapFactory.decodeResource(getResources(), R.drawable.snack1));
            snack7 = new Snack("통통치즈소세지", BitmapFactory.decodeResource(getResources(), R.drawable.snack2));
            snack8 = new Snack("생생칩(오리지널)", BitmapFactory.decodeResource(getResources(), R.drawable.snack3));
            snack9 = new Snack("생생칩(콘소메)", BitmapFactory.decodeResource(getResources(), R.drawable.snack4));
            snack10 = new Snack("신당동떡볶이", BitmapFactory.decodeResource(getResources(), R.drawable.snack5));
            snack11 = new Snack("오사쯔", BitmapFactory.decodeResource(getResources(), R.drawable.snack6));
            snack12 = new Snack("타코야끼볼", BitmapFactory.decodeResource(getResources(), R.drawable.snack7));
            snack13 = new Snack("콘포타츄", BitmapFactory.decodeResource(getResources(), R.drawable.snack8));
            snack14 = new Snack("구운양파", BitmapFactory.decodeResource(getResources(), R.drawable.snack9));
            snack15 = new Snack("구운오징어", BitmapFactory.decodeResource(getResources(), R.drawable.snack10));
            snack15 = new Snack("달고나팝콘", BitmapFactory.decodeResource(getResources(), R.drawable.snack11));
            snack16 = new Snack("맛동산", BitmapFactory.decodeResource(getResources(), R.drawable.snack12));
            snack17 = new Snack("생생칩(양파맛)", BitmapFactory.decodeResource(getResources(), R.drawable.snack13));
            snack18 = new Snack("구운인절미", BitmapFactory.decodeResource(getResources(), R.drawable.snack14));
            snack19 = new Snack("팝칩", BitmapFactory.decodeResource(getResources(), R.drawable.snack15));
            snack20 = new Snack("피자감자칩", BitmapFactory.decodeResource(getResources(), R.drawable.snack16));

            h_info_list = new ArrayList<Snack>();
            h_info_list.add(snack1);
            h_info_list.add(snack2);
            h_info_list.add(snack3);
            h_info_list.add(snack4);
            h_info_list.add(snack5);
            h_info_list.add(snack6);
            h_info_list.add(snack7);
            h_info_list.add(snack8);
            h_info_list.add(snack9);
            h_info_list.add(snack10);
            h_info_list.add(snack11);
            h_info_list.add(snack12);
            h_info_list.add(snack14);
            h_info_list.add(snack15);
            h_info_list.add(snack16);
            h_info_list.add(snack17);
            h_info_list.add(snack18);
            h_info_list.add(snack19);
            h_info_list.add(snack20);

            myadapter = new SnackAdapter(getApplicationContext(),R.layout.activity_price_rank1_list_item, h_info_list);
            listView.setAdapter(myadapter);



            /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getApplicationContext(), ImageActivity.class); // 다음넘어갈 화면
                    Bitmap sendBitmap = h_info_list.get(position).image;

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                    byte[] byteArray = stream.toByteArray();

                    intent.putExtra("image",byteArray);
                    startActivity(intent);
                }
            });
        }*/
    }
}
