<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetFoodStuffProxyid" scope="session" class="web.services.GetFoodStuffProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetFoodStuffProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetFoodStuffProxyid.getEndpoint();
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
        sampleGetFoodStuffProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.GetFoodStuff getGetFoodStuff10mtemp = sampleGetFoodStuffProxyid.getGetFoodStuff();
if(getGetFoodStuff10mtemp == null){
%>
<%=getGetFoodStuff10mtemp %>
<%
}else{
        if(getGetFoodStuff10mtemp!= null){
        String tempreturnp11 = getGetFoodStuff10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id24");
        int id_1idTemp  = Integer.parseInt(id_1id);
        model.FoodStuff getFoodStuffInfo13mtemp = sampleGetFoodStuffProxyid.getFoodStuffInfo(id_1idTemp);
if(getFoodStuffInfo13mtemp == null){
%>
<%=getFoodStuffInfo13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getFoodStuffInfo13mtemp != null){
java.lang.String typename16 = getFoodStuffInfo13mtemp.getName();
        String tempResultname16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename16));
        %>
        <%= tempResultname16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TD>
<%
if(getFoodStuffInfo13mtemp != null){
java.lang.String typeamount18 = getFoodStuffInfo13mtemp.getAmount();
        String tempResultamount18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeamount18));
        %>
        <%= tempResultamount18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">type:</TD>
<TD>
<%
if(getFoodStuffInfo13mtemp != null){
java.lang.String typetype20 = getFoodStuffInfo13mtemp.getType();
        String tempResulttype20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetype20));
        %>
        <%= tempResulttype20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getFoodStuffInfo13mtemp != null){
%>
<%=getFoodStuffInfo13mtemp.getId()
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