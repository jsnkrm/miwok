package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jsnkrm on 28/4/17.
 */

public class WordAdapter extends ArrayAdapter<word>{

    private int mBackgroundId;

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context,int backGroundId,ArrayList<word> words) {
        super(context, 0,backGroundId,words);
        mBackgroundId = backGroundId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        linearLayout.setBackgroundResource(mBackgroundId);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_word);
        defaultTextView.setText(currentWord.getmDefaulTranslation());

        TextView translateTextView = (TextView) listItemView.findViewById(R.id.translate_word);
        translateTextView.setText(currentWord.getmMiwokTranslation());


            ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
        if(currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getmResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
