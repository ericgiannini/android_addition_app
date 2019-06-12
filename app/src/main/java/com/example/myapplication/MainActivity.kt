package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /*
        // Getting references of widgets, i.e., button, edittext, textview.
        // This is the 'classic' way with findViewById:
        val firstNumEditText = findViewById<EditText>(R.id.firstNumEditText)
        val secondNumEditText = findViewById<EditText>(R.id.secondNumEditText)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val addButton = findViewById<Button>(R.id.addButton)
        */

        // We use instead the more concise synthetic view properties:

        addButton.setOnClickListener {
            val sum = firstNumEditText.text.toString().toInt() + secondNumEditText.text.toString().toInt()
            resultTextView.text = "Add=$sum"
            Toast.makeText(this, resultTextView.text, Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
