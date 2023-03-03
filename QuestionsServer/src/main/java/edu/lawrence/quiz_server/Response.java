/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lawrence.quiz_server;


public class Response {
    
    
    private int question_id;
    private String response;
    
    public Response(){}

    public int getQuestion_id() {
        return question_id;
    }

    public String getResponse() {
        return response;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
