/**
 * GetRefrigeratorInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

public class GetRefrigeratorInfoServiceLocator extends org.apache.axis.client.Service implements web.services.GetRefrigeratorInfoService {

    public GetRefrigeratorInfoServiceLocator() {
    }


    public GetRefrigeratorInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetRefrigeratorInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getRefrigeratorInfo
    private java.lang.String getRefrigeratorInfo_address = "http://localhost:8080/SmartFastFood/services/getRefrigeratorInfo";

    public java.lang.String getgetRefrigeratorInfoAddress() {
        return getRefrigeratorInfo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getRefrigeratorInfoWSDDServiceName = "getRefrigeratorInfo";

    public java.lang.String getgetRefrigeratorInfoWSDDServiceName() {
        return getRefrigeratorInfoWSDDServiceName;
    }

    public void setgetRefrigeratorInfoWSDDServiceName(java.lang.String name) {
        getRefrigeratorInfoWSDDServiceName = name;
    }

    public web.services.GetRefrigeratorInfo getgetRefrigeratorInfo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getRefrigeratorInfo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetRefrigeratorInfo(endpoint);
    }

    public web.services.GetRefrigeratorInfo getgetRefrigeratorInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            web.services.GetRefrigeratorInfoSoapBindingStub _stub = new web.services.GetRefrigeratorInfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getgetRefrigeratorInfoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetRefrigeratorInfoEndpointAddress(java.lang.String address) {
        getRefrigeratorInfo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (web.services.GetRefrigeratorInfo.class.isAssignableFrom(serviceEndpointInterface)) {
                web.services.GetRefrigeratorInfoSoapBindingStub _stub = new web.services.GetRefrigeratorInfoSoapBindingStub(new java.net.URL(getRefrigeratorInfo_address), this);
                _stub.setPortName(getgetRefrigeratorInfoWSDDServiceName());
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
        if ("getRefrigeratorInfo".equals(inputPortName)) {
            return getgetRefrigeratorInfo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.web", "getRefrigeratorInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.web", "getRefrigeratorInfo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getRefrigeratorInfo".equals(portName)) {
            setgetRefrigeratorInfoEndpointAddress(address);
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
