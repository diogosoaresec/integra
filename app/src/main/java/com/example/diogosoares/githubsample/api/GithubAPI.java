package com.example.diogosoares.githubsample.api;

/**
 * Created by diogosoares on 11/7/17.
 */

import com.example.diogosoares.githubsample.models.GithubIssue;
import com.example.diogosoares.githubsample.models.GithubRepo;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface GithubAPI {
    String ENDPOINT = "https://api.github.com";

    @GET("user/repos?per_page=100")
    Call<List<GithubRepo>> getRepos();

    @GET("/repos/{owner}/{repo}/issues")
    Call<List<GithubIssue>> getIssues(@Path("owner") String owner, @Path("repo") String repository);

    @POST
    Call<ResponseBody> postComment(@Url String url, @Body GithubIssue issue);
}