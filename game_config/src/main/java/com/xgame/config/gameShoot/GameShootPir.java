package com.xgame.config.gameShoot;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class GameShootPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**类型（1 单次奖励 2 一轮奖励）*/
	int type;
	/**模式（1 普通 2 高级）*/
	int mode;
	/**奖励*/
	Object rewards;
	/**权重*/
	int weight;
	/**本轮宝箱展示*/
	int show;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**类型（1 单次奖励 2 一轮奖励）*/
	public int getType(){
		return type;
	}
	/**模式（1 普通 2 高级）*/
	public int getMode(){
		return mode;
	}
	/**奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards(){
		return (T)rewards;
	}
	/**权重*/
	public int getWeight(){
		return weight;
	}
	/**本轮宝箱展示*/
	public int getShow(){
		return show;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}