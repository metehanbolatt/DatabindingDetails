package com.metehanbolat.databindingdetails

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl")
fun ImageView.loadImageFromUrl(profilePhoto: String) {
    this.load(profilePhoto)
}