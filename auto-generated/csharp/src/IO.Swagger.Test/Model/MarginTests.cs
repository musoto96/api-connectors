/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing Margin
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class MarginTests
    {
        // TODO uncomment below to declare an instance variable for Margin
        //private Margin instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of Margin
            //instance = new Margin();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Margin
        /// </summary>
        [Test]
        public void MarginInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" Margin
            //Assert.IsInstanceOfType<Margin> (instance, "variable 'instance' is a Margin");
        }


        /// <summary>
        /// Test the property 'Account'
        /// </summary>
        [Test]
        public void AccountTest()
        {
            // TODO unit test for the property 'Account'
        }
        /// <summary>
        /// Test the property 'Currency'
        /// </summary>
        [Test]
        public void CurrencyTest()
        {
            // TODO unit test for the property 'Currency'
        }
        /// <summary>
        /// Test the property 'RiskLimit'
        /// </summary>
        [Test]
        public void RiskLimitTest()
        {
            // TODO unit test for the property 'RiskLimit'
        }
        /// <summary>
        /// Test the property 'State'
        /// </summary>
        [Test]
        public void StateTest()
        {
            // TODO unit test for the property 'State'
        }
        /// <summary>
        /// Test the property 'Amount'
        /// </summary>
        [Test]
        public void AmountTest()
        {
            // TODO unit test for the property 'Amount'
        }
        /// <summary>
        /// Test the property 'PrevRealisedPnl'
        /// </summary>
        [Test]
        public void PrevRealisedPnlTest()
        {
            // TODO unit test for the property 'PrevRealisedPnl'
        }
        /// <summary>
        /// Test the property 'GrossComm'
        /// </summary>
        [Test]
        public void GrossCommTest()
        {
            // TODO unit test for the property 'GrossComm'
        }
        /// <summary>
        /// Test the property 'GrossOpenCost'
        /// </summary>
        [Test]
        public void GrossOpenCostTest()
        {
            // TODO unit test for the property 'GrossOpenCost'
        }
        /// <summary>
        /// Test the property 'GrossOpenPremium'
        /// </summary>
        [Test]
        public void GrossOpenPremiumTest()
        {
            // TODO unit test for the property 'GrossOpenPremium'
        }
        /// <summary>
        /// Test the property 'GrossExecCost'
        /// </summary>
        [Test]
        public void GrossExecCostTest()
        {
            // TODO unit test for the property 'GrossExecCost'
        }
        /// <summary>
        /// Test the property 'GrossMarkValue'
        /// </summary>
        [Test]
        public void GrossMarkValueTest()
        {
            // TODO unit test for the property 'GrossMarkValue'
        }
        /// <summary>
        /// Test the property 'RiskValue'
        /// </summary>
        [Test]
        public void RiskValueTest()
        {
            // TODO unit test for the property 'RiskValue'
        }
        /// <summary>
        /// Test the property 'InitMargin'
        /// </summary>
        [Test]
        public void InitMarginTest()
        {
            // TODO unit test for the property 'InitMargin'
        }
        /// <summary>
        /// Test the property 'MaintMargin'
        /// </summary>
        [Test]
        public void MaintMarginTest()
        {
            // TODO unit test for the property 'MaintMargin'
        }
        /// <summary>
        /// Test the property 'TargetExcessMargin'
        /// </summary>
        [Test]
        public void TargetExcessMarginTest()
        {
            // TODO unit test for the property 'TargetExcessMargin'
        }
        /// <summary>
        /// Test the property 'RealisedPnl'
        /// </summary>
        [Test]
        public void RealisedPnlTest()
        {
            // TODO unit test for the property 'RealisedPnl'
        }
        /// <summary>
        /// Test the property 'UnrealisedPnl'
        /// </summary>
        [Test]
        public void UnrealisedPnlTest()
        {
            // TODO unit test for the property 'UnrealisedPnl'
        }
        /// <summary>
        /// Test the property 'WalletBalance'
        /// </summary>
        [Test]
        public void WalletBalanceTest()
        {
            // TODO unit test for the property 'WalletBalance'
        }
        /// <summary>
        /// Test the property 'MarginBalance'
        /// </summary>
        [Test]
        public void MarginBalanceTest()
        {
            // TODO unit test for the property 'MarginBalance'
        }
        /// <summary>
        /// Test the property 'MarginLeverage'
        /// </summary>
        [Test]
        public void MarginLeverageTest()
        {
            // TODO unit test for the property 'MarginLeverage'
        }
        /// <summary>
        /// Test the property 'MarginUsedPcnt'
        /// </summary>
        [Test]
        public void MarginUsedPcntTest()
        {
            // TODO unit test for the property 'MarginUsedPcnt'
        }
        /// <summary>
        /// Test the property 'ExcessMargin'
        /// </summary>
        [Test]
        public void ExcessMarginTest()
        {
            // TODO unit test for the property 'ExcessMargin'
        }
        /// <summary>
        /// Test the property 'AvailableMargin'
        /// </summary>
        [Test]
        public void AvailableMarginTest()
        {
            // TODO unit test for the property 'AvailableMargin'
        }
        /// <summary>
        /// Test the property 'WithdrawableMargin'
        /// </summary>
        [Test]
        public void WithdrawableMarginTest()
        {
            // TODO unit test for the property 'WithdrawableMargin'
        }
        /// <summary>
        /// Test the property 'MakerFeeDiscount'
        /// </summary>
        [Test]
        public void MakerFeeDiscountTest()
        {
            // TODO unit test for the property 'MakerFeeDiscount'
        }
        /// <summary>
        /// Test the property 'TakerFeeDiscount'
        /// </summary>
        [Test]
        public void TakerFeeDiscountTest()
        {
            // TODO unit test for the property 'TakerFeeDiscount'
        }
        /// <summary>
        /// Test the property 'Timestamp'
        /// </summary>
        [Test]
        public void TimestampTest()
        {
            // TODO unit test for the property 'Timestamp'
        }

    }

}
