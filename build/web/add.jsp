<%-- 
    Document   : addBook
    Created on : 13 nov. 2022, 14:52:21
    Author     : lenovo
--%>

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
            <form method="GET" action="Servlet">
                <fieldset>
                    <legend>Add a book: </legend>

                    <table border="0">

                        <tr>
                            <td>Isbn:</td>
                            <td><input type="text" name="isbn" value="" /></td>
                        </tr>
                        <tr>
                            <td>Title:</td> 
                            <td><input type="text" name="title" value="" /></td>
                        </tr>
                        <tr>
                            <td>Edition date:</td>
                            <td><input type="Date" name="editionDate" value="" /></td>
                        </tr>
                        <tr>
                            <td>Author:</td>
                            <td><select name="author">
                                    <option value="1">Jeff Hawkins</option>
                                    <option value="2">Jordan Peterson</option>
                                    <option value="3">James Clear</option>
                                    <option value="4">Daniel Kahneman</option>
                                    <option value="5">Stephen R. Covey</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="submit" /></td>
                            <td></td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </body>

</html>