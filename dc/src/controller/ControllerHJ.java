package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHJ {
	//ù ȭ�� ����
	@RequestMapping("/search.do")
	public ModelAndView insert(Model model) {
		return new ModelAndView("search/search"); // /WEB-INF/view/insert.jsp�� �ǹ��Ѵ�.
	}
}
