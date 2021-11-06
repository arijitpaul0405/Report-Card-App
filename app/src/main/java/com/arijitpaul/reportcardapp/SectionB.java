package com.arijitpaul.reportcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SectionB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        ArrayList<Word> data_list = new ArrayList<>();

        data_list.add(new Word(getString(R.string.name_string) + "Ba", getString(R.string.roll_string) + "127", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bb", getString(R.string.roll_string) + "128", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Bc", getString(R.string.roll_string) + "129", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Bd", getString(R.string.roll_string) + "130", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Be", getString(R.string.roll_string) + "131", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Bf", getString(R.string.roll_string) + "132", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Bg", getString(R.string.roll_string) + "133", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Bh", getString(R.string.roll_string) + "134", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Bi", getString(R.string.roll_string) + "135", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Bj", getString(R.string.roll_string) + "136", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Bk", getString(R.string.roll_string) + "137", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bl", getString(R.string.roll_string) + "138", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bm", getString(R.string.roll_string) + "139", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bn", getString(R.string.roll_string) + "140", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bo", getString(R.string.roll_string) + "141", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "Bp", getString(R.string.roll_string) + "142", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Bq", getString(R.string.roll_string) + "143", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Br", getString(R.string.roll_string) + "144", getString(R.string.grade_string) + "B"));
        data_list.add(new Word(getString(R.string.name_string) + "Bs", getString(R.string.roll_string) + "145", getString(R.string.grade_string) + "D"));
        data_list.add(new Word(getString(R.string.name_string) + "Bt", getString(R.string.roll_string) + "146", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Bu", getString(R.string.roll_string) + "147", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Bv", getString(R.string.roll_string) + "148", getString(R.string.grade_string) + "F"));
        data_list.add(new Word(getString(R.string.name_string) + "Bw", getString(R.string.roll_string) + "149", getString(R.string.grade_string) + "E"));
        data_list.add(new Word(getString(R.string.name_string) + "Bq", getString(R.string.roll_string) + "150", getString(R.string.grade_string) + "A"));
        data_list.add(new Word(getString(R.string.name_string) + "By", getString(R.string.roll_string) + "151", getString(R.string.grade_string) + "C"));
        data_list.add(new Word(getString(R.string.name_string) + "Bz", getString(R.string.roll_string) + "152", getString(R.string.grade_string) + "C"));

        WordAdapter adapter = new WordAdapter(this, data_list);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

    }
}