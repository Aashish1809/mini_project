package com.example.summarization;

import android.annotation.SuppressLint;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class text_to_summary extends AppCompatActivity {

    public EditText mEditText;
    public TextView summary;
    public Toolbar toolBar;
    public String text_string;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_summary);
        mEditText = findViewById(R.id.url_edit_text);
        summary = findViewById(R.id.summary);
        findViewById(R.id.imdb_clear_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText("");
                summary.setText("");
            }
        });
        findViewById(R.id.imdb_submit_button).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                summary.setText("After Clicking");
                if(mEditText.getText()!=null && mEditText.getText().toString().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"INVALID INPUT",Toast.LENGTH_SHORT).show();
                }
                else if(mEditText.getText()!=null)
                {
                    text_string = mEditText.getText().toString();
                }
            }
        });
        toolBar = findViewById(R.id.toolbar);
        toolBar.setTitle(R.string.imdb_tensorflow);
    }
}
