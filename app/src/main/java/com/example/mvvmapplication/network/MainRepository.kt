package com.example.mvvmapplication.network

import com.example.mvvmapplication.model.User
import io.reactivex.Single

class MainRepository(val apiHelper: ApiHelper) {
    fun getUser() : Single<List<User>>{
        return apiHelper.getUser()
    }
}