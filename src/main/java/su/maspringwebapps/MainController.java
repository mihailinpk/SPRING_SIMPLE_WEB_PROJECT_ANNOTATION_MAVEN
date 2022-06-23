package su.maspringwebapps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Класс MainController
 * <p/>
 * Главный контроллер программы
 * <p/>
 *
 * @author petr.mikhailin
 * created 23.06.2022 9:40
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "test";
    }

}
