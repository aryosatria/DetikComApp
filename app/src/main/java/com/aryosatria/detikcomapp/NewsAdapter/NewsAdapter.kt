package com.aryosatria.detikcomapp.NewsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.recyclerview.widget.RecyclerView
import com.aryosatria.detikcomapp.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter (val context: Context, val listnews: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentNews: news? = null
        var currentPosition: Int = 0

        fun setData(currnews: news, pos: Int) {
            itemView.tvw_title.text = currnews!!.title
            itemView.tvw_desc.text = currnews!!.desc
            itemView.img_news.setImageResource(currnews!!.photo)

            this.currentNews
            this.currentPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener() {onItemClickCallback.onItemClick(listnews[position])}
    }

    //region 1. Event Click

    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnClickCallBack(onItemClickCallback: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallBack{
        fun onItemClick(data: news)
    }
}