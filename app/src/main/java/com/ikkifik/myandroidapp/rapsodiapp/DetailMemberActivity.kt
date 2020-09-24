package com.ikkifik.myandroidapp.rapsodiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailMemberActivity : AppCompatActivity() {
    private var title: String = "Detail Member"

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_member)
        supportActionBar?.title = title

        val tvDataName: TextView = findViewById(R.id.member_name_received)
        val tvDataDetail: TextView = findViewById(R.id.member_detail_received)
        val tvDataPhoto: ImageView = findViewById(R.id.member_photo_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvDataName.text = name
        tvDataDetail.text = detail

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(350,550))
            .into(tvDataPhoto)

    }
}