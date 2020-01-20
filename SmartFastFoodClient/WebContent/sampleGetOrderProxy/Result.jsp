<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetOrderProxyid" scope="session" class="web.services.GetOrderProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetOrderProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetOrderProxyid.getEndpoint();
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
        sampleGetOrderProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.GetOrder getGetOrder10mtemp = sampleGetOrderProxyid.getGetOrder();
if(getGetOrder10mtemp == null){
%>
<%=getGetOrder10mtemp %>
<%
}else{
        if(getGetOrder10mtemp!= null){
        String tempreturnp11 = getGetOrder10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id26");
        int id_1idTemp  = Integer.parseInt(id_1id);
        model.Order getOrderInfo13mtemp = sampleGetOrderProxyid.getOrderInfo(id_1idTemp);
if(getOrderInfo13mtemp == null){
%>
<%=getOrderInfo13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">contact:</TD>
<TD>
<%
if(getOrderInfo13mtemp != null){
java.lang.String typecontact16 = getOrderInfo13mtemp.getContact();
        String tempResultcontact16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontact16));
        %>
        <%= tempResultcontact16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">typeOfOrder:</TD>
<TD>
<%
if(getOrderInfo13mtemp != null){
java.lang.String typetypeOfOrder18 = getOrderInfo13mtemp.getTypeOfOrder();
        String tempResulttypeOfOrder18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetypeOfOrder18));
        %>
        <%= tempResulttypeOfOrder18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">note:</TD>
<TD>
<%
if(getOrderInfo13mtemp != null){
java.lang.String typenote20 = getOrderInfo13mtemp.getNote();
        String tempResultnote20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenote20));
        %>
        <%= tempResultnote20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">purchaser:</TD>
<TD>
<%
if(getOrderInfo13mtemp != null){
java.lang.String typepurchaser22 = getOrderInfo13mtemp.getPurchaser();
        String tempResultpurchaser22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepurchaser22));
        %>
        <%= tempResultpurchaser22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getOrderInfo13mtemp != null){
%>
<%=getOrderInfo13mtemp.getId()
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