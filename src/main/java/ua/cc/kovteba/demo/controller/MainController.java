package ua.cc.kovteba.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ua.cc.kovteba.demo.service.CalculatorService;
import ua.cc.kovteba.demo.service.CalculatorServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@Controller
@RequestMapping
public class MainController {

    private static CalculatorService calculatorService = new CalculatorServiceImpl();

    @RequestMapping("/")
    public String startPage(Model model) {

        System.out.println("Start page");

//        inputValue = String.valueOf(model.getAttribute("inputValue"));
//        result = String.valueOf(model.getAttribute("result"));
//
//        System.out.println(inputValue);
//        System.out.println(result);
//        if (inputValue.equals("null")) {
//            model.addAttribute("inputValue", "");
//        } else {
//            model.addAttribute("inputValue", inputValue);
//        }
//
//        if (result.equals("null")) {
//            model.addAttribute("result", "");
//        } else {
//            model.addAttribute("result", result);
//        }

        model.addAttribute("inputValue", "");
        model.addAttribute("result", "");
        return "index";
    }

    @PostMapping("calc")
    public String calculate(Model model, @ModelAttribute("inputValue") String inputValue, RedirectAttributes redirectAttributes) {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!! : " + inputValue);
        String result = "";
        try {
            result = calculatorService.calculate(inputValue);
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            result = "Incorrect string";
        }
        System.out.println("REsult : " + result);


//        model.addAttribute("inputValue", inputValue);
//        model.addAttribute("result", result);

        redirectAttributes.addFlashAttribute("inputValue", inputValue);
        redirectAttributes.addFlashAttribute("result", result);


//        return "index";
        return "redirect:/indexRedirect";
//        return startPage(model, inputValue, result);
    }

    @RequestMapping("/indexRedirect")
    public String indexRedirect(Model model, @ModelAttribute("inputValue") String inputValue, @ModelAttribute("result") String result) {

        if (inputValue.equals("null")) {
            model.addAttribute("inputValue", "");
        } else {
            model.addAttribute("inputValue", inputValue);
        }

        if (result.equals("null")) {
            model.addAttribute("result", "");
        } else {
            model.addAttribute("result", result);
        }

        model.addAttribute("inputValue", inputValue);
        model.addAttribute("result", result);

        return "index";
    }


}
