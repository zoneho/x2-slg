package com.xgame.config.armyScience;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmySciencePir extends BaseFilePri{
	
	/**﻿id*/
	int id;
	/**科技名*/
	int name;
	/**科技描述*/
	int desc;
	/**属性图标*/
	Object icon;
	/**解锁所需科技大厅等级*/
	int needLv;
	/**最大等级*/
	int maxLv;
	/**升级所需科技经验*/
	Object exp;
	/**属性加成*/
	Object add;
	
	
	
	/**﻿id*/
	public int getId(){
		return id;
	}
	/**科技名*/
	public int getName(){
		return name;
	}
	/**科技描述*/
	public int getDesc(){
		return desc;
	}
	/**属性图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**解锁所需科技大厅等级*/
	public int getNeedLv(){
		return needLv;
	}
	/**最大等级*/
	public int getMaxLv(){
		return maxLv;
	}
	/**升级所需科技经验*/
	@SuppressWarnings("unchecked")
	public <T> T getExp(){
		return (T)exp;
	}
	/**属性加成*/
	@SuppressWarnings("unchecked")
	public <T> T getAdd(){
		return (T)add;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}