package com.abdurrahimi.zeinbelajar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbP,cbNA,cbSA,cbDD,cbSD;
    private TextView tvP1,tvP2,tvP3,tvP4,tvP5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbP = (CheckBox)findViewById(R.id.cbP);
        cbNA = (CheckBox)findViewById(R.id.cbNA);
        cbSA = (CheckBox)findViewById(R.id.cbSA);
        cbDD = (CheckBox)findViewById(R.id.cbDD);
        cbSD = (CheckBox)findViewById(R.id.cbSD);
        tvP1 =(TextView)findViewById(R.id.tvP1);
        tvP2 =(TextView)findViewById(R.id.tvP2);
        tvP3 =(TextView)findViewById(R.id.tvP3);
        tvP4 =(TextView)findViewById(R.id.tvP4);
        tvP5 =(TextView)findViewById(R.id.tvP5);

    }
    public void checkone(View v){
            if(cbP.isChecked()){
                if(tvP1.getText().toString().equals("")){
                    tvP1.setText(String.valueOf("Proggramer"));
                }
                else if(tvP2.getText().toString().equals("")){
                    tvP2.setText(String.valueOf("Proggramer"));
                }
                else if(tvP3.getText().toString().equals("")){
                    tvP3.setText(String.valueOf("Proggramer"));
                }
                else if(tvP4.getText().toString().equals("")){
                    tvP4.setText(String.valueOf("Proggramer"));
                }
                else if(tvP5.getText().toString().equals("")){
                    tvP5.setText(String.valueOf("Proggramer"));
                }
            }
    }
    public void checktwo(View v){
        if(cbNA.isChecked()){
            if(tvP1.getText().toString().equals("")){
                tvP1.setText(String.valueOf("Network Security"));
            }
            else if(tvP2.getText().toString().equals("")){
                tvP2.setText(String.valueOf("Network Security"));
            }
            else if(tvP3.getText().toString().equals("")){
                tvP3.setText(String.valueOf("Network Security"));
            }
            else if(tvP4.getText().toString().equals("")){
                tvP4.setText(String.valueOf("Network Security"));
            }
            else if(tvP5.getText().toString().equals("")){
                tvP5.setText(String.valueOf("Network Security"));
            }
        }
    }
    public void checkthree(View v){
        if(cbSA.isChecked()){
            if(tvP1.getText().toString().equals("")){
                tvP1.setText(String.valueOf("Security Analyse"));
            }
            else if(tvP2.getText().toString().equals("")){
                tvP2.setText(String.valueOf("Security Analyse"));
            }
            else if(tvP3.getText().toString().equals("")){
                tvP3.setText(String.valueOf("Security Analyse"));
            }
            else if(tvP4.getText().toString().equals("")){
                tvP4.setText(String.valueOf("Security Analyse"));
            }
            else if(tvP5.getText().toString().equals("")){
                tvP5.setText(String.valueOf("Security Analyse"));
            }
        }
    }
    public void checkfour(View v){
        if(cbDD.isChecked()){
            if(tvP1.getText().toString().equals("")){
                tvP1.setText(String.valueOf("Database Developer"));
            }
            else if(tvP2.getText().toString().equals("")){
                tvP2.setText(String.valueOf("Database Developer"));
            }
            else if(tvP3.getText().toString().equals("")){
                tvP3.setText(String.valueOf("Database Developer"));
            }
            else if(tvP4.getText().toString().equals("")){
                tvP4.setText(String.valueOf("Database Developer"));
            }
            else if(tvP5.getText().toString().equals("")){
                tvP5.setText(String.valueOf("Database Developer"));
            }
        }
    }
    public void checkfive(View v){
        if(cbSD.isChecked()){
            if(tvP1.getText().toString().equals("")){
                tvP1.setText(String.valueOf("SOftware Developer"));
            }
            else if(tvP2.getText().toString().equals("")){
                tvP2.setText(String.valueOf("SOftware Developer"));
            }
            else if(tvP3.getText().toString().equals("")){
                tvP3.setText(String.valueOf("SOftware Developer"));
            }
            else if(tvP4.getText().toString().equals("")){
                tvP4.setText(String.valueOf("SOftware Developer"));
            }
            else if(tvP5.getText().toString().equals("")){
                tvP5.setText(String.valueOf("SOftware Developer"));
            }
        }
    }
}
