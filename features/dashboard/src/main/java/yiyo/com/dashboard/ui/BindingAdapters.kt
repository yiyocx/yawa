package yiyo.com.dashboard.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun ImageView.setImageUrl(url: String) {
    Glide.with(context).load(url).into(this)
}