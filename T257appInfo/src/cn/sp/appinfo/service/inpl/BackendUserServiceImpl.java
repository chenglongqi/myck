package cn.sp.appinfo.service.inpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sp.appinfo.dao.BackendUserDao;
import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.service.BackendUserService;

@Service
public class BackendUserServiceImpl implements BackendUserService{
	@Resource
	private BackendUserDao backendUserDao;
	
	@Override
	public BackendUser login(String userCode, String userPassword) {
		return backendUserDao.getByUserCodeAndUserPassword(userCode, userPassword);
	}

}
