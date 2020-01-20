<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAddOrderProxyid" scope="session" class="web.services.AddOrderProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAddOrderProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleAddOrderProxyid.getEndpoint();
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
        sampleAddOrderProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.AddOrder getAddOrder10mtemp = sampleAddOrderProxyid.getAddOrder();
if(getAddOrder10mtemp == null){
%>
<%=getAddOrder10mtemp %>
<%
}else{
        if(getAddOrder10mtemp!= null){
        String tempreturnp11 = getAddOrder10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id16");
        int id_1idTemp  = Integer.parseInt(id_1id);
        String typeOfOrder_2id=  request.getParameter("typeOfOrder18");
            java.lang.String typeOfOrder_2idTemp = null;
        if(!typeOfOrder_2id.equals("")){
         typeOfOrder_2idTemp  = typeOfOrder_2id;
        }
        String purchaser_3id=  request.getParameter("purchaser20");
            java.lang.String purchaser_3idTemp = null;
        if(!purchaser_3id.equals("")){
         purchaser_3idTemp  = purchaser_3id;
        }
        String contact_4id=  request.getParameter("contact22");
            java.lang.String contact_4idTemp = null;
        if(!contact_4id.equals("")){
         contact_4idTemp  = contact_4id;
        }
        String note_5id=  request.getParameter("note24");
            java.lang.String note_5idTemp = null;
        if(!note_5id.equals("")){
         note_5idTemp  = note_5id;
        }
        sampleAddOrderProxyid.createOrder(id_1idTemp,typeOfOrder_2idTemp,purchaser_3idTemp,contact_4idTemp,note_5idTemp);
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