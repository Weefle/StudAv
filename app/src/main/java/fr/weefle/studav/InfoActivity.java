package fr.weefle.studav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    private Button button3;
    private Button button2;
    private Button button;
    private Algorithm algo = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        this.button3 = findViewById(R.id.button3);
        this.button2 = findViewById(R.id.button2);
        this.button = findViewById(R.id.button);
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
                algo.removeEleve("Benoit");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                algo.addEleve("Benoit", 15.0, 5);
            }
        });
    }
}
