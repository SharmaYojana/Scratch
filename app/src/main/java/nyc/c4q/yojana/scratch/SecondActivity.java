package nyc.c4q.yojana.scratch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by yojanasharma on 12/9/16.
 */

public class SecondActivity extends AppCompatActivity{
    TextView second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        second = (TextView) findViewById(R.id.second_activity);
        Intent intent = getIntent();
        String nativeName = intent.getStringExtra("String");
        second.setText(nativeName);




    }
}
