package com.bonato.helloworld
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Ana2*****")
data class Customer (
    @ColumnInfo val zone : Int,
    @PrimaryKey val id : Long,
    @ColumnInfo val businessName : String,
    @ColumnInfo val phone : String,
    @ColumnInfo @Embedded(prefix="loc_") val location : Location,
    @ColumnInfo val lost : Boolean

    )

data class Location(
    val town : String,
    val province : String,
    val country : String,
    val place : String?,
    val hamlet: String?,
    val address : String,
    val civNumber : String,
    val ladder : String?,
    val flat : String?,
    val intercom : String?,
    val latitude : Double?,
    val longitude : Double?
)