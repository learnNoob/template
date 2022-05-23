package com.noob.structural.adapter;

public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("播放电影");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
