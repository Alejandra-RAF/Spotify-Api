package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqliteMusicDataBase implements MusicDataBase{
    private final Connection connection;

    public SqliteMusicDataBase() throws SQLException {
        String url ="jdbc:sqlite:tracks.db";
        connection = DriverManager.getConnection(url);
        initDatabase();
    }
        private static final String TableArtist =
                "CREATE TABLE IF NOT EXISTS artists (" +
                        "name TEXT, " +
                        "popularity NUMBER, " +
                        "genres TEXT, " +
                        "href TEXT)";

        private void initDatabase() throws SQLException {
            connection.createStatement().execute(TableArtist);
            }


        private static final String ADD_ARTIST =
                "INSERT INTO artists(name, popularity, genres, href) VALUES ('%s', '%d', '%s', '%s')";

        public void add(Artist artist) {
            try{
                connection.createStatement().execute(DMLTranslate.insertStatementOf(Integer.valueOf(ADD_ARTIST)));
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
}
