package com.arijitpaul.reportcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SectionA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        ArrayList<Word> data_list = new ArrayList<>();

        data_list.add(new Word(getString(R.string.name_string) + "Aa", getString(R.string.roll_string) + "101", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Ab", getString(R.string.roll_string) + "102", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Ac", getString(R.string.roll_string) + "103", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Ad", getString(R.string.roll_string) + "104", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Ae", getString(R.string.roll_string) + "105", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Af", getString(R.string.roll_string) + "106", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Ag", getString(R.string.roll_string) + "107", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Ah", getString(R.string.roll_string) + "108", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Ai", getString(R.string.roll_string) + "109", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Aj", getString(R.string.roll_string) + "110", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Ak", getString(R.string.roll_string) + "111", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Al", getString(R.string.roll_string) + "112", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Am", getString(R.string.roll_string) + "113", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "An", getString(R.string.roll_string) + "114", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Ao", getString(R.string.roll_string) + "115", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Ap", getString(R.string.roll_string) + "116", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Aq", getString(R.string.roll_string) + "117", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Ar", getString(R.string.roll_string) + "118", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "As", getString(R.string.roll_string) + "119", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "At", getString(R.string.roll_string) + "120", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Au", getString(R.string.roll_string) + "121", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Av", getString(R.string.roll_string) + "122", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Aw", getString(R.string.roll_string) + "123", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Ax", getString(R.string.roll_string) + "124", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Ay", getString(R.string.roll_string) + "125", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Az", getString(R.string.roll_string) + "126", getString(R.string.grade_string) + "A"));

        WordAdapter adapter = new WordAdapter(this, data_list);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

    }
}