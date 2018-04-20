package it.pradita.ac.id.myintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnPindahactivity;
    private Button btnPindahdata;
    private  Button btnDial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPindahactivity = (Button) findViewById(R.id.pindah_activity);
        btnPindahactivity.setOnClickListener(this);
        btnPindahactivity = (Button) findViewById(R.id.pindah_data);
        btnPindahactivity.setOnClickListener(this);
        btnDial = (Button)findViewById(R.id.btn_Dialnumber);
        btnDial.setOnClickListener(this);
    }
     public void onClick(View v) {
        switch (v.getId()){
            case R.id.pindah_activity:
                Intent intentpindah = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(intentpindah);
                break;
            case R.id.pindah_data:
                Intent pindahdata = new Intent(MainActivity.this,MoveActivity.class);
                pindahdata.putExtra(MoveActivity.EXTRA_NAME, "Andi Ardyansyah");
                pindahdata.putExtra(MoveActivity.EXTRA_AGE,19);
                pindahdata.putExtra(MoveActivity.EXTRA_TAHUN,1998);
                startActivity(pindahdata);
                break;

            case R.id.btn_Dialnumber:
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }
     }
}
