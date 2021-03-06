package com.xgame.logic.server.game.country.message;
import com.xgame.msglib.ReqMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Country-ReqCountryHandle - 建筑物移动
 */
public class ReqCountryHandleMessage extends ReqMessage {
	
	//模块号+消息号
	public static final int ID=100202;
	//模块号
	public static final int FUNCTION_ID=100;
	//消息号
	public static final int MSG_ID=202;
	
	/**唯一id*/
	@MsgField(Id = 1)
	public int templateId;
	/**EDIT  CANCEL  SAVE  DELETE ALLDELETE*/
	@MsgField(Id = 2)
	public String opName;
	/***/
	@MsgField(Id = 3)
	public int uid;
		
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
		return Communicationable.HandlerEnum.CS;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		buf.append("templateId:" + templateId +",");
		buf.append("opName:" + opName +",");
		buf.append("uid:" + uid +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}