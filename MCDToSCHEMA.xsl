<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>ESTS</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"></link>
                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous"/>
                <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
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
                    $("form").submit(function (event) {
                    // Prevent the default form submission
                    event.preventDefault();
                    var formData = {};
                    console.log($("#condid").val());
                    // Gather form data
                    var formData = {
                    prenom: $("#prenom").val(),
                    nom: $("#nom").val(),
                    email: $("#email").val(),
                    tele: $("#tele").val(),
                    address: $("#address").val(),
                    sex: $("#Sexe").val().toUpperCase(),
                    dateNaissance: $("#datenaiss").val(),
                    cne: $("#cne").val(),
                    bac: {
                       regional: $("#Regional").val(),
                       national: $("#National").val(),
                       specBac : $("#filiereBac").val(),
                       dateBac : $("#dateBac").val(),
                       mention : $("#mentionBac").val()
                    },
                    condidature : {
                       choix : $("#choix").val()
                    },
                    diplome : {
                       typeDiplome : $("#typeDiplome").val(),
                       mention : $("#mentionDiplome").val(),
                       filiereDiplome : $("#filiereDiplome").val() ,
                       notes1 : $("#notes1").val() ,
                       notes2 : $("#notes2").val() ,
                       notes3 : $("#notes3").val() ,
                       notes4 : $("#notes4").val() ,
                       validationFirstYear : $("#notesFirstYear").val() ,
                       validationSecondYear : $("#notesSecondYear").val() ,
                       nbretudiantsFirstYear : $("#nbretudiantsFirstYear").val(),
                       nbretudiantsSecondYear : $("#nbretudiantsSecondYear").val() ,
                       order : $("#Order").val() ,
                       noteDiplome : $("#noteDiplome").val()
                    }
                    
                    };
                    
                    
                    console.log(formData) ;
                    
                    $.ajax({
                    type: "POST",
                    url: "http://localhost:8080/Etudiants", // Replace with your actual API endpoint
                    contentType: "application/json",
                    data: JSON.stringify(formData),
                    success: function (response) {
                    console.log("Data sent successfully:", response);
                    // You can perform additional actions here if needed
                    },
                    error: function (xhr, status, error) {
                    console.error("Error sending data:");
                    console.error("Status:", status);
                    console.error("Error:", error);
                    console.error("Response Text:", xhr.responseText);
                    // You can perform additional actions here if needed
                    }
                    });
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
                            <li class="nav-item"><a class="nav-link" rel="noopener noreferrer" >Etudiants</a></li>
                            <li class="nav-item"><a class="nav-link" rel="noopener noreferrer" >Inscription</a></li>
                        </ul>
                    </div>
                </nav>
                <div class="container mt-4 mb-4">

                    <!-- Enseignants Card -->
                    <div class="card" id="enseignantsCard">
                        <div class="card-header">
                            <div class="d-flex justify-content-between">
                                <h3 class="card-title">List de Enseignants</h3>
                                <button type="button" class="btn btn-outline-secondary">Ajoute Enseignant</button>
                            </div>
                        </div>
                        <div class="card-body">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Nom</th>
                                        <th scope="col">Prenom</th>
                                        <th scope="col">Telephone</th>
                                        <th scope="col">email</th>
                                        <th scope="col">address</th>
                                        
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
                                            <td><xsl:value-of select="email"/></td>
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
                    
                    <!-- Inscription Card -->
                    <div class="card" id="inscriptionCard">
                        <div class="card-header">
                            <h3 class="card-title">
                                Inscription Form
                            </h3>
                        </div>
                        <div class="card-body">
                            <form>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="prenom">Prenom</label>
                                        <input type="text" class="form-control" id="prenom" />
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="nom">Nom</label>
                                        <input type="text" class="form-control" id="nom"/>
                                    </div>
                                </div>
                                <div class="form-row">
                                     <div class="col-md-6 mb-3">
                                         <label for="email">Email</label>
                                         <input type="email" class="form-control" id="email"/>
                                     </div>
                                     <div class="col-md-6 mb-3">
                                         <label for="tele">Telephone</label>
                                         <input type="tel" class="form-control" id="tele"/>
                                     </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="address">Address</label>
                                        <input type="text" class="form-control" id="address"/>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="datenaiss">Date de Naissance</label>
                                        <input type="date" class="form-control" id="datenaiss"/>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="Sexe">Sexe</label>
                                        <select class="custom-select" id="Sexe">
                                            <option  value="HOMME">Homme</option>
                                            <option  value="FEMME">Femme</option>
                                        </select>
                                    </div>
                                </div>
                                <hr></hr>
                                <div class="form-row">
                                    <div class="col-md-4 mb-4">
                                        <label for="national">CNE</label>
                                        <input type="text" maxlength="10"  class="form-control" id="cne" required="true"/>
                                    </div>
                                    <div class="col-md-4 mb-4">
                                        <label for="national">Mention Bac</label>
                                        <select class="custom-select" id="mentionBac"  >
                                            <option value="PASSABLE">PASSABLE</option>
                                            <option value="ASSEZ_BIEN" selected="true">ASSEZ BIEN</option>
                                            <option value="BIEN" >BIEN</option>
                                            <option value="TRES_BIEN">TRES BIEN</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="filiere">Filiere Bac</label>
                                        <select class="custom-select" id="filiereBac"  >
                                            <option value="SMB">BAC SCIENCES MATHÉMATIQUES B.</option>
                                            <option value="PC">BAC SCIENCES PHYSIQUES.</option>
                                            <option value="SVT">BAC SVT.</option>
                                            <option value="SMA">BAC SCIENCES MATHÉMATIQUES A.</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label for="dateBac">Date Obtenir</label>
                                        <input type="text" class="form-control" id="dateBac"  />
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="regional">Regional</label>
                                        <input type="number" min="6" max="20" class="form-control" id="Regional"/>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="national">National</label>
                                        <input type="number" max="20" min="10" class="form-control" id="National"/>
                                    </div>
                                </div>
                                <hr></hr>
                                <div class="form-row">
                                    <div class="col-md-4 mb-3">
                                        <label for="etablissment">Type Diplome</label>
                                        <select class="custom-select" id="typeDiplome">
                                            <option value="DUT">DUT</option>
                                            <option value="BTS">BTS</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="filiere">Filiere Diplome</label>
                                        <select class="custom-select" id="filiereDiplome">
                                            <option  value="GENIE_INDUSTRIELLE">GENIE INDUSTRIELLE</option>
                                            <option  value="TECHNIQUE_MANAGEMENT">TECHNIQUE MANAGEMENT</option>
                                            <option  value="GENIE_INFORMATIQUE">GENIE INFORMATIQUE</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4 mb-4">
                                        <label for="mentionDiplome">Mention Diplome</label>
                                        <select class="custom-select" id="mentionDiplome"  >
                                            <option value="PASSABLE">PASSABLE</option>
                                            <option value="ASSEZ_BIEN" selected="true">ASSEZ BIEN</option>
                                            <option value="BIEN" >BIEN</option>
                                            <option value="TRES_BIEN">TRES BIEN</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-2 mb-3">
                                        <label >Note S1</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notes1"/>
                                    </div>
                                    <div class="col-md-2 mb-3">
                                        <label >Note S2</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notes2"/>
                                    </div>
                                    <div class="col-md-2 mb-3">
                                        <label >Note S3</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notes3"/>
                                    </div>                                   
                                    <div class="col-md-2 mb-3">
                                        <label >Note S4</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notes4"/>
                                    </div>
                                    <div class="col-md-2 mb-3">
                                        <label >Note Premier annee</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notesFirstYear"/>
                                    </div>
                                    <div class="col-md-2 mb-3">
                                        <label for="etablissment">Note 2eme annee</label>
                                        <input type="text" min="10" max="20" class="form-control" id="notesSecondYear"/>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <label>number Etudiants 1 annee</label>
                                        <input type="number" class="form-control" id="nbretudiantsFirstYear" />
                                    </div>
                                    <div class="col-sm-3">
                                        <label>number Etudiants 2 annee</label>
                                        <input type="number" class="form-control" id="nbretudiantsSecondYear" />
                                    </div>
                                    <div class="col-sm-3">
                                        <label>Order</label>
                                        <input type="number" class="form-control" id="Order" />
                                    </div>
                                    <div class="col-md-3">
                                        <label>Note Diplome</label>
                                        <input type="text" class="form-control" id="noteDiplome" />
                                    </div>
                                </div>
                                <hr></hr>
                                <div class="form-row">
                                    <div class="col-5">
                                        <label >Condidatue</label>
                                        <select class="form-control" multiple="true" id="choix">
                                            <option value="ISIR">ISIR</option>
                                            <option value="TM">TM</option>
                                            <option value="ITIMQ">ITIMQ</option>
                                        </select>
                                    </div>
                                </div>
                                <hr></hr>
                                <div class="d-flex justify-content-center">
                                    <button class="btn btn-primary" type="submit">Ajoute</button>
                                </div>
                            </form>
                        </div>
                    </div>
                    
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
                
            </body>
        </html>
    </xsl:template>
</xsl:transform>
