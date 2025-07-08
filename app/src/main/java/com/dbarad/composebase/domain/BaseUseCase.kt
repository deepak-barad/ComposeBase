package com.dbarad.composebase.domain

import com.dbarad.composebase.data.BaseRepository
import jakarta.inject.Inject

class BaseUseCase @Inject constructor(private val baseRepository: BaseRepository) {

    operator fun invoke(): String {
        return baseRepository.baseFunction()
    }
}