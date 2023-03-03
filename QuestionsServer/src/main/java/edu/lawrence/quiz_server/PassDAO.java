
package edu.lawrence.quiz_server;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class PassDAO {
     @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pass> findByQuiz(int quiz) {
	String sql = "SELECT r.response, COUNT(resp.response) AS vote_count\n" +
"FROM (\n" +
"  SELECT 'a' AS response UNION ALL\n" +
"  SELECT 'b' AS response UNION ALL\n" +
"  SELECT 'c' AS response UNION ALL\n" +
"  SELECT 'd' AS response -- Add more rows as needed\n" +
") r\n" +
"LEFT OUTER JOIN response resp ON r.response = resp.response AND resp.question_id = ?\n" +
"GROUP BY r.response\n" +
"ORDER BY r.response ASC;";
        RowMapper<Pass> rowMapper = new PassRowMapper();
        return jdbcTemplate.query(sql, rowMapper, quiz);
    }
}
