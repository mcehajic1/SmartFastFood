<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSsmkTestSoapProxyid" scope="session" class="ssmk.example.SsmkTestSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSsmkTestSoapProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleSsmkTestSoapProxyid.getEndpoint();
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
        sampleSsmkTestSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ssmk.example.SsmkTestSoap getSsmkTestSoap10mtemp = sampleSsmkTestSoapProxyid.getSsmkTestSoap();
if(getSsmkTestSoap10mtemp == null){
%>
<%=getSsmkTestSoap10mtemp %>
<%
}else{
        if(getSsmkTestSoap10mtemp!= null){
        String tempreturnp11 = getSsmkTestSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String customerID_1id=  request.getParameter("customerID16");
            java.lang.String customerID_1idTemp = null;
        if(!customerID_1id.equals("")){
         customerID_1idTemp  = customerID_1id;
        }
        java.lang.String[] getCustomer13mtemp = sampleSsmkTestSoapProxyid.getCustomer(customerID_1idTemp);
if(getCustomer13mtemp == null){
%>
<%=getCustomer13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(getCustomer13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(getCustomer13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
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