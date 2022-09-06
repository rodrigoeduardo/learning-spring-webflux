package com.rodrigo.webflux.util;

import com.rodrigo.webflux.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Steins;Gate")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .id(1)
                .name("Steins;Gate")
                .build();
    }

    public static Anime createValidUpdateAnime() {
        return Anime.builder()
                .id(1)
                .name("Steins;Gate 0")
                .build();
    }
}
