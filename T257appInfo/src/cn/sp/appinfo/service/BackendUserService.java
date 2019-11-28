package cn.sp.appinfo.service;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.BackendUser;

public interface BackendUserService {
	//管理员登录验证方法
	public BackendUser login(@Param("userCode") String userCode,@Param("userPassword")String userPassword);
}
