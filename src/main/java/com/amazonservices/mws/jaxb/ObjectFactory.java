
package com.amazonservices.mws.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mws.elcuk.jaxb package. 
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

    private final static QName _ShipmentID_QNAME = new QName("", "ShipmentID");
    private final static QName _FulfillmentServiceLevel_QNAME = new QName("", "FulfillmentServiceLevel");
    private final static QName _MerchantOrderItemID_QNAME = new QName("", "MerchantOrderItemID");
    private final static QName _Address_QNAME = new QName("", "Address");
    private final static QName _FulfillmentMethod_QNAME = new QName("", "FulfillmentMethod");
    private final static QName _MarketplaceName_QNAME = new QName("", "MarketplaceName");
    private final static QName _ColorMap_QNAME = new QName("", "ColorMap");
    private final static QName _AmazonOrderID_QNAME = new QName("", "AmazonOrderID");
    private final static QName _ProductTaxCode_QNAME = new QName("", "ProductTaxCode");
    private final static QName _AmazonOrderItemCode_QNAME = new QName("", "AmazonOrderItemCode");
    private final static QName _ExternalCustomerID_QNAME = new QName("", "ExternalCustomerID");
    private final static QName _ShipOption_QNAME = new QName("", "ShipOption");
    private final static QName _PromotionClaimCode_QNAME = new QName("", "PromotionClaimCode");
    private final static QName _Denomination_QNAME = new QName("", "Denomination");
    private final static QName _AmazonCustomerID_QNAME = new QName("", "AmazonCustomerID");
    private final static QName _DeliveryChannel_QNAME = new QName("", "DeliveryChannel");
    private final static QName _CharacterData_QNAME = new QName("", "CharacterData");
    private final static QName _FulfillmentCenterID_QNAME = new QName("", "FulfillmentCenterID");
    private final static QName _CarrierCode_QNAME = new QName("", "CarrierCode");
    private final static QName _MerchantFulfillmentID_QNAME = new QName("", "MerchantFulfillmentID");
    private final static QName _MerchantPromotionID_QNAME = new QName("", "MerchantPromotionID");
    private final static QName _ConditionType_QNAME = new QName("", "ConditionType");
    private final static QName _MerchantOrderID_QNAME = new QName("", "MerchantOrderID");
    private final static QName _SKU_QNAME = new QName("", "SKU");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mws.elcuk.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderReport }
     * 
     */
    public OrderReport createOrderReport() {
        return new OrderReport();
    }

    /**
     * Create an instance of {@link Battery }
     * 
     */
    public Battery createBattery() {
        return new Battery();
    }

    /**
     * Create an instance of {@link PromotionDataType }
     * 
     */
    public PromotionDataType createPromotionDataType() {
        return new PromotionDataType();
    }

    /**
     * Create an instance of {@link BuyerPrice }
     * 
     */
    public BuyerPrice createBuyerPrice() {
        return new BuyerPrice();
    }

    /**
     * Create an instance of {@link AmazonFees }
     * 
     */
    public AmazonFees createAmazonFees() {
        return new AmazonFees();
    }

    /**
     * Create an instance of {@link DirectPaymentType }
     * 
     */
    public DirectPaymentType createDirectPaymentType() {
        return new DirectPaymentType();
    }

    /**
     * Create an instance of {@link TaxData }
     * 
     */
    public TaxData createTaxData() {
        return new TaxData();
    }

    /**
     * Create an instance of {@link OrderReport.BillingData }
     * 
     */
    public OrderReport.BillingData createOrderReportBillingData() {
        return new OrderReport.BillingData();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ShoulderHarnessHeight }
     * 
     */
    public ShoulderHarnessHeight createShoulderHarnessHeight() {
        return new ShoulderHarnessHeight();
    }

    /**
     * Create an instance of {@link LengthDimension }
     * 
     */
    public LengthDimension createLengthDimension() {
        return new LengthDimension();
    }

    /**
     * Create an instance of {@link StandardProductID }
     * 
     */
    public StandardProductID createStandardProductID() {
        return new StandardProductID();
    }

    /**
     * Create an instance of {@link ColorSpecification }
     * 
     */
    public ColorSpecification createColorSpecification() {
        return new ColorSpecification();
    }

    /**
     * Create an instance of {@link OrderReport.CustomerOrderInfo }
     * 
     */
    public OrderReport.CustomerOrderInfo createOrderReportCustomerOrderInfo() {
        return new OrderReport.CustomerOrderInfo();
    }

    /**
     * Create an instance of {@link OrderReport.FulfillmentData }
     * 
     */
    public OrderReport.FulfillmentData createOrderReportFulfillmentData() {
        return new OrderReport.FulfillmentData();
    }

    /**
     * Create an instance of {@link OrderReport.Item }
     * 
     */
    public OrderReport.Item createOrderReportItem() {
        return new OrderReport.Item();
    }

    /**
     * Create an instance of {@link RelatedProductID }
     * 
     */
    public RelatedProductID createRelatedProductID() {
        return new RelatedProductID();
    }

    /**
     * Create an instance of {@link Battery.BatterySubgroup }
     * 
     */
    public Battery.BatterySubgroup createBatteryBatterySubgroup() {
        return new Battery.BatterySubgroup();
    }

    /**
     * Create an instance of {@link Recall }
     * 
     */
    public Recall createRecall() {
        return new Recall();
    }

    /**
     * Create an instance of {@link ForwardFacingWeight }
     * 
     */
    public ForwardFacingWeight createForwardFacingWeight() {
        return new ForwardFacingWeight();
    }

    /**
     * Create an instance of {@link WeightDimension }
     * 
     */
    public WeightDimension createWeightDimension() {
        return new WeightDimension();
    }

    /**
     * Create an instance of {@link ComputerPlatform }
     * 
     */
    public ComputerPlatform createComputerPlatform() {
        return new ComputerPlatform();
    }

    /**
     * Create an instance of {@link AgeRecommendation }
     * 
     */
    public AgeRecommendation createAgeRecommendation() {
        return new AgeRecommendation();
    }

    /**
     * Create an instance of {@link MinimumAgeRecommendedDimension }
     * 
     */
    public MinimumAgeRecommendedDimension createMinimumAgeRecommendedDimension() {
        return new MinimumAgeRecommendedDimension();
    }

    /**
     * Create an instance of {@link AgeRecommendedDimension }
     * 
     */
    public AgeRecommendedDimension createAgeRecommendedDimension() {
        return new AgeRecommendedDimension();
    }

    /**
     * Create an instance of {@link RearFacingWeight }
     * 
     */
    public RearFacingWeight createRearFacingWeight() {
        return new RearFacingWeight();
    }

    /**
     * Create an instance of {@link HeightRecommendation }
     * 
     */
    public HeightRecommendation createHeightRecommendation() {
        return new HeightRecommendation();
    }

    /**
     * Create an instance of {@link CharacterDataType }
     * 
     */
    public CharacterDataType createCharacterDataType() {
        return new CharacterDataType();
    }

    /**
     * Create an instance of {@link WeightRecommendation }
     * 
     */
    public WeightRecommendation createWeightRecommendation() {
        return new WeightRecommendation();
    }

    /**
     * Create an instance of {@link WeightIntegerDimension }
     * 
     */
    public WeightIntegerDimension createWeightIntegerDimension() {
        return new WeightIntegerDimension();
    }

    /**
     * Create an instance of {@link ZoomDimension }
     * 
     */
    public ZoomDimension createZoomDimension() {
        return new ZoomDimension();
    }

    /**
     * Create an instance of {@link RebateType }
     * 
     */
    public RebateType createRebateType() {
        return new RebateType();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CapacityUnit }
     * 
     */
    public CapacityUnit createCapacityUnit() {
        return new CapacityUnit();
    }

    /**
     * Create an instance of {@link LengthIntegerDimension }
     * 
     */
    public LengthIntegerDimension createLengthIntegerDimension() {
        return new LengthIntegerDimension();
    }

    /**
     * Create an instance of {@link HardnessDimension }
     * 
     */
    public HardnessDimension createHardnessDimension() {
        return new HardnessDimension();
    }

    /**
     * Create an instance of {@link PixelDimension }
     * 
     */
    public PixelDimension createPixelDimension() {
        return new PixelDimension();
    }

    /**
     * Create an instance of {@link FrequencyDimension }
     * 
     */
    public FrequencyDimension createFrequencyDimension() {
        return new FrequencyDimension();
    }

    /**
     * Create an instance of {@link DegreeDimension }
     * 
     */
    public DegreeDimension createDegreeDimension() {
        return new DegreeDimension();
    }

    /**
     * Create an instance of {@link ServingDimension }
     * 
     */
    public ServingDimension createServingDimension() {
        return new ServingDimension();
    }

    /**
     * Create an instance of {@link AddressTypeSupportNonCity }
     * 
     */
    public AddressTypeSupportNonCity createAddressTypeSupportNonCity() {
        return new AddressTypeSupportNonCity();
    }

    /**
     * Create an instance of {@link ApertureDimension }
     * 
     */
    public ApertureDimension createApertureDimension() {
        return new ApertureDimension();
    }

    /**
     * Create an instance of {@link ResolutionDimension }
     * 
     */
    public ResolutionDimension createResolutionDimension() {
        return new ResolutionDimension();
    }

    /**
     * Create an instance of {@link EnergyRatingType }
     * 
     */
    public EnergyRatingType createEnergyRatingType() {
        return new EnergyRatingType();
    }

    /**
     * Create an instance of {@link MemorySizeIntegerDimension }
     * 
     */
    public MemorySizeIntegerDimension createMemorySizeIntegerDimension() {
        return new MemorySizeIntegerDimension();
    }

    /**
     * Create an instance of {@link LengthDimensionOptionalUnit }
     * 
     */
    public LengthDimensionOptionalUnit createLengthDimensionOptionalUnit() {
        return new LengthDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link NoiseLevelDimension }
     * 
     */
    public NoiseLevelDimension createNoiseLevelDimension() {
        return new NoiseLevelDimension();
    }

    /**
     * Create an instance of {@link CustomizationInfoType }
     * 
     */
    public CustomizationInfoType createCustomizationInfoType() {
        return new CustomizationInfoType();
    }

    /**
     * Create an instance of {@link TaxDataSubtype }
     * 
     */
    public TaxDataSubtype createTaxDataSubtype() {
        return new TaxDataSubtype();
    }

    /**
     * Create an instance of {@link PositiveWeightDimension }
     * 
     */
    public PositiveWeightDimension createPositiveWeightDimension() {
        return new PositiveWeightDimension();
    }

    /**
     * Create an instance of {@link AreaDimensionOptionalUnit }
     * 
     */
    public AreaDimensionOptionalUnit createAreaDimensionOptionalUnit() {
        return new AreaDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link CurrentDimension }
     * 
     */
    public CurrentDimension createCurrentDimension() {
        return new CurrentDimension();
    }

    /**
     * Create an instance of {@link NeckSizeDimension }
     * 
     */
    public NeckSizeDimension createNeckSizeDimension() {
        return new NeckSizeDimension();
    }

    /**
     * Create an instance of {@link AmperageDimension }
     * 
     */
    public AmperageDimension createAmperageDimension() {
        return new AmperageDimension();
    }

    /**
     * Create an instance of {@link LuminiousIntensityDimension }
     * 
     */
    public LuminiousIntensityDimension createLuminiousIntensityDimension() {
        return new LuminiousIntensityDimension();
    }

    /**
     * Create an instance of {@link VolumeRateDimension }
     * 
     */
    public VolumeRateDimension createVolumeRateDimension() {
        return new VolumeRateDimension();
    }

    /**
     * Create an instance of {@link LuminanceDimension }
     * 
     */
    public LuminanceDimension createLuminanceDimension() {
        return new LuminanceDimension();
    }

    /**
     * Create an instance of {@link OptionalMagnificationDimension }
     * 
     */
    public OptionalMagnificationDimension createOptionalMagnificationDimension() {
        return new OptionalMagnificationDimension();
    }

    /**
     * Create an instance of {@link VoltageIntegerDimensionOptionalUnit }
     * 
     */
    public VoltageIntegerDimensionOptionalUnit createVoltageIntegerDimensionOptionalUnit() {
        return new VoltageIntegerDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link SpeedDimension }
     * 
     */
    public SpeedDimension createSpeedDimension() {
        return new SpeedDimension();
    }

    /**
     * Create an instance of {@link LuminanceIntegerDimension }
     * 
     */
    public LuminanceIntegerDimension createLuminanceIntegerDimension() {
        return new LuminanceIntegerDimension();
    }

    /**
     * Create an instance of {@link MemorySizeDimension }
     * 
     */
    public MemorySizeDimension createMemorySizeDimension() {
        return new MemorySizeDimension();
    }

    /**
     * Create an instance of {@link BurnTimeDimension }
     * 
     */
    public BurnTimeDimension createBurnTimeDimension() {
        return new BurnTimeDimension();
    }

    /**
     * Create an instance of {@link JewelryLengthDimension }
     * 
     */
    public JewelryLengthDimension createJewelryLengthDimension() {
        return new JewelryLengthDimension();
    }

    /**
     * Create an instance of {@link LuminancePositiveIntegerDimension }
     * 
     */
    public LuminancePositiveIntegerDimension createLuminancePositiveIntegerDimension() {
        return new LuminancePositiveIntegerDimension();
    }

    /**
     * Create an instance of {@link PressureDimension }
     * 
     */
    public PressureDimension createPressureDimension() {
        return new PressureDimension();
    }

    /**
     * Create an instance of {@link PowerDimension }
     * 
     */
    public PowerDimension createPowerDimension() {
        return new PowerDimension();
    }

    /**
     * Create an instance of {@link VineyardYieldDimension }
     * 
     */
    public VineyardYieldDimension createVineyardYieldDimension() {
        return new VineyardYieldDimension();
    }

    /**
     * Create an instance of {@link ContinuousShootingDimension }
     * 
     */
    public ContinuousShootingDimension createContinuousShootingDimension() {
        return new ContinuousShootingDimension();
    }

    /**
     * Create an instance of {@link StringTemperatureDimension }
     * 
     */
    public StringTemperatureDimension createStringTemperatureDimension() {
        return new StringTemperatureDimension();
    }

    /**
     * Create an instance of {@link StringTimeDimension }
     * 
     */
    public StringTimeDimension createStringTimeDimension() {
        return new StringTimeDimension();
    }

    /**
     * Create an instance of {@link TemperatureRatingDimension }
     * 
     */
    public TemperatureRatingDimension createTemperatureRatingDimension() {
        return new TemperatureRatingDimension();
    }

    /**
     * Create an instance of {@link CycleLengthDimension }
     * 
     */
    public CycleLengthDimension createCycleLengthDimension() {
        return new CycleLengthDimension();
    }

    /**
     * Create an instance of {@link OptionalResolutionDimension }
     * 
     */
    public OptionalResolutionDimension createOptionalResolutionDimension() {
        return new OptionalResolutionDimension();
    }

    /**
     * Create an instance of {@link ForceDimension }
     * 
     */
    public ForceDimension createForceDimension() {
        return new ForceDimension();
    }

    /**
     * Create an instance of {@link FrequencyIntegerDimension }
     * 
     */
    public FrequencyIntegerDimension createFrequencyIntegerDimension() {
        return new FrequencyIntegerDimension();
    }

    /**
     * Create an instance of {@link VolumeAndVolumeRateDimension }
     * 
     */
    public VolumeAndVolumeRateDimension createVolumeAndVolumeRateDimension() {
        return new VolumeAndVolumeRateDimension();
    }

    /**
     * Create an instance of {@link GraduationInterval }
     * 
     */
    public GraduationInterval createGraduationInterval() {
        return new GraduationInterval();
    }

    /**
     * Create an instance of {@link VolumeIntegerDimension }
     * 
     */
    public VolumeIntegerDimension createVolumeIntegerDimension() {
        return new VolumeIntegerDimension();
    }

    /**
     * Create an instance of {@link TimeIntegerDimension }
     * 
     */
    public TimeIntegerDimension createTimeIntegerDimension() {
        return new TimeIntegerDimension();
    }

    /**
     * Create an instance of {@link DatedPrice }
     * 
     */
    public DatedPrice createDatedPrice() {
        return new DatedPrice();
    }

    /**
     * Create an instance of {@link WattageDimension }
     * 
     */
    public WattageDimension createWattageDimension() {
        return new WattageDimension();
    }

    /**
     * Create an instance of {@link ConditionInfo }
     * 
     */
    public ConditionInfo createConditionInfo() {
        return new ConditionInfo();
    }

    /**
     * Create an instance of {@link AssemblyTimeDimension }
     * 
     */
    public AssemblyTimeDimension createAssemblyTimeDimension() {
        return new AssemblyTimeDimension();
    }

    /**
     * Create an instance of {@link VoltageIntegerDimension }
     * 
     */
    public VoltageIntegerDimension createVoltageIntegerDimension() {
        return new VoltageIntegerDimension();
    }

    /**
     * Create an instance of {@link EnergyConsumptionDimension }
     * 
     */
    public EnergyConsumptionDimension createEnergyConsumptionDimension() {
        return new EnergyConsumptionDimension();
    }

    /**
     * Create an instance of {@link WeightRecommendationType }
     * 
     */
    public WeightRecommendationType createWeightRecommendationType() {
        return new WeightRecommendationType();
    }

    /**
     * Create an instance of {@link BootSizeDimension }
     * 
     */
    public BootSizeDimension createBootSizeDimension() {
        return new BootSizeDimension();
    }

    /**
     * Create an instance of {@link MagnificationDimension }
     * 
     */
    public MagnificationDimension createMagnificationDimension() {
        return new MagnificationDimension();
    }

    /**
     * Create an instance of {@link DatedCompareAtPrice }
     * 
     */
    public DatedCompareAtPrice createDatedCompareAtPrice() {
        return new DatedCompareAtPrice();
    }

    /**
     * Create an instance of {@link WattageDimensionOptionalUnit }
     * 
     */
    public WattageDimensionOptionalUnit createWattageDimensionOptionalUnit() {
        return new WattageDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link LoyaltyCustomAttribute }
     * 
     */
    public LoyaltyCustomAttribute createLoyaltyCustomAttribute() {
        return new LoyaltyCustomAttribute();
    }

    /**
     * Create an instance of {@link MillimeterDecimalDimension }
     * 
     */
    public MillimeterDecimalDimension createMillimeterDecimalDimension() {
        return new MillimeterDecimalDimension();
    }

    /**
     * Create an instance of {@link VoltageDecimalDimension }
     * 
     */
    public VoltageDecimalDimension createVoltageDecimalDimension() {
        return new VoltageDecimalDimension();
    }

    /**
     * Create an instance of {@link ClothingSizeDimension }
     * 
     */
    public ClothingSizeDimension createClothingSizeDimension() {
        return new ClothingSizeDimension();
    }

    /**
     * Create an instance of {@link TorqueType }
     * 
     */
    public TorqueType createTorqueType() {
        return new TorqueType();
    }

    /**
     * Create an instance of {@link VolumeDimension }
     * 
     */
    public VolumeDimension createVolumeDimension() {
        return new VolumeDimension();
    }

    /**
     * Create an instance of {@link AirFlowDisplacementDimension }
     * 
     */
    public AirFlowDisplacementDimension createAirFlowDisplacementDimension() {
        return new AirFlowDisplacementDimension();
    }

    /**
     * Create an instance of {@link TimeDimension }
     * 
     */
    public TimeDimension createTimeDimension() {
        return new TimeDimension();
    }

    /**
     * Create an instance of {@link PositiveNonZeroWeightDimension }
     * 
     */
    public PositiveNonZeroWeightDimension createPositiveNonZeroWeightDimension() {
        return new PositiveNonZeroWeightDimension();
    }

    /**
     * Create an instance of {@link BatteryPowerDimension }
     * 
     */
    public BatteryPowerDimension createBatteryPowerDimension() {
        return new BatteryPowerDimension();
    }

    /**
     * Create an instance of {@link DensityDimension }
     * 
     */
    public DensityDimension createDensityDimension() {
        return new DensityDimension();
    }

    /**
     * Create an instance of {@link AreaDimension }
     * 
     */
    public AreaDimension createAreaDimension() {
        return new AreaDimension();
    }

    /**
     * Create an instance of {@link BatteryLifeDimension }
     * 
     */
    public BatteryLifeDimension createBatteryLifeDimension() {
        return new BatteryLifeDimension();
    }

    /**
     * Create an instance of {@link WattageIntegerDimension }
     * 
     */
    public WattageIntegerDimension createWattageIntegerDimension() {
        return new WattageIntegerDimension();
    }

    /**
     * Create an instance of {@link CurrencyAmount }
     * 
     */
    public CurrencyAmount createCurrencyAmount() {
        return new CurrencyAmount();
    }

    /**
     * Create an instance of {@link StringLengthOptionalDimension }
     * 
     */
    public StringLengthOptionalDimension createStringLengthOptionalDimension() {
        return new StringLengthOptionalDimension();
    }

    /**
     * Create an instance of {@link CurencyDimension }
     * 
     */
    public CurencyDimension createCurencyDimension() {
        return new CurencyDimension();
    }

    /**
     * Create an instance of {@link AlcoholContentDimension }
     * 
     */
    public AlcoholContentDimension createAlcoholContentDimension() {
        return new AlcoholContentDimension();
    }

    /**
     * Create an instance of {@link OpticalPowerDimension }
     * 
     */
    public OpticalPowerDimension createOpticalPowerDimension() {
        return new OpticalPowerDimension();
    }

    /**
     * Create an instance of {@link SweetnessAtHarvestDimension }
     * 
     */
    public SweetnessAtHarvestDimension createSweetnessAtHarvestDimension() {
        return new SweetnessAtHarvestDimension();
    }

    /**
     * Create an instance of {@link PositiveCurrencyAmount }
     * 
     */
    public PositiveCurrencyAmount createPositiveCurrencyAmount() {
        return new PositiveCurrencyAmount();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link BatteryPowerIntegerDimension }
     * 
     */
    public BatteryPowerIntegerDimension createBatteryPowerIntegerDimension() {
        return new BatteryPowerIntegerDimension();
    }

    /**
     * Create an instance of {@link DateIntegerDimension }
     * 
     */
    public DateIntegerDimension createDateIntegerDimension() {
        return new DateIntegerDimension();
    }

    /**
     * Create an instance of {@link TemperatureDimension }
     * 
     */
    public TemperatureDimension createTemperatureDimension() {
        return new TemperatureDimension();
    }

    /**
     * Create an instance of {@link ResistanceDimension }
     * 
     */
    public ResistanceDimension createResistanceDimension() {
        return new ResistanceDimension();
    }

    /**
     * Create an instance of {@link SubscriptionTermDimension }
     * 
     */
    public SubscriptionTermDimension createSubscriptionTermDimension() {
        return new SubscriptionTermDimension();
    }

    /**
     * Create an instance of {@link StringLengthDimension }
     * 
     */
    public StringLengthDimension createStringLengthDimension() {
        return new StringLengthDimension();
    }

    /**
     * Create an instance of {@link OptionalLengthIntegerDimension }
     * 
     */
    public OptionalLengthIntegerDimension createOptionalLengthIntegerDimension() {
        return new OptionalLengthIntegerDimension();
    }

    /**
     * Create an instance of {@link JewelryWeightDimension }
     * 
     */
    public JewelryWeightDimension createJewelryWeightDimension() {
        return new JewelryWeightDimension();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link SunProtectionDimension }
     * 
     */
    public SunProtectionDimension createSunProtectionDimension() {
        return new SunProtectionDimension();
    }

    /**
     * Create an instance of {@link PromotionDataType.Component }
     * 
     */
    public PromotionDataType.Component createPromotionDataTypeComponent() {
        return new PromotionDataType.Component();
    }

    /**
     * Create an instance of {@link BuyerPrice.Component }
     * 
     */
    public BuyerPrice.Component createBuyerPriceComponent() {
        return new BuyerPrice.Component();
    }

    /**
     * Create an instance of {@link AmazonFees.Fee }
     * 
     */
    public AmazonFees.Fee createAmazonFeesFee() {
        return new AmazonFees.Fee();
    }

    /**
     * Create an instance of {@link DirectPaymentType.Component }
     * 
     */
    public DirectPaymentType.Component createDirectPaymentTypeComponent() {
        return new DirectPaymentType.Component();
    }

    /**
     * Create an instance of {@link TaxData.TaxJurisdictions }
     * 
     */
    public TaxData.TaxJurisdictions createTaxDataTaxJurisdictions() {
        return new TaxData.TaxJurisdictions();
    }

    /**
     * Create an instance of {@link TaxData.TaxRates }
     * 
     */
    public TaxData.TaxRates createTaxDataTaxRates() {
        return new TaxData.TaxRates();
    }

    /**
     * Create an instance of {@link OrderReport.BillingData.CreditCard }
     * 
     */
    public OrderReport.BillingData.CreditCard createOrderReportBillingDataCreditCard() {
        return new OrderReport.BillingData.CreditCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShipmentID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createShipmentID(String value) {
        return new JAXBElement<String>(_ShipmentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentServiceLevel")
    public JAXBElement<String> createFulfillmentServiceLevel(String value) {
        return new JAXBElement<String>(_FulfillmentServiceLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantOrderItemID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantOrderItemID(String value) {
        return new JAXBElement<String>(_MerchantOrderItemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentMethod")
    public JAXBElement<String> createFulfillmentMethod(String value) {
        return new JAXBElement<String>(_FulfillmentMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MarketplaceName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMarketplaceName(String value) {
        return new JAXBElement<String>(_MarketplaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ColorMap")
    public JAXBElement<String> createColorMap(String value) {
        return new JAXBElement<String>(_ColorMap_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonOrderID")
    public JAXBElement<String> createAmazonOrderID(String value) {
        return new JAXBElement<String>(_AmazonOrderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProductTaxCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createProductTaxCode(String value) {
        return new JAXBElement<String>(_ProductTaxCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonOrderItemCode")
    public JAXBElement<String> createAmazonOrderItemCode(String value) {
        return new JAXBElement<String>(_AmazonOrderItemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExternalCustomerID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createExternalCustomerID(String value) {
        return new JAXBElement<String>(_ExternalCustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShipOption")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createShipOption(String value) {
        return new JAXBElement<String>(_ShipOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PromotionClaimCode")
    public JAXBElement<String> createPromotionClaimCode(String value) {
        return new JAXBElement<String>(_PromotionClaimCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Denomination")
    public JAXBElement<BigDecimal> createDenomination(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Denomination_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonCustomerID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAmazonCustomerID(String value) {
        return new JAXBElement<String>(_AmazonCustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DeliveryChannel")
    public JAXBElement<String> createDeliveryChannel(String value) {
        return new JAXBElement<String>(_DeliveryChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CharacterData")
    public JAXBElement<CharacterDataType> createCharacterData(CharacterDataType value) {
        return new JAXBElement<CharacterDataType>(_CharacterData_QNAME, CharacterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentCenterID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFulfillmentCenterID(String value) {
        return new JAXBElement<String>(_FulfillmentCenterID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CarrierCode")
    public JAXBElement<String> createCarrierCode(String value) {
        return new JAXBElement<String>(_CarrierCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantFulfillmentID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantFulfillmentID(String value) {
        return new JAXBElement<String>(_MerchantFulfillmentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantPromotionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantPromotionID(String value) {
        return new JAXBElement<String>(_MerchantPromotionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConditionType")
    public JAXBElement<String> createConditionType(String value) {
        return new JAXBElement<String>(_ConditionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantOrderID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantOrderID(String value) {
        return new JAXBElement<String>(_MerchantOrderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SKU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSKU(String value) {
        return new JAXBElement<String>(_SKU_QNAME, String.class, null, value);
    }

}
