package com.zl.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserInfo {
		private static Map<String,String> map = new HashMap<String,String>();
		
		//������û�
		public static void setMap(String newName,String newPwd) {
				map.put(newName, newPwd);
				//��ӡ�û��б�
				Set<String> set = map.keySet();
				for (String key : set) {
					System.out.println("�û�:"+key);
				}
		}
		static{
			map.put("admin", "123");
			map.put("jdit", "123");
			map.put("user", "123");
		}
		/**
		 * У���û�
		 * @param userName ��ҪУ����û���
		 * @param password ��ҪУ�������
		 * @return �Ƿ���� true:���� false:������
		 */
		public static boolean findUser(String userName,String password){
			boolean res = false;
			Set<String> keys =  map.keySet();
			for (String key : keys) {
				if(key.equals(userName)&&map.get(key).equals(password)){
					res = true;
					break;
				}
			}
			return res;
		}
		/**
		 * �жϸ��û����Ƿ�ռ��
		 * @param userName
		 * @return
		 */
		public static boolean findUser(String userName){
			boolean res = false;
			Set<String> keys =  map.keySet();
			for (String key : keys) {
				if(key.equals(userName)){
					res = true;
					break;
				}
			}
			return res;
		}
}
