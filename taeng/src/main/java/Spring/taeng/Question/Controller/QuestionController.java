package Spring.taeng.Question.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {
    @GetMapping("/question/list")
    public String list(){
        return "forums";
    }
}