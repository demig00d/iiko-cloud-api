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

  /**
   * Information on group of modifiers.
   */
case class GroupModifierInfo(
  /* ID. */
  id: UUID,
  /* Minimum quantity. */
  minAmount: Int,
  /* Maximum quantity. */
  maxAmount: Int,
  /* Required availability. */
  required: Boolean,
  /* Presence of max/min quantity limitations of child modifiers. */
  childModifiersHaveMinMaxRestrictions: Option[Boolean] = None,
  /* List of child modifiers. */
  childModifiers: Seq[ChildModifierInfo],
  /* Hide if the amount is by default. This field is supported since 7.2.4 iikoRMS version. */
  hideIfDefaultAmount: Option[Boolean] = None,
  /* Amount by default. This field is supported since 7.2.4 iikoRMS version. */
  defaultAmount: Option[Int] = None,
  /* Modifier can be split. This field is supported since 7.2.4 iikoRMS version. */
  splittable: Option[Boolean] = None,
  /* Free amount. This field is supported since 7.2.4 iikoRMS version. */
  freeOfChargeAmount: Option[Int] = None
)
