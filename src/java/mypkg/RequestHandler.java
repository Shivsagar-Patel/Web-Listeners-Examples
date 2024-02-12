
package mypkg;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestHandler implements ServletRequestListener {

  
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("A New Request is Received......................@@@@@");
    }
      @Override
    public void requestDestroyed(ServletRequestEvent sre) {
                System.out.println("Request Over[Responded......................@@@@@");

    }
}
