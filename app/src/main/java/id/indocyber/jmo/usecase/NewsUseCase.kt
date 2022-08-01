package id.indocyber.jmo.usecase

import id.indocyber.jmo.service.NewsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.runBlocking
import retrofit2.Response

class NewsUseCase(val newsService: NewsService) {
    operator fun invoke() = callbackFlow {
        runBlocking(Dispatchers.IO) {
            val response = newsService.getPosts()
            when (response.isSuccessful) {
                true -> {
                    response.body()?.let {
                        send(Response.success(it))
                    }
                }
                false -> {

                }
            }
            close()
        }
        awaitClose()
    }
}
