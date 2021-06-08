package dmy.signup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import dmy.signup.service.DmySignUpService;
import dmy.signup.vo.DmySignUpVO;

@Controller
public class DmySignUpController {
	private Logger logger = Logger.getLogger(DmySignUpController.class);

	/* @Autowired
	private Dmymatch spoMatchService;
	
	@Autowired
	private SpoChatService spoChatService; */
	
	@Autowired(required = false)
	private DmySignUpService dmySignUpService;
	
	@RequestMapping(value = "listSignUp", method = RequestMethod.GET)
	public String listSignUp(DmySignUpVO svo, Model model) {
		System.out.println("DmySignUpController listSignUp �Լ� ���� ����!!");
		logger.info("DmySignUpController listSignUp �Լ� ���� ����!!");
		
		// ������ �̵� ����
		
		
		List<DmySignUpVO> list = dmySignUpService.listSignUp(svo);
		logger.info("DmySignUpController listSignUp >>> : " + list);
		
		model.addAttribute("list", list);
		
		System.out.println("DmySignUpController listSignUp �Լ� ��!!");
		logger.info("DmySignUpController listSignUp �Լ� ��!!");
		return "listSignUp"; // �����Ҷ� ���丮 ����
	}
	
	
	
	
	
	
	// ��û�ϱ�
	@RequestMapping(value = "signUpMath", method = RequestMethod.GET)
	public String signUpMatch(DmySignUpVO svo, HttpServletRequest req) {
		System.out.println("DmySignUpController signUpMatch �Լ� ���� ����!!");
		logger.info("DmySignUpController signUpMatch �Լ� ���� ����!!" + svo);
		
		String dsu_no ="";
		String result ="";
		//String resultPage = "";
		
		ModelAndView mav = new ModelAndView();
		
		// ����
		HttpSession session = req.getSession(false);
		logger.info("DmySignUpController signUpMatch session >>> : " + session);
		
		if(session != null) {
			dsu_no = String.valueOf(session.getAttribute("dsu_no"));
			svo.setDsu_no(dsu_no);
			logger.info("DmySignUpController mypageListMatch dsu_no >>> : " + dsu_no);
		} else {
			mav.addObject("result", "������ ����Ǿ����ϴ�. �ٽ� �α��� ���ּ���!");
			return "loginForm";
		} try {
			int nCnt = dmySignUpService.signUpMatch(svo);
			logger.info("DmySignUpController SignUpMatch nCnt >>> : " + nCnt);
			if(nCnt > 0) {
				// ��û ����� �� ������
				result = "��û ����";
				mav.addObject("dmySignUpVO", dmySignUpService.viewSignUp(svo));
				// resultPage = "";
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(e.getMessage());
			result = "��û�� ������ �߻��Ͽ� �����߽��ϴ�";
			// resultPage
			// logger.info("DmySignUpController signUpMatch dsu_no >>> : " + svo.getDsu_no());
		}
		mav.addObject("result", result);
		System.out.println("DmySignUpController signUpMatch �Լ� ��!!");
		logger.info("DmySignUpController signUpMatch �Լ� ��!!");
		return "signUp";
		
	}
	
}












