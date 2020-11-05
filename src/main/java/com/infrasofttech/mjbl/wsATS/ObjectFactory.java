//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 09:24:32 PM IST 
//


package com.infrasofttech.mjbl.wsATS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infrasofttech.mjbl.wsATS package. 
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

    private final static QName _Logon_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "logon");
    private final static QName _LogonResponse_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "logonResponse");
    private final static QName _Logout_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "logout");
    private final static QName _LogoutResponse_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "logoutResponse");
    private final static QName _Send_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "send");
    private final static QName _SendResponse_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "sendResponse");
    private final static QName _GetUpdates_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "getUpdates");
    private final static QName _GetUpdatesResponse_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "getUpdatesResponse");
    private final static QName _SendACKNAK_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "sendACKNAK");
    private final static QName _SendACKNAKResponse_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "sendACKNAKResponse");
    private final static QName _Fault_QNAME = new QName("http://integration.gwclient.smallsystems.cma.se/", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infrasofttech.mjbl.wsATS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogonT }
     * 
     */
    public LogonT createLogonT() {
        return new LogonT();
    }

    /**
     * Create an instance of {@link SessionT }
     * 
     */
    public SessionT createSessionT() {
        return new SessionT();
    }

    /**
     * Create an instance of {@link EmptyT }
     * 
     */
    public EmptyT createEmptyT() {
        return new EmptyT();
    }

    /**
     * Create an instance of {@link SendT }
     * 
     */
    public SendT createSendT() {
        return new SendT();
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link ParamsMtMsgArray }
     * 
     */
    public ParamsMtMsgArray createParamsMtMsgArray() {
        return new ParamsMtMsgArray();
    }

    /**
     * Create an instance of {@link SendACKNAKT }
     * 
     */
    public SendACKNAKT createSendACKNAKT() {
        return new SendACKNAKT();
    }

    /**
     * Create an instance of {@link FaultT }
     * 
     */
    public FaultT createFaultT() {
        return new FaultT();
    }

    /**
     * Create an instance of {@link ParamsMtMsg }
     * 
     */
    public ParamsMtMsg createParamsMtMsg() {
        return new ParamsMtMsg();
    }

    /**
     * Create an instance of {@link ResultT }
     * 
     */
    public ResultT createResultT() {
        return new ResultT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogonT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "logon")
    public JAXBElement<LogonT> createLogon(LogonT value) {
        return new JAXBElement<LogonT>(_Logon_QNAME, LogonT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "logonResponse")
    public JAXBElement<SessionT> createLogonResponse(SessionT value) {
        return new JAXBElement<SessionT>(_LogonResponse_QNAME, SessionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "logout")
    public JAXBElement<SessionT> createLogout(SessionT value) {
        return new JAXBElement<SessionT>(_Logout_QNAME, SessionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "logoutResponse")
    public JAXBElement<EmptyT> createLogoutResponse(EmptyT value) {
        return new JAXBElement<EmptyT>(_LogoutResponse_QNAME, EmptyT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "send")
    public JAXBElement<SendT> createSend(SendT value) {
        return new JAXBElement<SendT>(_Send_QNAME, SendT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "sendResponse")
    public JAXBElement<SendResponse> createSendResponse(SendResponse value) {
        return new JAXBElement<SendResponse>(_SendResponse_QNAME, SendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "getUpdates")
    public JAXBElement<SessionT> createGetUpdates(SessionT value) {
        return new JAXBElement<SessionT>(_GetUpdates_QNAME, SessionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsMtMsgArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "getUpdatesResponse")
    public JAXBElement<ParamsMtMsgArray> createGetUpdatesResponse(ParamsMtMsgArray value) {
        return new JAXBElement<ParamsMtMsgArray>(_GetUpdatesResponse_QNAME, ParamsMtMsgArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendACKNAKT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "sendACKNAK")
    public JAXBElement<SendACKNAKT> createSendACKNAK(SendACKNAKT value) {
        return new JAXBElement<SendACKNAKT>(_SendACKNAK_QNAME, SendACKNAKT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "sendACKNAKResponse")
    public JAXBElement<EmptyT> createSendACKNAKResponse(EmptyT value) {
        return new JAXBElement<EmptyT>(_SendACKNAKResponse_QNAME, EmptyT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.gwclient.smallsystems.cma.se/", name = "fault")
    public JAXBElement<FaultT> createFault(FaultT value) {
        return new JAXBElement<FaultT>(_Fault_QNAME, FaultT.class, null, value);
    }

}