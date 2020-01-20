package web.services;

public class AddRefrigeratorInfoProxy implements web.services.AddRefrigeratorInfo {
  private String _endpoint = null;
  private web.services.AddRefrigeratorInfo addRefrigeratorInfo = null;
  
  public AddRefrigeratorInfoProxy() {
    _initAddRefrigeratorInfoProxy();
  }
  
  public AddRefrigeratorInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddRefrigeratorInfoProxy();
  }
  
  private void _initAddRefrigeratorInfoProxy() {
    try {
      addRefrigeratorInfo = (new web.services.AddRefrigeratorInfoServiceLocator()).getaddRefrigeratorInfo();
      if (addRefrigeratorInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addRefrigeratorInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addRefrigeratorInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addRefrigeratorInfo != null)
      ((javax.xml.rpc.Stub)addRefrigeratorInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.AddRefrigeratorInfo getAddRefrigeratorInfo() {
    if (addRefrigeratorInfo == null)
      _initAddRefrigeratorInfoProxy();
    return addRefrigeratorInfo;
  }
  
  public void createRefrigeratorInfo(int refrigeratorInfoId, java.lang.String temperature, java.lang.String workingTime) throws java.rmi.RemoteException{
    if (addRefrigeratorInfo == null)
      _initAddRefrigeratorInfoProxy();
    addRefrigeratorInfo.createRefrigeratorInfo(refrigeratorInfoId, temperature, workingTime);
  }
  
  
}