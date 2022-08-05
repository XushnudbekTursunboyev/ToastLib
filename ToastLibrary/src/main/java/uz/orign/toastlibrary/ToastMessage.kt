package uz.orign.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastMessage {

    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}