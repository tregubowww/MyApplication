package ru.myuniquenickname.myapplication.data.api

import okhttp3.Interceptor
import okhttp3.Response
import ru.myuniquenickname.myapplication.BuildConfig

class MoviesApiHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val url = originalRequest.url.newBuilder().addQueryParameter(API_KEY_HEADER, BuildConfig.API_KEY).build()

        val request = originalRequest.newBuilder()
            .url(url)
            .build()

        return chain.proceed(request)
    }

    companion object {
        private const val API_KEY_HEADER = "api_key"
    }
}
