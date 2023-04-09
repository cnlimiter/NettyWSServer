import cn.evolvefield.sdk.fastws.core.FastWSServer;
import cn.evolvefield.sdk.fastws.core.WebSocketServer;
import cn.evolvefield.sdk.fastws.core.WebSocketSession;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/10/14 20:30
 * Version: 1.0
 */
public class TestWSServer extends FastWSServer implements WebSocketServer {

    private final Logger logger = LoggerFactory.getLogger("Test");
    public static TestWSServer INSTANCE = new TestWSServer();
    public static void main(String[] args){
        INSTANCE.startWS();
    }
    @Test
    public void startWS(){
        super.start("127.0.0.1", 8080, "help");
    }

    @Override
    public void onOpen(WebSocketSession session) {
        super.onOpen(session);
    }

    @Override
    public void onMessage(WebSocketSession session, String message) {
        logger.info(message);
        send(session, message);
    }

    @Override
    public void onClose(WebSocketSession session) {
        super.onClose(session);
    }

    @Override
    public void onError(WebSocketSession session, Throwable e) {
        super.onError(session, e);
    }
}
