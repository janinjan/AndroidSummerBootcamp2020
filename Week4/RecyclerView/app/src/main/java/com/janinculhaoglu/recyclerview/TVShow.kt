package com.janinculhaoglu.recyclerview

import android.os.Parcel
import android.os.Parcelable

data class TVShow(
    val id: Int,
    val title: String,
    val releaseDate: String,
    val summary: String,
    val poster: Int,
    val genre: String,
    val rating: Double?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readDouble()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(releaseDate)
        parcel.writeString(summary)
        parcel.writeInt(poster)
        parcel.writeString(genre)
        if (rating != null) {
            parcel.writeDouble(rating)
        }

    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<TVShow> {
        override fun createFromParcel(parcel: Parcel): TVShow {
            return TVShow(parcel)
        }

        override fun newArray(size: Int): Array<TVShow?> {
            return arrayOfNulls(size)
        }
    }
}