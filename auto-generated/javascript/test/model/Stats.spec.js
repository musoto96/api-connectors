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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BitMexApi);
  }
}(this, function(expect, BitMexApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('Stats', function() {
      beforeEach(function() {
        instance = new BitMexApi.Stats();
      });

      it('should create an instance of Stats', function() {
        // TODO: update the code to test Stats
        expect(instance).to.be.a(BitMexApi.Stats);
      });

      it('should have the property rootSymbol (base name: "rootSymbol")', function() {
        // TODO: update the code to test the property rootSymbol
        expect(instance).to.have.property('rootSymbol');
        // expect(instance.rootSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property currency (base name: "currency")', function() {
        // TODO: update the code to test the property currency
        expect(instance).to.have.property('currency');
        // expect(instance.currency).to.be(expectedValueLiteral);
      });

      it('should have the property volume24h (base name: "volume24h")', function() {
        // TODO: update the code to test the property volume24h
        expect(instance).to.have.property('volume24h');
        // expect(instance.volume24h).to.be(expectedValueLiteral);
      });

      it('should have the property turnover24h (base name: "turnover24h")', function() {
        // TODO: update the code to test the property turnover24h
        expect(instance).to.have.property('turnover24h');
        // expect(instance.turnover24h).to.be(expectedValueLiteral);
      });

      it('should have the property openInterest (base name: "openInterest")', function() {
        // TODO: update the code to test the property openInterest
        expect(instance).to.have.property('openInterest');
        // expect(instance.openInterest).to.be(expectedValueLiteral);
      });

      it('should have the property openValue (base name: "openValue")', function() {
        // TODO: update the code to test the property openValue
        expect(instance).to.have.property('openValue');
        // expect(instance.openValue).to.be(expectedValueLiteral);
      });

    });
  });

}));
