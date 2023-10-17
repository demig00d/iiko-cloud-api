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

import ru.restomatik.client.model.DiscountCardMode._

import java.util.UUID

  /**
   * Discount/surcharge DTO.
   */
case class DiscountCardTypeInfo(
  /* Discount ID in RMS. */
  id: UUID,
  /* Discount name. */
  name: String,
  /* Total discount rate.  > Ignored if \"isCategorisedDiscount\" specified. */
  percent: Double,
  /* Whether it is category discount or not.  > If true, \"productCategoryDiscounts\" discounts will apply. */
  isCategorisedDiscount: Boolean,
  /* Category discount. */
  productCategoryDiscounts: Seq[ProductCategoryDiscount],
  /* Comment. */
  comment: Option[String] = None,
  /* Whether discount allows for selected application to individual items at user's discretion. */
  canBeAppliedSelectively: Boolean,
  /* Minimum order amount required for discount application.  If order amount is less than specified threshold, discount does not apply. */
  minOrderSum: Option[Double] = None,
  mode: DiscountCardMode,
  /* Fixed amount.  > Triggers if fixed amount has been specified. */
  sum: Double,
  /* Can be applied by card No.  > If true, it's enough to enter discount card No. (card swiping not required) */
  canApplyByCardNumber: Boolean,
  /* Created manually. */
  isManual: Boolean,
  /* Executed by card. */
  isCard: Boolean,
  /* Created automatically. */
  isAutomatic: Boolean,
  /* IsDeleted. */
  isDeleted: Option[Boolean] = None
)

object DiscountCardTypeInfoEnums {

}
