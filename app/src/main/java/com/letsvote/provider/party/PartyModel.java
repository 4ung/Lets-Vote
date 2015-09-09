package com.letsvote.provider.party;

import com.letsvote.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * A party that will participate in Union Election
 */
public interface PartyModel extends BaseModel {

    /**
     * Unique id of party from server
     * Can be {@code null}.
     */
    @Nullable
    String getPartyId();

    /**
     * Last name (a.k.a. Given name) of this person. For instance, Smith.
     * Can be {@code null}.
     */
    @Nullable
    String getPartyName();

    /**
     * Get the {@code party_name_english} value.
     * Can be {@code null}.
     */
    @Nullable
    String getPartyNameEnglish();

    /**
     * Get the {@code gender} value.
     * Cannot be {@code null}.
     */
    @NonNull
    Gender getGender();
}
