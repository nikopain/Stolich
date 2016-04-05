package cl.usm.stolich.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cl.usm.stolich.R;

public class profileActivity extends AppCompatActivity {
    private String TAG = "profileActivity";
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv = (TextView) findViewById(R.id.nameProfile);
        tv.setText(getIntent().getStringExtra("NAME"));
    }
}
