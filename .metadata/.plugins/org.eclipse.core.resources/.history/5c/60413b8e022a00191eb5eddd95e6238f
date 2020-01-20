<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAddFoodStuffProxyid" scope="session" class="web.services.AddFoodStuffProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAddFoodStuffProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleAddFoodStuffProxyid.getEndpoint();
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
        sampleAddFoodStuffProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        web.services.AddFoodStuff getAddFoodStuff10mtemp = sampleAddFoodStuffProxyid.getAddFoodStuff();
if(getAddFoodStuff10mtemp == null){
%>
<%=getAddFoodStuff10mtemp %>
<%
}else{
        if(getAddFoodStuff10mtemp!= null){
        String tempreturnp11 = getAddFoodStuff10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id16");
        int id_1idTemp  = Integer.parseInt(id_1id);
        String name_2id=  request.getParameter("name18");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String type_3id=  request.getParameter("type20");
            java.lang.String type_3idTemp = null;
        if(!type_3id.equals("")){
         type_3idTemp  = type_3id;
        }
        String amount_4id=  request.getParameter("amount22");
            java.lang.String amount_4idTemp = null;
        if(!amount_4id.equals("")){
         amount_4idTemp  = amount_4id;
        }
        sampleAddFoodStuffProxyid.createFoodStuff(id_1idTemp,name_2idTemp,type_3idTemp,amount_4idTemp);
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