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
    ///  Class for testing GlobalNotification
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class GlobalNotificationTests
    {
        // TODO uncomment below to declare an instance variable for GlobalNotification
        //private GlobalNotification instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of GlobalNotification
            //instance = new GlobalNotification();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of GlobalNotification
        /// </summary>
        [Test]
        public void GlobalNotificationInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" GlobalNotification
            //Assert.IsInstanceOfType<GlobalNotification> (instance, "variable 'instance' is a GlobalNotification");
        }


        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'Date'
        /// </summary>
        [Test]
        public void DateTest()
        {
            // TODO unit test for the property 'Date'
        }
        /// <summary>
        /// Test the property 'Title'
        /// </summary>
        [Test]
        public void TitleTest()
        {
            // TODO unit test for the property 'Title'
        }
        /// <summary>
        /// Test the property 'Body'
        /// </summary>
        [Test]
        public void BodyTest()
        {
            // TODO unit test for the property 'Body'
        }
        /// <summary>
        /// Test the property 'Ttl'
        /// </summary>
        [Test]
        public void TtlTest()
        {
            // TODO unit test for the property 'Ttl'
        }
        /// <summary>
        /// Test the property 'Type'
        /// </summary>
        [Test]
        public void TypeTest()
        {
            // TODO unit test for the property 'Type'
        }
        /// <summary>
        /// Test the property 'Closable'
        /// </summary>
        [Test]
        public void ClosableTest()
        {
            // TODO unit test for the property 'Closable'
        }
        /// <summary>
        /// Test the property 'Persist'
        /// </summary>
        [Test]
        public void PersistTest()
        {
            // TODO unit test for the property 'Persist'
        }
        /// <summary>
        /// Test the property 'WaitForVisibility'
        /// </summary>
        [Test]
        public void WaitForVisibilityTest()
        {
            // TODO unit test for the property 'WaitForVisibility'
        }
        /// <summary>
        /// Test the property 'Sound'
        /// </summary>
        [Test]
        public void SoundTest()
        {
            // TODO unit test for the property 'Sound'
        }

    }

}
