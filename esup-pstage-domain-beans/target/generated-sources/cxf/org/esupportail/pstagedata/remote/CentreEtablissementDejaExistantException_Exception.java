
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:28.868+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CentreEtablissementDejaExistantException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class CentreEtablissementDejaExistantException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.CentreEtablissementDejaExistantException centreEtablissementDejaExistantException;

    public CentreEtablissementDejaExistantException_Exception() {
        super();
    }
    
    public CentreEtablissementDejaExistantException_Exception(String message) {
        super(message);
    }
    
    public CentreEtablissementDejaExistantException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CentreEtablissementDejaExistantException_Exception(String message, org.esupportail.pstagedata.remote.CentreEtablissementDejaExistantException centreEtablissementDejaExistantException) {
        super(message);
        this.centreEtablissementDejaExistantException = centreEtablissementDejaExistantException;
    }

    public CentreEtablissementDejaExistantException_Exception(String message, org.esupportail.pstagedata.remote.CentreEtablissementDejaExistantException centreEtablissementDejaExistantException, Throwable cause) {
        super(message, cause);
        this.centreEtablissementDejaExistantException = centreEtablissementDejaExistantException;
    }

    public org.esupportail.pstagedata.remote.CentreEtablissementDejaExistantException getFaultInfo() {
        return this.centreEtablissementDejaExistantException;
    }
}
