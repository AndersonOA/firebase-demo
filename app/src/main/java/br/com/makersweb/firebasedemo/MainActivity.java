package br.com.makersweb.firebasedemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = (Button) findViewById(R.id.btnOK);

        final String token = FirebaseInstanceId.getInstance().getToken();

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setMessage(token)
                        .setTitle("Teste")
                        .setNegativeButton("OK", null)
                        .show();
                Log.d("TesteMarreco", "Token Celular Marreco" + token);
            }
        });
    }
}
