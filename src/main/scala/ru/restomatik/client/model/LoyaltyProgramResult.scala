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
   * Loyalty result for order.
   */
case class LoyaltyProgramResult(
  /* Program marketing campaign id. */
  marketingCampaignId: Option[UUID] = None,
  /* Program name. */
  name: Option[String] = None,
  /* Discount operations applied to order items. */
  discounts: Option[Seq[DiscountOperation]] = None,
  /* Suggested items to add or advices for customer. */
  upsales: Option[Seq[Upsale]] = None,
  /* Program free products. */
  freeProducts: Option[Seq[FreeProductsGroup]] = None,
  /* Ids of combo specification available in current order. */
  availableComboSpecifications: Option[Seq[UUID]] = None,
  /* Partially added combos, available for assembly. */
  availableCombos: Option[Seq[AvailableCombo]] = None,
  /* Certificate number is required for activation. */
  needToActivateCertificate: Option[Boolean] = None
)

