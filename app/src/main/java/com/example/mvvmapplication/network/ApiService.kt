package com.example.mvvmapplication.network

import com.example.mvvmapplication.model.User
import io.reactivex.Single

interface ApiService {

    fun getUser(): Single<List<User>>
}