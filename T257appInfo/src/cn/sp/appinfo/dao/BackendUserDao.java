package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.BackendUser;

public interface BackendUserDao {
	//根据用户名和密码获得管理员信息
	public BackendUser getByUserCodeAndUserPassword(@Param("userCode") String userCode,@Param("userPassword")String userPassword);
}
