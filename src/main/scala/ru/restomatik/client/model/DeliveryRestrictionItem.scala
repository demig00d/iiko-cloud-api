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
   * Item of delivery restrictions.
   */
case class DeliveryRestrictionItem(
  /* The minimum order amount for a given point in a given time interval in this delivery zone. */
  minSum: Double,
  /* Terminal group ID.                Can be obtained by `/api/1/terminal_groups` operation. */
  terminalGroupId: UUID,
  /* Organization ID.                Can be obtained by `/api/1/organizations` operation. */
  organizationId: UUID,
  /* Name of delivery zone from cartography. */
  zone: String,
  /* Days of the week. */
  weekMap: Int,
  /* The time from which the point can process orders from the selected zone, in minutes from the beginning of the day. */
  from: Int,
  /* The maximum time at which a point can carry an order to a given zone, in minutes from the beginning of the day. */
  to: Int,
  /* Priority of point in delivery zone. */
  priority: Int,
  /* Delivery duration in delivery zone. */
  deliveryDurationInMinutes: Long,
  /* Link to \"delivery service payment\". */
  deliveryServiceProductId: UUID
)

