
package edu.lawrence.quiz_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public String save(Response response) {

        String insertSQL = "INSERT INTO response (response, question_id ) values (?, ?)";
        jdbcTemplate.update(insertSQL, response.getResponse(),response.getQuestion_id());
        return "saved";
        
    }
}