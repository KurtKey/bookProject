<%-- 
    Document   : home
    Created on : 13 nov. 2022, 14:07:14
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
            <div id="banniere_image">
                <div id="banniere_description">
                    Tranding: Atomic Habits...
                    <a href="#" class="bouton_rouge">Book info <img src="style/images/flecheblanchedroite.png" alt="" /></a>
                </div>
            </div>
        </div>
    </body>

</html>
