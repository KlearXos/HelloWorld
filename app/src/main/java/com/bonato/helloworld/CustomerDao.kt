package com.bonato.helloworld
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query
import androidx.room.OnConflictStrategy

@Dao
interface CustomerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg customers: Customer) //accepts several arguments of the same type

    @Insert
    fun insert(lst : List<Customer>)

    @Update
    fun update(vararg customers: Customer)

    @Update
    fun update(lst : List<Customer>)

    @Delete
    fun delete(vararg customers: Customer)

    @Delete
    fun delete(lst : List<Customer>)

    @Query("SELECT * FROM 'Ana2*****'")
    fun loadAll(): List<Customer>

    @Query("DELETE FROM 'Ana2*****'")
    fun deleteAll()

    @Query("SELECT * FROM 'Ana2*****' WHERE id = :id")
    fun load(id : Long): Customer
}