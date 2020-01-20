package web.services;

public class AddRoomInfoProxy implements web.services.AddRoomInfo {
  private String _endpoint = null;
  private web.services.AddRoomInfo addRoomInfo = null;
  
  public AddRoomInfoProxy() {
    _initAddRoomInfoProxy();
  }
  
  public AddRoomInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddRoomInfoProxy();
  }
  
  private void _initAddRoomInfoProxy() {
    try {
      addRoomInfo = (new web.services.AddRoomInfoServiceLocator()).getaddRoomInfo();
      if (addRoomInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addRoomInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addRoomInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addRoomInfo != null)
      ((javax.xml.rpc.Stub)addRoomInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.AddRoomInfo getAddRoomInfo() {
    if (addRoomInfo == null)
      _initAddRoomInfoProxy();
    return addRoomInfo;
  }
  
  public void createRoomInfo(int roomId, java.lang.String roomTemp, java.lang.String humidity, java.lang.String gas, java.lang.String oxigenLevel) throws java.rmi.RemoteException{
    if (addRoomInfo == null)
      _initAddRoomInfoProxy();
    addRoomInfo.createRoomInfo(roomId, roomTemp, humidity, gas, oxigenLevel);
  }
  
  
}