package com.juhuyoon.KeepUp.db;


import android.provider.BaseColumns;

//Android comes with SQLite as a default database.
public class TaskContract {
    public static final String DB_NAME = "com.juhuyoon.KeepUp.db";
    public static final int DB_VERSION = 1;

    //BaseColumns help with providing names for the variables that you store values to.
    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }

}
