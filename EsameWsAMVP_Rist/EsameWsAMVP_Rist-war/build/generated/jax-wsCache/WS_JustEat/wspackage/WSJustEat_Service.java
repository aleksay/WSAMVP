
package wspackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_JustEat", targetNamespace = "http://WSPackage/", wsdlLocation = "http://localhost:8080/EsameWsAMVP-war/WS_JustEat?wsdl")
public class WSJustEat_Service
    extends Service
{

    private final static URL WSJUSTEAT_WSDL_LOCATION;
    private final static WebServiceException WSJUSTEAT_EXCEPTION;
    private final static QName WSJUSTEAT_QNAME = new QName("http://WSPackage/", "WS_JustEat");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EsameWsAMVP-war/WS_JustEat?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSJUSTEAT_WSDL_LOCATION = url;
        WSJUSTEAT_EXCEPTION = e;
    }

    public WSJustEat_Service() {
        super(__getWsdlLocation(), WSJUSTEAT_QNAME);
    }

    public WSJustEat_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSJUSTEAT_QNAME, features);
    }

    public WSJustEat_Service(URL wsdlLocation) {
        super(wsdlLocation, WSJUSTEAT_QNAME);
    }

    public WSJustEat_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSJUSTEAT_QNAME, features);
    }

    public WSJustEat_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSJustEat_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSJustEat
     */
    @WebEndpoint(name = "WS_JustEatPort")
    public WSJustEat getWSJustEatPort() {
        return super.getPort(new QName("http://WSPackage/", "WS_JustEatPort"), WSJustEat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSJustEat
     */
    @WebEndpoint(name = "WS_JustEatPort")
    public WSJustEat getWSJustEatPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSPackage/", "WS_JustEatPort"), WSJustEat.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSJUSTEAT_EXCEPTION!= null) {
            throw WSJUSTEAT_EXCEPTION;
        }
        return WSJUSTEAT_WSDL_LOCATION;
    }

}