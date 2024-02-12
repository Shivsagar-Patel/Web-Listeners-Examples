
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class SessionHandler implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("One New User has Joined.................#########");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
      System.out.println("One User is Leaving.................#########");
    }
}
