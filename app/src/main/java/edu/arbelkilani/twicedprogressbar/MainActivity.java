package edu.arbelkilani.twicedprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arbelkilani.bicoloredprogress.BiColoredProgress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BiColoredProgress biColoredProgress = findViewById(R.id.twice_colored_progress);
        biColoredProgress.setProgress(87f);
        biColoredProgress.setAnimated(true);
        biColoredProgress.setAnimated(true, 3000);

    }
}
