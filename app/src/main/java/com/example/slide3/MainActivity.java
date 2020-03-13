package com.example.slide3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "extra_message";
    private static final String TAG = "MainActivity_TAG" ;
    static final String STATE_SCORE = "playerScore";
    static final String STATE_LEVEL = "playerLevel";
    int mCurrentScore = 0;
    int mCurrentLevel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_view);
        Log.e(TAG, "onCreate");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HeadlinesFragment fragment = new HeadlinesFragment();
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
//        instead of onRestoreInstanceState :
//        if (savedInstanceState != null) {
//            mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
//            mCurrentLevel = savedInstanceState.getInt(STATE_LEVEL);
//
//        } else {
//            // Probably initialize members with default values for a new instance
//        }
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        TextView text = new TextView(this);
//        Log.e(TAG, "onStart");
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        TextView text = new TextView(this);
//        text.setText(R.string.resume);
//        Log.e(TAG, "onResume " + mCurrentLevel +" "+ mCurrentScore);
//    }
//    @Override
//    protected void onPause() {
//
//        super.onPause();
//        TextView text = new TextView(this);
//        text.setText(R.string.pause);
//        mCurrentScore = 1;
//        mCurrentLevel = 2;
//        Log.e(TAG, "onPause");
//    }
//    @Override
//    protected void onStop() {
//        Log.e(TAG, "onStop");
//        super.onStop();
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        savedInstanceState.putInt(STATE_SCORE, mCurrentScore);
//        savedInstanceState.putInt(STATE_LEVEL, mCurrentLevel);
//        super.onSaveInstanceState(savedInstanceState);
//    }
//
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        mCurrentScore = savedInstanceState.getInt(STATE_SCORE);
//        mCurrentLevel = savedInstanceState.getInt(STATE_LEVEL);
//    }
//    public void onClick(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }

}
