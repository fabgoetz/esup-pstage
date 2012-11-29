
package org.esupportail.pstagedata.remote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:28.775+01:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AdminStructureAccountException", targetNamespace = "http://remote.pstagedata.esupportail.org/")
public class AdminStructureAccountException_Exception extends Exception {
    
    private org.esupportail.pstagedata.remote.AdminStructureAccountException adminStructureAccountException;

    public AdminStructureAccountException_Exception() {
        super();
    }
    
    public AdminStructureAccountException_Exception(String message) {
        super(message);
    }
    
    public AdminStructureAccountException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminStructureAccountException_Exception(String message, org.esupportail.pstagedata.remote.AdminStructureAccountException adminStructureAccountException) {
        super(message);
        this.adminStructureAccountException = adminStructureAccountException;
    }

    public AdminStructureAccountException_Exception(String message, org.esupportail.pstagedata.remote.AdminStructureAccountException adminStructureAccountException, Throwable cause) {
        super(message, cause);
        this.adminStructureAccountException = adminStructureAccountException;
    }

    public org.esupportail.pstagedata.remote.AdminStructureAccountException getFaultInfo() {
        return this.adminStructureAccountException;
    }
}
