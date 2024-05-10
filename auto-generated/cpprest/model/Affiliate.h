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

/*
 * Affiliate.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Affiliate_H_
#define IO_SWAGGER_CLIENT_MODEL_Affiliate_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Affiliate
    : public ModelBase
{
public:
    Affiliate();
    virtual ~Affiliate();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Affiliate members

    /// <summary>
    /// 
    /// </summary>
    double getAccount() const;
        void setAccount(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCurrency() const;
        void setCurrency(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getPrevPayout() const;
    bool prevPayoutIsSet() const;
    void unsetPrevPayout();
    void setPrevPayout(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPrevTurnover() const;
    bool prevTurnoverIsSet() const;
    void unsetPrevTurnover();
    void setPrevTurnover(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPrevComm() const;
    bool prevCommIsSet() const;
    void unsetPrevComm();
    void setPrevComm(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getPrevTimestamp() const;
    bool prevTimestampIsSet() const;
    void unsetPrevTimestamp();
    void setPrevTimestamp(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    double getExecTurnover() const;
    bool execTurnoverIsSet() const;
    void unsetExecTurnover();
    void setExecTurnover(double value);
    /// <summary>
    /// 
    /// </summary>
    double getExecComm() const;
    bool execCommIsSet() const;
    void unsetExecComm();
    void setExecComm(double value);
    /// <summary>
    /// 
    /// </summary>
    double getTotalReferrals() const;
    bool totalReferralsIsSet() const;
    void unsetTotalReferrals();
    void setTotalReferrals(double value);
    /// <summary>
    /// 
    /// </summary>
    double getTotalTurnover() const;
    bool totalTurnoverIsSet() const;
    void unsetTotalTurnover();
    void setTotalTurnover(double value);
    /// <summary>
    /// 
    /// </summary>
    double getTotalComm() const;
    bool totalCommIsSet() const;
    void unsetTotalComm();
    void setTotalComm(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPayoutPcnt() const;
    bool payoutPcntIsSet() const;
    void unsetPayoutPcnt();
    void setPayoutPcnt(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPendingPayout() const;
    bool pendingPayoutIsSet() const;
    void unsetPendingPayout();
    void setPendingPayout(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();
    void setTimestamp(utility::datetime value);
    /// <summary>
    /// 
    /// </summary>
    double getReferrerAccount() const;
    bool referrerAccountIsSet() const;
    void unsetReferrerAccount();
    void setReferrerAccount(double value);
    /// <summary>
    /// 
    /// </summary>
    double getReferralDiscount() const;
    bool referralDiscountIsSet() const;
    void unsetReferralDiscount();
    void setReferralDiscount(double value);
    /// <summary>
    /// 
    /// </summary>
    double getAffiliatePayout() const;
    bool affiliatePayoutIsSet() const;
    void unsetAffiliatePayout();
    void setAffiliatePayout(double value);

protected:
    double m_Account;
        utility::string_t m_Currency;
        double m_PrevPayout;
    bool m_PrevPayoutIsSet;
    double m_PrevTurnover;
    bool m_PrevTurnoverIsSet;
    double m_PrevComm;
    bool m_PrevCommIsSet;
    utility::datetime m_PrevTimestamp;
    bool m_PrevTimestampIsSet;
    double m_ExecTurnover;
    bool m_ExecTurnoverIsSet;
    double m_ExecComm;
    bool m_ExecCommIsSet;
    double m_TotalReferrals;
    bool m_TotalReferralsIsSet;
    double m_TotalTurnover;
    bool m_TotalTurnoverIsSet;
    double m_TotalComm;
    bool m_TotalCommIsSet;
    double m_PayoutPcnt;
    bool m_PayoutPcntIsSet;
    double m_PendingPayout;
    bool m_PendingPayoutIsSet;
    utility::datetime m_Timestamp;
    bool m_TimestampIsSet;
    double m_ReferrerAccount;
    bool m_ReferrerAccountIsSet;
    double m_ReferralDiscount;
    bool m_ReferralDiscountIsSet;
    double m_AffiliatePayout;
    bool m_AffiliatePayoutIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Affiliate_H_ */
