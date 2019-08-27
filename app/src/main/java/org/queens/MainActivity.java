package org.queens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AppCenter.start(getApplication(), "Hello App", Analytics.class, Crashes.class);
        AppCenter.start(getApplication(), "8034619f-95fc-4c57-8d09-eb1f0755a910",
                  Analytics.class, Crashes.class);
    }
}
