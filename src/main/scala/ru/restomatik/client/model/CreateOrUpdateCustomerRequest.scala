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

import ru.restomatik.client.model.IikoNetUserSex._
import ru.restomatik.client.model.PersonalDataConsentStatus._

import java.util.UUID

  /**
   * Not empty `phone` or `magnetCardTrack` or `id` is required for successful import.
   */
case class CreateOrUpdateCustomerRequest(
  /* Customer id. */
  id: Option[UUID] = None,
  /* Customer phone. Can be null. */
  phone: Option[String] = None,
  /* Card track. Required if cardNumber set. Can be null. */
  cardTrack: Option[String] = None,
  /* Card number. Required if cardTrack set. Can be null. */
  cardNumber: Option[String] = None,
  /* Customer name. Can be null. */
  name: Option[String] = None,
  /* Customer middle name. Can be null. */
  middleName: Option[String] = None,
  /* Customer surname. Can be null. */
  surName: Option[String] = None,
  /* Customer birthday. */
  birthday: Option[String] = None,
  /* Customer email. Can be null. */
  email: Option[String] = None,
  sex: Option[IikoNetUserSex] = None,
  consentStatus: Option[PersonalDataConsentStatus] = None,
  /* Customer get promo messages (email, sms). If null - unknown. */
  shouldReceivePromoActionsInfo: Option[Boolean] = None,
  /* Id for referrer guest. Null for old integrations, Guid.Empty - for referrer deletion. Can be null. */
  referrerId: Option[String] = None,
  /* Customer user data. Can be null. */
  userData: Option[String] = None,
  /* Customer organization id. */
  organizationId: UUID
)

object CreateOrUpdateCustomerRequestEnums {

}
