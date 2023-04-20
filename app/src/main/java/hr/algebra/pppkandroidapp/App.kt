package hr.algebra.pppkandroidapp

import android.app.Application
import hr.algebra.pppkandroidapp.dao.PeopleDatabase
import hr.algebra.pppkandroidapp.dao.PersonDao

class App : Application() {
    private lateinit var personDao: PersonDao
    fun getPersonDao() = personDao

    override fun onCreate() {
        super.onCreate()
        var db = PeopleDatabase.getInstance(this)
        personDao = db.personDao()
    }

}