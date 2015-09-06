package api;

import android.content.Context;

/**
 * Created by jr on 6/9/2015
 */



public class APIConfig
{

    Context mContext;

    //public static final String BASE_URL = "kny.co:3000/api/v1.0/driver";

    //public static final String BASE_URL = "http://10.56.57.159:3001/api/v1.1/driver";

    public static String api_key="f6388460eac70da18a5b785fa84f381670203e92";

    public static String BASE_URL = "http://api.maepaysoh.org";
    public static String BASE_URL_HEROKU = "api-maepaysoh.herokuapp.com";



    public static final String FACEBOOK_URL = "https://graph.facebook.com";
    public static String MY_PREF = "letsvote_pref";








    public static final String TOKEN_GENERATE="/token/generate";


    public static final String PARTY_LIST = "/party/list";
    public static final String PARTY_BY_ID = "/party/detail/{party_id}";



    public static final String CANDIDATE_LIST="/candidate/list";
    public static final String CANDIDATE_BY_ID="/candidate";

    public APIConfig()
    {
    }

}