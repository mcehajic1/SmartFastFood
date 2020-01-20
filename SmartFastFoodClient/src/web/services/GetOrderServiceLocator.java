/**
 * GetOrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

public class GetOrderServiceLocator extends org.apache.axis.client.Service implements web.services.GetOrderService {

    public GetOrderServiceLocator() {
    }


    public GetOrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetOrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getOrder
    private java.lang.String getOrder_address = "http://localhost:8080/SmartFastFood/services/getOrder";

    public java.lang.String getgetOrderAddress() {
        return getOrder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getOrderWSDDServiceName = "getOrder";

    public java.lang.String getgetOrderWSDDServiceName() {
        return getOrderWSDDServiceName;
    }

    public void setgetOrderWSDDServiceName(java.lang.String name) {
        getOrderWSDDServiceName = name;
    }

    public web.services.GetOrder getgetOrder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getOrder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetOrder(endpoint);
    }

    public web.services.GetOrder getgetOrder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            web.services.GetOrderSoapBindingStub _stub = new web.services.GetOrderSoapBindingStub(portAddress, this);
            _stub.setPortName(getgetOrderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetOrderEndpointAddress(java.lang.String address) {
        getOrder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (web.services.GetOrder.class.isAssignableFrom(serviceEndpointInterface)) {
                web.services.GetOrderSoapBindingStub _stub = new web.services.GetOrderSoapBindingStub(new java.net.URL(getOrder_address), this);
                _stub.setPortName(getgetOrderWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("getOrder".equals(inputPortName)) {
            return getgetOrder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.web", "getOrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.web", "getOrder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getOrder".equals(portName)) {
            setgetOrderEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
