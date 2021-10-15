package pastushok.vadum.taskhandler.model.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pastushok.vadum.taskhandler.model.entity.db.Event

@Dao
interface EventDao {

    @Query("SELECT * FROM ${DBConfig.Event.TABLE_NAME}")
    suspend fun getAllEvents(): MutableList<Event>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(event: Event)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(events: MutableList<Event>)
}