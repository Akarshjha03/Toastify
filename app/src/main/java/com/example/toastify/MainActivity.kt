package com.example.toastify

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing views
        val editName = findViewById<EditText>(R.id.editName)
        val editCity = findViewById<EditText>(R.id.editCity)
        val btnShow = findViewById<Button>(R.id.btnShow)

        // Click listener for the button
        btnShow.setOnClickListener {
            val name = editName.text.toString().trim()
            val city = editCity.text.toString().trim()

            if (name.isNotEmpty() && city.isNotEmpty()) {
                Toast.makeText(this, "Name: $name, City: $city", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both Name and City", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
