
import javax.persistence.*;

/**
 *
 * @author Pierre-Antoine RAMANE
 */
@Embeddable
@Table(name = "account")
public class Account {

    @Column(nullable = false, length = 11, unique = true)
    @Id
    private int numAccount;
    private String libelle;
    private String iban;
    private double solde;

    public Account(int numAccount, String libelle, String iban, double solde) {
        this.numAccount = numAccount;
        this.libelle = libelle;
        this.iban = iban;
        this.solde = solde;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    
}
