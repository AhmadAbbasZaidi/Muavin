package com.cfp.muaavin.web;

import android.app.Activity;
import android.content.Context;

import com.cfp.muaavin.facebook.FacebookUtil;
import com.cfp.muaavin.helper.DataLoaderHelper;
import com.cfp.muaavin.ui.UiUpdate;

import static com.cfp.muaavin.facebook.FacebookUtil.clearFacebookData;


public class FriendManagement  {

    //static String[] group1  =  {"A","B","C","All"};
    public static String[] group1 = new String[]{"Sexual harassment", "Incitement to violence","Hate speech","All of the above"};
    public static String[] groupInfo = new String[]{"*Sexual Harassment* includes all kinds of unwanted sexual advances, comments and associations.", "*Incitement to Violence* is speech that directly calls for violent actions against an individual or group.","*Hate speech* is speech that attacks people on basis of personal attributes like community and gender etc.","All of the above Info"};
    Context context;
    DataLoaderHelper controller;


    public void Highlights(Context context , UiUpdate uiUpdate, Activity activity)
    {
        this.context = context;
        clearFacebookData();
        controller = new DataLoaderHelper(context,uiUpdate,activity);
        controller.loadFacebookPosts("Facebook Users","me",false);
    }

    public void  reportFriends( final Context context, Activity activity)
    {
        this.context = context; FacebookUtil.isUserPresent = false;
        clearFacebookData();
        controller = new DataLoaderHelper(context,null, activity);
        controller.loadFacebookPosts("Timeline Posts","me",false);
    }

    public void Browse(Context context, Activity activity)
    {
        int check = 2;
        DialogBox dialogBox = new DialogBox();
        String user_id = "";
        dialogBox.ShowDialogBOx3(context, "Select Group", FriendManagement.group1, check, user_id,activity,null, false);
    }

    public void BrowseTweets(Context context, Activity activity)
    {
        int check = 333;
        DialogBox dialogBox = new DialogBox();
        String user_id = "";
        dialogBox.ShowDialogBOx3(context, "Select Group", FriendManagement.group1, check, user_id,activity,null, false);
    }

    public void HighLightedPosts(Context context, Activity activity)
    {
        int check = 1000;
        DialogBox dialogBox = new DialogBox();
        String user_id = "";
        dialogBox.ShowDialogBOx3(context, "Select Group", FriendManagement.group1, check, user_id,activity,null, false);
    }

    public void HighlightedTweets(Context context, Activity activity)
    {
        int check = 1001;
        DialogBox dialogBox = new DialogBox();
        String user_id = "";
        dialogBox.ShowDialogBOx3(context, "Select Group", FriendManagement.group1, check, user_id,activity,null, false);
    }

    public void BrowsePost(Context context ,String user_id,Activity activity)
    {
        int check = 4;
        DialogBox db = new DialogBox();
        db.ShowDialogBOx3(context, "Select Group", FriendManagement.group1, check, user_id,activity,null, false);
    }
}
