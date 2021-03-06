package mj.net.handler.game;

import mj.net.message.game.VoteDelSelectRet;
import mj.net.handler.MessageHandler;

public interface VoteDelSelectRetHandler <U> extends MessageHandler<VoteDelSelectRet, U> {
	/**
	 * @return 返回true 表示需要脱离缓冲，不然这个消息的内容可能被覆盖
	 */
	@Override
    boolean handler(VoteDelSelectRet msg, U user);
}