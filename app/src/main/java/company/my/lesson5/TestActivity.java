package company.my.lesson5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        text = findViewById(R.id.text);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("name", text.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle)
    {
        text.setText(bundle.getString("name"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "On Start Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Lifecycle", "On Resume Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Lifecycle", "On Stop Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Lifecycle", "On Pause Called");
    }
}
