package fr.weefle.studav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Algorithm algo = Algorithm.get();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*algo.addEleve("Benoit", 15.0, 5);
        algo.addEleve("Constance", 14.0, 4);
        algo.addEleve("Constance", 15.0, 4);
        algo.removeEleve("Constance");*/
        ListView shopListView = findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new EleveAdapter(this, algo.elevesob));

    }
}
