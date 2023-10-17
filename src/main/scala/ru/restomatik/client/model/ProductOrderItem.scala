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

import ru.restomatik.client.model.OrderItemStatus._

import java.util.UUID

  /**
   * Order item: item.
   */
case class ProductOrderItem(
  product: Product,
  /* Modifiers. */
  modifiers: Option[Seq[OrderItemModifier]] = None,
  /* Price per item unit. Can be sent different from the price in the base menu. */
  price: Double,
  /* Total cost per item without tax, discounts/surcharges. */
  cost: Double,
  /* Whether price is predefined. */
  pricePredefined: Boolean,
  /* Unique identifier of the item in the order and for the whole system. */
  positionId: Option[UUID] = None,
  /* Tax rate. */
  taxPercent: Option[Double] = None,
  `type`: String,
  status: OrderItemStatus,
  deleted: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderItemDeleted] = None,
  /* Quantity. */
  amount: Double,
  /* Comment. */
  comment: Option[String] = None,
  /* Printing time (Local for the terminal). */
  whenPrinted: Option[String] = None,
  size: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderComboSize] = None,
  comboInformation: Option[IikoTransportPublicApiContractsDeliveriesResponseOrderOrderItemComboInformation] = None
)

object ProductOrderItemEnums {

}
