package org.esupportail.pstage.dao.referentiel;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;


/**
 * Acces au composantes du personnel.
 *
 */
public interface PersonalComponentRepositoryDao extends Serializable, InitializingBean {
	/**
	 * Retourne les codes de toutes les composantes (UFR et departements) de l'universite et leurs libelles
	 * @param universityCode
	 * @return a Map<String,String>, codes et libelles des composantes
	 */
	public Map<String, String> getComposantesRef(String universityCode); 

}
