package kr.pe.karsei.springmvcbasic.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        return new ModelAndView("response/hello")
                .addObject("data", "hi");
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hi!");
        return "response/hello";
    }

    @RequestMapping("/response/hello") // 권장하지 않음
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hi!");
    }
}