package com.bonato.helloworld

import android.app.Application
import androidx.lifecycle.LiveData

class DataRepo(appl : Application) {
    private val dbase = DatabaseX.getDatabase(appl)
    private val customerDao = dbase.customerDao()
    private val allCustomers = customerDao.loadAll()
        get() = field

}