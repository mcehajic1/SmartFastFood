<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAddRoomInfoProxyid" scope="session" class="web.services.AddRoomInfoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAddRoomInfoProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAddRoomInfoProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAddRoomInfoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.AddRoomInfo getAddRoomInfo10mtemp = sampleAddRoomInfoProxyid.getAddRoomInfo();
if(getAddRoomInfo10mtemp == null){
%>
<%=getAddRoomInfo10mtemp %>
<%
}else{
        if(getAddRoomInfo10mtemp!= null){
        String tempreturnp11 = getAddRoomInfo10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String roomId_1id=  request.getParameter("roomId16");
        int roomId_1idTemp  = Integer.parseInt(roomId_1id);
        String roomTemp_2id=  request.getParameter("roomTemp18");
            java.lang.String roomTemp_2idTemp = null;
        if(!roomTemp_2id.equals("")){
         roomTemp_2idTemp  = roomTemp_2id;
        }
        String humidity_3id=  request.getParameter("humidity20");
            java.lang.String humidity_3idTemp = null;
        if(!humidity_3id.equals("")){
         humidity_3idTemp  = humidity_3id;
        }
        String gas_4id=  request.getParameter("gas22");
            java.lang.String gas_4idTemp = null;
        if(!gas_4id.equals("")){
         gas_4idTemp  = gas_4id;
        }
        String oxigenLevel_5id=  request.getParameter("oxigenLevel24");
            java.lang.String oxigenLevel_5idTemp = null;
        if(!oxigenLevel_5id.equals("")){
         oxigenLevel_5idTemp  = oxigenLevel_5id;
        }
        sampleAddRoomInfoProxyid.createRoomInfo(roomId_1idTemp,roomTemp_2idTemp,humidity_3idTemp,gas_4idTemp,oxigenLevel_5idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>