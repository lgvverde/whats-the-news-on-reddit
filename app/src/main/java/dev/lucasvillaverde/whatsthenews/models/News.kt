package dev.lucasvillaverde.whatsthenews.models

import android.os.Parcel
import android.os.Parcelable

data class News(
    val after: String,
    val before: String,
    val news: List<NewsItem>
) : Parcelable {

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<News> = object : Parcelable.Creator<News> {
            override fun createFromParcel(parcel: Parcel): News = News(parcel)
            override fun newArray(length: Int): Array<News?> = arrayOfNulls(length)
        }
    }

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createTypedArrayList(NewsItem.CREATOR)!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(newParcel: Parcel?, p1: Int) {
        newParcel?.writeString(after)
        newParcel?.writeString(before)
        newParcel?.writeTypedList(news)
    }
}

