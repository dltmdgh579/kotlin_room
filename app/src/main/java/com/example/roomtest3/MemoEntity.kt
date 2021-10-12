package com.example.roomtest3

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmark")
data class MemoEntity (
    @PrimaryKey(autoGenerate = true) var id : Long?,
    var memo : String = "")