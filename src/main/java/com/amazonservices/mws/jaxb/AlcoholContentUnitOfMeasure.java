
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlcoholContentUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AlcoholContentUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percent_by_volume"/>
 *     &lt;enumeration value="percent_by_weight"/>
 *     &lt;enumeration value="unit_of_alcohol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcoholContentUnitOfMeasure")
@XmlEnum
public enum AlcoholContentUnitOfMeasure {

    @XmlEnumValue("percent_by_volume")
    PERCENT_BY_VOLUME("percent_by_volume"),
    @XmlEnumValue("percent_by_weight")
    PERCENT_BY_WEIGHT("percent_by_weight"),
    @XmlEnumValue("unit_of_alcohol")
    UNIT_OF_ALCOHOL("unit_of_alcohol");
    private final String value;

    AlcoholContentUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcoholContentUnitOfMeasure fromValue(String v) {
        for (AlcoholContentUnitOfMeasure c: AlcoholContentUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
