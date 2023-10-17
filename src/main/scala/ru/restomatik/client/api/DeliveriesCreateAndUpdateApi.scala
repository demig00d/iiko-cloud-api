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

object DeliveriesCreateAndUpdateApi {

def apply(baseUrl: String = "https://api-ru.iiko.services") = new DeliveriesCreateAndUpdateApi(baseUrl)
}

class DeliveriesCreateAndUpdateApi(baseUrl: String) {

  /**
   *    > Allowed from version `7.4.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param addOrderItemsRequest 
   */
  def api1DeliveriesAddItemsPost(authorization: String, timeout: Option[Int] = None, addOrderItemsRequest: Option[AddOrderItemsRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/add_items")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(addOrderItemsRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `8.2.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param addOrderPaymentsRequest 
   */
  def api1DeliveriesAddPaymentsPost(authorization: String, timeout: Option[Int] = None, addOrderPaymentsRequest: Option[AddOrderPaymentsRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/add_payments")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(addOrderPaymentsRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.6.1`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param cancelDeliveryConfirmationRequest 
   */
  def api1DeliveriesCancelConfirmationPost(authorization: String, timeout: Option[Int] = None, cancelDeliveryConfirmationRequest: Option[CancelDeliveryConfirmationRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/cancel_confirmation")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(cancelDeliveryConfirmationRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.5.4`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param cancelOrderRequest 
   */
  def api1DeliveriesCancelPost(authorization: String, timeout: Option[Int] = None, cancelOrderRequest: Option[CancelOrderRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/cancel")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(cancelOrderRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.6.1`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changeDeliveryCommentRequest 
   */
  def api1DeliveriesChangeCommentPost(authorization: String, timeout: Option[Int] = None, changeDeliveryCommentRequest: Option[ChangeDeliveryCommentRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_comment")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changeDeliveryCommentRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.5.4`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changeCompleteBeforeRequest 
   */
  def api1DeliveriesChangeCompleteBeforePost(authorization: String, timeout: Option[Int] = None, changeCompleteBeforeRequest: Option[ChangeCompleteBeforeRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_complete_before")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changeCompleteBeforeRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.5.4`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changeDeliveryPointRequest 
   */
  def api1DeliveriesChangeDeliveryPointPost(authorization: String, timeout: Option[Int] = None, changeDeliveryPointRequest: Option[ChangeDeliveryPointRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_delivery_point")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changeDeliveryPointRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.6.1`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changeDeliveryOperatorRequest 
   */
  def api1DeliveriesChangeOperatorPost(authorization: String, timeout: Option[Int] = None, changeDeliveryOperatorRequest: Option[ChangeDeliveryOperatorRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_operator")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changeDeliveryOperatorRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   * > Method will fail if there are any processed payments in the order.  > If all payments in the order are unprocessed they will be removed and replaced with new ones.   > Allowed from version `7.6.3`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changePaymentsRequest 
   */
  def api1DeliveriesChangePaymentsPost(authorization: String, timeout: Option[Int] = None, changePaymentsRequest: Option[ChangePaymentsRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_payments")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changePaymentsRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.5.4`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param changeServiceTypeRequest 
   */
  def api1DeliveriesChangeServiceTypePost(authorization: String, timeout: Option[Int] = None, changeServiceTypeRequest: Option[ChangeServiceTypeRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/change_service_type")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(changeServiceTypeRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   * > Before version `8.0.6` it's possible to close deliveries with `DeliveryByClient`  orderServiceType only, starting from version `8.0.6` it's also possible to close  `DeliveryByCourier` deiveries in the DeliveryStatus `OnWay` or `Delivered` .   > Allowed from version `7.4.6`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param closeDeliveryOrderRequest 
   */
  def api1DeliveriesClosePost(authorization: String, timeout: Option[Int] = None, closeDeliveryOrderRequest: Option[CloseDeliveryOrderRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/close")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(closeDeliveryOrderRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.6.1`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param confirmDeliveryRequest 
   */
  def api1DeliveriesConfirmPost(authorization: String, timeout: Option[Int] = None, confirmDeliveryRequest: Option[ConfirmDeliveryRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/confirm")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(confirmDeliveryRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > This method is a command. Use `api/1/commands/status` method to get the progress status.
   * 
   * Expected answers:
   *   code 200 : OrderResponse (Success)
   *   code 400 : ErrorResponse (Bad Request)
   *   code 401 : ErrorResponse (Unauthorized)
   *   code 500 : ErrorResponse (Server Error)
   *   code 408 : ErrorResponse (Request Timeout)
   * 
   * @param authorization Authorization token.
   * @param timeout Timeout in seconds.
   * @param createOrderRequest 
   */
  def api1DeliveriesCreatePost(authorization: String, timeout: Option[Int] = None, createOrderRequest: Option[CreateOrderRequest] = None
): Request[Either[ResponseException[String, Exception], OrderResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/create")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(createOrderRequest)
      .response(asJson[OrderResponse])

  /**
   *    > Allowed from version `7.6.1`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param printDeliveryBillRequest 
   */
  def api1DeliveriesPrintDeliveryBillPost(authorization: String, timeout: Option[Int] = None, printDeliveryBillRequest: Option[PrintDeliveryBillRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/print_delivery_bill")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(printDeliveryBillRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > Allowed from version `7.1.5`.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param updateOrderCourierRequest 
   */
  def api1DeliveriesUpdateOrderCourierPost(authorization: String, timeout: Option[Int] = None, updateOrderCourierRequest: Option[UpdateOrderCourierRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/update_order_courier")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(updateOrderCourierRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param updateDeliveryStatusRequest 
   */
  def api1DeliveriesUpdateOrderDeliveryStatusPost(authorization: String, timeout: Option[Int] = None, updateDeliveryStatusRequest: Option[UpdateDeliveryStatusRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/update_order_delivery_status")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(updateDeliveryStatusRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   * > Deprecated, use `api/1/deliveries/change_payments` method instead.   > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param updateOrderPaymentsRequest 
   */
  def api1DeliveriesUpdateOrderPaymentsPost(authorization: String, timeout: Option[Int] = None, updateOrderPaymentsRequest: Option[UpdateOrderPaymentsRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/update_order_payments")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(updateOrderPaymentsRequest)
      .response(asJson[CorrelationIdResponse])

  /**
   *    > This method is a command. Use `api/1/commands/status` method to get the progress status.
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
   * @param updateOrderProblemRequest 
   */
  def api1DeliveriesUpdateOrderProblemPost(authorization: String, timeout: Option[Int] = None, updateOrderProblemRequest: Option[UpdateOrderProblemRequest] = None
): Request[Either[ResponseException[String, Exception], CorrelationIdResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/api/1/deliveries/update_order_problem")
      .contentType("application/json")
      .header("Authorization", authorization.toString)
      .header("Timeout", timeout.toString)
      .body(updateOrderProblemRequest)
      .response(asJson[CorrelationIdResponse])

}
