package hr.algebra.pppkandroidapp.dao

import androidx.room.Database
import androidx.room.TypeConverters

@Database(entities = [Person::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
class PeopleDatabase {
}