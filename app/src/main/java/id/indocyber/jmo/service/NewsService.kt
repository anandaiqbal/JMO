package id.indocyber.jmo.service

import id.indocyber.jmo.entity.news.NewsItem
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {
    @GET("posts")
    suspend fun getPosts(): Response<NewsItem>
}