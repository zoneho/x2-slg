package com.xgame.logic.server.game.modify.message;
import com.xgame.msglib.ReqMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Modify-ReqDestoryArmor - 请求销毁装甲
 */
public class ReqDestoryArmorMessage extends ReqMessage {
	
	//模块号+消息号
	public static final int ID=601201;
	//模块号
	public static final int FUNCTION_ID=601;
	//消息号
	public static final int MSG_ID=201;
	
	/**唯一id*/
	@MsgField(Id = 1)
	public long id;
	/**1已损毁 0未损毁*/
	@MsgField(Id = 2)
	public int isDestory;
	/**销毁数量*/
	@MsgField(Id = 3)
	public int num;
		
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
		buf.append("id:" + id +",");
		buf.append("isDestory:" + isDestory +",");
		buf.append("num:" + num +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}