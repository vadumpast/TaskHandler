package pastushok.vadum.taskhandler.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import pastushok.vadum.taskhandler.model.entity.db.Event

@Database(entities = [
    Event::class
], version = DBConfig.DB_VERSION)
abstract class AppDatabase : RoomDatabase(){
    abstract fun eventDao(): EventDao
}