package com.codegama.tugas_teknologi_aplikasi_bergerak.database;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.codegama.tugas_teknologi_aplikasi_bergerak.model.Task;

@Database(entities = {Task.class}, version = 1, exportSchema = false)
public  abstract class AppDatabase extends RoomDatabase {

    public abstract OnDataBaseAction dataBaseAction();
    private static volatile AppDatabase appDatabase;

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}

