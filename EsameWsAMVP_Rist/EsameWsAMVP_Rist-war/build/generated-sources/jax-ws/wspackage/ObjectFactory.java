
package wspackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wspackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemMenuEntry_QNAME = new QName("http://WSPackage/", "RemMenuEntry");
    private final static QName _DisplayMenuRistResponse_QNAME = new QName("http://WSPackage/", "DisplayMenuRistResponse");
    private final static QName _Hello_QNAME = new QName("http://WSPackage/", "hello");
    private final static QName _RemEntryMenuById_QNAME = new QName("http://WSPackage/", "RemEntryMenuById");
    private final static QName _HelloResponse_QNAME = new QName("http://WSPackage/", "helloResponse");
    private final static QName _AddMenuEntry_QNAME = new QName("http://WSPackage/", "AddMenuEntry");
    private final static QName _DisplayMenuRist_QNAME = new QName("http://WSPackage/", "DisplayMenuRist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wspackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayMenuRist }
     * 
     */
    public DisplayMenuRist createDisplayMenuRist() {
        return new DisplayMenuRist();
    }

    /**
     * Create an instance of {@link AddMenuEntry }
     * 
     */
    public AddMenuEntry createAddMenuEntry() {
        return new AddMenuEntry();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RemEntryMenuById }
     * 
     */
    public RemEntryMenuById createRemEntryMenuById() {
        return new RemEntryMenuById();
    }

    /**
     * Create an instance of {@link DisplayMenuRistResponse }
     * 
     */
    public DisplayMenuRistResponse createDisplayMenuRistResponse() {
        return new DisplayMenuRistResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link RemMenuEntry }
     * 
     */
    public RemMenuEntry createRemMenuEntry() {
        return new RemMenuEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemMenuEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "RemMenuEntry")
    public JAXBElement<RemMenuEntry> createRemMenuEntry(RemMenuEntry value) {
        return new JAXBElement<RemMenuEntry>(_RemMenuEntry_QNAME, RemMenuEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMenuRistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "DisplayMenuRistResponse")
    public JAXBElement<DisplayMenuRistResponse> createDisplayMenuRistResponse(DisplayMenuRistResponse value) {
        return new JAXBElement<DisplayMenuRistResponse>(_DisplayMenuRistResponse_QNAME, DisplayMenuRistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemEntryMenuById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "RemEntryMenuById")
    public JAXBElement<RemEntryMenuById> createRemEntryMenuById(RemEntryMenuById value) {
        return new JAXBElement<RemEntryMenuById>(_RemEntryMenuById_QNAME, RemEntryMenuById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMenuEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "AddMenuEntry")
    public JAXBElement<AddMenuEntry> createAddMenuEntry(AddMenuEntry value) {
        return new JAXBElement<AddMenuEntry>(_AddMenuEntry_QNAME, AddMenuEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMenuRist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSPackage/", name = "DisplayMenuRist")
    public JAXBElement<DisplayMenuRist> createDisplayMenuRist(DisplayMenuRist value) {
        return new JAXBElement<DisplayMenuRist>(_DisplayMenuRist_QNAME, DisplayMenuRist.class, null, value);
    }

}
