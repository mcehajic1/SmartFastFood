package web.services;

public class AddOrderProxy implements web.services.AddOrder {
  private String _endpoint = null;
  private web.services.AddOrder addOrder = null;
  
  public AddOrderProxy() {
    _initAddOrderProxy();
  }
  
  public AddOrderProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddOrderProxy();
  }
  
  private void _initAddOrderProxy() {
    try {
      addOrder = (new web.services.AddOrderServiceLocator()).getaddOrder();
      if (addOrder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addOrder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addOrder != null)
      ((javax.xml.rpc.Stub)addOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.AddOrder getAddOrder() {
    if (addOrder == null)
      _initAddOrderProxy();
    return addOrder;
  }
  
  public void createOrder(int id, java.lang.String typeOfOrder, java.lang.String purchaser, java.lang.String contact, java.lang.String note) throws java.rmi.RemoteException{
    if (addOrder == null)
      _initAddOrderProxy();
    addOrder.createOrder(id, typeOfOrder, purchaser, contact, note);
  }
  
  
}