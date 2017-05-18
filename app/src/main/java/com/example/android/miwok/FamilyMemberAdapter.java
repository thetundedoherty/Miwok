package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 5/18/2017.
 */

public class FamilyMemberAdapter extends ArrayAdapter<FamilyMember> {

    private static final String LOG_TAG = ColorAdapter.class.getSimpleName();

    public FamilyMemberAdapter(Activity context, ArrayList<FamilyMember> words) {


        super(context, 0, words);


    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        FamilyMember currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name

        TextView milwokTextView = (TextView) listItemView.findViewById(R.id.english_text_view);

        // Get the milwok translation from the current color object and
        // set this text on the name TextView

        milwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID name

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.milwok_text_view);

        // Get the English translation from the current family member object and
        // set this text on the name TextView

        englishTextView.setText(currentWord.getmDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }


}
