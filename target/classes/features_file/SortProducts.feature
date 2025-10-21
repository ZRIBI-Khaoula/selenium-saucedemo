@all @SortProducts
Feature: Tri des produits 
ETQ utulisateur je souhaite trier les produits afin de visualiser les produits dans l'ordre souhaité

  Background:
   Given Je me connecte à l'interface Swag Labs 
   When  Je saisis le username 
   And Je saisis le password
   And Je clique sur Login
   
   @SortByPrice
   Scenario: Je souhaite trier les produits par prix croissant  
   When Je selectionne l'option "Price (low to high)" dans le menu de tri
   Then Tri par prix croissant effectué
   
   
   
   @SortByName
   Scenario: Je souhaite trier les produits par ordre alphabétique de Z à A 
   When Je choisis l'option "Name (Z to A)" dans le menu de tri
   Then Tri par ordre alphabétique decroissant effectué