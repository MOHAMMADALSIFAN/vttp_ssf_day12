package sg.edu.nus.iss.vttp5a_ssf_day02l.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
  
  
  // public String home(){
  //   return "home";
  // }
@GetMapping(path={"","/landing"})
  public String home(Model model){
    model.addAttribute("CurrentTime", (new Date()).toString());

    Calendar cal = Calendar.getInstance();
    model.addAttribute("currHour",cal.get(Calendar.HOUR_OF_DAY));
    return "home";
    
  }
}
