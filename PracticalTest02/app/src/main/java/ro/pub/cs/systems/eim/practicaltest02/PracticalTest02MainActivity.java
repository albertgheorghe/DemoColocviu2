package ro.pub.cs.systems.eim.practicaltest02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class PracticalTest02MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test02_main);

    }
    @Override
    protected void onDestroy() {
        Log.i("PracticalTest02", "[MAIN ACTIVITY] onDestroy() callback method has been invoked");

        super.onDestroy();
    }

}
