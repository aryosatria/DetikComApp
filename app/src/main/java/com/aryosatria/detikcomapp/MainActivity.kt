package com.aryosatria.detikcomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aryosatria.detikcomapp.NewsAdapter.NewsAdapter
import com.aryosatria.detikcomapp.NewsAdapter.NewsModel
import com.aryosatria.detikcomapp.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region headline

        var headlinenews: news?
        if (NewsModel.newsList.size>0) {
            headlinenews = NewsModel.newsList[NewsModel.newsList.size-1]
            tvw_TitleHeadLine.setText(headlinenews.title)
            tvw_DescHeadLine.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.photo)

            cdv_newsheadline.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                    }
                startActivity(intent_detail)
                finish()
            }
        }

        //endregion

        //region daftar berita
        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newsList)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallBack(object  : NewsAdapter.OnItemClickCallBack{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                        putExtra(DetailActivity.cont_Deskripsi, data.deskripsi.toString())
                    }

                startActivity(intent)
                finish()

            }
        })

        //endregion

    }
}