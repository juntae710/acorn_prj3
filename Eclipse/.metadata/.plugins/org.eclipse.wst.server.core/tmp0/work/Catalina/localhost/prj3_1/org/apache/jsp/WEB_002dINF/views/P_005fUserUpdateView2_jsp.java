/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-20 01:04:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import prj3_1.P_Customer;

public final class P_005fUserUpdateView2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("prj3_1.P_Customer");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function select() {\r\n");
      out.write("		//$.ajax();  ( ) 인자정보를 객체타입으로 제공\r\n");
      out.write("		$.ajax({\r\n");
      out.write("					type : \"get\",\r\n");
      out.write("					dataType : \"json\",\r\n");
      out.write("					url : \"/prj3_1/UUA2.do\",\r\n");
      out.write("					success : function(data) {\r\n");
      out.write("						console.log(data);\r\n");
      out.write("						output = '';\r\n");
      out.write("							output += '아이디: <input id=\"id\" type=\"text\" value=\"' + data.id + '\" readonly=\"readonly\" ><br>';\r\n");
      out.write("							output += '비밀번호: <input id=\"pw\" type=\"text\" value=\"' + data.pw + '\"  ><br>';\r\n");
      out.write("							output += '이름: <input id=\"name\" type=\"text\" value=\"' + data.name + '\"readonly=\"readonly\"  ><br>';\r\n");
      out.write("							output += '전화번호: <input id=\"phone\" type=\"text\" value=\"' + data.phone + '\"  ><br>';\r\n");
      out.write("							output += '성별: <input id=\"gender\" type=\"text\" value=\"' + data.gender + '\" readonly=\"readonly\" ><br>';\r\n");
      out.write("							output += '<td><button onclick=\"update(this)\">수정하기</button></td>	</tr>';\r\n");
      out.write("						\r\n");
      out.write("						document.getElementById('disp').innerHTML = output;\r\n");
      out.write("					},\r\n");
      out.write("					error : function() {\r\n");
      out.write("						alert(\"요청실패\");\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("	}  // select\r\n");
      out.write("	function update(obj) {		\r\n");
      out.write("	   \r\n");
      out.write("	   let  div = obj.parentElement;\r\n");
      out.write("	   let id =  div.querySelector(\"#id\").value;\r\n");
      out.write("	   let pw =  div.querySelector(\"#pw\").value;\r\n");
      out.write("	   let name =  div.querySelector(\"#name\").value;\r\n");
      out.write("	   let phone =  div.querySelector(\"#phone\").value;\r\n");
      out.write("	   let gender =  div.querySelector(\"#gender\").value;\r\n");
      out.write("	   \r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type:'post',\r\n");
      out.write("			dataType:'text',\r\n");
      out.write("			data: \"id=\" + id + \"&pw=\" + pw + \"&name=\" + name + \"&phone=\" + phone + \"&gender=\" + gender,			\r\n");
      out.write("			url:\"/prj3_1/UUA2.do\",\r\n");
      out.write("			success: function(data){\r\n");
      out.write("				alert(data);\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err){\r\n");
      out.write("				alert(\"요청에 실패 했습니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<button onclick=\"select()\">\r\n");
      out.write("		<h2>수정할려면 클릭</h2>\r\n");
      out.write("	</button>\r\n");
      out.write("<form  action=\"");
      out.print(request.getContextPath());
      out.write("/smain\" method=\"get\" >\r\n");
      out.write(" <button>조회</button>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("	<div id=\"disp\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
