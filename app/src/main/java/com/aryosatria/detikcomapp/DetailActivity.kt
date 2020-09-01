package com.aryosatria.detikcomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_Deskripsi = "cont_Deskripsi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.setText(intent.getStringExtra(cont_TitleNews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews).toInt())
        txt_KontenNews.setText(intent.getStringExtra(cont_Deskripsi))

        btn_back.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intermain = Intent(
                    this@DetailActivity, MainActivity::class.java)

                startActivity(intermain)
                finish()
            }
        })
    }
}