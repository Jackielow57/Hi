package my.edu.taruc.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main()
        super.onCreate(savedInstanceState);

        //to display UI
            //R = resources class
            //layout = folder name
        setContentView(R.layout.activity_main);
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    //view = class
        //v = an instance of a class
    public void showMessenger(View view)
    {
        //linking UI to program

        textViewMsg.setText("Hello, Oh hi Mark");
    }

    public void clearScreen(View v)
    {
        textViewMsg.setText(' ');
    }
}

