package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shayari.R;

import Activity.MainActivity;


public class Category_Adapter extends BaseAdapter
{

    MainActivity mainActivity;
    TextView textView;
    ImageView imageView;
    String[] name;
    int[] imgArr;

    public Category_Adapter(MainActivity mainActivity, String[] name, int[] img) {
        this.mainActivity = mainActivity;
        this.name = name;
        this.imgArr = img;

    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(mainActivity).inflate(R.layout.first_iteam_list,parent,false);

        imageView=view.findViewById(R.id.main_item_img);
        textView=view.findViewById(R.id.main_item_name);

        textView.setText(""+name[position]);
        imageView.setImageResource(imgArr[position]);

        return view;
    }
}