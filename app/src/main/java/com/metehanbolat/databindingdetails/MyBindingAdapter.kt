package com.metehanbolat.databindingdetails

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

class MyBindingAdapter {

    companion object {
        @BindingAdapter("loadImageFromUrl")
        @JvmStatic
        fun ImageView.loadImageFromUrl(profilePhoto: String) {
            this.load(profilePhoto)
        }
    }
}