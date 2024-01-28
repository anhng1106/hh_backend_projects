package exercise.exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
    @RequestMapping("/studentlist") 
    public String getStudentList(Model model) {
         // Create a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kate", "Cole"));
        studentList.add(new Student("Dan", "Brown"));
        studentList.add(new Student("Mike", "Mars"));
        
        // Add the list to the model
        model.addAttribute("studentlist", studentList);

        return "studentlist.html"; 
    }
  
}
