package com.example.a2;

import android.view.View;

public class dva { @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.second);
}
    public void Back(View view) {import android.app.Activity;
import android.content.Intent;
import java.awt.event.ActionEvent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

        public class Second extends Activity {
            private TextView mT1;
            private TextView mT2;
            private Button mBack;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.second);
                mT1=(TextView)findViewById(R.id.tv1);
                mT2=(TextView)findViewById(R.id.tv2);
                mBack=(Button)findViewById(R.id.b2);

                String Name = getIntent().getStringExtra("name");
                String Fam = getIntent().getStringExtra("fam");

                mT1.setText(mT1.getText().toString()+ "" + Name);
                mT2.setText(mT2.getText().toString()+ "" + Fam);
            }

            public void Back(View view) {
                Intent intent=new Intent(Second.this,MainActivity.class);
                startActivity(intent);
            }
        }
    }