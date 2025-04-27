package com.falon.survey.utils

import android.widget.Toast
import com.falon.survey.MyApp

actual fun showToast(message: String) {
    MyApp.Instance?.applicationContext?.let {
        Toast.makeText(it, message, Toast.LENGTH_SHORT).show()
    }
}
