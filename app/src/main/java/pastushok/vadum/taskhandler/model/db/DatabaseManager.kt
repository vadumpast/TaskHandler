package pastushok.vadum.taskhandler.model.db

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import pastushok.vadum.taskhandler.model.entity.db.Event
import javax.inject.Inject

class DatabaseManager @Inject constructor(
    private val eventDao: EventDao,
) {

    suspend fun getAllEvents() = eventDao.getAllEvents()

    suspend fun insertEvent(event: Event) = eventDao.insertEvent(event)

    suspend fun insertEvent(events: MutableList<Event>) = eventDao.insertEvent(events)

}