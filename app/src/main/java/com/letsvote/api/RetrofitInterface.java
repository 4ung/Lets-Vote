// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.letsvote.api;


import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;


public interface RetrofitInterface {


    @POST(APIConfig.TOKEN_GENERATE)
    @FormUrlEncoded
    void getToken(@Field("api_key") String api_key,Callback<String> callback);


    @GET(APIConfig.PARTY_LIST)
    void getPartylist(@Query("token") String token,  Callback<String> callback);




    @GET(APIConfig.PARTY_BY_ID)
    void getPartyById(@Query("token") String fat,@Path("party_id") String partyid,
                                        Callback<String> callback);






}


