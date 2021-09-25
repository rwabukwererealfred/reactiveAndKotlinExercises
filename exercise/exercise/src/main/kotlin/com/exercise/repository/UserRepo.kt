package com.exercise.repository

import com.exercise.entity.Users
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.data.repository.reactive.ReactiveSortingRepository


interface UserRepo: R2dbcRepository<Users, Integer> {
}