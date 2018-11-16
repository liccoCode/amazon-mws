
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VolumeRateUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeRateUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="milliliters per second"/>
 *     &lt;enumeration value="centiliters per second"/>
 *     &lt;enumeration value="liters per second"/>
 *     &lt;enumeration value="milliliters per minute"/>
 *     &lt;enumeration value="liters per minute"/>
 *     &lt;enumeration value="microliters per second"/>
 *     &lt;enumeration value="nanoliters per second"/>
 *     &lt;enumeration value="picoliters per second"/>
 *     &lt;enumeration value="microliters per minute"/>
 *     &lt;enumeration value="nanoliters per minute"/>
 *     &lt;enumeration value="picoliters per minute"/>
 *     &lt;enumeration value="gallons_per_day"/>
 *     &lt;enumeration value="liters_per_day"/>
 *     &lt;enumeration value="liters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumeRateUnitOfMeasure")
@XmlEnum
public enum VolumeRateUnitOfMeasure {

    @XmlEnumValue("milliliters per second")
    MILLILITERS_PER_SECOND("milliliters per second"),
    @XmlEnumValue("centiliters per second")
    CENTILITERS_PER_SECOND("centiliters per second"),
    @XmlEnumValue("liters per second")
    LITERS_PER_SECOND("liters per second"),
    @XmlEnumValue("milliliters per minute")
    MILLILITERS_PER_MINUTE("milliliters per minute"),
    @XmlEnumValue("liters per minute")
    LITERS_PER_MINUTE("liters per minute"),
    @XmlEnumValue("microliters per second")
    MICROLITERS_PER_SECOND("microliters per second"),
    @XmlEnumValue("nanoliters per second")
    NANOLITERS_PER_SECOND("nanoliters per second"),
    @XmlEnumValue("picoliters per second")
    PICOLITERS_PER_SECOND("picoliters per second"),
    @XmlEnumValue("microliters per minute")
    MICROLITERS_PER_MINUTE("microliters per minute"),
    @XmlEnumValue("nanoliters per minute")
    NANOLITERS_PER_MINUTE("nanoliters per minute"),
    @XmlEnumValue("picoliters per minute")
    PICOLITERS_PER_MINUTE("picoliters per minute"),
    @XmlEnumValue("gallons_per_day")
    GALLONS_PER_DAY("gallons_per_day"),
    @XmlEnumValue("liters_per_day")
    LITERS_PER_DAY("liters_per_day"),
    @XmlEnumValue("liters")
    LITERS("liters");
    private final String value;

    VolumeRateUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeRateUnitOfMeasure fromValue(String v) {
        for (VolumeRateUnitOfMeasure c: VolumeRateUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
