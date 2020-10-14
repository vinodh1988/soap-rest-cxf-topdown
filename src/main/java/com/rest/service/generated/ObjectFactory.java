
package com.rest.service.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.myservice.myservice package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _CreatePersonRequest_QNAME = new QName("http://www.myservice.org/myservice/", "createPersonRequest");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://www.myservice.org/myservice/", "createPersonResponse");
    private final static QName _GetPeopleRequest_QNAME = new QName("http://www.myservice.org/myservice/", "getPeopleRequest");
    private final static QName _GetPeopleResponse_QNAME = new QName("http://www.myservice.org/myservice/", "getPeopleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.myservice.myservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePersonRequest }
     * 
     */
    public CreatePersonRequest createCreatePersonRequest() {
        return new CreatePersonRequest();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleRequest }
     * 
     */
    public GetPeopleRequest createGetPeopleRequest() {
        return new GetPeopleRequest();
    }

    /**
     * Create an instance of {@link GetPeopleResponse }
     * 
     */
    public GetPeopleResponse createGetPeopleResponse() {
        return new GetPeopleResponse();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePersonRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.myservice.org/myservice/", name = "createPersonRequest")
    public JAXBElement<CreatePersonRequest> createCreatePersonRequest(CreatePersonRequest value) {
        return new JAXBElement<CreatePersonRequest>(_CreatePersonRequest_QNAME, CreatePersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.myservice.org/myservice/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPeopleRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.myservice.org/myservice/", name = "getPeopleRequest")
    public JAXBElement<GetPeopleRequest> createGetPeopleRequest(GetPeopleRequest value) {
        return new JAXBElement<GetPeopleRequest>(_GetPeopleRequest_QNAME, GetPeopleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPeopleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.myservice.org/myservice/", name = "getPeopleResponse")
    public JAXBElement<GetPeopleResponse> createGetPeopleResponse(GetPeopleResponse value) {
        return new JAXBElement<GetPeopleResponse>(_GetPeopleResponse_QNAME, GetPeopleResponse.class, null, value);
    }

}
