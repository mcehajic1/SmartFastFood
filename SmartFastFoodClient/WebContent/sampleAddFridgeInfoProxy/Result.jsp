<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAddFridgeInfoProxyid" scope="session" class="web.services.AddFridgeInfoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAddFridgeInfoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleAddFridgeInfoProxyid.getEndpoint();
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
        sampleAddFridgeInfoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.AddFridgeInfo getAddFridgeInfo10mtemp = sampleAddFridgeInfoProxyid.getAddFridgeInfo();
if(getAddFridgeInfo10mtemp == null){
%>
<%=getAddFridgeInfo10mtemp %>
<%
}else{
        if(getAddFridgeInfo10mtemp!= null){
        String tempreturnp11 = getAddFridgeInfo10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String fridgeInfoId_1id=  request.getParameter("fridgeInfoId16");
        int fridgeInfoId_1idTemp  = Integer.parseInt(fridgeInfoId_1id);
        String temperature_2id=  request.getParameter("temperature18");
            java.lang.String temperature_2idTemp = null;
        if(!temperature_2id.equals("")){
         temperature_2idTemp  = temperature_2id;
        }
        String workingTime_3id=  request.getParameter("workingTime20");
            java.lang.String workingTime_3idTemp = null;
        if(!workingTime_3id.equals("")){
         workingTime_3idTemp  = workingTime_3id;
        }
        sampleAddFridgeInfoProxyid.createFridgeInfo(fridgeInfoId_1idTemp,temperature_2idTemp,workingTime_3idTemp);
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