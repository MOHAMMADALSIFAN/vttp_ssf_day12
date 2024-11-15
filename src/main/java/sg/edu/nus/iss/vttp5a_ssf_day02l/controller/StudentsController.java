package sg.edu.nus.iss.vttp5a_ssf_day02l.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sg.edu.nus.iss.vttp5a_ssf_day02l.model.Student;

@Controller
public class StudentsController {
    // handler loop method to handle loop expression
  @GetMapping("/students")
  public String students(Model model) {
    Student admin = new Student(1,"Mohammad","Alsifan",17051998,"alsifan@gmail.com","bhsbao");
    Student chian = new Student(2,"John","kumar",17051888,"john@gmail.com","jsbjsb");
    Student cihan = new Student(3,"Gunn","Al",17111984,"GUN@gmail.com","jurong");
    List<Student> students = new ArrayList<>();
    students.add(admin);
    students.add(chian);
    students.add(cihan);
    model.addAttribute("students", students);
    return "students";
  }
}
