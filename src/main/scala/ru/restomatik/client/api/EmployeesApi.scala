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

object EmployeesApi {

def apply(baseUrl: String = "https://api-ru.iiko.services") = new EmployeesApi(baseUrl)
}

class EmployeesApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : ActiveCourierLocationsResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param activeCourierLocationsByTerminalGroupRequest 
   */
  def api1EmployeesCouriersActiveLocationByTerminalPost(authorization: String, timeout: Option[Int] = None, activeCourierLocationsByTerminalGroupRequest: Option[ActiveCourierLocationsByTerminalGroupRequest] = None
): Request[Either[ResponseException[String, Exception], ActiveCourierLocationsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/couriers/active_location/by_terminal")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(activeCourierLocationsByTerminalGroupRequest)
      .response(asJson[ActiveCourierLocationsResponse])

  /**
   * Expected answers:
   *   code 200 : ActiveCourierLocationsResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param couriersRequest 
   */
  def api1EmployeesCouriersActiveLocationPost(authorization: String, timeout: Option[Int] = None, couriersRequest: Option[CouriersRequest] = None
): Request[Either[ResponseException[String, Exception], ActiveCourierLocationsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/couriers/active_location")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(couriersRequest)
      .response(asJson[ActiveCourierLocationsResponse])

  /**
   * Expected answers:
   *   code 200 : EmployeesWithRoleSignResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param couriersAndCheckRoleRequest 
   */
  def api1EmployeesCouriersByRolePost(authorization: String, timeout: Option[Int] = None, couriersAndCheckRoleRequest: Option[CouriersAndCheckRoleRequest] = None
): Request[Either[ResponseException[String, Exception], EmployeesWithRoleSignResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/couriers/by_role")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(couriersAndCheckRoleRequest)
      .response(asJson[EmployeesWithRoleSignResponse])

  /**
   * Expected answers:
   *   code 200 : CourierLocationsByTimeOffsetResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param courierLocationsByTimeOffsetRequest 
   */
  def api1EmployeesCouriersLocationsByTimeOffsetPost(authorization: String, timeout: Option[Int] = None, courierLocationsByTimeOffsetRequest: Option[CourierLocationsByTimeOffsetRequest] = None
): Request[Either[ResponseException[String, Exception], CourierLocationsByTimeOffsetResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/couriers/locations/by_time_offset")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(courierLocationsByTimeOffsetRequest)
      .response(asJson[CourierLocationsByTimeOffsetResponse])

  /**
   * Expected answers:
   *   code 200 : EmployeesResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param couriersRequest 
   */
  def api1EmployeesCouriersPost(authorization: String, timeout: Option[Int] = None, couriersRequest: Option[CouriersRequest] = None
): Request[Either[ResponseException[String, Exception], EmployeesResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/couriers")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(couriersRequest)
      .response(asJson[EmployeesResponse])

  /**
   * Expected answers:
   *   code 200 : EmployeeInfoResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param employeeInfoRequest 
   */
  def api1EmployeesInfoPost(authorization: String, timeout: Option[Int] = None, employeeInfoRequest: Option[EmployeeInfoRequest] = None
): Request[Either[ResponseException[String, Exception], EmployeeInfoResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/info")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(employeeInfoRequest)
      .response(asJson[EmployeeInfoResponse])

  /**
   *    > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : ChangePersonalSessionResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param openPersonalSessionRequest 
   */
  def api1EmployeesShiftClockinPost(authorization: String, timeout: Option[Int] = None, openPersonalSessionRequest: Option[OpenPersonalSessionRequest] = None
): Request[Either[ResponseException[String, Exception], ChangePersonalSessionResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/shift/clockin")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(openPersonalSessionRequest)
      .response(asJson[ChangePersonalSessionResponse])

  /**
   *    > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : ChangePersonalSessionResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param closePersonalSessionRequest 
   */
  def api1EmployeesShiftClockoutPost(authorization: String, timeout: Option[Int] = None, closePersonalSessionRequest: Option[ClosePersonalSessionRequest] = None
): Request[Either[ResponseException[String, Exception], ChangePersonalSessionResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/shift/clockout")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(closePersonalSessionRequest)
      .response(asJson[ChangePersonalSessionResponse])

  /**
   * Expected answers:
   *   code 200 : GetPersonalSessionInfoResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param getPersonalSessionInfoRequest 
   */
  def api1EmployeesShiftIsOpenPost(authorization: String, timeout: Option[Int] = None, getPersonalSessionInfoRequest: Option[GetPersonalSessionInfoRequest] = None
): Request[Either[ResponseException[String, Exception], GetPersonalSessionInfoResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/employees/shift/is_open")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(getPersonalSessionInfoRequest)
      .response(asJson[GetPersonalSessionInfoResponse])

}
