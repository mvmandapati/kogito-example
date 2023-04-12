package org.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@QuarkusTest
public class NotificationsTest {

    @Inject
    DataSource dataSource;

    @Test
    void tableExists() throws SQLException {
        //PreparedStatement ps=new
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select * from notifications")) {
            ps.executeQuery();
        }
    }
    
}
