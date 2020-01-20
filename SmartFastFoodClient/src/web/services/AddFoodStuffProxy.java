package web.services;

public class AddFoodStuffProxy implements web.services.AddFoodStuff {
  private String _endpoint = null;
  private web.services.AddFoodStuff addFoodStuff = null;
  
  public AddFoodStuffProxy() {
    _initAddFoodStuffProxy();
  }
  
  public AddFoodStuffProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddFoodStuffProxy();
  }
  
  private void _initAddFoodStuffProxy() {
    try {
      addFoodStuff = (new web.services.AddFoodStuffServiceLocator()).getaddFoodStuff();
      if (addFoodStuff != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addFoodStuff)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addFoodStuff)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addFoodStuff != null)
      ((javax.xml.rpc.Stub)addFoodStuff)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.AddFoodStuff getAddFoodStuff() {
    if (addFoodStuff == null)
      _initAddFoodStuffProxy();
    return addFoodStuff;
  }
  
  public void createFoodStuff(int id, java.lang.String name, java.lang.String type, java.lang.String amount) throws java.rmi.RemoteException{
    if (addFoodStuff == null)
      _initAddFoodStuffProxy();
    addFoodStuff.createFoodStuff(id, name, type, amount);
  }
  
  
}