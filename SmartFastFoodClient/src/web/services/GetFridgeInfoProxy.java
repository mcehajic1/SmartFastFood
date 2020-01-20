package web.services;

public class GetFridgeInfoProxy implements web.services.GetFridgeInfo {
  private String _endpoint = null;
  private web.services.GetFridgeInfo getFridgeInfo = null;
  
  public GetFridgeInfoProxy() {
    _initGetFridgeInfoProxy();
  }
  
  public GetFridgeInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetFridgeInfoProxy();
  }
  
  private void _initGetFridgeInfoProxy() {
    try {
      getFridgeInfo = (new web.services.GetFridgeInfoServiceLocator()).getgetFridgeInfo();
      if (getFridgeInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getFridgeInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getFridgeInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getFridgeInfo != null)
      ((javax.xml.rpc.Stub)getFridgeInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.GetFridgeInfo getGetFridgeInfo() {
    if (getFridgeInfo == null)
      _initGetFridgeInfoProxy();
    return getFridgeInfo;
  }
  
  public model.FridgeInfo getFridgeInfoStatus(int fridgeinfoid) throws java.rmi.RemoteException{
    if (getFridgeInfo == null)
      _initGetFridgeInfoProxy();
    return getFridgeInfo.getFridgeInfoStatus(fridgeinfoid);
  }
  
  
}