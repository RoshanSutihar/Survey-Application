
package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summary")
@CrossOrigin(origins="*")
public class PassController {
     private PassDAO passDAO;
    
    public PassController(PassDAO dao) {
        this.passDAO = dao;
    }
    
   @GetMapping(params={"question"})
    public List<Pass> questionsByQuiz(@RequestParam int question) {
        return passDAO.findByQuiz(question);
    }

}
