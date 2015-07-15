package ch.websoft.taxulator.web.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ch.websoft.taxulator.web.client.TaxulatorService;

public class TaxulatorServiceImpl extends RemoteServiceServlet implements TaxulatorService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}