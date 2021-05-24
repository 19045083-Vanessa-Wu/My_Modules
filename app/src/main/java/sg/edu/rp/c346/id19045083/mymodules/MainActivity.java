package sg.edu.rp.c346.id19045083.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnC322 = findViewById(R.id.buttonC322);
        Button btnC346 = findViewById(R.id.buttonC346);
        Button btnC382 = findViewById(R.id.buttonC382);

        btnC322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C322");
                intent.putExtra("name", "IT Service Delivery");
                intent.putExtra("year", "2021");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E61G");
                startActivity(intent);

            }
        });

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", "2021");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62E");
                startActivity(intent);

            }
        });

        btnC382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C322");
                intent.putExtra("name", "Data Centre and Cloud Management");
                intent.putExtra("year", "2021");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62G");
                startActivity(intent);

            }
        });

    }
}