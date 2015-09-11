package com.letsvote.provider.party;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.letsvote.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code party} table.
 */
public class PartyCursor extends AbstractCursor implements PartyModel {
    public PartyCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PartyColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Unique id of party from server
     * Can be {@code null}.
     */
    @Nullable
    public String getPartyId() {
        String res = getStringOrNull(PartyColumns.PARTY_ID);
        return res;
    }

    /**
     * Last name (a.k.a. Given name) of this person. For instance, Smith.
     * Can be {@code null}.
     */
    @Nullable
    public String getPartyName() {
        String res = getStringOrNull(PartyColumns.PARTY_NAME);
        return res;
    }

    /**
     * Get the {@code party_name_english} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getPartyNameEnglish() {
        String res = getStringOrNull(PartyColumns.PARTY_NAME_ENGLISH);
        return res;
    }

    /**
     * Get the {@code gender} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public Gender getGender() {
        Integer intValue = getIntegerOrNull(PartyColumns.GENDER);
        if (intValue == null)
            throw new NullPointerException("The value of 'gender' in the database was null, which is not allowed according to the model definition");
        return Gender.values()[intValue];
    }
}
