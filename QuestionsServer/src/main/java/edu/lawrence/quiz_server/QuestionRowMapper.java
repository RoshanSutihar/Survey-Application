
package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuestionRowMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet row, int rowNum) throws SQLException {
        Question q = new Question();
        q.setQuestion_id(row.getInt(1));
        q.setQuestion_name(row.getString(2));
        q.setOpt_a(row.getString(3));
        q.setOpt_b(row.getString(4));
        q.setOpt_c(row.getString(5));
        q.setOpt_d(row.getString(6));
        return q;
    }
}
