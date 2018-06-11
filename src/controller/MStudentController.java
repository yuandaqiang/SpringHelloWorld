package controller;

import com.tutorialspoint.FStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller

public class MStudentController {
    @RequestMapping(value = "/MyStudent",method =RequestMethod.GET)
    public ModelAndView student()
    {
        return  new ModelAndView("MyStudent","command",new FStudent());
    }
    @RequestMapping(value = "/r",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")FStudent fStudent, ModelMap modelMap)
    {

        modelMap.addAttribute("name",fStudent.getName());
        modelMap.addAttribute("id",fStudent.getId());
        modelMap.addAttribute("age",fStudent.getAge());
        return "MyResult";
    }
}
