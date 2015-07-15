package ch.websoft.taxulator.web.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TaxulatorServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
