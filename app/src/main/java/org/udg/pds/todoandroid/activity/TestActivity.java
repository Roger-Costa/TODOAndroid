package org.udg.pds.todoandroid.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import org.udg.pds.todoandroid.R;
public class TestActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        final EditText et = (EditText)findViewById(R.id.editTextText);
        Button btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(TestActivity.this, et.getText().toString(), Toast.LENGTH_LONG).show();
                Intent i = new Intent();
                i.putExtra("result", et.getText().toString());
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });
    }
}