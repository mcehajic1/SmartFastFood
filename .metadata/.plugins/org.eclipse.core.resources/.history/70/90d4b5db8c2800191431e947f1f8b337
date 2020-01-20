<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetRefrigeratorInfoProxyid" scope="session" class="web.services.GetRefrigeratorInfoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetRefrigeratorInfoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetRefrigeratorInfoProxyid.getEndpoint();
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
        sampleGetRefrigeratorInfoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.GetRefrigeratorInfo getGetRefrigeratorInfo10mtemp = sampleGetRefrigeratorInfoProxyid.getGetRefrigeratorInfo();
if(getGetRefrigeratorInfo10mtemp == null){
%>
<%=getGetRefrigeratorInfo10mtemp %>
<%
}else{
        if(getGetRefrigeratorInfo10mtemp!= null){
        String tempreturnp11 = getGetRefrigeratorInfo10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String refrigeratorinfoid_1id=  request.getParameter("refrigeratorinfoid22");
        int refrigeratorinfoid_1idTemp  = Integer.parseInt(refrigeratorinfoid_1id);
        model.RefrigeratorInfo getRefrigeratorInfoStatus13mtemp = sampleGetRefrigeratorInfoProxyid.getRefrigeratorInfoStatus(refrigeratorinfoid_1idTemp);
if(getRefrigeratorInfoStatus13mtemp == null){
%>
<%=getRefrigeratorInfoStatus13mtemp %>
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
if(getRefrigeratorInfoStatus13mtemp != null){
java.lang.String typetemperature16 = getRefrigeratorInfoStatus13mtemp.getTemperature();
        String tempResulttemperature16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetemperature16));
        %>
        <%= tempResulttemperature16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workingTime:</TD>
<TD>
<%
if(getRefrigeratorInfoStatus13mtemp != null){
java.lang.String typeworkingTime18 = getRefrigeratorInfoStatus13mtemp.getWorkingTime();
        String tempResultworkingTime18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeworkingTime18));
        %>
        <%= tempResultworkingTime18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">refrigeratorId:</TD>
<TD>
<%
if(getRefrigeratorInfoStatus13mtemp != null){
%>
<%=getRefrigeratorInfoStatus13mtemp.getRefrigeratorId()
%><%}%>
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