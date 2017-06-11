import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.SMTPAppenderBase;

/**
 * @author wanghanyu
 * @create 2017-06-11 19:03
 */
public class MyAppender extends AppenderBase<ILoggingEvent> {
    protected void append(ILoggingEvent eventObject) {
        System.out.println();
    }
}
