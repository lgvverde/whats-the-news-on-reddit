package dev.lucasvillaverde.whatsthenews.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsthenews.R
import dev.lucasvillaverde.whatsthenews.models.NewsItem
import dev.lucasvillaverde.whatsthenews.utils.inflate

/*class NewsDelegateAdapter(val viewActions: onViewSelectedListener) : ViewTypeDelegateAdapter {

    interface onViewSelectedListener {
        fun onItemSelected(url: String?)
    }

    override fun onCreateViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder {
       return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType){
        holder as NewsViewHolder
        holder.bind(item as NewsItem)
    }

    inner class NewsViewHolder(parent:  ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.newsItem)){

        private val imgThumbnail = itemView.img_thumbnail
        private val description = itemView.description
        private val author = itemView.author
        private val comments.text = itemView.comments
        private val time.text = itemView.time

        fun bind(item: NewsItem){
            imgThumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.craeted.getFriendlyTime()

            super.itemView.setOnClickListener{ viewActions.onItemSelected(item.url) }
        }

    }

}*/
