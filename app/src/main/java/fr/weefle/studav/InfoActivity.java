package fr.weefle.studav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private Button button3;
    private Button button2;
    private Button button;
    private EditText text;
    private EditText text2;
    private EditText text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        this.button3 = findViewById(R.id.button3);
        this.button2 = findViewById(R.id.button2);
        this.button = findViewById(R.id.button);
        this.text = findViewById(R.id.editText);
        this.text2 = findViewById(R.id.editText2);
        this.text3 = findViewById(R.id.editText3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newactivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(newactivity);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Algorithm.get().removeAll();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Algorithm.get().addEleve(text.getText().toString(), Double.parseDouble(text2.getText().toString()), Integer.parseInt(text3.getText().toString()));
            }
        });
    }
}
