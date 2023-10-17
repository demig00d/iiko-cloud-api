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
   * Request for check restaurant sections workload.
   */
case class GetRestaurantSectionsWorkloadRequest(
  /* Collection of restaurant section ID.                Can be obtained by `/api/1/reserve/available_restaurant_sections` operation. */
  restaurantSectionIds: Seq[UUID],
  /* Estimated start time (Local for the terminal). Lower limit.                Order details are stored for 90 days. */
  dateFrom: String,
  /* Estimated start time (Local for the terminal). Upper limit. */
  dateTo: Option[String] = None
)

