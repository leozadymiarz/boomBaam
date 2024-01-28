package leozadymiarz.gigakupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.List;

import leozadymiarz.gigakupa.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {


    Activity2Binding activity2Binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
//---------------------------------------
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
//---------------------------------------
        activity2Binding = Activity2Binding.inflate(getLayoutInflater());
        View view = activity2Binding.getRoot();
        setContentView(view);
//-----------------------------

        View button2;
        activity2Binding.wrocButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

    /*    activity2Binding.lesgoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openList(); }
        });
            /*
                  public void openActivity2()
                    {
                        Intent intent = new Intent(this, Activity2.class);
                        startActivity();
                    }
            */

    }
    private void openActivity1()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    /*
    private void openList()
    {
        Intent intent2 = new Intent(this, Lista.class);
        startActivity(intent2);
    } */
}