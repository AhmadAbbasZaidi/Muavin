package com.cfp.muaavin.twitter;

import com.cfp.muaavin.facebook.Post;

import java.util.ArrayList;

/**
 * Created by Tooba Saeed on 04/01/2017.
 */

public interface TweetsAsynchronousResponse {

    public void tweetsAsynchronousResponse(ArrayList<Post> tweet, String option);
    public void  postLink(String type, String postLink, String userProfile, String message, String userName, int check);

}
