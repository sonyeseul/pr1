/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-07-17 06:31:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jspbook.ch07.pr01.*;

public final class menu_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
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
    _jspx_imports_packages.add("jspbook.ch07.pr01");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String type;

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
    jspContext.setAttribute("type", type);
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getType() != null ) 
      _jspx_page_context.setAttribute("type", getType());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    ");
      jspbook.ch07.pr01.AddrManager am = null;
      synchronized (session) {
        am = (jspbook.ch07.pr01.AddrManager) _jspx_page_context.getAttribute("am", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (am == null){
          am = new jspbook.ch07.pr01.AddrManager();
          _jspx_page_context.setAttribute("am", am, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("    td {\r\n");
      out.write("border : 1px solid;\r\n");
      out.write("border-collapse : collapse;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");

String str = type;
String str2;
for(AddrBean ab: am.getAddrList()) {
	str2 = ab.getGroup();
	if(str2.equals(str)) {


      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(ab.getUsername() );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(ab.getTel() );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(ab.getEmail() );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(ab.getGender() );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(ab.getGroup() );
      out.write("</td><tr>\r\n");
      out.write("\r\n");

}
}

    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}