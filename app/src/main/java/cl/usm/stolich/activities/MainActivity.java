package cl.usm.stolich.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.usm.stolich.R;

public class MainActivity extends AppCompatActivity {
    private EditText edText;
    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.Ingresar);
        edText = (EditText) findViewById(R.id.name);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edText.getText().toString();
                if (!name.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, profileActivity.class);
                    intent.putExtra("NAME", name);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Inserta un nombre",Toast.LENGTH_SHORT);
                }
            }
        });
    }


}
