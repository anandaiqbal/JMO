package id.indocyber.jmo.activity.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.indocyber.jmo.databinding.NewsFragmentItemBinding
import id.indocyber.jmo.entity.news.NewsItem

class NewsAdapter : RecyclerView.Adapter<NewsViewHolder>() {
    val data = ArrayList<NewsItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            NewsFragmentItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class NewsViewHolder(val binding: NewsFragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(news: NewsItem) {
        binding.title.text = news.title
        binding.body.text = news.body
    }
}