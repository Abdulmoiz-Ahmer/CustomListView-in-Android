package com.example.aceahmer.taskthree;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    List<ModelClass> list;
    ListView listView;
    TextView Cname,Mname;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
        addValues();
        CustomAdapter cs=new CustomAdapter(MainActivity.this,list,R.layout.custom_list_layout);
        listView.setAdapter(cs);
        listView.setOnItemClickListener(this);

    }
    public void initializeVariables(){
        list=new ArrayList<>();
        listView=(ListView)findViewById(R.id.cars_list);
        listView.setOnItemClickListener(this);


    }
    public void addValues(){
        list.add(new ModelClass( "Daihatsu","Copen",R.drawable.daihatsu_copen,"Amazing build quality and a very good option in mid budget range.\n" +
                "pickup and performance is just amazing . It can touch 100-120kmph very easily without any vibration,front seats are comfortable with good leg space while back legs space is not as much comfy ,Steering works like Power steering (Semi power steering),Handling ,road grip ,ground clearance is also satisfactory."));
        list.add(new ModelClass( "Honda","N-Box",R.drawable.honda_n_box,"Japan’s best selling kei car. Around one-third of the cars sold in Japan are kei cars, size restricted vehicles that attract favourable toll and tax breaks in the largest cities."));
        list.add(new ModelClass( "Mercedes","Golf Cart",R.drawable.mercedes_golf_cart,"\n" +
                "ELECTRIC\n" +
                "FIRST LOOK\n" +
                "MERCEDES-BENZ\n" +
                "The humble golf cart has been transporting lazy golfists around well-cut lawns for decades. But as you’ve probably noticed, the design hasn’t really changed since the early days way back when. \n" +
                "\n" +
                "Yes, some people have turned them into Hummers and Escalades, and range and speeds have improved, but they’ve always looked the same: diddy wheels at each corner, non-descript and slightly depressed face at the front, enough room for two sets of golf sticks in the back, and a flimsy plastic canopy overhead. Boring. "));
        list.add(new ModelClass( "Toyota","CHR",R.drawable.toyota_chr,"It’s a bit unfair, really. The Nissan Qashqai gets all the plaudits for kicking off the small SUV craze when Toyota arguably did so more than a decade earlier with the original RAV4.\n" +
                "\n" +
                "The modern day RAV4 is a much larger and dumpier beast, however, which is where the Toyota C-HR comes in. It’s roughly the same size as its main rivals, the aforementioned Qashqai and the Seat Ateca. However, it isn’t as roomy in the back as those cars (blame the sleek roofline) and costs a bit more to buy."));


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        ModelClass mc=list.get(i);


        Intent intent=new Intent(this,Details.class);
        intent.putExtra("data", (Serializable) mc);
        startActivity(intent);

    }
}
