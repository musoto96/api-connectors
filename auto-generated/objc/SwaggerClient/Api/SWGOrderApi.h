#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGOrder.h"
#import "SWGApi.h"

/**
* BitMEX API
* ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
*
* OpenAPI spec version: 1.2.0
* Contact: support@bitmex.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGOrderApi: NSObject <SWGApi>

extern NSString* kSWGOrderApiErrorDomain;
extern NSInteger kSWGOrderApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Amend the quantity or price of an open order.
/// Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  > A `leavesQty` can be used to make a \"Filled\" order live again, if it is received within 60 seconds of the fill. 
///
/// @param orderID Order ID (optional)
/// @param origClOrdID Client Order ID. See POST /order. (optional)
/// @param clOrdID Optional new Client Order ID, requires &#x60;origClOrdID&#x60;. (optional)
/// @param simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
/// @param orderQty Optional order quantity in units of the instrument (i.e. contracts, for spot it is the base currency in minor currency (e.g. XBt quantity for XBT)). (optional)
/// @param simpleLeavesQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
/// @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts, for spot it is the base currency in minor currency (e.g. XBt quantity for XBT)). Useful for amending partially filled orders. (optional)
/// @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. (optional)
/// @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. (optional)
/// @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. (optional)
/// @param text Optional amend annotation. e.g. &#39;Adjust skew&#39;. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGOrder*
-(NSURLSessionTask*) orderAmendWithOrderID: (NSString*) orderID
    origClOrdID: (NSString*) origClOrdID
    clOrdID: (NSString*) clOrdID
    simpleOrderQty: (NSNumber*) simpleOrderQty
    orderQty: (NSNumber*) orderQty
    simpleLeavesQty: (NSNumber*) simpleLeavesQty
    leavesQty: (NSNumber*) leavesQty
    price: (NSNumber*) price
    stopPx: (NSNumber*) stopPx
    pegOffsetValue: (NSNumber*) pegOffsetValue
    text: (NSString*) text
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler;


/// Cancel order(s). Send multiple order IDs to cancel in bulk.
/// Either an orderID or a clOrdID must be provided.
///
/// @param orderID Order ID(s). (optional)
/// @param clOrdID Client Order ID(s). See POST /order. (optional)
/// @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGOrder>*
-(NSURLSessionTask*) orderCancelWithOrderID: (NSString*) orderID
    clOrdID: (NSString*) clOrdID
    text: (NSString*) text
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler;


/// Cancels all of your orders.
/// 
///
/// @param targetAccountIds AccountIds to cancel all orders, must be a paired account with main user. Also accepts wildcard, [*], this will cancel all orders for all accounts. the authenticated user has order write permissions for. (optional)
/// @param symbol Optional symbol. If provided, only cancels orders for that symbol. (optional)
/// @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. (optional)
/// @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGOrder>*
-(NSURLSessionTask*) orderCancelAllWithTargetAccountIds: (NSString*) targetAccountIds
    symbol: (NSString*) symbol
    filter: (NSString*) filter
    text: (NSString*) text
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler;


/// Automatically cancel all your orders after a specified timeout.
/// Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel). 
///
/// @param timeout Timeout in ms. Set to 0 to cancel this timer. 
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSObject*
-(NSURLSessionTask*) orderCancelAllAfterWithTimeout: (NSNumber*) timeout
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler;


/// Close a position. [Deprecated, use POST /order with execInst: 'Close']
/// If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.
///
/// @param symbol Symbol of position to close.
/// @param price Optional limit price. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGOrder*
-(NSURLSessionTask*) orderClosePositionWithSymbol: (NSString*) symbol
    price: (NSNumber*) price
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler;


/// Get your orders.
/// To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.
///
/// @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
/// @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
/// @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
/// @param count Number of results to fetch. Must be a positive integer. (optional) (default to 100)
/// @param start Starting point for results. (optional) (default to 0)
/// @param reverse If true, will sort results newest first. (optional) (default to false)
/// @param startTime Starting date filter for results. (optional)
/// @param endTime Ending date filter for results. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return NSArray<SWGOrder>*
-(NSURLSessionTask*) orderGetOrdersWithSymbol: (NSString*) symbol
    filter: (NSString*) filter
    columns: (NSString*) columns
    count: (NSNumber*) count
    start: (NSNumber*) start
    reverse: (NSNumber*) reverse
    startTime: (NSDate*) startTime
    endTime: (NSDate*) endTime
    completionHandler: (void (^)(NSArray<SWGOrder>* output, NSError* error)) handler;


/// Create a new order.
/// ## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  - **Limit**: The default order type. Specify an `orderQty` and `price`. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - `Close` Stops don't require an `orderQty`. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders. - **Pegged**: Pegged orders allow users to submit a limit price relative to the current market price. Specify a   `pegPriceType`, and `pegOffsetValue`.   - Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time the order     is accepted and does not change as the reference price changes.   - `PrimaryPeg`: Price is set relative to near touch price.   - `MarketPeg`: Price is set relative to far touch price.   - A `pegPriceType` submitted with no `ordType` is treated as a `Pegged` order.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement, it will cancel instead.   This is intended to protect you from the far touch moving towards you while the order is in transit.   It is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `MarkPrice` is used. Also used for Pegged orders to define the value of `LastPeg`. IndexPrice is not applicable to spot trading symbols. - **ReduceOnly**: A `ReduceOnly` order can only reduce your position, not increase it. If you have a `ReduceOnly`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `ReduceOnly` orders the least aggressive will be amended first. Not applicable to spot trading symbols. - **Close**: `Close` implies `ReduceOnly`. A `Close` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `Close` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If `orderQty` is not specified, a `Close` order has an `orderQty` equal to your current position's size. Not applicable to spot trading symbols.   - Note that a `Close` order without an `orderQty` requires a `side`, so that BitMEX knows if it should trigger     above or below the `stopPx`. - **LastWithinMark**: Used by stop orders with `LastPrice` to allow stop triggers only when:   - For Sell Stop Market / Stop Limit Order     - Last Price &lt= Stop Price     - Last Price &gt= Mark Price × (1 - 5%)   - For Buy Stop Market / Stop Limit Order:     - Last Price &gt= Stop Price     - Last Price &lt= Mark Price × (1 + 5%)   - Not applicable to spot trading symbols. - **Fixed**: Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time   the order is accepted and does not change as the reference price changes.  #### Pegged Orders  Pegged orders allow users to submit a limit price relative to the current market price. The limit price is set once when the order is submitted and does not change with the reference price. This order type is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it.  Pegged orders have an `ordType` of `Pegged`, and an `execInst` of `Fixed`.  A `pegPriceType` and `pegOffsetValue` must also be submitted:  - `PrimaryPeg` - price is set relative to the **near touch** price - `MarketPeg` - price is set relative to the **far touch** price  #### Trailing Stop Pegged Orders  Use `pegPriceType` of `TrailingStopPeg` to create Trailing Stops.  The price is set at submission and updates once per second if the underlying price (last/mark/index) has moved by more than 0.1%. `stopPx` then moves as the market moves away from the peg, and freezes as the market moves toward it.  Use `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `MarkPrice`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `Stop`, `StopLimit`, `MarketIfTouched`, `LimitIfTouched`.  #### Linked Orders  Linked Orders are an advanced capability. It is very powerful, but its use requires careful coding and testing. Please follow this document carefully and use the [Testnet Exchange](https://testnet.bitmex.com) while developing.  BitMEX offers four advanced Linked Order types:  - **OCO**: _One Cancels the Other_. A very flexible version of the standard Stop / Take Profit technique.   Multiple orders may be linked together using a single `clOrdLinkID`. Send a `contingencyType` of   `OneCancelsTheOther` on the orders. The first order that fully or partially executes (or activates   for `Stop` orders) will cancel all other orders with the same `clOrdLinkID`. - **OTO**: _One Triggers the Other_. Send a `contingencyType` of `'OneTriggersTheOther'` on the primary order and   then subsequent orders with the same `clOrdLinkID` will be not be triggered until the primary order fully executes.  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  You can improve your reactivity to market movements while staying under your rate limit by using the [Amend](#!/Order/Order_amend) endpoint (PUT /order). This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the `clOrdID` by amending an order, supplying an `origClOrdID`, and your desired new ID as the `clOrdID` param, like so:  ``` # Amends an order's leavesQty, and updates its clOrdID to \"def-456\" PUT /api/v1/order {\"origClOrdID\": \"abc-123\", \"clOrdID\": \"def-456\", \"leavesQty\": 1000} ``` 
///
/// @param symbol Instrument symbol. e.g. &#39;XBTUSD&#39;.
/// @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; is negative. (optional)
/// @param simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26 (optional)
/// @param orderQty Order quantity in units of the instrument (i.e. contracts, for spot it is base currency in minor currency for spot (e.g. XBt quantity for XBT)). (optional)
/// @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. (optional)
/// @param displayQty Optional quantity to display in the book. Use 0 for a fully hidden order. (optional)
/// @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. (optional)
/// @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions. (optional)
/// @param clOrdLinkID Optional Client Order Link ID for contingent orders (optional)
/// @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. (optional)
/// @param pegPriceType Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg. (optional)
/// @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. (optional) (default to Limit)
/// @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. (optional)
/// @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39;, &#39;IndexPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. &#39;LastWithinMark&#39; instruction valid for &#39;Stop&#39; and &#39;StopLimit&#39; with instruction &#39;LastPrice&#39;. IndexPrice, LastWithMark, Close and ReduceOnly are not applicable to spot trading symbols. (optional)
/// @param contingencyType Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther. (optional)
/// @param text Optional order annotation. e.g. &#39;Take profit&#39;. (optional)
/// 
///  code:200 message:"Request was successful",
///  code:400 message:"Parameter Error",
///  code:401 message:"Unauthorized",
///  code:403 message:"Access Denied",
///  code:404 message:"Not Found"
///
/// @return SWGOrder*
-(NSURLSessionTask*) orderNewWithSymbol: (NSString*) symbol
    side: (NSString*) side
    simpleOrderQty: (NSNumber*) simpleOrderQty
    orderQty: (NSNumber*) orderQty
    price: (NSNumber*) price
    displayQty: (NSNumber*) displayQty
    stopPx: (NSNumber*) stopPx
    clOrdID: (NSString*) clOrdID
    clOrdLinkID: (NSString*) clOrdLinkID
    pegOffsetValue: (NSNumber*) pegOffsetValue
    pegPriceType: (NSString*) pegPriceType
    ordType: (NSString*) ordType
    timeInForce: (NSString*) timeInForce
    execInst: (NSString*) execInst
    contingencyType: (NSString*) contingencyType
    text: (NSString*) text
    completionHandler: (void (^)(SWGOrder* output, NSError* error)) handler;



@end
