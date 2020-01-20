package web.services;

public class ItemProxy implements web.services.Item {
  private String _endpoint = null;
  private web.services.Item item = null;
  
  public ItemProxy() {
    _initItemProxy();
  }
  
  public ItemProxy(String endpoint) {
    _endpoint = endpoint;
    _initItemProxy();
  }
  
  private void _initItemProxy() {
    try {
      item = (new web.services.ItemServiceLocator()).getItem();
      if (item != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)item)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)item)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (item != null)
      ((javax.xml.rpc.Stub)item)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.Item getItem() {
    if (item == null)
      _initItemProxy();
    return item;
  }
  
  
}