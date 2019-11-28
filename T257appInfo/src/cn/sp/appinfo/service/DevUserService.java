package cn.sp.appinfo.service;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserService {
	//开发者登录验证方法
	public DevUser login(@Param("devCode") String devCode,@Param("devPassword")String devPassword);
}
