package com.example.gerrybuenafe.angeles_buenafe_115;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class thingsAfterPage extends AppCompatActivity {
    Toolbar mToolbar;
    TextView mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_after_page);
        mToolbar = findViewById(R.id.toolB);
        mTitle = mToolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(mToolbar);
        mTitle.setText("THINGS TO REMEMBER AFTER THE FLOOD");

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            if(item.getItemId()==android.R.id.home)
                finish();
            return super.onOptionsItemSelected(item);
        }
}
