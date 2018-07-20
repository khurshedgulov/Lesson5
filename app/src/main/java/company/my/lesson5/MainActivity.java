package company.my.lesson5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout result;
    Float number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = 0f;
        result = findViewById(R.id.result);
    }

    public void click(View v) {
        Button b = (Button) v;
        Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show();

        try {
            number = number * 10 + Float.parseFloat((String)b.getText());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            Log.e("Error", e.toString());
        }
        TextView text = new TextView(this);
        text.setText(String.valueOf(number));

        result.addView(text);
    }

    public void action(View v) {
        Button b = (Button)v;
        String text = (String)b.getText();
        if (text.equals("*"))
        {
            Log.i("Action","Pressed button *");
        }
        if (text.equals("/"))
        {

        }
        if (text.equals("+"))
        {

        }
        if (text.equals("-"))
        {

        }
        if (text.equals("="))
        {

        }
    }

    @Override
    public void onBackPressed() {

        Log.i("Action", "Back pressed");
        super.onBackPressed();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putFloat("number", 10.5f);
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle)
    {
        float num = bundle.getFloat("number");
        Log.i("Action", String.valueOf(num));
    }
}
