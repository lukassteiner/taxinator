package ch.websoft.taxulator.web.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("TaxulatorService")
public interface TaxulatorService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use TaxulatorService.App.getInstance() to access static instance of TaxulatorServiceAsync
     */
    public static class App {
        private static TaxulatorServiceAsync ourInstance = GWT.create(TaxulatorService.class);

        public static synchronized TaxulatorServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
