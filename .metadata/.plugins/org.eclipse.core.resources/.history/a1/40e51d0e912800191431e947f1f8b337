<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetRoomInfoProxyid" scope="session" class="web.services.GetRoomInfoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetRoomInfoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetRoomInfoProxyid.getEndpoint();
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
        sampleGetRoomInfoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.GetRoomInfo getGetRoomInfo10mtemp = sampleGetRoomInfoProxyid.getGetRoomInfo();
if(getGetRoomInfo10mtemp == null){
%>
<%=getGetRoomInfo10mtemp %>
<%
}else{
        if(getGetRoomInfo10mtemp!= null){
        String tempreturnp11 = getGetRoomInfo10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String roomid_1id=  request.getParameter("roomid28");
        int roomid_1idTemp  = Integer.parseInt(roomid_1id);
        model.RoomInfo getRoomInfoStatus13mtemp = sampleGetRoomInfoProxyid.getRoomInfoStatus(roomid_1idTemp);
if(getRoomInfoStatus13mtemp == null){
%>
<%=getRoomInfoStatus13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">roomTemp:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
java.lang.String typeroomTemp16 = getRoomInfoStatus13mtemp.getRoomTemp();
        String tempResultroomTemp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeroomTemp16));
        %>
        <%= tempResultroomTemp16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">oxigenLevel:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
java.lang.String typeoxigenLevel18 = getRoomInfoStatus13mtemp.getOxigenLevel();
        String tempResultoxigenLevel18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeoxigenLevel18));
        %>
        <%= tempResultoxigenLevel18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">roomid:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
%>
<%=getRoomInfoStatus13mtemp.getRoomid()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">roomId:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
%>
<%=getRoomInfoStatus13mtemp.getRoomId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">humidity:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
java.lang.String typehumidity24 = getRoomInfoStatus13mtemp.getHumidity();
        String tempResulthumidity24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehumidity24));
        %>
        <%= tempResulthumidity24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">gas:</TD>
<TD>
<%
if(getRoomInfoStatus13mtemp != null){
java.lang.String typegas26 = getRoomInfoStatus13mtemp.getGas();
        String tempResultgas26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegas26));
        %>
        <%= tempResultgas26 %>
        <%
}%>
</TD>
</TABLE>
<%
}
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