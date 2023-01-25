<%-- 
    Document   : contact
    Created on : 13 nov. 2022, 14:58:24
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

            <div class="container">
                <form action="contact.jsp">
                    <fieldset>
                        <table>
                            <tr>
                                <td>First Name</td>
                                <td>
                                    <input type="text" id="fname" name="firstname" placeholder="Your name..">
                                </td>
                            </tr>
                            <tr>
                                <td>Last Name</td>
                                <td>
                                    <input type="text" id="lname" name="lastname" placeholder="Your last name..">
                                </td>
                            </tr>
                            <tr>
                                <td>Country</td>
                                <td>
                                    <select id="country" name="country">
                                        <option value="australia">Morocco</option>
                                        <option value="canada">USA</option>
                                        <option value="usa">Canada</option>
                                        <option value="canada">Britain</option>
                                        <option value="usa">Other</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Subject</td>
                                <td>
                                    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" value="Submit">
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
            </div>
    </body>
</html>
