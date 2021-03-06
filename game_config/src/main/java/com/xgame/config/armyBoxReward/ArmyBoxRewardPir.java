package com.xgame.config.armyBoxReward;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyBoxRewardPir extends BaseFilePri{
	
	/**﻿宝箱等级*/
	int lv;
	/**升级所需点数*/
	int needExp;
	/**铁质宝箱(道具1id_道具数量1_道具权重1，道具2id_道具2数量_道具2权重，道具3id_道具3数量_道具3权重；随机次数)*/
	Object LV1;
	/**锡质宝箱*/
	Object LV2;
	/**铜质宝箱*/
	Object LV3;
	/**白银宝箱*/
	Object LV4;
	/**黄金宝箱*/
	Object LV5;
	
	
	
	/**﻿宝箱等级*/
	public int getLv(){
		return lv;
	}
	/**升级所需点数*/
	public int getNeedExp(){
		return needExp;
	}
	/**铁质宝箱(道具1id_道具数量1_道具权重1，道具2id_道具2数量_道具2权重，道具3id_道具3数量_道具3权重；随机次数)*/
	@SuppressWarnings("unchecked")
	public <T> T getLV1(){
		return (T)LV1;
	}
	/**锡质宝箱*/
	@SuppressWarnings("unchecked")
	public <T> T getLV2(){
		return (T)LV2;
	}
	/**铜质宝箱*/
	@SuppressWarnings("unchecked")
	public <T> T getLV3(){
		return (T)LV3;
	}
	/**白银宝箱*/
	@SuppressWarnings("unchecked")
	public <T> T getLV4(){
		return (T)LV4;
	}
	/**黄金宝箱*/
	@SuppressWarnings("unchecked")
	public <T> T getLV5(){
		return (T)LV5;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}