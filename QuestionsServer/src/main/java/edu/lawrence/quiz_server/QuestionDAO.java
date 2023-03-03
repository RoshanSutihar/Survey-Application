
package edu.lawrence.quiz_server;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Question> findByQuiz() {
	String sql = "SELECT * FROM survey_ques WHERE date = CURDATE()";
        RowMapper<Question> rowMapper = new QuestionRowMapper();
        return jdbcTemplate.query(sql, rowMapper);
    }

}

