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

import ru.restomatik.client.model.DeliveryStatus._

import java.util.UUID

  /**
   * Order creation details.  > Field is filled up if \"creationStatus\"=\"Success\".
   */
case class IikoTransportPublicApiContractsDeliveriesResponseOrderOrderInfoOrder(
  /* ID of delivery serving as source for splitting by FCRs. */
  parentDeliveryId: Option[UUID] = None,
  customer: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderCustomer] = None,
  /* Delivery phone number. */
  phone: String,
  deliveryPoint: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderDeliveryPoint] = None,
  status: DeliveryStatus,
  cancelInfo: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderCancelInfo] = None,
  courierInfo: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderCourierInfo] = None,
  /* Order fulfillment time (Local for the terminal). */
  completeBefore: String,
  /* Delivery creation time in iikoFront (Local for the terminal). */
  whenCreated: String,
  /* Delivery confirmation time (Local for the terminal). */
  whenConfirmed: Option[String] = None,
  /* Service printing time (Local for the terminal). */
  whenPrinted: Option[String] = None,
  /* Cooking completion time (Local for the terminal). */
  whenCookingCompleted: Option[String] = None,
  /* Delivery dispatch time (Local for the terminal). */
  whenSended: Option[String] = None,
  /* Actual delivery time (Local for delivery terminal). */
  whenDelivered: Option[String] = None,
  /* Order comment. */
  comment: Option[String] = None,
  problem: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderProblem] = None,
  operator: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderOperator] = None,
  marketingSource: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderMarketingSource] = None,
  /* Duration of delivery (in minutes). */
  deliveryDuration: Option[Long] = None,
  /* Ordinal number in route list.  <remarks>  Field is filled up at the time of delivery allocation by logistics in iikoFront.  If logistics is not in use, the field is not filled up.  </remarks> */
  indexInCourierRoute: Option[Int] = None,
  /* The time when you need to start cooking an order (Local for the terminal). */
  cookingStartTime: String,
  /* Order is deleted. */
  isDeleted: Option[Boolean] = None,
  /* Moment of time when CloudAPI received the request to create the order (UTC). */
  whenReceivedByApi: Option[String] = None,
  /* Moment of time when the order first received and saved from iikoFront (UTC). */
  whenReceivedFromFront: Option[String] = None,
  /* Tells that this delivery has been moved from terminal group  with id *MovedFromTerminalGroupId* by cancelling delivery with deliveryId *MovedFromDeliveryId*.   > Allowed from version `7.5.4`. */
  movedFromDeliveryId: Option[UUID] = None,
  /* Tells that this delivery has been moved from terminal group  with id *MovedFromTerminalGroupId* by cancelling delivery with deliveryId *MovedFromDeliveryId*.   > Allowed from version `7.5.4`. */
  movedFromTerminalGroupId: Option[UUID] = None,
  /* Tells that this delivery has been moved from terminal group  with id *MovedFromTerminalGroupId* by cancelling delivery with deliveryId *MovedFromDeliveryId*.   > Allowed from version `7.5.4`. */
  movedFromOrganizationId: Option[UUID] = None,
  externalCourierService: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderExternalCourierService] = None,
  /* Tells that this delivery has been canceled and moved to terminal group  with id *MovedToTerminalGroupId*. */
  movedToDeliveryId: Option[UUID] = None,
  movedToTerminalGroupId: Option[UUID] = None,
  movedToOrganizationId: Option[UUID] = None,
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

object IikoTransportPublicApiContractsDeliveriesResponseOrderOrderInfoOrderEnums {

}
