package com.xgame.logic.server.game.duplicate.handler;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xgame.logic.server.core.net.process.PlayerCommand;
import com.xgame.logic.server.game.duplicate.message.ReqGetDupNoteInfoMessage;

/** 
 * @author messageGenerator
 * 
 * @version 1.0.0
 * 
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReqGetDupNoteInfoHandler extends PlayerCommand<ReqGetDupNoteInfoMessage>{


	@Override
    public void action() {
    }
}
