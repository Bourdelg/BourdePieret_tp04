package fr.utt.if26.bourdepieret_tp04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtNom;
    private TextView txtPrenom;
    private EditText plainNom;
    private EditText plainPrenom;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtNom = findViewById(R.id.main_text_nom);
        this.txtPrenom = findViewById(R.id.main_text_prenom);
        this.plainNom = findViewById(R.id.main_plainText_nom);
        this.plainPrenom = findViewById(R.id.main_plainText_prenom);
        this.button1 = findViewById(R.id.main_button_B01);
        this.button2 = findViewById(R.id.main_button_B02);

        this.button1.setBackgroundColor(Color.RED);
        this.button2.setBackgroundColor(Color.RED);

        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);

        this.button1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent resultActivity = new Intent(MainActivity.this, ResultActivity.class);
                
                startActivity(resultActivity);
                return false;
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.main_button_B01:
                this.button1.setSelected(!this.button1.isSelected());
                this.button1.setBackgroundColor(this.button1.isSelected() ? Color.GREEN : Color.RED);
                break;
            case R.id.main_button_B02:
                this.button2.setSelected(!this.button2.isSelected());
                this.button2.setBackgroundColor(this.button2.isSelected() ? Color.GREEN : Color.RED);
                break;
        }
    }

}
