package pastushok.vadum.taskhandler.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pastushok.vadum.taskhandler.model.db.AppDatabase
import pastushok.vadum.taskhandler.model.db.DBConfig
import pastushok.vadum.taskhandler.model.db.DatabaseManager
import pastushok.vadum.taskhandler.model.db.EventDao
import pastushok.vadum.taskhandler.model.entity.db.Event

@Module
@InstallIn(SingletonComponent::class)
object DatabaseManagerModule {

    @Provides
    fun provideDB(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            DBConfig.DB_NAME
        ).build()
    }

    @Provides
    fun provideEventDao(
        db: AppDatabase
    ): EventDao{
        return db.eventDao()
    }

    @Provides
    fun provideDatabaseManager(
        eventDao: EventDao
    ): DatabaseManager{
        return DatabaseManager(
            eventDao
        )
    }
}