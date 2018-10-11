package com.example.aceahmer.taskthree;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<ModelClass>{

    List<ModelClass> list;
    Context context;
    int customlayoutres;
    ImageView img;
    TextView cname,mname;
    View view;

    public CustomAdapter(@NonNull Context context,  List<ModelClass> list, int customlayoutres) {
        super(context, customlayoutres,list);
        this.list = list;
        this.context = context;
        this.customlayoutres = customlayoutres;
    }
    public void initializeVariable(){
        img=(ImageView)view.findViewById(R.id.image_view);
        cname=(TextView)view.findViewById(R.id.cname_txt);
        mname=(TextView)view.findViewById(R.id.mname_txt);

    }
    public void setValues(ModelClass mc){
        img.setImageDrawable(context.getDrawable(mc.getImage()));
        img.setTag(mc.getImage());
        cname.setText(mc.getCname());
        mname.setText(mc.getMname());

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(customlayoutres,null,false);
        initializeVariable();
        ModelClass mc=list.get(position);
        setValues(mc);
        return view;
    }
}
