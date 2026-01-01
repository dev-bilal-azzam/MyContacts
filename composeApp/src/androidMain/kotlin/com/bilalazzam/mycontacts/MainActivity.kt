package com.bilalazzam.mycontacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bilalazzam.mycontacts.di.Dependencies
import com.bilalazzam.mycontacts.di.dependencies

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        dependencies = Dependencies(this)
        setContent {
            ContactsScreen()
        }
    }
}
