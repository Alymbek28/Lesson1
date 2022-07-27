package com.example.lesson1.ui

import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(url: Uri?) {
    Glide.with(this).load(url).into(this)
}