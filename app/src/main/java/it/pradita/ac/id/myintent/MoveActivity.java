package it.pradita.ac.id.myintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {

    public static String EXTRA_AGE = "extra_age";
    public  static String EXTRA_NAME = "extra_name";
    public static  String EXTRA_TAHUN ="extra_tahun";
    private TextView tvDataReceived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        tvDataReceived = (TextView) findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,19);
        int tahun = getIntent().getIntExtra(EXTRA_TAHUN,1998);
        String text = "Name :" + name + "\nUsia :" +age+"\nTahun :"+ tahun;
        tvDataReceived.setText(text);
    }
}


