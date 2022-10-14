import cn.evolvefield.dev.core.FastWSServer;
import cn.evolvefield.dev.core.WebSocketSession;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/10/14 20:30
 * Version: 1.0
 */
public class TestWSServer extends FastWSServer {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TestWSServer.class);

    @Test
    public void startWS(){
        super.start("127.0.0.1", 8080);
    }

    @Override
    public void onOpen(WebSocketSession session) {
        super.onOpen(session);
    }

    @Override
    public void onMessage(WebSocketSession session, String message) {
        logger.info(message);
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
