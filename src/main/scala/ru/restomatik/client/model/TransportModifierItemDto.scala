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

case class TransportModifierItemDto(
  prices: Option[Seq[TransportPriceDto]] = None,
  /* Modifier's code */
  sku: Option[String] = None,
  /* Modifier's name */
  name: Option[String] = None,
  /* Modifier's description */
  description: Option[String] = None,
  /* Links to images */
  buttonImage: Option[String] = None,
  restrictions: Option[ModifierRestrictionsDto] = None,
  allergenGroups: Option[Seq[AllergenGroupDto]] = None,
  nutritionPerHundredGrams: Option[Any] = None,
  /* Modifier's weight in gramms */
  portionWeightGrams: Option[Float] = None,
  tags: Option[Seq[TagDto]] = None,
  /* Modifier's Id */
  itemId: Option[UUID] = None
)
