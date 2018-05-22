package com.zixuapp.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.fastinfoset.algorithm.ShortEncodingAlgorithm;
import com.zixuapp.entity.User;
import com.zixuapp.mysql.MysqlBaseContorManager;
import com.zixuapp.system.Config;

public class UserDao {
	private static ArrayList<User> getAll(ArrayList<String[]> where) {
		MysqlBaseContorManager mysqlBaseContorManager = new MysqlBaseContorManager();
		mysqlBaseContorManager.setPrefix(true);
		mysqlBaseContorManager.setTableName("user");
		mysqlBaseContorManager.setWhere(where);
		ArrayList<HashMap<String, String>> res = mysqlBaseContorManager.select();
		ArrayList<User> list = new ArrayList<>();
		if(res == null) {
			return null;
		}
		for (HashMap<String, String> item : res) {
			User user = new User();
			user.setLock(Boolean.parseBoolean(item.get("lock")));
			user.setId(Integer.parseInt(item.get("id")));
			user.setUsername(item.get("username"));
			user.setPassword(item.get("password"));
			user.setSecret(item.get("secret"));
			user.setType(item.get("type"));
			list.add(user);
		}
		return list;
	}
	
	public static User username(String username){
		ArrayList<String[]> where = new ArrayList<>();
		where.add(new String[] {"username","=",username});
		ArrayList<User> res = getAll(where);
		if(res == null || res.size() == 0) {
			return null;
		}else {
			return res.get(0);
		}
	}
	
	public static boolean add(User user) {
		MysqlBaseContorManager mysqlBaseContorManager = new MysqlBaseContorManager();
		mysqlBaseContorManager.setPrefix(true);
		mysqlBaseContorManager.setTableName("user");
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("id", String.valueOf(user.getId()));
		userMap.put("lock", user.getLockTinyint());
		userMap.put("password", user.getPassword());
		userMap.put("username", user.getUsername());
		userMap.put("secret", user.getSecret());
		userMap.put("type", user.getType());	
		mysqlBaseContorManager.setInsert(userMap);
		return mysqlBaseContorManager.insert();
	}
}
