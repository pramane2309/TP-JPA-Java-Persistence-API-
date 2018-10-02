
import javax.persistence.*;

/**
 *
 * @author Pierre-Antoine RAMANE
 */
@Entity
public class Appartenir {

    @EmbeddedId
    private Client idClient;
    @EmbeddedId
    private Account numAccount;

}
