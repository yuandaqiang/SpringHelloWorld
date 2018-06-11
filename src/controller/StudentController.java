package controller;

import com.tutorialspoint.FStudent;
import exception.SpringException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student()
    {

        return new ModelAndView("student","command",new FStudent());
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent(@ModelAttribute("SpringWeb")FStudent fStudent, ModelMap model)
    {
        if(fStudent.getName().length()<5)
        {
            throw new SpringException("name is to short");
        }
        else {
            model.addAttribute("name", fStudent.getName());
            model.addAttribute("id", fStudent.getId());
            model.addAttribute("age", fStudent.getAge());
            return "result";
        }
    }
}
