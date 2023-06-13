package Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.shayari.R;

import Activity.Edit_activity;

public class Emoji_Adapter extends BaseAdapter
{
    Edit_activity edit_activity;
    String emojiArr[];

    public Emoji_Adapter(Edit_activity edit_activity, String[] emojiArr) {
        this.edit_activity=edit_activity;
        this.emojiArr = emojiArr;
    }

    @Override
    public int getCount() {
        return emojiArr.length;
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
        view= LayoutInflater.from(edit_activity).inflate(R.layout.emoji_layout_itam,parent,false);
        TextView textView =view.findViewById(R.id.emoji_list_item);
        textView.setText(""+emojiArr[position]);
        return view;
    }
}