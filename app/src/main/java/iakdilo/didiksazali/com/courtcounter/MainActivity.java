package iakdilo.didiksazali.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int pointA = 0;
    private int pointB = 0;
    private TextView skorA, skorB;
    private Button btnTigaA, btnDuaA, btnSatuA, btnTigaB, btnDuaB, btnSatuB, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skorA = (TextView)findViewById(R.id.skorA);
        skorB = (TextView)findViewById(R.id.skorB);

        btnTigaA = (Button)findViewById(R.id.btnTigaA);
        btnTigaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"+3 Points",Toast.LENGTH_SHORT).show();
                pointA = pointA + 3;
                setTampilanA();
            }
        });

        btnDuaA = (Button)findViewById(R.id.btnDuaA);
        btnDuaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"+2 Points",Toast.LENGTH_SHORT).show();
                pointA = pointA + 2;
                setTampilanA();
            }
        });

        btnSatuA = (Button)findViewById(R.id.btnSatuA);
        btnSatuA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Free Thrown",Toast.LENGTH_SHORT).show();
                pointA = pointA + 1;
                setTampilanA();
            }
        });

        btnTigaB = (Button)findViewById(R.id.btnTigaB);
        btnTigaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"+3 Points",Toast.LENGTH_SHORT).show();
                pointB = pointB + 3;
                setTampilanB();
            }
        });

        btnDuaB = (Button)findViewById(R.id.btnDuaB);
        btnDuaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"+2 Points",Toast.LENGTH_SHORT).show();
                pointB = pointB + 2;
                setTampilanB();
            }
        });

        btnSatuB = (Button)findViewById(R.id.btnSatuB);
        btnSatuB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Free Thrown",Toast.LENGTH_SHORT).show();
                pointB = pointB + 1;
                setTampilanB();
            }
        });

        btnReset = (Button)findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA = 0;
                pointB = 0;
                skorA.setText("0");
                skorB.setText("0");
                Toast.makeText(getApplicationContext(),"Reset Score",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setTampilanA(){
        skorA.setText(""+pointA);
    }

    private void setTampilanB(){
        skorB.setText(""+pointB);
    }

}
