package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Hello World"); // Post "Hello World" to Logcat

        try{
            int a = 5/0; // Try to divide by zero
        }

        catch(Exception e){
            Log.e("MainActivity", e.getMessage()); // Post the exception message to Logcat
        }
    }
}