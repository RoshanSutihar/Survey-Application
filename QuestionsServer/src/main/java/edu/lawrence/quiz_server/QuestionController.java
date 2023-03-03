/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins="*")
public class QuestionController {
    private QuestionDAO questionDAO;
    
    public QuestionController(QuestionDAO dao) {
        this.questionDAO = dao;
    }
    
    @GetMapping
    public List<Question> questionsByQuiz() {
        return questionDAO.findByQuiz();
    }
    
}