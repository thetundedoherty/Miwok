package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<Number> words = new ArrayList<Number>();

        words.add (new Number ("One" ,"Lutti"));
        words.add (new Number ("Two","Otiiko"));
        words.add (new Number ("Three","Tolookosu"));
        words.add (new Number ("Four","Oyyisa"));
        words.add (new Number("Five","Massokka"));
        words.add (new Number ("Six","Temmokka"));
        words.add (new Number("Seven","Kenekaku"));
        words.add (new Number("Eight","Kawinta"));
        words.add (new Number("Nine","Wo'e"));
        words.add (new Number("Ten","na'aacha"));

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word
        NumberAdapter numberAdapter = new NumberAdapter(this, words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(numberAdapter);

    }


}
