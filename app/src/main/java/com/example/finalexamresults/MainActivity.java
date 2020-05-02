package com.example.finalexamresults;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView = findViewById(R.id.expandableLstView);
        HashMap<String, List<String>> item = new HashMap<>();
        ArrayList<String> Subject = new ArrayList<>();
        Subject.add("Lecturer");
        Subject.add("Credits");
        Subject.add("Hours");
        Subject.add("Tries");
        Subject.add("Date");
        Subject.add("Grade");

        item.put("SubjectA", Subject);
        item.put("SubjectB", Subject);
        item.put("SubjectC", Subject);
        item.put("SubjectD", Subject);
        item.put("SubjectE", Subject);
        item.put("SubjectF", Subject);
        item.put("SubjectG", Subject);




        ExpListAdapter adapter = new ExpListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}
