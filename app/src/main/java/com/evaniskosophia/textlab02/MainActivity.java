package com.evaniskosophia.textlab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button nameButton, wordButton;
    TextView nameView, wordView;
    EditText nameEdit;
    String [] strs;
    int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameButton = findViewById(R.id.namebutton);
        wordButton = findViewById(R.id.wordbutton);
        wordView = findViewById(R.id.wordview);
        nameView = findViewById(R.id.nameview);
        nameEdit = findViewById(R.id.nameenter);
        Resources res = getResources();
        strs = res.getStringArray(R.array.randomwords);
    }

    public void showName(View view){
        String name = nameEdit.getText().toString();
        nameView.setText(getString(R.string.hello,  name));
    }

    public void showWord(View view){
        String word = strs[clicks%(strs.length)];
        wordView.setText(word);
        clicks++;

    }

}
