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
   * Order. Used only at a banquet.
   */
case class IikoTransportPublicApiContractsReservesCreateReserveRequestOrder(
  /* External menu ID. */
  menuId: Option[String] = None,
  /* Order items. */
  items: Seq[OrderItem],
  /* Combos included in order. */
  combos: Option[Seq[Combo]] = None,
  /* Order payment components.   > Type **IikoCard** allowed from version `7.1.5`. */
  payments: Option[Seq[Payment]] = None,
  /* Order tips components. */
  tips: Option[Seq[TipsPayment]] = None,
  /* The string key (marker) of the source (partner - api user) that created the order. Needed to limit the visibility of orders for external integration. */
  sourceKey: Option[String] = None,
  discountsInfo: Option[IikoTransportPublicApiContractsDeliveriesRequestCreateOrderDeliveryOrderDiscountsInfo] = None,
  loyaltyInfo: Option[IikoTransportPublicApiContractsDeliveriesRequestCreateOrderDeliveryOrderLoyaltyInfo] = None,
  /* Order type ID.                 Can be obtained by `/api/1/deliveries/order_types` operation */
  orderTypeId: Option[UUID] = None,
  chequeAdditionalInfo: Option[IikoTransportPublicApiContractsDeliveriesRequestCreateOrderDeliveryOrderChequeAdditionalInfo] = None,
  /* Order external data.   > Allowed from version `8.0.6`. */
  externalData: Option[Seq[ExternalData]] = None
)

