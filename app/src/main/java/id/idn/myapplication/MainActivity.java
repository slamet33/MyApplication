package id.idn.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    TODO 1. Create variable
    TextView txtPrint;
    EditText edtNama, edtUsername;
    Button btnShow;
    String strInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TODO 2. Initialize to View by id
        txtPrint = findViewById(R.id.txt_print);
        edtNama = findViewById(R.id.edt_nama);
        btnShow = findViewById(R.id.btn_show);


//        TODO 4. create Onclick on btnShow

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3. set variable strInput from edtNama
                strInput = edtNama.getText().toString();

                //TODO 5. set txtPrint to strInput
                txtPrint.setText(strInput);
            }
        });
    }
}