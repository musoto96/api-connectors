/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.38-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "Trade.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Trade::Trade()
{
    m_Timestamp = utility::datetime();
    m_Symbol = utility::conversions::to_string_t("");
    m_Side = utility::conversions::to_string_t("");
    m_SideIsSet = false;
    m_Size = 0.0;
    m_SizeIsSet = false;
    m_Price = 0.0;
    m_PriceIsSet = false;
    m_TickDirection = utility::conversions::to_string_t("");
    m_TickDirectionIsSet = false;
    m_TrdMatchID = utility::conversions::to_string_t("");
    m_TrdMatchIDIsSet = false;
    m_GrossValue = 0.0;
    m_GrossValueIsSet = false;
    m_HomeNotional = 0.0;
    m_HomeNotionalIsSet = false;
    m_ForeignNotional = 0.0;
    m_ForeignNotionalIsSet = false;
    m_TrdType = utility::conversions::to_string_t("");
    m_TrdTypeIsSet = false;
}

Trade::~Trade()
{
}

void Trade::validate()
{
    // TODO: implement validation
}

web::json::value Trade::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("timestamp")] = ModelBase::toJson(m_Timestamp);
    val[utility::conversions::to_string_t("symbol")] = ModelBase::toJson(m_Symbol);
    if(m_SideIsSet)
    {
        val[utility::conversions::to_string_t("side")] = ModelBase::toJson(m_Side);
    }
    if(m_SizeIsSet)
    {
        val[utility::conversions::to_string_t("size")] = ModelBase::toJson(m_Size);
    }
    if(m_PriceIsSet)
    {
        val[utility::conversions::to_string_t("price")] = ModelBase::toJson(m_Price);
    }
    if(m_TickDirectionIsSet)
    {
        val[utility::conversions::to_string_t("tickDirection")] = ModelBase::toJson(m_TickDirection);
    }
    if(m_TrdMatchIDIsSet)
    {
        val[utility::conversions::to_string_t("trdMatchID")] = ModelBase::toJson(m_TrdMatchID);
    }
    if(m_GrossValueIsSet)
    {
        val[utility::conversions::to_string_t("grossValue")] = ModelBase::toJson(m_GrossValue);
    }
    if(m_HomeNotionalIsSet)
    {
        val[utility::conversions::to_string_t("homeNotional")] = ModelBase::toJson(m_HomeNotional);
    }
    if(m_ForeignNotionalIsSet)
    {
        val[utility::conversions::to_string_t("foreignNotional")] = ModelBase::toJson(m_ForeignNotional);
    }
    if(m_TrdTypeIsSet)
    {
        val[utility::conversions::to_string_t("trdType")] = ModelBase::toJson(m_TrdType);
    }

    return val;
}

void Trade::fromJson(web::json::value& val)
{
    setTimestamp
    (ModelBase::dateFromJson(val[utility::conversions::to_string_t("timestamp")]));
    setSymbol(ModelBase::stringFromJson(val[utility::conversions::to_string_t("symbol")]));
    if(val.has_field(utility::conversions::to_string_t("side")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("side")];
        if(!fieldValue.is_null())
        {
            setSide(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("size")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("size")];
        if(!fieldValue.is_null())
        {
            setSize(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("price")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("price")];
        if(!fieldValue.is_null())
        {
            setPrice(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("tickDirection")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("tickDirection")];
        if(!fieldValue.is_null())
        {
            setTickDirection(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trdMatchID")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("trdMatchID")];
        if(!fieldValue.is_null())
        {
            setTrdMatchID(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("grossValue")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("grossValue")];
        if(!fieldValue.is_null())
        {
            setGrossValue(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("homeNotional")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("homeNotional")];
        if(!fieldValue.is_null())
        {
            setHomeNotional(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("foreignNotional")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("foreignNotional")];
        if(!fieldValue.is_null())
        {
            setForeignNotional(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trdType")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("trdType")];
        if(!fieldValue.is_null())
        {
            setTrdType(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void Trade::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timestamp"), m_Timestamp));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol"), m_Symbol));
    if(m_SideIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("side"), m_Side));
        
    }
    if(m_SizeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("size"), m_Size));
    }
    if(m_PriceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("price"), m_Price));
    }
    if(m_TickDirectionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("tickDirection"), m_TickDirection));
        
    }
    if(m_TrdMatchIDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trdMatchID"), m_TrdMatchID));
        
    }
    if(m_GrossValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("grossValue"), m_GrossValue));
    }
    if(m_HomeNotionalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("homeNotional"), m_HomeNotional));
    }
    if(m_ForeignNotionalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("foreignNotional"), m_ForeignNotional));
    }
    if(m_TrdTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trdType"), m_TrdType));
        
    }
}

void Trade::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setTimestamp(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timestamp"))));
    setSymbol(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol"))));
    if(multipart->hasContent(utility::conversions::to_string_t("side")))
    {
        setSide(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("side"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("size")))
    {
        setSize(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("size"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("price")))
    {
        setPrice(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("price"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("tickDirection")))
    {
        setTickDirection(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("tickDirection"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trdMatchID")))
    {
        setTrdMatchID(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trdMatchID"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("grossValue")))
    {
        setGrossValue(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("grossValue"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("homeNotional")))
    {
        setHomeNotional(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("homeNotional"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("foreignNotional")))
    {
        setForeignNotional(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("foreignNotional"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trdType")))
    {
        setTrdType(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trdType"))));
    }
}

utility::datetime Trade::getTimestamp() const
{
    return m_Timestamp;
}


void Trade::setTimestamp(utility::datetime value)
{
    m_Timestamp = value;
    
}
utility::string_t Trade::getSymbol() const
{
    return m_Symbol;
}


void Trade::setSymbol(utility::string_t value)
{
    m_Symbol = value;
    
}
utility::string_t Trade::getSide() const
{
    return m_Side;
}


void Trade::setSide(utility::string_t value)
{
    m_Side = value;
    m_SideIsSet = true;
}
bool Trade::sideIsSet() const
{
    return m_SideIsSet;
}

void Trade::unsetSide()
{
    m_SideIsSet = false;
}

double Trade::getSize() const
{
    return m_Size;
}


void Trade::setSize(double value)
{
    m_Size = value;
    m_SizeIsSet = true;
}
bool Trade::sizeIsSet() const
{
    return m_SizeIsSet;
}

void Trade::unsetSize()
{
    m_SizeIsSet = false;
}

double Trade::getPrice() const
{
    return m_Price;
}


void Trade::setPrice(double value)
{
    m_Price = value;
    m_PriceIsSet = true;
}
bool Trade::priceIsSet() const
{
    return m_PriceIsSet;
}

void Trade::unsetPrice()
{
    m_PriceIsSet = false;
}

utility::string_t Trade::getTickDirection() const
{
    return m_TickDirection;
}


void Trade::setTickDirection(utility::string_t value)
{
    m_TickDirection = value;
    m_TickDirectionIsSet = true;
}
bool Trade::tickDirectionIsSet() const
{
    return m_TickDirectionIsSet;
}

void Trade::unsetTickDirection()
{
    m_TickDirectionIsSet = false;
}

utility::string_t Trade::getTrdMatchID() const
{
    return m_TrdMatchID;
}


void Trade::setTrdMatchID(utility::string_t value)
{
    m_TrdMatchID = value;
    m_TrdMatchIDIsSet = true;
}
bool Trade::trdMatchIDIsSet() const
{
    return m_TrdMatchIDIsSet;
}

void Trade::unsetTrdMatchID()
{
    m_TrdMatchIDIsSet = false;
}

double Trade::getGrossValue() const
{
    return m_GrossValue;
}


void Trade::setGrossValue(double value)
{
    m_GrossValue = value;
    m_GrossValueIsSet = true;
}
bool Trade::grossValueIsSet() const
{
    return m_GrossValueIsSet;
}

void Trade::unsetGrossValue()
{
    m_GrossValueIsSet = false;
}

double Trade::getHomeNotional() const
{
    return m_HomeNotional;
}


void Trade::setHomeNotional(double value)
{
    m_HomeNotional = value;
    m_HomeNotionalIsSet = true;
}
bool Trade::homeNotionalIsSet() const
{
    return m_HomeNotionalIsSet;
}

void Trade::unsetHomeNotional()
{
    m_HomeNotionalIsSet = false;
}

double Trade::getForeignNotional() const
{
    return m_ForeignNotional;
}


void Trade::setForeignNotional(double value)
{
    m_ForeignNotional = value;
    m_ForeignNotionalIsSet = true;
}
bool Trade::foreignNotionalIsSet() const
{
    return m_ForeignNotionalIsSet;
}

void Trade::unsetForeignNotional()
{
    m_ForeignNotionalIsSet = false;
}

utility::string_t Trade::getTrdType() const
{
    return m_TrdType;
}


void Trade::setTrdType(utility::string_t value)
{
    m_TrdType = value;
    m_TrdTypeIsSet = true;
}
bool Trade::trdTypeIsSet() const
{
    return m_TrdTypeIsSet;
}

void Trade::unsetTrdType()
{
    m_TrdTypeIsSet = false;
}

}
}
}
}

