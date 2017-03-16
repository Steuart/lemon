package top.joylife.lemon.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HemingWu on 2017/3/10 0010.
 */
public class EndPoint extends TextWebSocketHandler {

    public static Map<String,WebSocketSession> seMap = new HashMap<>();

    @Override
    protected void handleTextMessage(WebSocketSession session,
                                     TextMessage textMessage) throws Exception {
        super.handleTextMessage(session,textMessage);
        System.out.println(session.getAttributes().get("token"));
        TextMessage reMsg = new TextMessage(textMessage.getPayload()+"received at server  ;;;"+session.getId());
        seMap.put(session.getId(),session);
        for(String id :seMap.keySet()){
            seMap.get(id).sendMessage(reMsg);
        }
        //session.sendMessage(reMsg);
    }


}
