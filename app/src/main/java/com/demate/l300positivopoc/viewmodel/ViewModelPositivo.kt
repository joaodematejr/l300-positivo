package com.demate.l300positivopoc.viewmodel

import android.widget.Toast
import androidx.lifecycle.ViewModel
import br.com.positivo.printermodule.Printer
import br.com.positivo.printermodule.PrinterCallback

class ViewModelPositivo : ViewModel() {

    init {

    }

    fun handleInit(context: android.content.Context) {
        Toast.makeText(context, "Init Context", Toast.LENGTH_SHORT).show()
    }

    fun handlePrint(context: android.content.Context) {
        val callback: PrinterCallback = object : PrinterCallback {
            override fun onError(i: Int, s: String) {
                Toast.makeText(context, "Error: $s", Toast.LENGTH_SHORT).show()
            }

            override fun onRealLength(v: Double, v1: Double) {
                Toast.makeText(context, "Real Length: $v, $v1", Toast.LENGTH_SHORT).show()
            }

            override fun onComplete() {
                Toast.makeText(context, "Complete", Toast.LENGTH_SHORT).show()
            }
        }
        val printer = Printer(context)
        printer.printText("Hello World", callback)
    }

}