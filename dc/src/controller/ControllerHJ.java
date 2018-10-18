package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHJ {
	//첫 화면 띄우기
	@RequestMapping("/search.do")
	public ModelAndView insert(Model model) {
		return new ModelAndView("search/search"); // /WEB-INF/view/insert.jsp를 의미한다.
	}
}
