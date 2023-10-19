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
import ru.restomatik.client.model.{CorrelationIdResponse, SendNotificationRequest}
import sttp.client3._
import sttp.model.Method

object NotificationsApi {

def apply(baseUrl: String = "https://api-ru.iiko.services") = new NotificationsApi(baseUrl)
}

class NotificationsApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : CorrelationIdResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param sendNotificationRequest 
   */
  def api1NotificationsSendPost(authorization: String, timeout: Option[Int] = None, sendNotificationRequest: Option[SendNotificationRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/notifications/send")
      .contentType("application/json")
      .header("Authorization", s"Bearer $authorization")
      .header("Timeout", timeout.toString)
      .body(sendNotificationRequest)
      .response(asJson[CorrelationIdResponse])

}
