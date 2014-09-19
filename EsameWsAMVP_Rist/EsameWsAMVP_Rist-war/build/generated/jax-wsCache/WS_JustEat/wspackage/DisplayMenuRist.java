
package wspackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DisplayMenuRist complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DisplayMenuRist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_rist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayMenuRist", propOrder = {
    "idRist"
})
public class DisplayMenuRist {

    @XmlElement(name = "id_rist")
    protected String idRist;

    /**
     * Recupera il valore della proprietà idRist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRist() {
        return idRist;
    }

    /**
     * Imposta il valore della proprietà idRist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRist(String value) {
        this.idRist = value;
    }

}
