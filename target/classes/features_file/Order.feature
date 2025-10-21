@all @Commande @Products
Feature: Achat des produits 
ETQ utulisateur je vais acheter des produits

  Background:
   Given Je me connecte à l'interface Swag Labs 
   When  Je saisis le username 
   And Je saisis le password
   And Je clique sur Login
   
   Scenario:Je souhaite passer une commande
   When J'ajoute des produits au panier
   And Je clique sur le bouton panier
   And Je vérifie que tous les produits ajoutés sont dans le panier 
   And Je clique sur le bouton checkout
   And Je saisis toutes les informations 
   And Je clique sur le bouton Continuer 
   And Je clique sur finish
   Then  Je verifie le message de réussite "Thank you for your order!" 
  
