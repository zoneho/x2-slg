package com.xgame.logic.server.game.task.message;
import com.xgame.logic.server.game.task.bean.PlayerActiveTaskBean;
import com.xgame.msglib.ResMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Task-ResRewardActiveBox - 返回活跃度
 */
public class ResRewardActiveBoxMessage extends ResMessage {
	
	//模块号+消息号
	public static final int ID=201104;
	//模块号
	public static final int FUNCTION_ID=201;
	//消息号
	public static final int MSG_ID=104;
	
	/**玩家活跃度任务信息*/
	@MsgField(Id = 1)
	public PlayerActiveTaskBean playerActiveTask;
	/**领取活跃度的宝箱刻度*/
	@MsgField(Id = 2)
	public int tag;
		
	@Override
	public int getId() {
		return ID;
	}

	@Override
	public String getQueue() {
		return "s2s";
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public boolean isSync() {
		return false;
	}

	@Override
	public CommandEnum getCommandEnum() {
		return Communicationable.CommandEnum.PLAYERMSG;
	}
	
	@Override
	public HandlerEnum getHandlerEnum() {
		return Communicationable.HandlerEnum.SC;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		buf.append("playerActiveTask:" + playerActiveTask +",");
		buf.append("tag:" + tag +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}