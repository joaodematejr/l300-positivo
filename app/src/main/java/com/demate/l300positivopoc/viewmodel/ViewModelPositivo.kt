package com.demate.l300positivopoc.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelPositivo : ViewModel() {

    fun handleInit(context: android.content.Context) {
        android.widget.Toast.makeText(context, "Init Context", android.widget.Toast.LENGTH_SHORT)
            .show()
    }

}