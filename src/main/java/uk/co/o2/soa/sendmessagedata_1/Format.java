
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="html"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "format")
@XmlEnum
public enum Format {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("html")
    HTML("html");
    private final String value;

    Format(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Format fromValue(String v) {
        for (Format c: Format.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
