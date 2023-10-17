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

import java.util.UUID

case class TransportItemSizeDto(
  prices: Option[Seq[TransportPriceDto]] = None,
  itemModifierGroups: Option[Seq[TransportModifierGroupDto]] = None,
  /* Unique size code, consists of the product code and the name of the size, if the product has one size, then the size code will be equal to the product code */
  sku: Option[String] = None,
  sizeCode: Option[String] = None,
  /* Name of the product size, the name can be empty if there is only one size in the list */
  sizeName: Option[String] = None,
  /* Whether it is a default size of the product. If the product has one size, then the parameter will be true, if the product has several sizes, none of them can be default. */
  isDefault: Option[Boolean] = None,
  /* Size's weight */
  portionWeightGrams: Option[Float] = None,
  /* ID size, can be empty if the default size is selected and it is the only size in the list */
  sizeId: Option[UUID] = None,
  nutritionPerHundredGrams: Option[Any] = None,
  /* links to images */
  buttonImageUrl: Option[String] = None,
  buttonImageCroppedUrl: Option[Seq[String]] = None
)
