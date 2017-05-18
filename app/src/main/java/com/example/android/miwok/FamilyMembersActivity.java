package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);


        // Create a list of words for family members
        ArrayList<FamilyMember> words = new ArrayList<FamilyMember>();

        words.add (new FamilyMember("Father" ,"әpә"));
        words.add (new FamilyMember("Mother","әṭa"));
        words.add (new FamilyMember("Son","angsi"));
        words.add (new FamilyMember("Daughter","tune"));
        words.add (new FamilyMember("Older brother","taachi"));
        words.add (new FamilyMember("Younger brother","chalitti"));
        words.add (new FamilyMember("Older sister","teṭeṭ"));
        words.add (new FamilyMember("Younger sister","kolliti"));
        words.add (new FamilyMember("Grandmother","ama"));
        words.add (new FamilyMember("Grandfather","paapa"));

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word

        FamilyMemberAdapter familyMemberAdapter = new FamilyMemberAdapter(this, words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(familyMemberAdapter);



    }







    }

