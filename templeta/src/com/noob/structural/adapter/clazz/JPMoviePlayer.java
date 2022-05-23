package com.noob.structural.adapter.clazz;

import com.noob.structural.adapter.Player;
import com.noob.structural.adapter.ZH_JPTranslator;

/**
 * 继承的方式
 */
public class JPMoviePlayer extends ZH_JPTranslator implements Player {


    private Player player;
    public JPMoviePlayer(Player tager){
        this.player = tager;
    }
    @Override
    public String play() {
        String play = player.play();
        String traslator = traslator(play);
        //转化字幕
        return traslator;
    }
}
