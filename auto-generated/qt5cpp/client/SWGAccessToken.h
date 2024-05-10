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

/*
 * SWGAccessToken.h
 *
 * 
 */

#ifndef SWGAccessToken_H_
#define SWGAccessToken_H_

#include <QJsonObject>


#include "SWGObject.h"
#include <QDateTime>
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGAccessToken: public SWGObject {
public:
    SWGAccessToken();
    SWGAccessToken(QString json);
    ~SWGAccessToken();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGAccessToken* fromJson(QString jsonString) override;

    QDateTime* getUpdated();
    void setUpdated(QDateTime* updated);

    SWGObject* getAuthorizedAccounts();
    void setAuthorizedAccounts(SWGObject* authorized_accounts);

    QString* getId();
    void setId(QString* id);

    double getTtl();
    void setTtl(double ttl);

    QDateTime* getCreated();
    void setCreated(QDateTime* created);

    double getUserId();
    void setUserId(double user_id);


    virtual bool isSet() override;

private:
    QDateTime* updated;
    bool m_updated_isSet;

    SWGObject* authorized_accounts;
    bool m_authorized_accounts_isSet;

    QString* id;
    bool m_id_isSet;

    double ttl;
    bool m_ttl_isSet;

    QDateTime* created;
    bool m_created_isSet;

    double user_id;
    bool m_user_id_isSet;

};

}

#endif /* SWGAccessToken_H_ */
