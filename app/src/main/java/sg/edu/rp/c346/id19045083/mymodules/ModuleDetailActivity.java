package sg.edu.rp.c346.id19045083.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        TextView tvShow = findViewById(R.id.TextView);
        Button btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String code = "Module Code: " + intentReceived.getStringExtra("code");
        String name = "Module Name: " + intentReceived.getStringExtra("name");
        String year = "Academic Year: " + intentReceived.getStringExtra("year");
        String sem = "Semester: " + intentReceived.getStringExtra("semester");
        String credit = "Module Credit: " + intentReceived.getStringExtra("credit");
        String venue = "Venue: " + intentReceived.getStringExtra("venue");

        String output = String.format("%s \n\n%s \n\n%s \n\n%s \n\n%s \n\n%s", code, name, year, sem, credit, venue);

        if (code.contentEquals("C322")) {
            tvShow.setText(output);
        } else if (code.contentEquals("C346")) {
            tvShow.setText(output);
        } else {
            tvShow.setText(output);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}