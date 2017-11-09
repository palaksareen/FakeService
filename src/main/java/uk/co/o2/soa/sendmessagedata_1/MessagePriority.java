
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messagePriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messagePriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messagePriority")
@XmlEnum
public enum MessagePriority {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    MessagePriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessagePriority fromValue(String v) {
        for (MessagePriority c: MessagePriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
