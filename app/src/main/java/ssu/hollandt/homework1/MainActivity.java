package ssu.hollandt.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    private Button nameButton;
    private TextView nameText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = (TextView)findViewById(R.id.name_text);
        nameButton = (Button)findViewById(R.id.name_button);
    }

}
