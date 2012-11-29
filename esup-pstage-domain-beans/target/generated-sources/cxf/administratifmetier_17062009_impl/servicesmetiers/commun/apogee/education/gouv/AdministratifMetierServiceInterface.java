package administratifmetier_17062009_impl.servicesmetiers.commun.apogee.education.gouv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-28T15:25:31.155+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009-impl", name = "AdministratifMetierServiceInterface")
@XmlSeeAlso({gouv.education.apogee.commun.transverse.dto.administratif.spohautnivdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.cursusexternedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.typeetablissementdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.aidefinancieredto.ObjectFactory.class, gouv.education.apogee.commun.transverse.exception.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.cursusexternesettransfertsdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.insadmanudto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.boursedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.cgedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.etatiaadto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.insadmetpdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.departementdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.catsocprofdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.paysdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.quotitetravdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.prgechangedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.transfertdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.typdiplomesisedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.specialitesdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.etablissementetrangerdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.etablissementdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.statutetudto.ObjectFactory.class, administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.profiletudto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.insadmanudto2.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.domaineactiviteprofdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.cpamdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.composantedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.regimeinsdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.etatiaedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.diplomedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.etapedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.typdiplomeextdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.situationsisedto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.niveauformationdto.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.insadmetpdto2.ObjectFactory.class, gouv.education.apogee.commun.transverse.dto.administratif.typdiplomedto.ObjectFactory.class})
public interface AdministratifMetierServiceInterface {

    @WebResult(name = "recupererIAAnnuellesReturn_v2", targetNamespace = "")
    @RequestWrapper(localName = "recupererIAAnnuelles_v2", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAAnnuellesV2")
    @WebMethod(operationName = "recupererIAAnnuelles_v2")
    @ResponseWrapper(localName = "recupererIAAnnuelles_v2Response", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAAnnuellesV2Response")
    public java.util.List<gouv.education.apogee.commun.transverse.dto.administratif.insadmanudto2.InsAdmAnuDTO2> recupererIAAnnuellesV2(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu,
        @WebParam(name = "_annee", targetNamespace = "")
        java.lang.String annee,
        @WebParam(name = "_etatIAA", targetNamespace = "")
        java.lang.String etatIAA
    ) throws WebBaseException;

    @WebResult(name = "recupererAnneesIaReturn", targetNamespace = "")
    @RequestWrapper(localName = "recupererAnneesIa", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererAnneesIa")
    @WebMethod
    @ResponseWrapper(localName = "recupererAnneesIaResponse", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererAnneesIaResponse")
    public java.util.List<java.lang.String> recupererAnneesIa(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu,
        @WebParam(name = "_etatInscriptionIA", targetNamespace = "")
        java.lang.String etatInscriptionIA
    ) throws WebBaseException;

    @WebResult(name = "recupererCursusExterneReturn", targetNamespace = "")
    @RequestWrapper(localName = "recupererCursusExterne", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererCursusExterne")
    @WebMethod
    @ResponseWrapper(localName = "recupererCursusExterneResponse", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererCursusExterneResponse")
    public gouv.education.apogee.commun.transverse.dto.administratif.cursusexternesettransfertsdto.CursusExternesEtTransfertsDTO recupererCursusExterne(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu
    ) throws WebBaseException;

    @WebResult(name = "recupererIAEtapesReturn", targetNamespace = "")
    @RequestWrapper(localName = "recupererIAEtapes", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAEtapes")
    @WebMethod
    @ResponseWrapper(localName = "recupererIAEtapesResponse", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAEtapesResponse")
    public java.util.List<gouv.education.apogee.commun.transverse.dto.administratif.insadmetpdto.InsAdmEtpDTO> recupererIAEtapes(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu,
        @WebParam(name = "_annee", targetNamespace = "")
        java.lang.String annee,
        @WebParam(name = "_etatIAA", targetNamespace = "")
        java.lang.String etatIAA,
        @WebParam(name = "_etatIAE", targetNamespace = "")
        java.lang.String etatIAE
    ) throws WebBaseException;

    @WebResult(name = "recupererIAAnnuellesReturn", targetNamespace = "")
    @RequestWrapper(localName = "recupererIAAnnuelles", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAAnnuelles")
    @WebMethod
    @ResponseWrapper(localName = "recupererIAAnnuellesResponse", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAAnnuellesResponse")
    public java.util.List<gouv.education.apogee.commun.transverse.dto.administratif.insadmanudto.InsAdmAnuDTO> recupererIAAnnuelles(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu,
        @WebParam(name = "_annee", targetNamespace = "")
        java.lang.String annee,
        @WebParam(name = "_etatIAA", targetNamespace = "")
        java.lang.String etatIAA
    ) throws WebBaseException;

    @WebResult(name = "recupererIAEtapes_v2Return", targetNamespace = "")
    @RequestWrapper(localName = "recupererIAEtapes_v2", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAEtapesV2")
    @WebMethod(operationName = "recupererIAEtapes_v2")
    @ResponseWrapper(localName = "recupererIAEtapes_v2Response", targetNamespace = "gouv.education.apogee.commun.servicesmetiers.AdministratifMetier_17062009", className = "administratifmetier_17062009.servicesmetiers.commun.apogee.education.gouv.RecupererIAEtapesV2Response")
    public java.util.List<gouv.education.apogee.commun.transverse.dto.administratif.insadmetpdto2.InsAdmEtpDTO2> recupererIAEtapesV2(
        @WebParam(name = "_codEtu", targetNamespace = "")
        java.lang.String codEtu,
        @WebParam(name = "_annee", targetNamespace = "")
        java.lang.String annee,
        @WebParam(name = "_etatIAA", targetNamespace = "")
        java.lang.String etatIAA,
        @WebParam(name = "_etatIAE", targetNamespace = "")
        java.lang.String etatIAE
    ) throws WebBaseException;
}
