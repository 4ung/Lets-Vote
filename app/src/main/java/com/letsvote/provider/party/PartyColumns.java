package com.letsvote.provider.party;

import android.net.Uri;
import android.provider.BaseColumns;

import com.letsvote.provider.MyProvider;
import com.letsvote.provider.party.PartyColumns;

/**
 * A party that will participate in Union Election
 */
public class PartyColumns implements BaseColumns {
    public static final String TABLE_NAME = "party";
    public static final Uri CONTENT_URI = Uri.parse(MyProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * Unique id of party from server
     */
    public static final String PARTY_ID = "party_id";

    /**
     * Last name (a.k.a. Given name) of this person. For instance, Smith.
     */
    public static final String PARTY_NAME = "party_name";

    public static final String PARTY_NAME_ENGLISH = "party_name_english";

    public static final String GENDER = "gender";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            PARTY_ID,
            PARTY_NAME,
            PARTY_NAME_ENGLISH,
            GENDER
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(PARTY_ID) || c.contains("." + PARTY_ID)) return true;
            if (c.equals(PARTY_NAME) || c.contains("." + PARTY_NAME)) return true;
            if (c.equals(PARTY_NAME_ENGLISH) || c.contains("." + PARTY_NAME_ENGLISH)) return true;
            if (c.equals(GENDER) || c.contains("." + GENDER)) return true;
        }
        return false;
    }

}
