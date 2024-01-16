# Spring Boot Avec JaxB

# Contexte

La communication entre systèmes distribués et la nécessité de stocker des données de manière persistante sont des défis courants dans le développement d'applications modernes. L'utilisation d'un format standard tel que XML pour représenter ces données facilite l'interopérabilité et garantit une lisibilité humaine des informations stockées.

Java Architecture for XML Binding `JAXB` est une spécification qui permet de faire correspondre un document XML à un ensemble de classes et vice versa au moyen d'opérations de sérialisation/désérialisation nommées marshalling/unmarshalling.

# **Objectifs du Projet**

1. **Persistance des Objets avec JaxB :** Le projet vise à démontrer comment utiliser la bibliothèque JaxB pour convertir des objets Java complexes en format XML et vice versa, permettant ainsi la persistance de données dans des fichiers XML.
2. **Intégration avec Spring Boot :** L'intégration de JaxB sera réalisée dans le contexte de Java Spring Boot, un framework réputé pour sa facilité de configuration et son support complet du développement d'applications RESTful.
3. **Manipulation des Données XML :** En plus de la persistance, le projet illustrera comment manipuler et extraire des informations à partir des fichiers XML à l'aide des fonctionnalités fournies par JaxB.

# Creation d’un **Projet Spring Boot**

nous utilisons Spring Initializer pour générer un projet Spring Boot avec les dépendances nécessaires. Suivez ces étapes :

1. Accédez à [Spring Initializer](https://start.spring.io/).
2. Remplissez les champs comme suit 
    
    **Project:** Maven Project (Ce choise pour Automatisation Votre Projet)
    
    **Language:** Java 
    
    **Spring Boot:** Choisissez la version la plus récente. 
    
    **Group:** com.example (ou votre nom de groupe habituel)
    
    **Artifact:** demo (ou le nom de votre application)
    
    **Dependencies:** Recherchez "Spring Web" et ajoutez cette dépendance (Pour `RestFul` et plusieurs de choise `Tomcat` ce dernier est Web Container ). 
    
3. Cliquez sur le bouton "Generate" pour télécharger le projet zip généré.
4. Décompressez le fichier zip dans le répertoire de votre choix.
5. Importez le projet dans votre IDE de développement (Eclipse, IntelliJ, etc.). 

maintenant vous etez avoir Projet Spring Boot.

# **Configuration de JaxB dans le Projet Spring Boot**

Dans votre projet Spring Boot généré, suivez ces étapes pour configurer JaxB :

1. Ouvrez le fichier `pom.xml` à la racine de votre projet.
2. Assurez-vous que la dépendance `JaxB` est présente. Ajoutez-la si elle n'est pas déjà incluse. Vérifiez également que la version correspond à vos besoins.

```xml
<!--		API Implementation JAXB-->
		<dependency>
			<groupId>com.sun.xml.bind</groupId>
			<artifactId>jaxb-impl</artifactId>
			<version>2.3.3</version>
			<scope>runtime</scope>
		</dependency>

<!--		API reference JAXB-->
		<dependency>
			<groupId>jakarta.xml.bind</groupId>
			<artifactId>jakarta.xml.bind-api</artifactId>
			<version>2.3.3</version>
		</dependency>
```

Apres Ajout ceux dependeces on va reload maven pour include ceux dependeces dans cache pour facilite si nous avons utilise autre fois . 

d’abord on va cree des entités (ou classes) qui représentent les objets que nous souhaitons persister dans fichier XML à l'aide de JaxB .

comme ceux ci :

```xml
package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Etudiants")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiants {

    @XmlElement(name = "Etudiant")
    private List<Etudiant> etudiant = new ArrayList<Etudiant>();

    public Etudiants() {
    }

    public List<Etudiant> getEtudiants() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant.add(etudiant);
    }
    public void setEtudiants(List<Etudiant> etudiants){
        this.etudiant.addAll(etudiants);
    }
}
```

Voila une Explication de ce Code :

1. **`@XmlRootElement(name = "Etudiants")` :**
    - Cette annotation est utilisée au niveau de la classe pour spécifier que la classe `Etudiants` représente l'élément racine dans la hiérarchie XML. Le paramètre `name` spécifie le nom de l'élément XML correspondant.
2. **`@XmlAccessorType(XmlAccessType.FIELD)` :**
    - Cette annotation spécifie comment JaxB doit accéder aux champs de la classe pour effectuer la conversion XML. Avec `FIELD`, JaxB accède directement aux champs plutôt qu'aux méthodes getter/setter.
3. **`@XmlElement(name = "Etudiant")` :**
    - Cette annotation est utilisée au niveau du champ `etudiant` pour indiquer comment chaque élément de la liste doit être nommé dans le fichier XML. Dans ce cas, chaque élément de la liste `etudiant` sera représenté par un élément XML avec le nom "Etudiant".

quelques autres annotations JaxB que vous pourriez trouver utiles dans le contexte de la sérialisation/désérialisation XML avec JaxB.

**`@XmlAttribute` :**

- Cette annotation est utilisée pour mapper un champ de classe en tant qu'attribut d'un élément XML. Par exemple :
    
    ```java
    @XmlAttribute
    private int id;
    ```
    

**`@XmlTransient` :**

- Cette annotation est utilisée pour exclure un champ de la sérialisation/désérialisation XML. Elle peut être utile si vous avez des champs dans votre classe qui ne doivent pas être inclus dans le fichier XML.
    
    ```java
    @XmlTransient
    private String informationInterne;
    ```
    

**`@XmlValue` :**

- Cette annotation est utilisée pour spécifier qu'un champ ou une méthode doit être utilisé comme valeur de l'élément XML. Elle est souvent utilisée avec des types simples comme les chaînes de caractères.
    
    ```java
    @XmlValue
    private String contenu;
    ```
    

Voici tous les classes utilise dans ce projet :

![MCDToJAXB.png](Spring%20Boot%20Avec%20JaxB%20cf5be56740e44989ad8f5302d669d10b/MCDToJAXB.png)

nos Service qui elle va faire des traitmants (CRUD):

[](https://github.com/Soufiane-Chajjaoui/XMLProject/blob/master/BackEndXML/src/main/java/com/example/merise/services/MCDToJaxBService.java)

D'accord, service en détail. Ce service utilise JAXB (Java Architecture for XML Binding) pour la sérialisation et la désérialisation des objets en format XML. Il semble être axé sur la gestion d'une liste d'étudiants.

### Méthode `addStudent`:

Cette méthode ajoute un étudiant à la liste existante.

1. **`JAXBContext context = JAXBContext.newInstance(Bac.class, Etudiant.class, Etudiants.class, FiliereDiplome.class);` :**
    - Cette ligne crée un contexte JAXB avec les classes que vous souhaitez marshalliser/unmarshalliser.
2. **`Etudiants etudiants;` :**
    - Une instance de la classe `Etudiants` qui va contenir la liste d'étudiants.
3. **`Unmarshaller unmarshaller = context.createUnmarshaller();` :**
    - Unmarshaller est utilisé pour désérialiser (convertir XML en objets Java). Il peut être configuré avec un schéma (XSD), mais cela est commenté dans votre code.
4. **`etudiants = (Etudiants) unmarshaller.unmarshal(file);` :**
    - Désérialisation de la liste d'étudiants à partir du fichier XML.
5. **`etudiants.setEtudiant(etudiantParam);` :**
    - Ajout de l'étudiant passé en paramètre à la liste.
6. **`marshaller.marshal(etudiants, stringWriter);` :**
    - Marshal l'objet `Etudiants` avec le nouvel étudiant vers une chaîne XML.
7. **`fileWriter.write(stringWriter.toString());` :**
    - Écriture de la chaîne XML dans le fichier.

### Méthode `removeStudent`:

Cette méthode supprime un étudiant de la liste par ID.

1. **`Unmarshaller unmarshaller = context.createUnmarshaller();` :**
    - Désérialisation de la liste d'étudiants à partir du fichier XML.
2. **`Iterator<Etudiant> itrEtudiant = etudiants.getEtudiants().iterator();` :**
    - Utilisation d'un itérateur pour parcourir la liste d'étudiants.
3. **`itrEtudiant.remove();` :**
    - Suppression de l'étudiant avec l'ID correspondant.
4. **`marshaller.marshal(etudiants, stringWriter);` :**
    - Marshal l'objet `Etudiants` avec l'étudiant supprimé vers une chaîne XML.
5. **`fileWriter.write(stringWriter.toString());` :**
    - Écriture de la chaîne XML dans le fichier.

### Méthode `updateStudent`:

Cette méthode met à jour le nom d'un étudiant par ID.

1. **`Etudiants etudiants;` :**
    - Désérialisation de la liste d'étudiants à partir du fichier XML.
2. **`for (Etudiant e : etudiants.getEtudiants()) { ... }` :**
    - Parcours de la liste pour trouver l'étudiant par ID.
3. **`e.setNom(nom);` :**
    - Mise à jour du nom de l'étudiant.
4. **`marshaller.marshal(etudiants, stringWriter);` :**
    - Marshal l'objet `Etudiants` avec l'étudiant mis à jour vers une chaîne XML.
5. **`fileWriter.write(stringWriter.toString());` :**
    - Écriture de la chaîne XML dans le fichier.

### Remarques :

- La gestion des erreurs (exceptions) pourrait être améliorée avec des retours d'erreur plus informatifs.
- L'utilisation de `Optional` est une bonne pratique pour indiquer les résultats facultatifs.
- La structure générale du service semble correcte pour la gestion des opérations CRUD sur une liste d'étudiants en utilisant XML.

Voici nos RestController.

[](https://github.com/Soufiane-Chajjaoui/XMLProject/blob/6a9d7bf551fac25ce5b45166f4a56aa34a50f364/BackEndXML/src/main/java/com/example/merise/controllers/EtudiantController.java)

contrôleur `EtudiantController` gère les requêtes liées aux opérations CRUD pour les étudiants. Voici une explication détaillée de chaque méthode dans votre contrôleur :

### Méthode `store` (POST):

- **URL associée:** `/Etudiants`
- **Méthode HTTP:** POST
- **Description:**
    - Cette méthode est utilisée pour ajouter un nouvel étudiant.
    - Elle prend un objet `Etudiant` en entrée depuis le corps de la requête (`@RequestBody`).
    - Appelle la méthode `addStudant` du service `MCDToJaxBService` pour ajouter l'étudiant.
    - Si l'étudiant est ajouté avec succès, renvoie une réponse avec le statut HTTP 201 (Created) et le nouvel étudiant ajouté.
    - Si l'ajout échoue en raison d'un CNE déjà existant, renvoie une réponse avec le statut HTTP 409 (Conflict) et un message d'erreur.

### Méthode `delete` (DELETE):

- **URL associée:** `/Etudiants/{id}`
- **Méthode HTTP:** DELETE
- **Description:**
    - Cette méthode est utilisée pour supprimer un étudiant en spécifiant son ID dans l'URL.
    - Appelle la méthode `removeStudent` du service `MCDToJaxBService` pour supprimer l'étudiant.
    - Si la suppression réussit, renvoie une réponse avec le statut HTTP 200 (OK) et un message indiquant que l'étudiant a été supprimé.
    - Si l'étudiant n'est pas trouvé, renvoie une réponse avec le statut HTTP 204 (No Content) et un message indiquant que la ressource n'a pas été trouvée.

### Méthode `update` (PATCH):

- **URL associée:** `/Etudiants/{id}/{nom}`
- **Méthode HTTP:** PATCH
- **Description:**
    - Cette méthode est utilisée pour mettre à jour le nom d'un étudiant en spécifiant son ID dans l'URL et le nouveau nom dans le chemin.
    - Appelle la méthode `updateEtudiant` du service `MCDToJaxBService` pour effectuer la mise à jour.
    - Si la mise à jour réussit, renvoie une réponse avec le statut HTTP 200 (OK) et un message indiquant que l'étudiant a été mis à jour avec le nouveau nom.
    - Si l'étudiant n'est pas trouvé, renvoie une réponse avec le statut HTTP 404 (Not Found) et un message indiquant que la ressource n'a pas été trouvée.

### Remarques générales :

- Les annotations `@Autowired` sont utilisées pour injecter les instances des services dans le contrôleur.
- L'annotation `@RestController` indique que toutes les méthodes de cette classe renvoient directement des données au client (au lieu de renvoyer des vues).
- L'annotation `@RequestMapping("/Etudiants")` spécifie que toutes les méthodes de ce contrôleur répondent aux requêtes sous le chemin `/Etudiants`.
- L'annotation `@CrossOrigin` autorise les requêtes provenant de tous les domaines.
- Les réponses sont encapsulées dans des objets `ResponseEntity` pour fournir des informations supplémentaires sur la réponse HTTP (par exemple, le statut HTTP).

Pour front-end :

Ce fichier XSL (Extensible Stylesheet Language) semble être utilisé pour transformer un document XML en un document HTML avec des fonctionnalités dynamiques côté client, notamment l'utilisation de jQuery et d'autres bibliothèques.

fichier [MCDToSchema.xsl](https://github.com/Soufiane-Chajjaoui/XMLProject/blob/6a9d7bf551fac25ce5b45166f4a56aa34a50f364/MCDToSCHEMA.xsl) qui presente la parte front-end cote Client .
