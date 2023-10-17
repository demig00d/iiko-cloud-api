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
   * Order.
   */
case class ReserveOrder(
  /* External menu ID. */
  menuId: Option[String] = None,
  /* Order amount (after discount or surcharge). */
  sum: Double,
  /* Delivery No. */
  number: Int,
  /* Delivery source. */
  sourceKey: Option[String] = None,
  /* Invoice printing time (guest bill time). */
  whenBillPrinted: Option[String] = None,
  /* Delivery closing time (Local for delivery terminal). */
  whenClosed: Option[String] = None,
  conception: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderConception] = None,
  guestsInfo: IikoTransportPublicApiContractsDeliveriesResponseOrderOrderGuestsInfo,
  /* Order items. */
  items: Seq[OrderItem],
  /* Combo. */
  combos: Option[Seq[OrderCombo]] = None,
  /* Payments. */
  payments: Option[Seq[PaymentItem]] = None,
  /* Tips. */
  tips: Option[Seq[TipsPaymentItem]] = None,
  /* Discounts. */
  discounts: Option[Seq[DiscountItem]] = None,
  orderType: IikoTransportPublicApiContractsDeliveriesResponseOrderOrderOrderType,
  /* ID of the terminal group where the order is located. */
  terminalGroupId: UUID,
  /* The amount of processed payments.  <remarks>  null - only for unsupported POS versions.  </remarks>   > Allowed from version `7.6.0`. */
  processedPaymentsSum: Double,
  loyaltyInfo: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderLoyaltyInfo] = None,
  /* Order external data.   > Allowed from version `8.0.6`. */
  externalData: Option[Seq[ExternalData]] = None
)

