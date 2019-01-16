package com.niit.rio.contoller;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.rio.model.Employee;

@Controller
public class IndexController 
{
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String m1(ModelMap map)
    {
        Employee e=new Employee(1, "sagar", 45444);
        map.addAttribute("employee",e);
        return "employee";
    }
    
    @RequestMapping(value = {"/employeedetails"})
    public String m2(ModelMap map)
    {
        Employee e1=new Employee(1, "praful", 45000);
        Employee e2=new Employee(2, "suresh", 55000);
        Employee e3=new Employee(3, "ramesh", 95000);
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        map.addAttribute("employees",employees);
        return "employeedetails";
    }
}
