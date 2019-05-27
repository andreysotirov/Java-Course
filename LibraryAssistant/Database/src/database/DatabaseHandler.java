package database;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseHandler {

    private static DatabaseHandler handler;

    private static final String DB_URL = "jdbc:derby:database;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DatabaseHandler() {
        createConnection();
    }

    void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").getDeclaredConstructors();
            conn = DriverManager.getConnection(DB_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setupBookTable() {
        String TABLE_NAME = "Book";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " already exists. Ready to go!");
            } else {
                stmt.execute("CREATE TABLE " + TABLE_NAME + "(" +
                        "id varchar(200) primary key,\n" +
                        "title varchar(200),\n" +
                        "author varchar(200),\n" +
                        "publisher varchar(100),\n" +
                        "isAvail boolean default true" +
                        ")");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "---- database");
        } finally {

        }
    }
}
