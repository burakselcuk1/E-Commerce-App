package com.example.e_commerce.di

import android.content.Context
import androidx.room.Room
import com.example.e_commerce.db.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, Database::class.java,
        "beef_data"
    ).build()

    @Singleton
    @Provides
    fun provideToDoDao(
        db: Database
    ) = db.toDoDao()
}