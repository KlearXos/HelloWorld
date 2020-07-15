package com.bonato.helloworld
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
Data class
The compiler automatically derives the following members from all properties declared in the primary constructor:

equals()/hashCode() pair;
toString() of the form "User(name=John, age=42)";
componentN() functions corresponding to the properties in their order of declaration;
copy() function (see below).
To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:

The primary constructor needs to have at least one parameter;
All primary constructor parameters need to be marked as val or var;
Data classes cannot be abstract, open, sealed or inner;
(before 1.1) Data classes may only implement interfaces.
 */
@Entity(tableName="Ana2*****")
data class Customer (
    @ColumnInfo val zone : Int,
    @PrimaryKey val id : Long, //@PrimaryKey(autoGenerate = true)
    @ColumnInfo val businessName : String,
    @ColumnInfo val phone : String,
    @Embedded(prefix="loc_") val location : Location?,
    @ColumnInfo val lost : Boolean

    )
{
    /* secondary constructor
    constructor(stringRecord : String)
    {
       //zone = stringRecord.substring(0,)
    }*/
}

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