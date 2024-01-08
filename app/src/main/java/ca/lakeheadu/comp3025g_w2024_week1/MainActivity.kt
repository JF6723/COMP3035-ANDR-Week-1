package ca.lakeheadu.comp3025g_w2024_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        greetingTextView.text = "Hello Tom"

    }
}