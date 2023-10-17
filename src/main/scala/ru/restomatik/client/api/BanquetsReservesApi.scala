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
package ru.restomatik.client.api

import ru.restomatik.client.core.JsonSupport._
import ru.restomatik.client.model._
import sttp.client3._
import sttp.model.Method

object BanquetsReservesApi {

def apply(baseUrl: String = "https://api-ru.iiko.services") = new BanquetsReservesApi(baseUrl)
}

class BanquetsReservesApi(baseUrl: String) {

  /**
   * Available only for banquets.   > Allowed from version `8.2.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : CorrelationIdResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param addOrderItemsToBanquetRequest 
   */
  def api1ReserveAddItemsPost(authorization: String, timeout: Option[Int] = None, addOrderItemsToBanquetRequest: Option[AddOrderItemsToBanquetRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/add_items")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(addOrderItemsToBanquetRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   * Available only for banquets.   > Allowed from version `8.2.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : CorrelationIdResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param addOrderPaymentsToBanquetRequest 
   */
  def api1ReserveAddPaymentsPost(authorization: String, timeout: Option[Int] = None, addOrderPaymentsToBanquetRequest: Option[AddOrderPaymentsToBanquetRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/add_payments")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(addOrderPaymentsToBanquetRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.1.5`.
   * 
   * Expected answers:
   *   code 200 : GetOrganizationsResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param getOrganizationsRequest 
   */
  def api1ReserveAvailableOrganizationsPost(authorization: String, timeout: Option[Int] = None, getOrganizationsRequest: Option[GetOrganizationsRequest] = None
): Request[Either[ResponseException[String, Exception], GetOrganizationsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/available_organizations")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(getOrganizationsRequest)
      .response(asJson[GetOrganizationsResponse])

  /**
   *    > Allowed from version `7.1.5`.
   * 
   * Expected answers:
   *   code 200 : GetRestaurantSectionsResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param getRestaurantSectionsRequest 
   */
  def api1ReserveAvailableRestaurantSectionsPost(authorization: String, timeout: Option[Int] = None, getRestaurantSectionsRequest: Option[GetRestaurantSectionsRequest] = None
): Request[Either[ResponseException[String, Exception], GetRestaurantSectionsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/available_restaurant_sections")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(getRestaurantSectionsRequest)
      .response(asJson[GetRestaurantSectionsResponse])

  /**
   *    > Allowed from version `7.1.5`.
   * 
   * Expected answers:
   *   code 200 : TerminalGroupsResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param getTerminalGroupsByOrganizationsRequest 
   */
  def api1ReserveAvailableTerminalGroupsPost(authorization: String, timeout: Option[Int] = None, getTerminalGroupsByOrganizationsRequest: Option[GetTerminalGroupsByOrganizationsRequest] = None
): Request[Either[ResponseException[String, Exception], TerminalGroupsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/available_terminal_groups")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(getTerminalGroupsByOrganizationsRequest)
      .response(asJson[TerminalGroupsResponse])

  /**
   * Available only for reserves with status 'New'.   > Allowed from version `8.2.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : CorrelationIdResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param cancelReserveRequest 
   */
  def api1ReserveCancelPost(authorization: String, timeout: Option[Int] = None, cancelReserveRequest: Option[CancelReserveRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/cancel")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(cancelReserveRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.1.5`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : ReserveResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param createReserveRequest 
   */
  def api1ReserveCreatePost(authorization: String, timeout: Option[Int] = None, createReserveRequest: Option[CreateReserveRequest] = None
): Request[Either[ResponseException[String, Exception], ReserveResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/create")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(createReserveRequest)
      .response(asJson[ReserveResponse])

  /**
   *    > Allowed from version `7.1.5`.
   * 
   * Expected answers:
   *   code 200 : GetRestaurantSectionsWorkloadResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param getRestaurantSectionsWorkloadRequest 
   */
  def api1ReserveRestaurantSectionsWorkloadPost(authorization: String, timeout: Option[Int] = None, getRestaurantSectionsWorkloadRequest: Option[GetRestaurantSectionsWorkloadRequest] = None
): Request[Either[ResponseException[String, Exception], GetRestaurantSectionsWorkloadResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/restaurant_sections_workload")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(getRestaurantSectionsWorkloadRequest)
      .response(asJson[GetRestaurantSectionsWorkloadResponse])

  /**
   *    > Allowed from version `7.1.5`.
   * 
   * Expected answers:
   *   code 200 : ReservesResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param reservesByIdRequest 
   */
  def api1ReserveStatusByIdPost(authorization: String, timeout: Option[Int] = None, reservesByIdRequest: Option[ReservesByIdRequest] = None
): Request[Either[ResponseException[String, Exception], ReservesResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/reserve/status_by_id")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(reservesByIdRequest)
      .response(asJson[ReservesResponse])

}