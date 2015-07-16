package ch.websoft.taxulator.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import ch.websoft.taxulator.shared.SampleClass;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SampleClass sample = new SampleClass();

        Log.v("Debug message", "" + sample.increment(1));
    }
}
