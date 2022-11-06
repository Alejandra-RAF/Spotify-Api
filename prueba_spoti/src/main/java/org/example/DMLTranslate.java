package org.example;


public class DMLTranslate {

    private static final String INSERT_ARTIST =
            "INSERT INTO artists(name, popularity, genres, href) VALUES ('%s', '%d', '%s', '%d')";

    public static String insertStatementOf(Artist artist){
        return String.format(INSERT_ARTIST,
                artist.name,
                artist.popularity,
                artist.genres,
                artist.href);
    }



    public static String insertStatementOf(Integer a){
        String s = "";
        return s;
    }
}
