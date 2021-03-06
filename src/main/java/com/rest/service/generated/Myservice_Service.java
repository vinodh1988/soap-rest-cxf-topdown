package com.rest.service.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-10-14T11:43:40.492+05:30
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "myservice",
                  wsdlLocation = "file:/C:/Users/kcvin/Documents/workspace-spring-tool-suite-4-4.8.0.RELEASE/people-soap/src/main/resources/myservice.wsdl",
                  targetNamespace = "http://www.myservice.org/myservice/")
public class Myservice_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.myservice.org/myservice/", "myservice");
    public final static QName MyserviceSOAP = new QName("http://www.myservice.org/myservice/", "myserviceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/kcvin/Documents/workspace-spring-tool-suite-4-4.8.0.RELEASE/people-soap/src/main/resources/myservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Myservice_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/kcvin/Documents/workspace-spring-tool-suite-4-4.8.0.RELEASE/people-soap/src/main/resources/myservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Myservice_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Myservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Myservice_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Myservice_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Myservice_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Myservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Myservice
     */
    @WebEndpoint(name = "myserviceSOAP")
    public Myservice getMyserviceSOAP() {
        return super.getPort(MyserviceSOAP, Myservice.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Myservice
     */
    @WebEndpoint(name = "myserviceSOAP")
    public Myservice getMyserviceSOAP(WebServiceFeature... features) {
        return super.getPort(MyserviceSOAP, Myservice.class, features);
    }

}
