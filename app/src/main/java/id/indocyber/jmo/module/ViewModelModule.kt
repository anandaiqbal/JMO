package id.indocyber.jmo.module

import com.google.gson.Gson
import id.indocyber.jmo.service.NewsService
import id.indocyber.jmo.usecase.NewsUseCase
import id.indocyber.jmo.viewmodel.NewsViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val vmModule = module {
    viewModel {
        NewsViewModel(get(), get())
    }
}

val networkServiceLogin = module {
    single {
        Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create(Gson())).build()
    }
    single {
        get<Retrofit>().create(NewsService::class.java)
    }
    single {
        OkHttpClient.Builder().build()
    }
}

val usecaseModule = module {
    factory {
        NewsUseCase(get())
    }
}
