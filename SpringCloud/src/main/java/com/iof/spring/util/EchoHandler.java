package com.iof.spring.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class EchoHandler extends TextWebSocketHandler {
	
	/** Session All save
	 * 1:1 chatting
	 */
	private Map<String, WebSocketSession> sessions = new HashMap<String, WebSocketSession>();
	
	/**
	 * all chatting
	 */
	private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();
	
	private static Logger logger = LoggerFactory.getLogger(EchoHandler.class);
	
	/**
	 * client connection done exec
	 */
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		/**
		 * Using Map
		 */
		//sessions.put(session.getId(), session);
		
		/**
		 * Using List
		 */
		sessionList.add(session);
		logger.info("{} connection", session.getId());
	}
	/**
	 * client wesocket send server exec
	 */	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// TODO Auto-generated method stub
		/** o session.getId() 1 message.getPayload() input */
		logger.info("{} is send {}", session.getId(), message.getPayload());
		
		/**
		 * Connection all client send message : list 
		 */
		for(WebSocketSession sess : sessionList) {
			sess.sendMessage(new TextMessage("echo: " + message.getPayload()));
		}
        // 맵 방법.
        /*
        Iterator<String> sessionIds = sessions.ketSet().iterator();         
        String sessionId = "";
        while (sessionIds.hasNext()) {
            sessionId = sessionIds.next();
            sessions.get(sessionId).sendMessage(new TextMessage("echo:" + message.getPayload()));
            }
        */
        
        //연결되어 있는 모든 클라이언트들에게 메시지를 전송한다.
        //session.sendMessage(new TextMessage("echo:" + message.getPayload()));		
	}
	
	/**
	 * client connection close exec
	 */
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		// TODO Auto-generated method stub
		/** Delete List */
		sessionList.remove(session);
		
		/** Map delete */
		//sessions.remove(session.getId());
		
		logger.info("{} connection close", session.getId());
	}
	
	

}
