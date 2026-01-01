package com.bilalazzam.mycontacts

import androidx.compose.ui.window.ComposeUIViewController
import com.bilalazzam.mycontacts.di.Dependencies
import com.bilalazzam.mycontacts.di.dependencies
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    dependencies = Dependencies()
    return ComposeUIViewController { ContactsScreen() }
}