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
    describe('Position', function() {
      beforeEach(function() {
        instance = new BitMexApi.Position();
      });

      it('should create an instance of Position', function() {
        // TODO: update the code to test Position
        expect(instance).to.be.a(BitMexApi.Position);
      });

      it('should have the property account (base name: "account")', function() {
        // TODO: update the code to test the property account
        expect(instance).to.have.property('account');
        // expect(instance.account).to.be(expectedValueLiteral);
      });

      it('should have the property symbol (base name: "symbol")', function() {
        // TODO: update the code to test the property symbol
        expect(instance).to.have.property('symbol');
        // expect(instance.symbol).to.be(expectedValueLiteral);
      });

      it('should have the property currency (base name: "currency")', function() {
        // TODO: update the code to test the property currency
        expect(instance).to.have.property('currency');
        // expect(instance.currency).to.be(expectedValueLiteral);
      });

      it('should have the property underlying (base name: "underlying")', function() {
        // TODO: update the code to test the property underlying
        expect(instance).to.have.property('underlying');
        // expect(instance.underlying).to.be(expectedValueLiteral);
      });

      it('should have the property quoteCurrency (base name: "quoteCurrency")', function() {
        // TODO: update the code to test the property quoteCurrency
        expect(instance).to.have.property('quoteCurrency');
        // expect(instance.quoteCurrency).to.be(expectedValueLiteral);
      });

      it('should have the property commission (base name: "commission")', function() {
        // TODO: update the code to test the property commission
        expect(instance).to.have.property('commission');
        // expect(instance.commission).to.be(expectedValueLiteral);
      });

      it('should have the property initMarginReq (base name: "initMarginReq")', function() {
        // TODO: update the code to test the property initMarginReq
        expect(instance).to.have.property('initMarginReq');
        // expect(instance.initMarginReq).to.be(expectedValueLiteral);
      });

      it('should have the property maintMarginReq (base name: "maintMarginReq")', function() {
        // TODO: update the code to test the property maintMarginReq
        expect(instance).to.have.property('maintMarginReq');
        // expect(instance.maintMarginReq).to.be(expectedValueLiteral);
      });

      it('should have the property riskLimit (base name: "riskLimit")', function() {
        // TODO: update the code to test the property riskLimit
        expect(instance).to.have.property('riskLimit');
        // expect(instance.riskLimit).to.be(expectedValueLiteral);
      });

      it('should have the property leverage (base name: "leverage")', function() {
        // TODO: update the code to test the property leverage
        expect(instance).to.have.property('leverage');
        // expect(instance.leverage).to.be(expectedValueLiteral);
      });

      it('should have the property crossMargin (base name: "crossMargin")', function() {
        // TODO: update the code to test the property crossMargin
        expect(instance).to.have.property('crossMargin');
        // expect(instance.crossMargin).to.be(expectedValueLiteral);
      });

      it('should have the property deleveragePercentile (base name: "deleveragePercentile")', function() {
        // TODO: update the code to test the property deleveragePercentile
        expect(instance).to.have.property('deleveragePercentile');
        // expect(instance.deleveragePercentile).to.be(expectedValueLiteral);
      });

      it('should have the property rebalancedPnl (base name: "rebalancedPnl")', function() {
        // TODO: update the code to test the property rebalancedPnl
        expect(instance).to.have.property('rebalancedPnl');
        // expect(instance.rebalancedPnl).to.be(expectedValueLiteral);
      });

      it('should have the property prevRealisedPnl (base name: "prevRealisedPnl")', function() {
        // TODO: update the code to test the property prevRealisedPnl
        expect(instance).to.have.property('prevRealisedPnl');
        // expect(instance.prevRealisedPnl).to.be(expectedValueLiteral);
      });

      it('should have the property prevUnrealisedPnl (base name: "prevUnrealisedPnl")', function() {
        // TODO: update the code to test the property prevUnrealisedPnl
        expect(instance).to.have.property('prevUnrealisedPnl');
        // expect(instance.prevUnrealisedPnl).to.be(expectedValueLiteral);
      });

      it('should have the property openingQty (base name: "openingQty")', function() {
        // TODO: update the code to test the property openingQty
        expect(instance).to.have.property('openingQty');
        // expect(instance.openingQty).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderBuyQty (base name: "openOrderBuyQty")', function() {
        // TODO: update the code to test the property openOrderBuyQty
        expect(instance).to.have.property('openOrderBuyQty');
        // expect(instance.openOrderBuyQty).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderBuyCost (base name: "openOrderBuyCost")', function() {
        // TODO: update the code to test the property openOrderBuyCost
        expect(instance).to.have.property('openOrderBuyCost');
        // expect(instance.openOrderBuyCost).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderBuyPremium (base name: "openOrderBuyPremium")', function() {
        // TODO: update the code to test the property openOrderBuyPremium
        expect(instance).to.have.property('openOrderBuyPremium');
        // expect(instance.openOrderBuyPremium).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderSellQty (base name: "openOrderSellQty")', function() {
        // TODO: update the code to test the property openOrderSellQty
        expect(instance).to.have.property('openOrderSellQty');
        // expect(instance.openOrderSellQty).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderSellCost (base name: "openOrderSellCost")', function() {
        // TODO: update the code to test the property openOrderSellCost
        expect(instance).to.have.property('openOrderSellCost');
        // expect(instance.openOrderSellCost).to.be(expectedValueLiteral);
      });

      it('should have the property openOrderSellPremium (base name: "openOrderSellPremium")', function() {
        // TODO: update the code to test the property openOrderSellPremium
        expect(instance).to.have.property('openOrderSellPremium');
        // expect(instance.openOrderSellPremium).to.be(expectedValueLiteral);
      });

      it('should have the property currentQty (base name: "currentQty")', function() {
        // TODO: update the code to test the property currentQty
        expect(instance).to.have.property('currentQty');
        // expect(instance.currentQty).to.be(expectedValueLiteral);
      });

      it('should have the property currentCost (base name: "currentCost")', function() {
        // TODO: update the code to test the property currentCost
        expect(instance).to.have.property('currentCost');
        // expect(instance.currentCost).to.be(expectedValueLiteral);
      });

      it('should have the property currentComm (base name: "currentComm")', function() {
        // TODO: update the code to test the property currentComm
        expect(instance).to.have.property('currentComm');
        // expect(instance.currentComm).to.be(expectedValueLiteral);
      });

      it('should have the property realisedCost (base name: "realisedCost")', function() {
        // TODO: update the code to test the property realisedCost
        expect(instance).to.have.property('realisedCost');
        // expect(instance.realisedCost).to.be(expectedValueLiteral);
      });

      it('should have the property unrealisedCost (base name: "unrealisedCost")', function() {
        // TODO: update the code to test the property unrealisedCost
        expect(instance).to.have.property('unrealisedCost');
        // expect(instance.unrealisedCost).to.be(expectedValueLiteral);
      });

      it('should have the property grossOpenPremium (base name: "grossOpenPremium")', function() {
        // TODO: update the code to test the property grossOpenPremium
        expect(instance).to.have.property('grossOpenPremium');
        // expect(instance.grossOpenPremium).to.be(expectedValueLiteral);
      });

      it('should have the property isOpen (base name: "isOpen")', function() {
        // TODO: update the code to test the property isOpen
        expect(instance).to.have.property('isOpen');
        // expect(instance.isOpen).to.be(expectedValueLiteral);
      });

      it('should have the property markPrice (base name: "markPrice")', function() {
        // TODO: update the code to test the property markPrice
        expect(instance).to.have.property('markPrice');
        // expect(instance.markPrice).to.be(expectedValueLiteral);
      });

      it('should have the property markValue (base name: "markValue")', function() {
        // TODO: update the code to test the property markValue
        expect(instance).to.have.property('markValue');
        // expect(instance.markValue).to.be(expectedValueLiteral);
      });

      it('should have the property riskValue (base name: "riskValue")', function() {
        // TODO: update the code to test the property riskValue
        expect(instance).to.have.property('riskValue');
        // expect(instance.riskValue).to.be(expectedValueLiteral);
      });

      it('should have the property homeNotional (base name: "homeNotional")', function() {
        // TODO: update the code to test the property homeNotional
        expect(instance).to.have.property('homeNotional');
        // expect(instance.homeNotional).to.be(expectedValueLiteral);
      });

      it('should have the property foreignNotional (base name: "foreignNotional")', function() {
        // TODO: update the code to test the property foreignNotional
        expect(instance).to.have.property('foreignNotional');
        // expect(instance.foreignNotional).to.be(expectedValueLiteral);
      });

      it('should have the property posState (base name: "posState")', function() {
        // TODO: update the code to test the property posState
        expect(instance).to.have.property('posState');
        // expect(instance.posState).to.be(expectedValueLiteral);
      });

      it('should have the property posCost (base name: "posCost")', function() {
        // TODO: update the code to test the property posCost
        expect(instance).to.have.property('posCost');
        // expect(instance.posCost).to.be(expectedValueLiteral);
      });

      it('should have the property posCross (base name: "posCross")', function() {
        // TODO: update the code to test the property posCross
        expect(instance).to.have.property('posCross');
        // expect(instance.posCross).to.be(expectedValueLiteral);
      });

      it('should have the property posComm (base name: "posComm")', function() {
        // TODO: update the code to test the property posComm
        expect(instance).to.have.property('posComm');
        // expect(instance.posComm).to.be(expectedValueLiteral);
      });

      it('should have the property posLoss (base name: "posLoss")', function() {
        // TODO: update the code to test the property posLoss
        expect(instance).to.have.property('posLoss');
        // expect(instance.posLoss).to.be(expectedValueLiteral);
      });

      it('should have the property posMargin (base name: "posMargin")', function() {
        // TODO: update the code to test the property posMargin
        expect(instance).to.have.property('posMargin');
        // expect(instance.posMargin).to.be(expectedValueLiteral);
      });

      it('should have the property posMaint (base name: "posMaint")', function() {
        // TODO: update the code to test the property posMaint
        expect(instance).to.have.property('posMaint');
        // expect(instance.posMaint).to.be(expectedValueLiteral);
      });

      it('should have the property initMargin (base name: "initMargin")', function() {
        // TODO: update the code to test the property initMargin
        expect(instance).to.have.property('initMargin');
        // expect(instance.initMargin).to.be(expectedValueLiteral);
      });

      it('should have the property maintMargin (base name: "maintMargin")', function() {
        // TODO: update the code to test the property maintMargin
        expect(instance).to.have.property('maintMargin');
        // expect(instance.maintMargin).to.be(expectedValueLiteral);
      });

      it('should have the property realisedPnl (base name: "realisedPnl")', function() {
        // TODO: update the code to test the property realisedPnl
        expect(instance).to.have.property('realisedPnl');
        // expect(instance.realisedPnl).to.be(expectedValueLiteral);
      });

      it('should have the property unrealisedPnl (base name: "unrealisedPnl")', function() {
        // TODO: update the code to test the property unrealisedPnl
        expect(instance).to.have.property('unrealisedPnl');
        // expect(instance.unrealisedPnl).to.be(expectedValueLiteral);
      });

      it('should have the property unrealisedPnlPcnt (base name: "unrealisedPnlPcnt")', function() {
        // TODO: update the code to test the property unrealisedPnlPcnt
        expect(instance).to.have.property('unrealisedPnlPcnt');
        // expect(instance.unrealisedPnlPcnt).to.be(expectedValueLiteral);
      });

      it('should have the property unrealisedRoePcnt (base name: "unrealisedRoePcnt")', function() {
        // TODO: update the code to test the property unrealisedRoePcnt
        expect(instance).to.have.property('unrealisedRoePcnt');
        // expect(instance.unrealisedRoePcnt).to.be(expectedValueLiteral);
      });

      it('should have the property avgCostPrice (base name: "avgCostPrice")', function() {
        // TODO: update the code to test the property avgCostPrice
        expect(instance).to.have.property('avgCostPrice');
        // expect(instance.avgCostPrice).to.be(expectedValueLiteral);
      });

      it('should have the property avgEntryPrice (base name: "avgEntryPrice")', function() {
        // TODO: update the code to test the property avgEntryPrice
        expect(instance).to.have.property('avgEntryPrice');
        // expect(instance.avgEntryPrice).to.be(expectedValueLiteral);
      });

      it('should have the property breakEvenPrice (base name: "breakEvenPrice")', function() {
        // TODO: update the code to test the property breakEvenPrice
        expect(instance).to.have.property('breakEvenPrice');
        // expect(instance.breakEvenPrice).to.be(expectedValueLiteral);
      });

      it('should have the property marginCallPrice (base name: "marginCallPrice")', function() {
        // TODO: update the code to test the property marginCallPrice
        expect(instance).to.have.property('marginCallPrice');
        // expect(instance.marginCallPrice).to.be(expectedValueLiteral);
      });

      it('should have the property liquidationPrice (base name: "liquidationPrice")', function() {
        // TODO: update the code to test the property liquidationPrice
        expect(instance).to.have.property('liquidationPrice');
        // expect(instance.liquidationPrice).to.be(expectedValueLiteral);
      });

      it('should have the property bankruptPrice (base name: "bankruptPrice")', function() {
        // TODO: update the code to test the property bankruptPrice
        expect(instance).to.have.property('bankruptPrice');
        // expect(instance.bankruptPrice).to.be(expectedValueLiteral);
      });

      it('should have the property timestamp (base name: "timestamp")', function() {
        // TODO: update the code to test the property timestamp
        expect(instance).to.have.property('timestamp');
        // expect(instance.timestamp).to.be(expectedValueLiteral);
      });

    });
  });

}));
