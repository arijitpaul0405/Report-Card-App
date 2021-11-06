package com.arijitpaul.reportcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SectionC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        ArrayList<Word> data_list = new ArrayList<>();

        data_list.add(new Word(getString(R.string.name_string) + "Ca", getString(R.string.roll_string) + "153", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Cb", getString(R.string.roll_string) + "154", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Cc", getString(R.string.roll_string) + "155", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Cd", getString(R.string.roll_string) + "156", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Ce", getString(R.string.roll_string) + "157", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Cf", getString(R.string.roll_string) + "158", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Cg", getString(R.string.roll_string) + "159", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Ch", getString(R.string.roll_string) + "160", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Ci", getString(R.string.roll_string) + "161", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cj", getString(R.string.roll_string) + "162", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Ck", getString(R.string.roll_string) + "163", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cl", getString(R.string.roll_string) + "164", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cm", getString(R.string.roll_string) + "165", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cn", getString(R.string.roll_string) + "166", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Co", getString(R.string.roll_string) + "167", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Cp", getString(R.string.roll_string) + "168", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Cq", getString(R.string.roll_string) + "169", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Cr", getString(R.string.roll_string) + "170", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Cs", getString(R.string.roll_string) + "171", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Ct", getString(R.string.roll_string) + "172", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cu", getString(R.string.roll_string) + "173", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cv", getString(R.string.roll_string) + "174", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Cw", getString(R.string.roll_string) + "175", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Cx", getString(R.string.roll_string) + "176", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cy", getString(R.string.roll_string) + "177", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Cz", getString(R.string.roll_string) + "178", getString(R.string.grade_string) + "F"));

        WordAdapter adapter = new WordAdapter(this, data_list);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

    }
}