/**
 * iikoCloud API
 * <h3>Description of common data formats:</h3><b>uuid</b> - string in UUID(universally unique identifier).<br/>Examples: <i>550e8400-e29b-41d4-a716-446655440000, b090de0b-8550-6e17-70b2-bbba152bcbd3</i><br/><br/><b>date-time</b> - date and time string in custom string format <b>yyyy-MM-dd HH:mm:ss.fff</b>.<br/>Examples: <i>2017-04-29 20:45:00.000, 2018-01-01 01:01:30.123</i>
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.restomatik.client.model


case class GetExternalMenuWithPriceSourceRequestDto(
  /* id of the requested menu */
  id: Option[Int] = None,
  /* Price from the external menu or price category */
  priceSource: Option[GetExternalMenuWithPriceSourceRequestDtoEnums.PriceSource] = None,
  organizations: Option[Seq[String]] = None,
  priceCategoryId: Option[String] = None
)

object GetExternalMenuWithPriceSourceRequestDtoEnums {

  type PriceSource = PriceSource.Value
  object PriceSource extends Enumeration {
    val CONFIGUREDINMENU = Value("CONFIGURED_IN_MENU")
    val PRICECATEGORY = Value("PRICE_CATEGORY")
  }

}