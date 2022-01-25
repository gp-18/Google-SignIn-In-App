package com.example.checkify

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes_table")
class Note (@ColumnInfo(name = "text")val text:String) {
    @PrimaryKey(autoGenerate = true)val id=0;
}