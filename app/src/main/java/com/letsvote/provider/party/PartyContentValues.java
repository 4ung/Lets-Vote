package com.letsvote.provider.party;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.letsvote.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code party} table.
 */
public class PartyContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PartyColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PartySelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PartySelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Unique id of party from server
     */
    public PartyContentValues putPartyId(@Nullable String value) {
        mContentValues.put(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartyContentValues putPartyIdNull() {
        mContentValues.putNull(PartyColumns.PARTY_ID);
        return this;
    }

    /**
     * Last name (a.k.a. Given name) of this person. For instance, Smith.
     */
    public PartyContentValues putPartyName(@Nullable String value) {
        mContentValues.put(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartyContentValues putPartyNameNull() {
        mContentValues.putNull(PartyColumns.PARTY_NAME);
        return this;
    }

    public PartyContentValues putPartyNameEnglish(@Nullable String value) {
        mContentValues.put(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartyContentValues putPartyNameEnglishNull() {
        mContentValues.putNull(PartyColumns.PARTY_NAME_ENGLISH);
        return this;
    }

    public PartyContentValues putGender(@NonNull Gender value) {
        if (value == null) throw new IllegalArgumentException("gender must not be null");
        mContentValues.put(PartyColumns.GENDER, value.ordinal());
        return this;
    }

}
