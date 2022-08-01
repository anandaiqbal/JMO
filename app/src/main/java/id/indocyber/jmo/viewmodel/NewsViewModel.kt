package id.indocyber.jmo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import id.indocyber.jmo.entity.news.News
import id.indocyber.jmo.entity.news.NewsItem
import id.indocyber.jmo.usecase.NewsUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(val app: Application, val newsUseCase: NewsUseCase) :
    AndroidViewModel(app) {
    val dataNews = MutableLiveData<Response<NewsItem>>()

    init {
        loadNews()
    }

    fun loadNews() {
        viewModelScope.launch {
            newsUseCase().collect {
                dataNews.value = it
            }
        }
    }
}