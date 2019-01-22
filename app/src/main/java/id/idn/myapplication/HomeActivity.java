package id.idn.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.idn.myapplication.widget.ImageWidgetActivity;

public class HomeActivity extends AppCompatActivity {

    //    Todo 1. Create Variable Button
    Button btnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Todo 2. Initialize Widget to Variable by Id
        btnImage = findViewById(R.id.btn_image);
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ImageWidgetActivity.class));
            }
        });
    }
}