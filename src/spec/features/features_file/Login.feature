@all @login
Feature:Authentification 
 ETQ utulisateur je veux  me connecter à l'interface Swag Labs afin de gérer la boutique en ligne
 
  Background:
   Given Je me connecte à l'interface Swag Labs 
   When  Je saisis le username 
   And Je saisis le password
   And Je clique sur Login
 
 @login_validCredential
 Scenario: Je souhaite  me connecter à l'interface avec des identifiants valides
 Then Je me redirige vers la page Home "Products"
 
 @logout
 Scenario: Je souhaite me deconnecter
 When  Je clique sur le burgur menu
 And   Je clique sur Logout
 Then  Je me redirige vers la page de connexion "Login"