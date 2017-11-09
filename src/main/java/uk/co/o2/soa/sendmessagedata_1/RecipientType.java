
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recipientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="to"/>
 *     &lt;enumeration value="cc"/>
 *     &lt;enumeration value="bcc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recipientType")
@XmlEnum
public enum RecipientType {

    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("cc")
    CC("cc"),
    @XmlEnumValue("bcc")
    BCC("bcc");
    private final String value;

    RecipientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecipientType fromValue(String v) {
        for (RecipientType c: RecipientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
