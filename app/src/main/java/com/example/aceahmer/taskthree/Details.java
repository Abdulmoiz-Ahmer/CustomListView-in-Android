package com.example.aceahmer.taskthree;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

public class Details extends Activity {

    TextView Cname,Mname,Review;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initializeVaribles();
        setViews();
    }
    public void initializeVaribles(){
        Cname=(TextView)findViewById(R.id.cname_txt);
        Mname=(TextView)findViewById(R.id.mname_txt);
        img=(ImageView) findViewById(R.id.img);
        Review=(TextView)findViewById(R.id.review_txt);
    }
    public void setViews(){
        ModelClass model = (ModelClass) getIntent().getSerializableExtra("data");
        Cname.setText(getResources().getString(R.string.name)+" "+model.Cname);
        Mname.setText(getResources().getString(R.string.model)+" "+model.Mname);
        img.setImageDrawable(getResources().getDrawable(model.getImage()));
        Review.setText(getResources().getString(R.string.model)+" "+model.getReview());
    }

}
