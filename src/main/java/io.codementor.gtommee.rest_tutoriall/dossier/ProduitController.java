package io.codementor.gtommee.rest_tutoriall.dossier;

import io.codementor.gtommee.rest_tutoriall.modeles.produit;
import io.codementor.gtommee.rest_tutoriall.referentiel.ProduitRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
    private ProduitRepository repository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<produit> getAllproduit() {
        return repository.findAll();

    }
}
