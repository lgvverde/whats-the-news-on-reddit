package dev.lucasvillaverde.whatsthenews.models

import android.os.Parcel
import android.os.Parcelable
import dev.lucasvillaverde.whatsthenews.adapters.ViewType
import dev.lucasvillaverde.whatsthenews.utils.AppConstants

data class NewsItem(
    val author: String,
    val title: String,
    val numComments: Int,
    val created: Long,
    val thumbnail: String,
    val url: String?
) : ViewType, Parcelable {

    override fun getViewType() = AppConstants.Adapters.NEWS

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<NewsItem> = object : Parcelable.Creator<NewsItem> {
            override fun createFromParcel(parcel: Parcel): NewsItem = NewsItem(parcel)
            override fun newArray(length: Int): Array<NewsItem?> = arrayOfNulls(length)

        }
    }

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readLong(),
        parcel.readString()!!,
        parcel.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(newParcel: Parcel?, p1: Int) {
        newParcel?.writeString(author)
        newParcel?.writeString(title)
        newParcel?.writeInt(numComments)
        newParcel?.writeLong(created)
        newParcel?.writeString(thumbnail)
        newParcel?.writeString(url)
    }
}