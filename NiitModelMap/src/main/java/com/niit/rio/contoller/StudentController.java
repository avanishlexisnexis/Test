
package com.niit.rio.contoller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.rio.model.Student;


@Controller
public class StudentController 
{
    @RequestMapping("/students")
    public ModelAndView m1(ModelAndView mv)
    {
        Student s1=new Student(1, "sahil");
        Student s2=new Student(2, "sameer");
        Student s3=new Student(3, "sam");
        Student s4=new Student(4, "sana");
        
        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        mv=new ModelAndView("studentsdetails", "students", students);
        return mv;
    }
}
