package denys.diomaxius.stopvape.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import denys.diomaxius.stopvape.data.database.VapeDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        VapeDatabase::class.java,
        VapeDatabase.NAME
    ).build()

    @Provides
    @Singleton
    fun provideQuitDataDao(db: VapeDatabase) = db.quitDataDao()
}