package web.services;

public class GetOrderProxy implements web.services.GetOrder {
  private String _endpoint = null;
  private web.services.GetOrder getOrder = null;
  
  public GetOrderProxy() {
    _initGetOrderProxy();
  }
  
  public GetOrderProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetOrderProxy();
  }
  
  private void _initGetOrderProxy() {
    try {
      getOrder = (new web.services.GetOrderServiceLocator()).getgetOrder();
      if (getOrder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getOrder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getOrder != null)
      ((javax.xml.rpc.Stub)getOrder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.GetOrder getGetOrder() {
    if (getOrder == null)
      _initGetOrderProxy();
    return getOrder;
  }
  
  public model.Order getOrderInfo(int id) throws java.rmi.RemoteException{
    if (getOrder == null)
      _initGetOrderProxy();
    return getOrder.getOrderInfo(id);
  }
  
  
}