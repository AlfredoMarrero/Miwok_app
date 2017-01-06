package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by alfred on 1/3/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;

    public WordAdapter(Context context, ArrayList<Word> word, int colorId){
        super(context, 0, word);
        colorResourceId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //step 1 get list view items
        Word word = getItem(position);

        // step 2 check if view item is being reused, otherwise inflate view
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate( R.layout.list_view_item, parent, false);
        }

        LinearLayout wordTranslationView = (LinearLayout) convertView.findViewById(R.id.word_translation_view);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        wordTranslationView.setBackgroundColor(color);

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_word);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView englishTextView = (TextView) convertView.findViewById(R.id.english_word);
        englishTextView.setText(word.getEnglishTranslation());

        ImageView image = (ImageView) convertView.findViewById(R.id.image_view);
        if(word.hasAnImage()){
            image.setImageResource(word.getImageResourceId());
        }
        else{
            image.setVisibility(View.GONE);
        }

        return convertView;
    }
}
