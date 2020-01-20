package web.services;

public class AddFridgeInfoProxy implements web.services.AddFridgeInfo {
  private String _endpoint = null;
  private web.services.AddFridgeInfo addFridgeInfo = null;
  
  public AddFridgeInfoProxy() {
    _initAddFridgeInfoProxy();
  }
  
  public AddFridgeInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddFridgeInfoProxy();
  }
  
  private void _initAddFridgeInfoProxy() {
    try {
      addFridgeInfo = (new web.services.AddFridgeInfoServiceLocator()).getaddFridgeInfo();
      if (addFridgeInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addFridgeInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addFridgeInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addFridgeInfo != null)
      ((javax.xml.rpc.Stub)addFridgeInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.AddFridgeInfo getAddFridgeInfo() {
    if (addFridgeInfo == null)
      _initAddFridgeInfoProxy();
    return addFridgeInfo;
  }
  
  public void createFridgeInfo(int fridgeInfoId, java.lang.String temperature, java.lang.String workingTime) throws java.rmi.RemoteException{
    if (addFridgeInfo == null)
      _initAddFridgeInfoProxy();
    addFridgeInfo.createFridgeInfo(fridgeInfoId, temperature, workingTime);
  }
  
  
}