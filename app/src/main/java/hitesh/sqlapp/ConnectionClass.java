package hitesh.sqlapp;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Imam Ibnu Faishal on 15-Apr-16.
 */

public class ConnectionClass {
    String ip = "37aede7d-8783-49b9-a421-a5e000a3bf70.sqlserver.sequelizer.com";
    String classs = "net.sourceforge.jtds.jdbc.Driver";
    String db = "db37aede7d878349b9a421a5e000a3bf70";
    String un = "csvcctgricgcrjsl";
    String password = "YXvvwCkxV3W3myhtudZwVSc2CHDJhUkAgsRr6Z7KFztm8vC385TKDvMfUBZV8Jqa";

    @SuppressLint("NewApi")
    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try {

            Class.forName(classs);
            ConnURL = "jdbc:jtds:sqlserver://" + ip + ";"
                    + "databaseName=" + db + ";user=" + un + ";password="
                    + password + ";";
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return conn;
    }
}
