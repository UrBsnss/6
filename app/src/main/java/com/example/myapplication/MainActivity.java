package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Send(View view) {import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import java.awt.event.ActionEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static home.study.R.id.b1;

        public class MainActivity extends Activity {
            private EditText mName;
            private EditText mFam;
            private Button mGo;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                mName=(EditText)findViewById(R.id.et1);
                mFam=(EditText)findViewById(R.id.et2);
                mGo=(Button)findViewById(b1);
            }
            public void Send(View view) {
                switch (view.getId()) {
                    case R.id.b1:

                        Intent intent=new Intent(MainActivity.this,Second.class);
                        intent.putExtra("name", mName.getText().toString());
                        intent.putExtra("fam", mFam.getText().toString());
                        startActivity(intent);
                        break;
                    default: break;
                }
            }}

    }
}
    }
}