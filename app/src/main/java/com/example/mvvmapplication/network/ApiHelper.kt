package com.example.mvvmapplication.network

class ApiHelper(val apiService: ApiService) {
    fun getUser() = apiService.getUser()
}