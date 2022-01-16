package com.lym.design.pattern.structural.adapter.clazz;

import com.lym.design.pattern.structural.adapter.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(player);
//
//
        adapter.play();
        // player.play();

    }
}
