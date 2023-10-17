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

import ru.restomatik.client.model.PaymentProcessingType._
import ru.restomatik.client.model.PaymentTypeKind._

import java.util.UUID

  /**
   * DTO for payment type in iikoRMS
   */
case class PaymentType(
  /* Payment type ID */
  id: Option[UUID] = None,
  /* Payment type code */
  code: Option[String] = None,
  /* Payment type name */
  name: Option[String] = None,
  /* Payment type comment */
  comment: Option[String] = None,
  /* Combinability attribute */
  combinable: Option[Boolean] = None,
  /* External system revision number. */
  externalRevision: Option[Long] = None,
  /* Array of marketing campaigns associated with LoyaltyApp payment type applicable to this organization. */
  applicableMarketingCampaigns: Seq[UUID],
  /* IsDeleted attribute of payment type. */
  isDeleted: Option[Boolean] = None,
  /* If true, payment type is fiscal and bill will be printed. */
  printCheque: Option[Boolean] = None,
  paymentProcessingType: Option[PaymentProcessingType] = None,
  paymentTypeKind: Option[PaymentTypeKind] = None,
  /* Terminal groups where this payment type is available. */
  terminalGroups: Seq[TerminalGroup]
)

object PaymentTypeEnums {

}
