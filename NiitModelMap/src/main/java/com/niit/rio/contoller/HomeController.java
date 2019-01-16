
package com.niit.rio.contoller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.rio.model.AddressHome;
import com.niit.rio.model.StudentHome;

@Controller
public class HomeController 
{
    @RequestMapping("/home")
    @ResponseBody
    public String m1()
    {
        return "Home";
    }
    
    @RequestMapping("/index")
    @ResponseBody
    public String m2()
    {
        return "<html><head></head><body><h1>Hello from index</h1></body></html>";
    }
    
    @RequestMapping(value = "/getstudent")
    @ResponseBody
    public StudentHome m3()
    {
        AddressHome add=new AddressHome("mumbai",400098);
        StudentHome std=new StudentHome(1, "suresh", "sruesh@gmail.com", add);
        return std;
    }
    
    @RequestMapping("/getdata")
    @ResponseBody
    public StudentHome m4(@RequestParam("id") int id)
    {
        AddressHome add1=new AddressHome("mumbai",400098);
        AddressHome add2=new AddressHome("mumbai",400098);
        
        StudentHome std1=new StudentHome(1, "suresh", "sruesh@gmail.com", add1);
        StudentHome std2=new StudentHome(2, "naresh", "naresh@gmail.com", add2);
        
        StudentHome s=new StudentHome();
        ArrayList<StudentHome> students=new ArrayList<>();
        students.add(std1);
        students.add(std2);
        
        for (StudentHome student : students) 
        {
            if(student.getRollno()==id)
            {
                s=student;
                break;
            }
        }
        
        return s;
    }
    
    @RequestMapping("/getdata/city/{city}")
    @ResponseBody
    public ArrayList<StudentHome> m5(@PathVariable("city") String city)
    {
        AddressHome add1=new AddressHome("mumbai",400098);
        AddressHome add2=new AddressHome("mumbai",400098);
        
        StudentHome std1=new StudentHome(1, "suresh", "sruesh@gmail.com", add1);
        StudentHome std2=new StudentHome(2, "naresh", "naresh@gmail.com", add2);
        
        //StudentHome s=new StudentHome();
        ArrayList<StudentHome> students=new ArrayList<>();
        students.add(std1);
        students.add(std2);
        
        ArrayList<StudentHome> stds=new ArrayList<>();
        
        for (StudentHome student : students) 
        {
            if(student.getAdd().getCity().equals(city))
            {
                stds.add(student);
            }
        }
        
        return stds;
    }
}
