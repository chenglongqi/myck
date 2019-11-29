package cn.sp.appinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sp.appinfo.entity.AppInfo;
import cn.sp.appinfo.service.AppinfoService;

@Controller
@RequestMapping("/info")
public class AppInfoController {
	@Resource
	private AppinfoService appinfoService;
	
	//跳转到信息查看页面显示信息
	@RequestMapping("/list")
	public String list(Model model){
		List<AppInfo> infolist = appinfoService.getall();
		model.addAttribute("infolist", infolist);
		return "developer/appinfolist";
	}
}
