import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @author wanghanyu
 * @create 2017-06-11 15:28
 */

@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000000; i++) {
            sb.append("Hello World");
        }
        log.error(sb.toString());
    }
}
