
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="FLA"/>
 *     &lt;enumeration value="PIC"/>
 *     &lt;enumeration value="LOG"/>
 *     &lt;enumeration value="RTN"/>
 *     &lt;enumeration value="RPR"/>
 *     &lt;enumeration value="WAP"/>
 *     &lt;enumeration value="BIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {

    TXT,
    FLA,
    PIC,
    LOG,
    RTN,
    RPR,
    WAP,
    BIN;

    public String value() {
        return name();
    }

    public static MessageType fromValue(String v) {
        return valueOf(v);
    }

}
