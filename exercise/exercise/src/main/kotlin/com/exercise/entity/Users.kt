package com.exercise.entity

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table



@Table
data class Users(
        @Id
        @Column("id")
        val id:Int?,
        val firstName:String,
        val lastName:String,
        val age:Int
) {

}