<%-- 
    Document   : search
    Created on : 13 nov. 2022, 14:37:11
    Author     : lenovo
--%>

<%@page import="javax.sound.midi.SysexMessage"%>
<%@page import="entities.Book"%>
<%@page import="service.BookService"%>
<%@page import="service.AuthorService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8" />
        <link href="style/style.css" rel="stylesheet" type="text/css"/>
        <title>Booky - book manager</title>
    </head>

    <body>
        <div id="bloc_page">
            <header>
                <div id="titre_principale">
                    <div id="logo">
                        <img src="style/images/book_logo.png" />
                        <h1>Booky</h1>
                    </div>
                    <h2>Book manager</h2>
                </div>
                <nav>
                    <ul>
                        <li><a href="http://localhost:8083/bookProject/home.jsp">Accueil</a></li>
                        <li><a href="http://localhost:8083/bookProject/search.jsp">Search a book</a></li>
                        <li><a href="http://localhost:8083/bookProject/add.jsp">Add a book</a></li>
                        <li><a href="http://localhost:8083/bookProject/contact.jsp">Contact</a></li>
                    </ul>
                </nav>

            </header>
            <form method="GET" action="search.jsp">
                <fieldset>
                    <legend>Book Table: </legend>
                    Name of the author: 
                    <select name="authors">
                        <option value="0"></option>
                        <option value="1">Jeff Hawkins</option>
                        <option value="2">Jordan Peterson</option>
                        <option value="3">James Clear</option>
                        <option value="4">Daniel Kahneman</option>
                        <option value="5">Stephen R. Covey</option>
                    </select>
                    <input type="submit" value="search" />  
                    <table border="2">
                        <br></br>
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Isbn</th>
                                <th>Title</th>
                                <th>EditionDate</th>
                                <th>Author</th>
                                <th>delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% AuthorService as = new AuthorService();
                                BookService bs = new BookService();
                                try {
                                    String authorname = request.getParameter("authors");
                                    if (Integer.parseInt(authorname)==0) {
                                        for (Book b : bs.getAllBooks()) {
                            %>
                            <tr>
                                <td><%=b.getId()%></td>
                                <td><%=b.getIsbn()%></td>
                                <td><%=b.getTitle()%></td>
                                <td><%=b.getEditionDate()%></td>
                                <td><%=b.getAuthor()%></td>
                                <td><a href="./DeleteEtudiant?id=<%=b.getId()%>">X</td>
                            </tr>
                        </tbody>

                        <%}
                        } else {
                             for (Book b : bs.getBooksByAuthor(as.getById(Integer.parseInt(authorname)))) {
                        %>
                        <tr>
                            <td><%=b.getId()%></td>
                            <td><%=b.getIsbn()%></td>
                            <td><%=b.getTitle()%></td>
                            <td><%=b.getEditionDate()%></td>
                            <td><%=b.getAuthor()%></td>
                        </tr>
                        </tbody>
                        <%
                                    }
                                }
                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }%>
                    </table>
                </fieldset>
            </form>
        </div>
    </body>

</html>

