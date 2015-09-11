package com.letsvote.provider.party;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.letsvote.provider.base.AbstractSelection;

/**
 * Selection for the {@code party} table.
 */
public class PartySelection extends AbstractSelection<PartySelection> {
    @Override
    protected Uri baseUri() {
        return PartyColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PartyCursor} object, which is positioned before the first entry, or null.
     */
    public PartyCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PartyCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PartyCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PartyCursor} object, which is positioned before the first entry, or null.
     */
    public PartyCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PartyCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PartyCursor query(Context context) {
        return query(context, null);
    }


    public PartySelection id(long... value) {
        addEquals("party." + PartyColumns._ID, toObjectArray(value));
        return this;
    }

    public PartySelection idNot(long... value) {
        addNotEquals("party." + PartyColumns._ID, toObjectArray(value));
        return this;
    }

    public PartySelection orderById(boolean desc) {
        orderBy("party." + PartyColumns._ID, desc);
        return this;
    }

    public PartySelection orderById() {
        return orderById(false);
    }

    public PartySelection partyId(String... value) {
        addEquals(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection partyIdNot(String... value) {
        addNotEquals(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection partyIdLike(String... value) {
        addLike(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection partyIdContains(String... value) {
        addContains(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection partyIdStartsWith(String... value) {
        addStartsWith(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection partyIdEndsWith(String... value) {
        addEndsWith(PartyColumns.PARTY_ID, value);
        return this;
    }

    public PartySelection orderByPartyId(boolean desc) {
        orderBy(PartyColumns.PARTY_ID, desc);
        return this;
    }

    public PartySelection orderByPartyId() {
        orderBy(PartyColumns.PARTY_ID, false);
        return this;
    }

    public PartySelection partyName(String... value) {
        addEquals(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection partyNameNot(String... value) {
        addNotEquals(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection partyNameLike(String... value) {
        addLike(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection partyNameContains(String... value) {
        addContains(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection partyNameStartsWith(String... value) {
        addStartsWith(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection partyNameEndsWith(String... value) {
        addEndsWith(PartyColumns.PARTY_NAME, value);
        return this;
    }

    public PartySelection orderByPartyName(boolean desc) {
        orderBy(PartyColumns.PARTY_NAME, desc);
        return this;
    }

    public PartySelection orderByPartyName() {
        orderBy(PartyColumns.PARTY_NAME, false);
        return this;
    }

    public PartySelection partyNameEnglish(String... value) {
        addEquals(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection partyNameEnglishNot(String... value) {
        addNotEquals(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection partyNameEnglishLike(String... value) {
        addLike(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection partyNameEnglishContains(String... value) {
        addContains(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection partyNameEnglishStartsWith(String... value) {
        addStartsWith(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection partyNameEnglishEndsWith(String... value) {
        addEndsWith(PartyColumns.PARTY_NAME_ENGLISH, value);
        return this;
    }

    public PartySelection orderByPartyNameEnglish(boolean desc) {
        orderBy(PartyColumns.PARTY_NAME_ENGLISH, desc);
        return this;
    }

    public PartySelection orderByPartyNameEnglish() {
        orderBy(PartyColumns.PARTY_NAME_ENGLISH, false);
        return this;
    }

    public PartySelection gender(Gender... value) {
        addEquals(PartyColumns.GENDER, value);
        return this;
    }

    public PartySelection genderNot(Gender... value) {
        addNotEquals(PartyColumns.GENDER, value);
        return this;
    }


    public PartySelection orderByGender(boolean desc) {
        orderBy(PartyColumns.GENDER, desc);
        return this;
    }

    public PartySelection orderByGender() {
        orderBy(PartyColumns.GENDER, false);
        return this;
    }
}
