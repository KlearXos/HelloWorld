package com.bonato.helloworld

import androidx.room.ColumnInfo
import androidx.room.Entity;
import androidx.room.PrimaryKey

@Entity(tableName="salesman_table")
class Salesman {

    @PrimaryKey
    var id : String,
    @ColumnInfo var name : String

}