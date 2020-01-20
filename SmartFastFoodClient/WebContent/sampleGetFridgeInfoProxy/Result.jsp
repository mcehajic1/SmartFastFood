<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetFridgeInfoProxyid" scope="session" class="web.services.GetFridgeInfoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetFridgeInfoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetFridgeInfoProxyid.getEndpoint();
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
        sampleGetFridgeInfoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.GetFridgeInfo getGetFridgeInfo10mtemp = sampleGetFridgeInfoProxyid.getGetFridgeInfo();
if(getGetFridgeInfo10mtemp == null){
%>
<%=getGetFridgeInfo10mtemp %>
<%
}else{
        if(getGetFridgeInfo10mtemp!= null){
        String tempreturnp11 = getGetFridgeInfo10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String fridgeinfoid_1id=  request.getParameter("fridgeinfoid22");
        int fridgeinfoid_1idTemp  = Integer.parseInt(fridgeinfoid_1id);
        model.FridgeInfo getFridgeInfoStatus13mtemp = sampleGetFridgeInfoProxyid.getFridgeInfoStatus(fridgeinfoid_1idTemp);
if(getFridgeInfoStatus13mtemp == null){
%>
<%=getFridgeInfoStatus13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">temperature:</TD>
<TD>
<%
if(getFridgeInfoStatus13mtemp != null){
java.lang.String typetemperature16 = getFridgeInfoStatus13mtemp.getTemperature();
        String tempResulttemperature16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetemperature16));
        %>
        <%= tempResulttemperature16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fridgeInfoId:</TD>
<TD>
<%
if(getFridgeInfoStatus13mtemp != null){
%>
<%=getFridgeInfoStatus13mtemp.getFridgeInfoId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workingTime:</TD>
<TD>
<%
if(getFridgeInfoStatus13mtemp != null){
java.lang.String typeworkingTime20 = getFridgeInfoStatus13mtemp.getWorkingTime();
        String tempResultworkingTime20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeworkingTime20));
        %>
        <%= tempResultworkingTime20 %>
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