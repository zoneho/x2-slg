package com.xgame.logic.server.game.gameevent.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xgame.logic.server.core.net.process.PlayerCommand;
import com.xgame.logic.server.game.gameevent.EventManager;
import com.xgame.logic.server.game.gameevent.message.ReqEventDetailMessage;

/** 
 * @author messageGenerator
 * 
 * @version 1.0.0
 * 
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReqEventDetailHandler extends PlayerCommand<ReqEventDetailMessage>{
	
	@Autowired
	private EventManager eventManager;

	@Override
    public void action() {
		eventManager.getEventDetail(player, message.eventId);
    }
}
