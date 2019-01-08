package io.codementor.gtommee.rest_tutoriall.modeles;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class produit {
    @Id
    public ObjectId _id;
    public String name;
    public int prixachat;
    public int prixvente;


    public void setPrixachat(int prixachat) {
        this.prixachat = prixachat;
    }

    public void setPrixvente(int prixvente) {
        this.prixvente = prixvente;
    }

    public int getPrixvente() {
        return prixvente;
    }

    public int getPrixachat() {
        return prixachat;
    }

    public produit() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public produit(ObjectId _id, String name, int prixachat, int prixvente) {
        this._id = _id;
        this.name = name;
        this.prixachat = prixachat;
        this.prixvente = prixvente;
    }


}
