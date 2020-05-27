package dev.lucasvillaverde.whatsthenews.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsthenews.R
import dev.lucasvillaverde.whatsthenews.utils.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        LoadViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.news_list_item_loading)
    )

}