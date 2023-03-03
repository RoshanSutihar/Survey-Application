/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lawrence.quiz_server;


public class Question {
    
    
    private int question_id;
    private String question_name;
    private String opt_a;
     private String opt_b;
      private String opt_c;
       private String opt_d;
   

   

    public int getQuestion_id() {
        return question_id;
    }

    public String getQuestion_name() {
        return question_name;
    }

    public String getOpt_a() {
        return opt_a;
    }

    public String getOpt_b() {
        return opt_b;
    }

    public String getOpt_c() {
        return opt_c;
    }

    public String getOpt_d() {
        return opt_d;
    }
       
       public Question(){}

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public void setQuestion_name(String question_name) {
        this.question_name = question_name;
    }

    public void setOpt_a(String opt_a) {
        this.opt_a = opt_a;
    }

    public void setOpt_b(String opt_b) {
        this.opt_b = opt_b;
    }

    public void setOpt_c(String opt_c) {
        this.opt_c = opt_c;
    }

    public void setOpt_d(String opt_d) {
        this.opt_d = opt_d;
    }
       
       
    
}
