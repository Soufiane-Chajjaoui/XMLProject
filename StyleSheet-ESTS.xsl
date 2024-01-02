<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>ESTS</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"></link>
                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous"/>
                <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"/>
                <script>
                    $(document).ready(function(){
                    $(".card").hide();
                    $("#etablissmentsCard").show();
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
                <style>
                    a , i {
                        cursor: pointer;
                    }
                </style>
            </head>
            <body>
                <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                    <a class="navbar-brand" href="#">ESTS</a>
                    <div class="p-3">
                        <ul class="nav navbar-nav">
                            <li class="nav-item"><a class="nav-link active" rel="noopener noreferrer" >Etablissments</a></li>
                            <li class="nav-item"><a class="nav-link" rel="noopener noreferrer" >Enseignants</a></li>
                            <li class="nav-item"><a class="nav-link" rel="noopener noreferrer" >Etudiants</a></li>
                            <li class="nav-item"><a class="nav-link" rel="noopener noreferrer" >Inscription</a></li>
                        </ul>
                    </div>
                </nav>
                <div class="container mt-4">
                    <!-- Etablissments Card -->
                    <div class="card" id="etablissmentsCard">
                        <div class="card-header">List de Etablissments</div>
                        <div class="card-body">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Etablissment</th>
                                        <th scope="col">Vile</th>
                                        <th scope="col" class="text-center">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <xsl:for-each select="Universite/Etablissments/Etablissment">
                                        <tr>
                                            <td><xsl:value-of select="@idEtablissment"/></td>
                                            <td><xsl:value-of select="@NomEtablissment"/></td>
                                            <td><xsl:value-of select="@VileEtablissment"/></td>
                                            <td class="d-flex justify-content-around">
                                                <i class="fas fa-pen"></i>
                                                <i class="fas fa-trash"></i>
                                            </td>
                                        </tr>                        
                                    </xsl:for-each>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <!-- Enseignants Card -->
                    <div class="card" id="enseignantsCard">
                        <div class="card-header">List de Enseignants</div>
                        <div class="card-body">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Etablissment</th>
                                        <th scope="col">Vile</th>
                                        <th scope="col">Telephone</th>
                                        <th scope="col">address</th>
                                        <th scope="col">Enseigner</th>
                                        <th scope="col" class="text-center">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <xsl:for-each select="/Universite/Etablissments/Etablissment/Enseignants/Enseignant">
                                        <tr>
                                            <td><xsl:value-of select="@idPerson"/></td>
                                            <td><xsl:value-of select="Nom"/></td>
                                            <td><xsl:value-of select="Prenom"/></td>
                                            <td><xsl:value-of select="Telephone"/></td>
                                            <td><xsl:value-of select="address"/></td>
                                            <td><xsl:for-each select="Matiers/Matier">
                                                <xsl:value-of select="."/>
                                                <xsl:if test="position() &lt; last()"> + </xsl:if>
                                            </xsl:for-each></td>
                                            <td class="d-flex justify-content-around">
                                                <i class="fas fa-pen"></i>
                                                <i class="fas fa-trash"></i>
                                            </td>
                                        </tr>                        
                                    </xsl:for-each>
                                </tbody>
                            </table>
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
              <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
                
            </body>
        </html>
    </xsl:template>
</xsl:transform>
