
package gouv.education.apogee.commun.transverse.dto.pedagogique.calendrierexamendto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gouv.education.apogee.commun.transverse.dto.pedagogique.epreuvedto4.EpreuveDTO4;


/**
 * <p>Java class for tableauEpreuveDTO4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tableauEpreuveDTO4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{EpreuveDTO4.pedagogique.dto.transverse.commun.apogee.education.gouv}EpreuveDTO4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableauEpreuveDTO4", propOrder = {
    "item"
})
public class TableauEpreuveDTO4 {

    protected List<EpreuveDTO4> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EpreuveDTO4 }
     * 
     * 
     */
    public List<EpreuveDTO4> getItem() {
        if (item == null) {
            item = new ArrayList<EpreuveDTO4>();
        }
        return this.item;
    }

}
