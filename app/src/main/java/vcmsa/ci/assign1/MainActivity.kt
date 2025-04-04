package vcmsa.ci.assign1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Initialize UI elements
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val textViewSuggestion = findViewById<TextView>(R.id.textViewSuggestion)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        //Author: Openai ChatGpt
        //url: https://chat.openai.com

        // Set button click Listener
        buttonSubmit.setOnClickListener {
            val timeOfDay = editTextTime.text.toString().trim().lowercase()

            val suggestion = when (timeOfDay) {
                "morning" -> "Have a healthy breakfast!"
                "afternoon" -> "Take a short break and relax!"
                "evening" -> "Go for a walk and enjoy the sunset!"
                "night" -> "Get ready for bed and sleep well!"
                else -> "Please enter a valid time: Morning, Afternoon, Evening, or Night."
            }

            textViewSuggestion.text = suggestion
        }

        // Reset button to clear input and suggestion
        buttonReset.setOnClickListener {
            editTextTime.text.clear()
            textViewSuggestion.text = "Your suggestion will appear here"
        }
// Author: Openai ChatGpt
        //url:https://chat.openai.com

            }
        }

