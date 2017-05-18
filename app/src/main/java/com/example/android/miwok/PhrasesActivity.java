package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create a list of words for family members
        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        phrases.add (new Phrase("Where are you going?" ,"minto wuksus"));
        phrases.add (new Phrase("What is your name?","tinnә oyaase'nә"));
        phrases.add (new Phrase("My name is Miwok","oyaaset Miwok"));
        phrases.add (new Phrase("How are you feeling?","michәksәs?"));
        phrases.add (new Phrase("I’m feeling good.","kuchi achit"));
        phrases.add (new Phrase("Are you coming?","әәnәs'aa?"));
        phrases.add (new Phrase("Yes, I’m coming.","hәә’ әәnәm"));
        phrases.add (new Phrase("I’m coming.","әәnәm"));
        phrases.add (new Phrase("Let’s go.","yoowutis"));
        phrases.add (new Phrase("Come here.","әnni'nem"));

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word

        PhraseAdapter phraseAdapter = new PhraseAdapter(this, phrases);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(phraseAdapter);



    }
}
