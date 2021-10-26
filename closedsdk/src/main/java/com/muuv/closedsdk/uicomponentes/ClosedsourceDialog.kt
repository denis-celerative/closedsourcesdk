package com.muuv.closedsdk.uicomponentes

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.muuv.closedsdk.R

class ClosedsourceDialog(private val onClickListener: DialogInterface.OnClickListener): DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        super.onCreateDialog(savedInstanceState)
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.muuv_closedsourcesdk_title)
                .setMessage(R.string.muuv_closedsourcesdk_description)
                .setPositiveButton(R.string.muuv_closedsourcesdk_positive_button, onClickListener)
                .setNegativeButton(R.string.muuv_closedsourcesdk_negative_button, onClickListener)
                .setCancelable(true)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be found")
    }

}
