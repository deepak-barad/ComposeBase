package com.dbarad.composebase.data

import javax.inject.Inject

interface BaseRepository {
    fun baseFunction(): String
}

class  BaseRepositoryImpl @Inject constructor(): BaseRepository {
    override fun baseFunction(): String {
        return "to be implemented"
    }
}