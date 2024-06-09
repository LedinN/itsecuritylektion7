package dev.nick.itsecuritylektion7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    private final LoggingController loggingController;

    public Controller(LoggingController loggingController) {
        this.loggingController = loggingController;
    }



@GetMapping("/")
    public String startpage() {
    return "startpage";
}

@GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b, Model model) {
        int result = loggingController.divide(a,b);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("result",result);
        return "divide";
}

}
