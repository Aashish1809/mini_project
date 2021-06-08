package com.example.summarization;
import android.content.Intent;
import android.os.Bundle;

public class EnglishNLPList extends AbstractListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.blog_to_summary).setOnClickListener(v -> {
            final Intent intent = new Intent(EnglishNLPList.this, UrlToSummary.class);
            startActivity(intent);
        });
        findViewById(R.id.text_to_summary).setOnClickListener(v -> {
            final Intent intent = new Intent(EnglishNLPList.this, text_to_summary.class);
            startActivity(intent);
        });
        findViewById(R.id.image_to_text).setOnClickListener(v -> {
            final Intent intent = new Intent(EnglishNLPList.this, MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected int getListContentLayoutRes() {
        return R.layout.activity_english_nlplist;
    }
}