/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.38-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Error', 'model/IndexComposite', 'model/Instrument', 'model/InstrumentInterval', 'model/StatsUSDBySymbol'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/IndexComposite'), require('../model/Instrument'), require('../model/InstrumentInterval'), require('../model/StatsUSDBySymbol'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.InstrumentApi = factory(root.BitMexApi.ApiClient, root.BitMexApi.Error, root.BitMexApi.IndexComposite, root.BitMexApi.Instrument, root.BitMexApi.InstrumentInterval, root.BitMexApi.StatsUSDBySymbol);
  }
}(this, function(ApiClient, Error, IndexComposite, Instrument, InstrumentInterval, StatsUSDBySymbol) {
  'use strict';

  /**
   * Instrument service.
   * @module api/InstrumentApi
   * @version 1.2.0
   */

  /**
   * Constructs a new InstrumentApi. 
   * @alias module:api/InstrumentApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the instrumentGet operation.
     * @callback module:api/InstrumentApi~instrumentGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Instrument>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get instruments.
     * This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX` 
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
     * @param {String} opts.filter Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
     * @param {String} opts.columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
     * @param {Number} opts.count Number of results to fetch. Must be a positive integer. (default to 100)
     * @param {Number} opts.start Starting point for results. (default to 0)
     * @param {Boolean} opts.reverse If true, will sort results newest first. (default to false)
     * @param {Date} opts.startTime Starting date filter for results.
     * @param {Date} opts.endTime Ending date filter for results.
     * @param {module:api/InstrumentApi~instrumentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Instrument>}
     */
    this.instrumentGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'columns': opts['columns'],
        'count': opts['count'],
        'start': opts['start'],
        'reverse': opts['reverse'],
        'startTime': opts['startTime'],
        'endTime': opts['endTime'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Instrument];

      return this.apiClient.callApi(
        '/instrument', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetActive operation.
     * @callback module:api/InstrumentApi~instrumentGetActiveCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Instrument>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all active instruments and instruments that have expired in <24hrs.
     * @param {module:api/InstrumentApi~instrumentGetActiveCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Instrument>}
     */
    this.instrumentGetActive = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Instrument];

      return this.apiClient.callApi(
        '/instrument/active', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetActiveAndIndices operation.
     * @callback module:api/InstrumentApi~instrumentGetActiveAndIndicesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Instrument>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
     * @param {module:api/InstrumentApi~instrumentGetActiveAndIndicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Instrument>}
     */
    this.instrumentGetActiveAndIndices = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Instrument];

      return this.apiClient.callApi(
        '/instrument/activeAndIndices', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetActiveIntervals operation.
     * @callback module:api/InstrumentApi~instrumentGetActiveIntervalsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InstrumentInterval} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Return all active contract series and interval pairs.
     * This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.
     * @param {module:api/InstrumentApi~instrumentGetActiveIntervalsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InstrumentInterval}
     */
    this.instrumentGetActiveIntervals = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = InstrumentInterval;

      return this.apiClient.callApi(
        '/instrument/activeIntervals', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetCompositeIndex operation.
     * @callback module:api/InstrumentApi~instrumentGetCompositeIndexCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IndexComposite>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Show constituent parts of an index.
     * Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol The composite index symbol. (default to .BXBT)
     * @param {String} opts.filter Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`.
     * @param {String} opts.columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
     * @param {Number} opts.count Number of results to fetch. Must be a positive integer. (default to 100)
     * @param {Number} opts.start Starting point for results. (default to 0)
     * @param {Boolean} opts.reverse If true, will sort results newest first. (default to false)
     * @param {Date} opts.startTime Starting date filter for results.
     * @param {Date} opts.endTime Ending date filter for results.
     * @param {module:api/InstrumentApi~instrumentGetCompositeIndexCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IndexComposite>}
     */
    this.instrumentGetCompositeIndex = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'columns': opts['columns'],
        'count': opts['count'],
        'start': opts['start'],
        'reverse': opts['reverse'],
        'startTime': opts['startTime'],
        'endTime': opts['endTime'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [IndexComposite];

      return this.apiClient.callApi(
        '/instrument/compositeIndex', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetIndices operation.
     * @callback module:api/InstrumentApi~instrumentGetIndicesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Instrument>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all price indices.
     * @param {module:api/InstrumentApi~instrumentGetIndicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Instrument>}
     */
    this.instrumentGetIndices = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Instrument];

      return this.apiClient.callApi(
        '/instrument/indices', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the instrumentGetUsdVolume operation.
     * @callback module:api/InstrumentApi~instrumentGetUsdVolumeCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/StatsUSDBySymbol>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a summary of exchange statistics in USD.
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Filter by symbol.
     * @param {String} opts.columns Array of column names to fetch.
     * @param {module:api/InstrumentApi~instrumentGetUsdVolumeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/StatsUSDBySymbol>}
     */
    this.instrumentGetUsdVolume = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
        'columns': opts['columns'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [StatsUSDBySymbol];

      return this.apiClient.callApi(
        '/instrument/usdVolume', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
