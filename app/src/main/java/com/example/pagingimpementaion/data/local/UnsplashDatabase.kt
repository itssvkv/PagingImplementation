package com.example.pagingimpementaion.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagingimpementaion.data.local.dao.UnsplashImageDao
import com.example.pagingimpementaion.data.local.dao.UnsplashRemoteKeysDao
import com.example.pagingimpementaion.model.UnsplashImage
import com.example.pagingimpementaion.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 2)
abstract class UnsplashDatabase : RoomDatabase(){

    abstract fun unsplashImageDao():UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}