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
   * External payment type
   */
case class ExternalPayment(
  paymentTypeKind: String,
  /* Amount due. */
  sum: Double,
  /* Payment type.                 Can be obtained by `/api/1/payment_types` operation. */
  paymentTypeId: UUID,
  /* Whether payment item is processed by external payment system (made from outside). */
  isProcessedExternally: Option[Boolean] = None,
  paymentAdditionalData: Option[IikoTransportPublicApiContractsDeliveriesRequestCreateOrderPaymentPaymentAdditionalData] = None,
  /* Whether the payment item is externally fiscalized.   > Allowed from version `7.6.3`. */
  isFiscalizedExternally: Option[Boolean] = None,
  /* Whether the payment item is prepay. Unavailable for `paymentKindType.IikoCard`.   > Allowed from version `8.2.6`. */
  isPrepay: Option[Boolean] = None
)

