//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-07/07/2014 12:56 PM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.06 at 01:47:13 PM EDT 
//


package gov.mlms.cciio.cms.mlmsshopuserprofilecommontype;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.mlms.cciio.cms.mlmsshopuserprofilecommontype package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserInfo_QNAME = new QName("http://cms.cciio.mlms.gov/MLMSShopUserProfileCommonType", "UserInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.mlms.cciio.cms.mlmsshopuserprofilecommontype
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link WorkingHoursType }
     * 
     */
    public WorkingHoursType createWorkingHoursType() {
        return new WorkingHoursType();
    }

    /**
     * Create an instance of {@link DaysOfWeekType }
     * 
     */
    public DaysOfWeekType createDaysOfWeekType() {
        return new DaysOfWeekType();
    }

    /**
     * Create an instance of {@link WorkingDaysType }
     * 
     */
    public WorkingDaysType createWorkingDaysType() {
        return new WorkingDaysType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link UserPreferencesType }
     * 
     */
    public UserPreferencesType createUserPreferencesType() {
        return new UserPreferencesType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AgencyInfoType }
     * 
     */
    public AgencyInfoType createAgencyInfoType() {
        return new AgencyInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cms.cciio.mlms.gov/MLMSShopUserProfileCommonType", name = "UserInfo")
    public JAXBElement<UserType> createUserInfo(UserType value) {
        return new JAXBElement<UserType>(_UserInfo_QNAME, UserType.class, null, value);
    }

}