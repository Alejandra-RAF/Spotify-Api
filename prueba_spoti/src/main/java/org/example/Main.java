package org.example;
import java.util.Collections;
import java.util.List;
import java.util.Map;



public class Main {
    public static void main(String[] args) throws Exception {
        SpotifyAccessor accessor = new SpotifyAccessor();
        String artist = accessor.get("/artist/43ZHCT0cAZBISjO8DG9PnE/tracks");
        MusicDataBase musicDataBase = new SqliteMusicDataBase();
        for (Artist artist: artists) {
            musicDataBase.add(artist);
        }
    }
}