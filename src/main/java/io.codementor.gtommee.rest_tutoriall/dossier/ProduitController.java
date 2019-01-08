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

    @RequestMapping(value = "/p", method = RequestMethod.POST)
    public produit createproduit(@Valid @RequestBody produit p) {
        p.set_id(ObjectId.get());
        repository.save(p);
        return p;
    }

    //Marge
    @RequestMapping(value = "/marge", method = RequestMethod.GET)
    public List<String> getmarge() {
        List<produit> produits = repository.findAll();
        List<String> marge = new ArrayList<String>();
        for (produit p : produits) {
            int margeProd = p.prixvente - p.prixachat;
            marge.add(p.name + " " + margeProd);
        }

        return marge;

    }

    // trier
    @RequestMapping(value = "/k", method = RequestMethod.GET)
    public Iterable<produit> testTriDesc() {

        Iterable<produit> personnesTrouvees =
                repository.findAll(new Sort(Sort.Direction.ASC, "name"));
        return personnesTrouvees;
    }



}
