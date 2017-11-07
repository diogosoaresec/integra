package com.example.diogosoares.githubsample.models;

/**
 * Created by diogosoares on 11/7/17.
 */

public class GithubRepo {
    public String name;
    public String owner;
    public String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
