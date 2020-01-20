/**
 * ItemService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

public interface ItemService extends javax.xml.rpc.Service {
    public java.lang.String getItemAddress();

    public web.services.Item getItem() throws javax.xml.rpc.ServiceException;

    public web.services.Item getItem(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
