
package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PassRowMapper implements RowMapper<Pass>  {
     @Override
    public Pass mapRow(ResultSet row, int rowNum) throws SQLException {
        Pass q = new Pass();
   
        Integer val = row.getInt(2);
      
        if (val == null){
            q.setVote(0);
        } else{
        q.setVote(val);
        }
        return q;
    }
    
}
