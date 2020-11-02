package com.jguzmandev.demo.utils

import com.google.firebase.firestore.DocumentSnapshot

fun <T>List<DocumentSnapshot>.toList(classType: Class<T>):MutableList<T>{

    val data = this
    val listEntities = mutableListOf<T>()

    data.forEach {
        val item = it.toObject(classType)
        item?.let {value->
            listEntities.add(value)
        }
    }
    return listEntities
}