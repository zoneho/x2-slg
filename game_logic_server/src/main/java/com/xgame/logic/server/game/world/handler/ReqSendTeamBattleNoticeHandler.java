package com.xgame.logic.server.game.world.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xgame.logic.server.core.net.process.PlayerCommand;
import com.xgame.logic.server.game.world.WorldLogicManager;
import com.xgame.logic.server.game.world.message.ReqSendTeamBattleNotcieMessage;

/** 
 * @author messageGenerator
 * 
 * @version 1.0.0
 * 
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReqSendTeamBattleNoticeHandler extends PlayerCommand<ReqSendTeamBattleNotcieMessage>{

	@Autowired
	private WorldLogicManager worldLogicManager;
	
	@Override
    public void action() {
		worldLogicManager.sendAllianceBattleNotice(player, message.teamId);
	}
}
