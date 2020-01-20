package web.services;

public class GetFoodStuffProxy implements web.services.GetFoodStuff {
  private String _endpoint = null;
  private web.services.GetFoodStuff getFoodStuff = null;
  
  public GetFoodStuffProxy() {
    _initGetFoodStuffProxy();
  }
  
  public GetFoodStuffProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetFoodStuffProxy();
  }
  
  private void _initGetFoodStuffProxy() {
    try {
      getFoodStuff = (new web.services.GetFoodStuffServiceLocator()).getgetFoodStuff();
      if (getFoodStuff != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getFoodStuff)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getFoodStuff)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getFoodStuff != null)
      ((javax.xml.rpc.Stub)getFoodStuff)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.GetFoodStuff getGetFoodStuff() {
    if (getFoodStuff == null)
      _initGetFoodStuffProxy();
    return getFoodStuff;
  }
  
  public model.FoodStuff getFoodStuffInfo(int id) throws java.rmi.RemoteException{
    if (getFoodStuff == null)
      _initGetFoodStuffProxy();
    return getFoodStuff.getFoodStuffInfo(id);
  }
  
  
}