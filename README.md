# iikoCloud Api

- API version: 1.0.0

<h3>Description of common data formats:</h3><b>uuid</b> - string in UUID(universally unique identifier).<br/>Examples: <i>550e8400-e29b-41d4-a716-446655440000, b090de0b-8550-6e17-70b2-bbba152bcbd3</i><br/><br/><b>date-time</b> - date and time string in custom string format <b>yyyy-MM-dd HH:mm:ss.fff</b>.<br/>Examples: <i>2017-04-29 20:45:00.000, 2018-01-01 01:01:30.123</i>

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)* from <https://api-ru.iiko.services>

## Requirements

Building the API client library requires:

1. Scala
2. SBT

## Installation

To add the API client library to your project put these contents in a
file named `project/Build.scala`:

```scala
lazy val iikoCloudApi = RootProject(uri("https://github.com/demig00d/iiko-cloud-api.git"))

lazy val root = (project in file("."))
  .dependsOn(iikoCloudApi)
  .settings(...)
```

## Getting Started

Minimal example

```scala
import sttp.client3._
import ru.restomatik.client.api.AuthorizationApi
import ru.restomatik.client.model.GetAccessTokenRequest

object Main extends App {
  val apiLogin = Some(GetAccessTokenRequest("<your apiLogin>"))

  AuthorizationApi()
    .api1AccessTokenPost(getAccessTokenRequest = apiLogin)
    .send(HttpClientSyncBackend())
    .body
    .foreach(body => println(s"this is access token: ${body.token}"))
}
```

## Documentation for API Endpoints

All URIs are relative to *<https://api-ru.iiko.services>*

Class | Method                                                    | HTTP request                                                          | Description
------------ |-----------------------------------------------------------|-----------------------------------------------------------------------| -------------
*AddressesApi* | **api1CitiesPost**                                        | **POST** /api/1/cities                                                | Cities.
*AddressesApi* | **api1RegionsPost**                                       | **POST** /api/1/regions                                               | Regions.
*AddressesApi* | **api1StreetsByCityPost**                                 | **POST** /api/1/streets/by_city                                       | Streets by city.
*AddressesApi* | **api1StreetsByIdPost**                                   | **POST** /api/1/streets/by_id                                         | Streets by id or by classifierId.
*AuthorizationApi* | **api1AccessTokenPost**                                   | **POST** /api/1/access_token                                          | Retrieve session key for API user.
*BanquetsReservesApi* | **api1ReserveAddItemsPost**                               | **POST** /api/1/reserve/add_items                                     | Add order items.
*BanquetsReservesApi* | **api1ReserveAddPaymentsPost**                            | **POST** /api/1/reserve/add_payments                                  | Add order payments.
*BanquetsReservesApi* | **api1ReserveAvailableOrganizationsPost**                 | **POST** /api/1/reserve/available_organizations                       | Returns all organizations of current account (determined by Authorization request header) for which banquet/reserve booking are available.
*BanquetsReservesApi* | **api1ReserveAvailableRestaurantSectionsPost**            | **POST** /api/1/reserve/available_restaurant_sections                 | Returns all restaurant sections of specified terminal groups, for which banquet/reserve booking are available.
*BanquetsReservesApi* | **api1ReserveAvailableTerminalGroupsPost**                | **POST** /api/1/reserve/available_terminal_groups                     | Returns all terminal groups of specified organizations, for which banquet/reserve booking are available.
*BanquetsReservesApi* | **api1ReserveCancelPost**                                 | **POST** /api/1/reserve/cancel                                        | Cancel reservation due to some reason.
*BanquetsReservesApi* | **api1ReserveCreatePost**                                 | **POST** /api/1/reserve/create                                        | Create banquet/reserve.
*BanquetsReservesApi* | **api1ReserveRestaurantSectionsWorkloadPost**             | **POST** /api/1/reserve/restaurant_sections_workload                  | Returns all banquets/reserves for passed restaurant sections.
*BanquetsReservesApi* | **api1ReserveStatusByIdPost**                             | **POST** /api/1/reserve/status_by_id                                  | Retrieve banquets/reserves statuses by IDs.
*CustomerCategoriesApi* | **api1LoyaltyIikoCustomerCategoryAddPost**                | **POST** /api/1/loyalty/iiko/customer_category/add                    | Add category for customer.
*CustomerCategoriesApi* | **api1LoyaltyIikoCustomerCategoryPost**                   | **POST** /api/1/loyalty/iiko/customer_category                        | Get customer categories.
*CustomerCategoriesApi* | **api1LoyaltyIikoCustomerCategoryRemovePost**             | **POST** /api/1/loyalty/iiko/customer_category/remove                 | Remove category for customer.
*CustomersApi* | **api1LoyaltyIikoCustomerCardAddPost**                    | **POST** /api/1/loyalty/iiko/customer/card/add                        | Add card.
*CustomersApi* | **api1LoyaltyIikoCustomerCardRemovePost**                 | **POST** /api/1/loyalty/iiko/customer/card/remove                     | Delete card.
*CustomersApi* | **api1LoyaltyIikoCustomerCreateOrUpdatePost**             | **POST** /api/1/loyalty/iiko/customer/create_or_update                | Create or update customer.
*CustomersApi* | **api1LoyaltyIikoCustomerInfoPost**                       | **POST** /api/1/loyalty/iiko/customer/info                            | Get customer info.
*CustomersApi* | **api1LoyaltyIikoCustomerProgramAddPost**                 | **POST** /api/1/loyalty/iiko/customer/program/add                     | Add customer to program.
*CustomersApi* | **api1LoyaltyIikoCustomerWalletCancelHoldPost**           | **POST** /api/1/loyalty/iiko/customer/wallet/cancel_hold              | Cancel hold money.
*CustomersApi* | **api1LoyaltyIikoCustomerWalletChargeoffPost**            | **POST** /api/1/loyalty/iiko/customer/wallet/chargeoff                | Withdraw balance.
*CustomersApi* | **api1LoyaltyIikoCustomerWalletHoldPost**                 | **POST** /api/1/loyalty/iiko/customer/wallet/hold                     | Hold money.
*CustomersApi* | **api1LoyaltyIikoCustomerWalletTopupPost**                | **POST** /api/1/loyalty/iiko/customer/wallet/topup                    | Refill balance.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesAddItemsPost**                            | **POST** /api/1/deliveries/add_items                                  | Add order items.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesAddPaymentsPost**                         | **POST** /api/1/deliveries/add_payments                               | Add order payments.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesCancelConfirmationPost**                  | **POST** /api/1/deliveries/cancel_confirmation                        | Cancel delivery confirmation.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesCancelPost**                              | **POST** /api/1/deliveries/cancel                                     | Cancel delivery order.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangeCommentPost**                       | **POST** /api/1/deliveries/change_comment                             | Change delivery comment.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangeCompleteBeforePost**                | **POST** /api/1/deliveries/change_complete_before                     | Change time when client wants the order to be delivered.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangeDeliveryPointPost**                 | **POST** /api/1/deliveries/change_delivery_point                      | Change order&#39;s delivery point information.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangeOperatorPost**                      | **POST** /api/1/deliveries/change_operator                            | Assign/change the order operator.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangePaymentsPost**                      | **POST** /api/1/deliveries/change_payments                            | Change order&#39;s payments.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesChangeServiceTypePost**                   | **POST** /api/1/deliveries/change_service_type                        | Change order&#39;s delivery type.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesClosePost**                               | **POST** /api/1/deliveries/close                                      | Close order.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesConfirmPost**                             | **POST** /api/1/deliveries/confirm                                    | Confirm delivery.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesCreatePost**                              | **POST** /api/1/deliveries/create                                     | Create delivery.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesPrintDeliveryBillPost**                   | **POST** /api/1/deliveries/print_delivery_bill                        | Print delivery bill.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesUpdateOrderCourierPost**                  | **POST** /api/1/deliveries/update_order_courier                       | Update order courier.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesUpdateOrderDeliveryStatusPost**           | **POST** /api/1/deliveries/update_order_delivery_status               | Update delivery status.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesUpdateOrderPaymentsPost**                 | **POST** /api/1/deliveries/update_order_payments                      | Update order payment details.
*DeliveriesCreateAndUpdateApi* | **api1DeliveriesUpdateOrderProblemPost**                  | **POST** /api/1/deliveries/update_order_problem                       | Update order problem.
*DeliveriesRetrieveApi* | **api1DeliveriesByDeliveryDateAndPhonePost**              | **POST** /api/1/deliveries/by_delivery_date_and_phone                 | Retrieve list of orders by telephone number, dates and revision.
*DeliveriesRetrieveApi* | **api1DeliveriesByDeliveryDateAndSourceKeyAndFilterPost** | **POST** /api/1/deliveries/by_delivery_date_and_source_key_and_filter | Search orders by search text and additional filters (date, problem, statuses and other).
*DeliveriesRetrieveApi* | **api1DeliveriesByDeliveryDateAndStatusPost**             | **POST** /api/1/deliveries/by_delivery_date_and_status                | Retrieve list of orders by statuses and dates.
*DeliveriesRetrieveApi* | **api1DeliveriesByIdPost**                                | **POST** /api/1/deliveries/by_id                                      | Retrieve orders by IDs.
*DeliveriesRetrieveApi* | **api1DeliveriesByRevisionPost**                          | **POST** /api/1/deliveries/by_revision                                | Retrieve list of orders changed from the time revision was passed.
*DeliveryRestrictionsApi* | **api1DeliveryRestrictionsAllowedPost**                   | **POST** /api/1/delivery_restrictions/allowed                         | Get suitable terminal groups for delivery restrictions.
*DeliveryRestrictionsApi* | **api1DeliveryRestrictionsPost**                          | **POST** /api/1/delivery_restrictions                                 | Retrieve list of delivery restrictions.
*DeliveryRestrictionsApi* | **api1DeliveryRestrictionsUpdatePost**                    | **POST** /api/1/delivery_restrictions/update                          | Update delivery restrictions.
*DeprecatedApi* | **api1DeliveriesCheckCreatePost**                         | **POST** /api/1/deliveries/check_create                               | Check create delivery.
*DeprecatedApi* | **api1DeliveriesUpdateOrderPaymentsPost**                 | **POST** /api/1/deliveries/update_order_payments                      | Update order payment details.
*DeprecatedApi* | **api1OrderUpdatePaymentsPost**                           | **POST** /api/1/order/update_payments                                 | Update order payment details.
*DeprecatedApi* | **api1OrganizationsGet**                                  | **GET** /api/1/organizations                                          | Returns organizations available to api-login user.
*DictionariesApi* | **api1CancelCausesPost**                                  | **POST** /api/1/cancel_causes                                         | Delivery cancel causes.
*DictionariesApi* | **api1DeliveriesOrderTypesPost**                          | **POST** /api/1/deliveries/order_types                                | Order types.
*DictionariesApi* | **api1DiscountsPost**                                     | **POST** /api/1/discounts                                             | Discounts / surcharges.
*DictionariesApi* | **api1PaymentTypesPost**                                  | **POST** /api/1/payment_types                                         | Payment types.
*DictionariesApi* | **api1RemovalTypesPost**                                  | **POST** /api/1/removal_types                                         | Removal types (reasons for deletion).
*DictionariesApi* | **api1TipsTypesPost**                                     | **POST** /api/1/tips_types                                            | Get tips types for api-login&#x60;s rms group.
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoCalculatePost**                          | **POST** /api/1/loyalty/iiko/calculate                                | Calculate checkin.
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoCouponsBySeriesPost**                    | **POST** /api/1/loyalty/iiko/coupons/by_series                        | Get non-activated coupons
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoCouponsInfoPost**                        | **POST** /api/1/loyalty/iiko/coupons/info                             | Get coupon info.
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoCouponsSeriesPost**                      | **POST** /api/1/loyalty/iiko/coupons/series                           | Get coupon series with non-activated coupons.
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoManualConditionPost**                    | **POST** /api/1/loyalty/iiko/manual_condition                         | Get manual conditions.
*DiscountsAndPromotionsApi* | **api1LoyaltyIikoProgramPost**                            | **POST** /api/1/loyalty/iiko/program                                  | Get programs.
*EmployeesApi* | **api1EmployeesCouriersActiveLocationByTerminalPost**     | **POST** /api/1/employees/couriers/active_location/by_terminal        | Returns list of all active (courier session is opened) courier&#39;s locations which are delivery drivers in specified   restaurant and are clocked in on specified delivery terminal.
*EmployeesApi* | **api1EmployeesCouriersActiveLocationPost**               | **POST** /api/1/employees/couriers/active_location                    | Returns list of all active (courier session is opened) courier&#39;s locations which are delivery drivers   in specified restaurants.
*EmployeesApi* | **api1EmployeesCouriersByRolePost**                       | **POST** /api/1/employees/couriers/by_role                            | Returns list of all employees which are delivery drivers in specified restaurants,   and checks whether each employee has passed role.
*EmployeesApi* | **api1EmployeesCouriersLocationsByTimeOffsetPost**        | **POST** /api/1/employees/couriers/locations/by_time_offset           | Method of obtaining drivers&#39; coordinates history.
*EmployeesApi* | **api1EmployeesCouriersPost**                             | **POST** /api/1/employees/couriers                                    | Returns list of all employees which are delivery drivers in specified restaurants.
*EmployeesApi* | **api1EmployeesInfoPost**                                 | **POST** /api/1/employees/info                                        | Returns employee info.
*EmployeesApi* | **api1EmployeesShiftClockinPost**                         | **POST** /api/1/employees/shift/clockin                               | Open personal session.
*EmployeesApi* | **api1EmployeesShiftClockoutPost**                        | **POST** /api/1/employees/shift/clockout                              | Close personal session.
*EmployeesApi* | **api1EmployeesShiftIsOpenPost**                          | **POST** /api/1/employees/shift/is_open                               | Check if personal session is open.
*MarketingSourcesApi* | **api1MarketingSourcesPost**                              | **POST** /api/1/marketing_sources                                     | Marketing sources.
*MenuApi* | **api1ComboCalculatePost**                                | **POST** /api/1/combo/calculate                                       | Calculate combo price
*MenuApi* | **api1ComboPost**                                         | **POST** /api/1/combo                                                 | Get combos info
*MenuApi* | **api1NomenclaturePost**                                  | **POST** /api/1/nomenclature                                          | Menu.
*MenuApi* | **api1StopListsCheckPost**                                | **POST** /api/1/stop_lists/check                                      | Check items in out-of-stock list.
*MenuApi* | **api1StopListsPost**                                     | **POST** /api/1/stop_lists                                            | Out-of-stock items.
~~*MenuApi*~~ | ~~**api2MenuByIdPost**~~                                  | ~~**POST** /api/2/menu/by_id~~                                        | This method is commented in source code because it was generated with errors.
*MenuApi* | **api2MenuPost**                                          | **POST** /api/2/menu                                                  | External menus with price categories.
*MessagesApi* | **api1LoyaltyIikoMessageSendEmailPost**                   | **POST** /api/1/loyalty/iiko/message/send_email                       | Send email.
*MessagesApi* | **api1LoyaltyIikoMessageSendSmsPost**                     | **POST** /api/1/loyalty/iiko/message/send_sms                         | Send sms.
*NotificationsApi* | **api1NotificationsSendPost**                             | **POST** /api/1/notifications/send                                    | Send notification to external systems (iikoFront and iikoWeb).
*OperationsApi* | **api1CommandsStatusPost**                                | **POST** /api/1/commands/status                                       | Get status of command.
*OrdersApi* | **api1OrderAddCustomerPost**                              | **POST** /api/1/order/add_customer                                    | Add customer to order.
*OrdersApi* | **api1OrderAddItemsPost**                                 | **POST** /api/1/order/add_items                                       | Add order items.
*OrdersApi* | **api1OrderAddPaymentsPost**                              | **POST** /api/1/order/add_payments                                    | Add order payments.
*OrdersApi* | **api1OrderByIdPost**                                     | **POST** /api/1/order/by_id                                           | Retrieve orders by IDs.
*OrdersApi* | **api1OrderByTablePost**                                  | **POST** /api/1/order/by_table                                        | Retrieve orders by tables.
*OrdersApi* | **api1OrderChangePaymentsPost**                           | **POST** /api/1/order/change_payments                                 | Change table order&#39;s payments.
*OrdersApi* | **api1OrderClosePost**                                    | **POST** /api/1/order/close                                           | Close order.
*OrdersApi* | **api1OrderCreatePost**                                   | **POST** /api/1/order/create                                          | Create order.
*OrdersApi* | **api1OrderInitByPosOrderPost**                           | **POST** /api/1/order/init_by_posOrder                                | Init orders, created on POS, by POS orders.
*OrdersApi* | **api1OrderInitByTablePost**                              | **POST** /api/1/order/init_by_table                                   | Init orders, created on POS, by tables.
*OrdersApi* | **api1OrderUpdatePaymentsPost**                           | **POST** /api/1/order/update_payments                                 | Update order payment details.
*OrganizationsApi* | **api1OrganizationsPost**                                 | **POST** /api/1/organizations                                         | Returns organizations available to api-login user.
*TerminalGroupsApi* | **api1TerminalGroupsAwakePost**                           | **POST** /api/1/terminal_groups/awake                                 | Awake terminal groups from sleep mode.
*TerminalGroupsApi* | **api1TerminalGroupsIsAlivePost**                         | **POST** /api/1/terminal_groups/is_alive                              | Returns information on availability of group of terminals.
*TerminalGroupsApi* | **api1TerminalGroupsPost**                                | **POST** /api/1/terminal_groups                                       | Method that returns information on groups of delivery terminals.
*WebhooksApi* | **api1WebhooksSettingsPost**                              | **POST** /api/1/webhooks/settings                                     | Get webhooks settings for specified organization and authorized API login.
*WebhooksApi* | **api1WebhooksUpdateSettingsPost**                        | **POST** /api/1/webhooks/update_settings                              | Update webhooks settings for specified organization and authorized API login.
