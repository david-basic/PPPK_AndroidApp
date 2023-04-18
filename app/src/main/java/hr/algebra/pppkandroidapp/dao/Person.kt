package hr.algebra.pppkandroidapp.dao

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = true)
    var _id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var picturePath: String? = null,
    var birthDate: LocalDate = LocalDate.now()
    // TODO: ovdje dodaj jos jedan atribut entitetu kada budes gotov sa default appom sa vjezbi
){
    override fun toString() = "$firstName $lastName"
}
