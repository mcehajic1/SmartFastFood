package web.services;

public class GetRoomInfoProxy implements web.services.GetRoomInfo {
  private String _endpoint = null;
  private web.services.GetRoomInfo getRoomInfo = null;
  
  public GetRoomInfoProxy() {
    _initGetRoomInfoProxy();
  }
  
  public GetRoomInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetRoomInfoProxy();
  }
  
  private void _initGetRoomInfoProxy() {
    try {
      getRoomInfo = (new web.services.GetRoomInfoServiceLocator()).getgetRoomInfo();
      if (getRoomInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getRoomInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getRoomInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getRoomInfo != null)
      ((javax.xml.rpc.Stub)getRoomInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.GetRoomInfo getGetRoomInfo() {
    if (getRoomInfo == null)
      _initGetRoomInfoProxy();
    return getRoomInfo;
  }
  
  public model.RoomInfo getRoomInfoStatus(int roomid) throws java.rmi.RemoteException{
    if (getRoomInfo == null)
      _initGetRoomInfoProxy();
    return getRoomInfo.getRoomInfoStatus(roomid);
  }
  
  
}