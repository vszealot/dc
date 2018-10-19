package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.BoardInfo;
import entity.User;
import model.BoardDao;
import model.UserDao;

@Controller
public class ControllerHJ {
	@Autowired
	UserDao userdao;
	@Autowired
	BoardDao boarddao;

	// �߰��ϱ� �� ȭ�� ===============================================================
	@RequestMapping("/insert.do")
	public ModelAndView insert(Model model) {
		return new ModelAndView("insert"); // /WEB-INF/view/insert.jsp�� �ǹ��Ѵ�.
	}

	// �߰��ϱ� �� �ڵ� ===============================================================
	@RequestMapping(value = "/insertProc.do", method = RequestMethod.POST)
	public ModelAndView insertProc(@ModelAttribute User user) {
		// System.out.println("�̸� : " + user.getUserId());

		if (userdao.insertUser(user)) {
			return list();
		} else {
			return new ModelAndView("insert");
		}

	}

	// ��ü ����ϱ� =================================================================
	@RequestMapping(value = "/list.do")
	public ModelAndView list() {
		return new ModelAndView("list", "list", userdao.listUser());
	}

	// �Խ��� �����ϱ� �� ȭ�� =============================================================
	@RequestMapping("/createBoard.do")
	public ModelAndView createBoard(Model model) {
		return new ModelAndView("board/createBoard");
	}

	// �Խ��� �����ϱ� �� �ڵ� =============================================================
	@RequestMapping(value = "/createBoardProc.do", method = RequestMethod.POST)
	public ModelAndView createBoardProc(@ModelAttribute BoardInfo boardInfo) {

		if (boarddao.createBoard(boardInfo)) {
			makeNewBoard(boardInfo);
			return new ModelAndView("board/createResult");
		} else {
			return list();
		}

	}

	// JSP���� ����� ===================================================================
	private void makeNewBoard(@ModelAttribute BoardInfo boardInfo) {
		String txt = "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"\r\n" + 
				"    pageEncoding=\"UTF-8\"%>\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";

		String fileName = "C:\\Users\\Playdata\\git\\dc\\dc\\web\\WEB-INF\\view\\board\\newBoard\\"
				+ boardInfo.getUserId() + ".jsp";

		try {

			// BufferedWriter �� FileWriter�� �����Ͽ� ��� (�ӵ� ���)
			BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));

			// ���Ͼȿ� ���ڿ� ����
			fw.write(txt);
			fw.flush();

			// ��ü �ݱ�
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
