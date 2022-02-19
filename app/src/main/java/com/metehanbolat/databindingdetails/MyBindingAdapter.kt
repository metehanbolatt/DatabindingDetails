package com.metehanbolat.databindingdetails

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl", "displayTitle", requireAll = true)
fun ImageView.loadImageFromUrl(profilePhoto: String, title: String) {
    this.load(profilePhoto)
    Log.d("Title", title)
}

@BindingAdapter("setVisibility")
fun View.setMyViewVisibility(points: Int) {
    if (points > 10) {
        this.visibility = View.INVISIBLE
    }
}
