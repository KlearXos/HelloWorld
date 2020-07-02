package com.bonato.helloworld

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import androidx.room.Embedded

@Entity(tableName="head2")
data class Salesman(@PrimaryKey var id : Long, @ColumnInfo var name : String, @ColumnInfo var depot : Long, @ColumnInfo var dep_name : String) {

    @ColumnInfo var phone : String = ""
}