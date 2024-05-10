/*
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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.swagger.client.model.Error;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Quote;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuoteApi {
    private ApiClient apiClient;

    public QuoteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QuoteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for quoteGet
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteGetCall(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/quote";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (columns != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("columns", columns));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (reverse != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reverse", reverse));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endTime", endTime));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call quoteGetValidateBeforeCall(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = quoteGetCall(symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Quotes.
     * 
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @return List&lt;Quote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Quote> quoteGet(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        ApiResponse<List<Quote>> resp = quoteGetWithHttpInfo(symbol, filter, columns, count, start, reverse, startTime, endTime);
        return resp.getData();
    }

    /**
     * Get Quotes.
     * 
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @return ApiResponse&lt;List&lt;Quote&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Quote>> quoteGetWithHttpInfo(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        com.squareup.okhttp.Call call = quoteGetValidateBeforeCall(symbol, filter, columns, count, start, reverse, startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Quotes. (asynchronously)
     * 
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteGetAsync(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ApiCallback<List<Quote>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = quoteGetValidateBeforeCall(symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for quoteGetBucketed
     * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
     * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteGetBucketedCall(String binSize, Boolean partial, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/quote/bucketed";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (binSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("binSize", binSize));
        if (partial != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partial", partial));
        if (symbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (columns != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("columns", columns));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (reverse != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reverse", reverse));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endTime", endTime));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call quoteGetBucketedValidateBeforeCall(String binSize, Boolean partial, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = quoteGetBucketedCall(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get previous quotes in time buckets.
     * Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
     * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
     * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @return List&lt;Quote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Quote> quoteGetBucketed(String binSize, Boolean partial, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        ApiResponse<List<Quote>> resp = quoteGetBucketedWithHttpInfo(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime);
        return resp.getData();
    }

    /**
     * Get previous quotes in time buckets.
     * Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
     * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
     * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @return ApiResponse&lt;List&lt;Quote&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Quote>> quoteGetBucketedWithHttpInfo(String binSize, Boolean partial, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        com.squareup.okhttp.Call call = quoteGetBucketedValidateBeforeCall(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get previous quotes in time buckets. (asynchronously)
     * Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
     * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
     * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
     * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
     * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
     * @param start Starting point for results. (optional, default to 0)
     * @param reverse If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime Ending date filter for results. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteGetBucketedAsync(String binSize, Boolean partial, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ApiCallback<List<Quote>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = quoteGetBucketedValidateBeforeCall(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
