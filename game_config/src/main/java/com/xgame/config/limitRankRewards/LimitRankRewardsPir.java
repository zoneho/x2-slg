package com.xgame.config.limitRankRewards;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class LimitRankRewardsPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**排行类型（对应limitRank表activityType）*/
	int rankType;
	/**排名*/
	Object rank;
	/**奖励发放最低积分限制*/
	int limit;
	/**对应奖励*/
	Object rewards;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**排行类型（对应limitRank表activityType）*/
	public int getRankType(){
		return rankType;
	}
	/**排名*/
	@SuppressWarnings("unchecked")
	public <T> T getRank(){
		return (T)rank;
	}
	/**奖励发放最低积分限制*/
	public int getLimit(){
		return limit;
	}
	/**对应奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards(){
		return (T)rewards;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}