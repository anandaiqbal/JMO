package id.indocyber.jmo.entity.news


import com.google.gson.annotations.SerializedName

data class NewsItem(
    @SerializedName("body")
    val body: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)