package io.codementor.gtommee.rest_tutoriall.referentiel;

import io.codementor.gtommee.rest_tutoriall.modeles.produit;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProduitRepository  extends MongoRepository<produit, String> {
  produit findBy_id(ObjectId _id)  ;
}
