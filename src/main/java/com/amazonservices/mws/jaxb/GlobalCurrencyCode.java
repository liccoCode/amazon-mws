
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GlobalCurrencyCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalCurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="ATS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BEF"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CSD"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DEM"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FIM"/>
 *     &lt;enumeration value="FRF"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="ITL"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LUF"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PTE"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalCurrencyCode")
@XmlEnum
public enum GlobalCurrencyCode {

    AED,
    ALL,
    ARS,
    ATS,
    AUD,
    BAM,
    BEF,
    BGN,
    BHD,
    BOB,
    BRL,
    BYR,
    CAD,
    CHF,
    CLP,
    CNY,
    COP,
    CRC,
    CSD,
    CZK,
    DEM,
    DKK,
    DOP,
    DZD,
    EEK,
    EGP,
    ESP,
    EUR,
    FIM,
    FRF,
    GBP,
    GRD,
    GTQ,
    HKD,
    HNL,
    HRK,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    ISK,
    ITL,
    JOD,
    JPY,
    KRW,
    KWD,
    LBP,
    LTL,
    LUF,
    LVL,
    LYD,
    MAD,
    MKD,
    MXN,
    MYR,
    NIO,
    NOK,
    NZD,
    OMR,
    PAB,
    PEN,
    PHP,
    PLN,
    PTE,
    PYG,
    QAR,
    RON,
    RSD,
    RUB,
    SAR,
    SDG,
    SEK,
    SGD,
    SKK,
    SVC,
    SYP,
    THB,
    TND,
    TRY,
    TWD,
    UAH,
    USD,
    UYU,
    VEF,
    VND,
    YER,
    ZAR;

    public String value() {
        return name();
    }

    public static GlobalCurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
