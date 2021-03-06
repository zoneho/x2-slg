package com.xgame.config.armyBox;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyBoxPir extends BaseFilePri{
	
	/**﻿宝箱ID*/
	int id;
	/**宝箱名*/
	int name;
	/**宝箱图标*/
	Object icon;
	/**过期时间（单位秒）*/
	int time;
	/**宝箱点数*/
	Object addBoxExp;
	
	
	
	/**﻿宝箱ID*/
	public int getId(){
		return id;
	}
	/**宝箱名*/
	public int getName(){
		return name;
	}
	/**宝箱图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**过期时间（单位秒）*/
	public int getTime(){
		return time;
	}
	/**宝箱点数*/
	@SuppressWarnings("unchecked")
	public <T> T getAddBoxExp(){
		return (T)addBoxExp;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}