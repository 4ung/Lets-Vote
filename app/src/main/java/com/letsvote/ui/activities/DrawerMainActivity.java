package com.letsvote.ui.activities;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.letsvote.R;

import com.letsvote.Base.BaseActivity;
import com.letsvote.api.APIConfig;
import com.letsvote.api.RetrofitAPI;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.letsvote.ui.adapters.DrawerList_Adapter;



import java.io.IOException;

public class DrawerMainActivity extends BaseActivity {
    ActionBarDrawerToggle mDrawerToggle;
    LinearLayout mDrawerListLayout;
    DrawerLayout mDrawerLayout;
    ListView mDrawerList;

    Toolbar toolbar;
    String[] DrawerMenuList;
    int[] DrawerIcons;

    static ObjectMapper mapper=new ObjectMapper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_main);

        mDrawerList=(ListView) findViewById(R.id.left_drawer_lv);
        mDrawerListLayout=(LinearLayout) findViewById(R.id.left_drawer);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_drawer_main);

        initialize();
        binddataTOList();

        makeFragmentSelection(0);

        RetrofitAPI.getInstance(getApplication()).getService().getToken(APIConfig.api_key, new Callback<String>() {
            @Override
            public void success(String s, Response response) {
                parsejson(s);
            }

            @Override
            public void failure(RetrofitError error) {
                error.printStackTrace();
            }
        });


    }

    void parsejson(String s){
        Object obj = null;
        try {
            obj = mapper.readValue(s, Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.w("OBJECT","obj type: " + obj.getClass().toString()); // java.util.LinkedHashMap
        Log.w("OBJECT","obj: " + obj);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initialize(){


        toolbar.setTitle(getResources().getString(R.string.app_name));

        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setOnMenuItemClickListener(new ToolbarMenuclickListener());


        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);


        //set toggle to naviation drawer on tollbar
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                // getActionBar().setTitle(mTitle);
                // toolbar.setTitle("PSI DataCapture");
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                // toolbar.setTitle(Title);
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);


    }

    protected class ToolbarMenuclickListener implements Toolbar.OnMenuItemClickListener{

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            return false;
        }
    }

    void makeFragmentSelection(int position){
        FragmentManager fragmentManager=getSupportFragmentManager();
        switch (position){
            case 0:
                toolbar.setTitle(DrawerMenuList[position]);
                //fragmentManager.beginTransaction().replace(R.id.content_frame, new Fragment_Diy_container()).commit();
                break;
            case 1:
                toolbar.setTitle(DrawerMenuList[position]);
                // fragmentManager.beginTransaction().replace(R.id.content_frame, new Fragment_setting()).commit();
                break;
            case 2:
                //Do action here
                toolbar.setTitle(DrawerMenuList[position]);
                //fragmentManager.beginTransaction().replace(R.id.content_frame, new Fragment_vocablist()).commit();
                break;
            case 3:
                //Do action here
                toolbar.setTitle(DrawerMenuList[position]);
                //fragmentManager.beginTransaction().replace(R.id.content_frame,new Fragment_Settings()).commit();
                break;
            case 4:
                //Do action here
                toolbar.setTitle(DrawerMenuList[position]);
                //fragmentManager.beginTransaction().replace(R.id.content_frame,new Fragment_About()).commit();
                break;
        }
        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerListLayout);


    }

    void binddataTOList(){
        DrawerMenuList=new String[]{"Candidates","Parties","FAQs", "Geolocations","About"};
        //DrawerIcons=new int[]{R.drawable.ic_calendar, R.drawable.ic_setting,R.drawable.ic_info};
        DrawerIcons=new int[]{R.drawable.ic_candidate,R.drawable.ic_party,R.drawable.ic_faq,R.drawable.ic_partyocations,R.drawable.ic_info};
        DrawerList_Adapter drawerList_adapter=new DrawerList_Adapter(this,DrawerMenuList,DrawerIcons);
        drawerList_adapter.notifyDataSetChanged();
        mDrawerList.setAdapter(drawerList_adapter);
        mDrawerList.setOnItemClickListener(new DrawerListItemClickListener());
        setListViewHeightBasedOnChildren(mDrawerList);

    }

    protected class DrawerListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            makeFragmentSelection(position);
        }

    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = listView.getPaddingTop()
                + listView.getPaddingBottom();
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            if (listItem instanceof ViewGroup)
                listItem.setLayoutParams(new AbsListView.LayoutParams(
                        AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT));
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
}
