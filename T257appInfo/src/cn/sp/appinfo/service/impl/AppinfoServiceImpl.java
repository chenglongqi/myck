package cn.sp.appinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sp.appinfo.dao.AppinfoDao;
import cn.sp.appinfo.entity.AppInfo;
import cn.sp.appinfo.service.AppinfoService;

@Service
public class AppinfoServiceImpl implements AppinfoService{
	
	@Resource
	private AppinfoDao appinfoDao;
	
	@Override
	public List<AppInfo> getall() {
		return appinfoDao.getall();
	}

}
