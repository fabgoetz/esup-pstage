
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:28.763+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AdminStructureLoginEppnAlreadyUsedException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class AdminStructureLoginEppnAlreadyUsedException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.AdminStructureLoginEppnAlreadyUsedException adminStructureLoginEppnAlreadyUsedException;

    public AdminStructureLoginEppnAlreadyUsedException_Exception() {
        super();
    }
    
    public AdminStructureLoginEppnAlreadyUsedException_Exception(String message) {
        super(message);
    }
    
    public AdminStructureLoginEppnAlreadyUsedException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminStructureLoginEppnAlreadyUsedException_Exception(String message, org.esupportail.pstagedata.remote.AdminStructureLoginEppnAlreadyUsedException adminStructureLoginEppnAlreadyUsedException) {
        super(message);
        this.adminStructureLoginEppnAlreadyUsedException = adminStructureLoginEppnAlreadyUsedException;
    }

    public AdminStructureLoginEppnAlreadyUsedException_Exception(String message, org.esupportail.pstagedata.remote.AdminStructureLoginEppnAlreadyUsedException adminStructureLoginEppnAlreadyUsedException, Throwable cause) {
        super(message, cause);
        this.adminStructureLoginEppnAlreadyUsedException = adminStructureLoginEppnAlreadyUsedException;
    }

    public org.esupportail.pstagedata.remote.AdminStructureLoginEppnAlreadyUsedException getFaultInfo() {
        return this.adminStructureLoginEppnAlreadyUsedException;
    }
}
