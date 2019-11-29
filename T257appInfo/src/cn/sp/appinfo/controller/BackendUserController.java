package cn.sp.appinfo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sp.appinfo.entity.AppInfo;
import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.service.AppinfoService;
import cn.sp.appinfo.service.BackendUserService;

@Controller
@RequestMapping("/backend")
public class BackendUserController {
	@Resource
	private BackendUserService backendUserService;
	
	@Resource
	private AppinfoService appinfoService;

	// 跳转到管理员登录页面
	@RequestMapping("/beforebackendLogin")
	public String beforebackendLogin(Model model) {
		return "backendlogin";
	}

	// 登录验证
	@RequestMapping("/login")
	public String login(String userCode, String userPassword, HttpSession session, Model model) {
		BackendUser backendUser = backendUserService.login(userCode, userPassword);
		if (backendUser != null) {
			session.setAttribute("userName", backendUser.getUserName());
			session.setAttribute("userCode", backendUser.getUserCode());
			return "backend/main";
		} else {
			model.addAttribute("error", "用户名或密码错误,请重新登陆!");
			return "backendlogin";
		}
	}

	// 开发者注销
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// 让session失效
		session.invalidate();
		return "backendlogin";
	}

	// 跳转到信息查看页面显示信息
	@RequestMapping("/list")
	public String list(Model model) {
		List<AppInfo> infolist = appinfoService.getall();
		model.addAttribute("infolist", infolist);
		return "backend/applist";
	}
}
