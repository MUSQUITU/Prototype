
package exemplo.musquitu.prototype;

/**
 *
 * @author camila
 */
public abstract class PDF extends DocumentoPrototype {
    System.out.println("clone");
     private String nome;
     private String data;
}
//get e set
public DocumentoPrototype clone(){
    novo.setPDF(this.nome);
    novo.setPDF(this.data);
        return novo;
}
