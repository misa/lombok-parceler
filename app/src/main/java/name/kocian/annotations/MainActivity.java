package name.kocian.annotations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Michal Kocian
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
