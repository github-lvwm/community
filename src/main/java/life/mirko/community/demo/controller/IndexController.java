package life.mirko.community.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    /**
     * 接收普通请求参数
     * http://localhost:8080/hello?name=Mirko
     * url参数中的name必须要和@RequestParam("name")一致
     *
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
