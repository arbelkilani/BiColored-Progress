package edu.arbelkilani.twicedprogressbar;

import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

import com.arbelkilani.bicoloredprogress.BiColoredProgress;

public class MainActivity extends AppCompatActivity {

    private final static int DURATION = 5000;
    private final static float VALUE = 87f;

    private BiColoredProgress mBiColoredProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBiColoredProgress = findViewById(R.id.twice_colored_progress);
        mBiColoredProgress.setProgress(VALUE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_interpolator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bounce:
                mBiColoredProgress.setAnimated(true, DURATION, new BounceInterpolator());
                return true;

            case R.id.fastOutSlowIn:
                mBiColoredProgress.setAnimated(true, DURATION, new FastOutSlowInInterpolator());
                return true;

            case R.id.fastOutLinearIn:
                mBiColoredProgress.setAnimated(true, DURATION, new FastOutLinearInInterpolator());
                return true;

            case R.id.overshoot:
                mBiColoredProgress.setAnimated(true, DURATION, new OvershootInterpolator());
                return true;

            case R.id.accelerateDecelerate:
                mBiColoredProgress.setAnimated(true, DURATION, new AccelerateDecelerateInterpolator());
                return true;

            case R.id.anticipate:
                mBiColoredProgress.setAnimated(true, DURATION, new AnticipateInterpolator());
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
