package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.sound.midi.SysexMessage;
import entities.Book;
import service.BookService;
import service.AuthorService;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <link href=\"style/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Booky - book shop</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"bloc_page\">\n");
      out.write("            <header>\n");
      out.write("                <div id=\"titre_principale\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <img src=\"style/images/book_logo.png\" />\n");
      out.write("                        <h1>Booky</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <h2>Book finder</h2>\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"http://localhost:8083/bookProject/home.jsp\">Accueil</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8083/bookProject/search.jsp\">Search a book</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8083/bookProject/add.jsp\">Add a book</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8083/bookProject/contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("            <form method=\"GET\" action=\"search.jsp\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Book Table: </legend>\n");
      out.write("                    Name of the author: \n");
      out.write("                    <select name=\"authors\">\n");
      out.write("                        <option value=\"0\"></option>\n");
      out.write("                        <option value=\"1\">Jeff Hawkins</option>\n");
      out.write("                        <option value=\"2\">Jordan Peterson</option>\n");
      out.write("                        <option value=\"3\">James Clear</option>\n");
      out.write("                        <option value=\"4\">Daniel Kahneman</option>\n");
      out.write("                        <option value=\"5\">Stephen R. Covey</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"submit\" value=\"search\" />  \n");
      out.write("                    <table border=\"2\">\n");
      out.write("                        <br></br>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Id</th>\n");
      out.write("                                <th>Isbn</th>\n");
      out.write("                                <th>Title</th>\n");
      out.write("                                <th>EditionDate</th>\n");
      out.write("                                <th>Author</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 AuthorService as = new AuthorService();
                                BookService bs = new BookService();
                                try {
                                    String authorname = request.getParameter("authors");
                                    if (Integer.parseInt(authorname)!= 1) {
                                        for (Book b : bs.getAllBooks()) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(b.getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(b.getIsbn());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(b.getTitle());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(b.getEditionDate());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(b.getAuthor().getLastName());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                        ");
}
                        } else {
                             for (Book b : bs.getBooksByAuthor(as.getById(Integer.parseInt(authorname)))) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(b.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(b.getIsbn());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(b.getTitle());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(b.getEditionDate());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(b.getAuthor().getLastName());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                        ");

                                    }
                                }
                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
