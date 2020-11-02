package com.jguzmandev.demo.utils

sealed class Resource<T> {
    class Loading<T>():Resource<T>()
    data class Success<T>(val data:T):Resource<T>()
    data class Failure<T>(val ex:Exception):Resource<T>()
}