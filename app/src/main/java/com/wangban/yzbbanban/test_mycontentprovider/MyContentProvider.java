package com.wangban.yzbbanban.test_mycontentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Created by YZBbanban on 16/7/29.
 */

public class MyContentProvider extends ContentProvider {
    public static final int TABLE1_DIR = 0;
    public static final int TABLE1_ITEM = 1;
    public static final int TABLE2_DIR = 2;
    public static final int TABLE2_ITEM = 3;
    private static UriMatcher uriMatcher;

    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI("com.wangban.yzbbanban.test_mycontentprovider", "table1", TABLE1_DIR);
        uriMatcher.addURI("com.wangban.yzbbanban.test_mycontentprovider", "table1/#", TABLE1_ITEM);
        uriMatcher.addURI("com.wangban.yzbbanban.test_mycontentprovider", "table2", TABLE2_DIR);
        uriMatcher.addURI("com.wangban.yzbbanban.test_mycontentprovider", "table2/#", TABLE2_ITEM);
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        switch (uriMatcher.match(uri)) {
            case TABLE1_DIR:

                break;
            case TABLE1_ITEM:

                break;
            case TABLE2_DIR:

                break;
            case TABLE2_ITEM:

                break;
        }
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
