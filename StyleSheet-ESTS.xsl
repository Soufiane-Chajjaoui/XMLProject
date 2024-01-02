<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>ESTS</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"/>
                <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
                <script>
                    $(document).ready(function(){
                    // jQuery function to handle click on the navbar brand
                    $(".nav-link").click(function(){
                    console.log("Clicked on " + $(this).text() + " link!");
                    
                    // Remove "active" class from all nav links
                    $(".nav-link").removeClass("active");
                    // Add "active" class to the clicked nav link
                    $(this).addClass("active");
                    
                    // Hide all card elements
                    $(".card").hide();
                    
                    // Show the specific card based on the clicked link
                    var linkText = $(this).text().toLowerCase();
                    $("#" + linkText + "Card").show();
                    });
                    });
                </script>
            </head>
            <body>
                <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                    <a class="navbar-brand" href="#">ESTS</a>
                    <div class="p-3">
                        <ul class="nav navbar-nav">
                            <li class="nav-item"><a class="nav-link active" href="#">Etablissments</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Enseignants</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Etudiants</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Inscription</a></li>
                        </ul>
                    </div>
                </nav>
                <div class="container mt-4">
                    <!-- Etablissments Card -->
                    <div class="card" id="etablissmentsCard">
                        <div class="card-header">List de Etablissments</div>
                        <div class="card-body">
                            <!-- Etablissments Table -->
                            <!-- Table Content -->
                        </div>
                    </div>
                    
                    <!-- Enseignants Card -->
                    <div class="card" id="enseignantsCard">
                        <div class="card-header">List de Enseignants</div>
                        <div class="card-body">
                            <!-- Enseignants Table -->
                            <!-- Table Content -->
                        </div>
                    </div>
                    
                    <!-- Etudiants Card -->
                    <div class="card" id="etudiantsCard">
                        <div class="card-header">List de Etudiants</div>
                        <div class="card-body">
                            <!-- Etudiants Table -->
                            <!-- Table Content -->
                        </div>
                    </div>
                    
                    <!-- Inscription Card -->
                    <div class="card" id="inscriptionCard">
                        <div class="card-header">Inscription Form</div>
                        <div class="card-body">
                            <!-- Inscription Form -->
                            <!-- Form Content -->
                        </div>
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
            </body>
        </html>
    </xsl:template>
</xsl:transform>
