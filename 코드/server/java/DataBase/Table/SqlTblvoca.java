package DataBase.Table;

import java.sql.*;
import com.mysql.cj.jdbc.CallableStatement;

import DataBase.Connection.ConnectionInfo;

public class SqlTblvoca {
    Tblvoca tblvoca = null;

    public Boolean insert_user(Tblvoca table) {
        Connection connection;
        ConnectionInfo getconString = new ConnectionInfo();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ② 연결
            connection = DriverManager.getConnection(getconString.url, getconString.user, getconString.password);
            CallableStatement stat = (CallableStatement) connection
                    .prepareCall("{CALL voca__UpdateNInsert(?, ?, ?, ?, ?, ?, ?, ?)}");
            stat.setString(1, ""); // ID 고정
            stat.setString(2, "test");
            stat.setString(3, table.getMean());
            stat.setString(4, "명사");
            stat.setInt(5, 1);
            stat.setInt(6, 1);
            stat.setString(7, "test is hard");
            stat.setString(8, "127.0.0.1");

            stat.execute();
        } catch (Exception e) {
            System.out.println("[insert_user 오류]\n" + e.getLocalizedMessage());
            return false;
        } 
        return true;
    }
}