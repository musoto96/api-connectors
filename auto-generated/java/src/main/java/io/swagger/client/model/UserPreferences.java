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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * UserPreferences
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T15:37:13.208+08:00")
public class UserPreferences {
  @SerializedName("alertOnLiquidations")
  private Boolean alertOnLiquidations = null;

  @SerializedName("animationsEnabled")
  private Boolean animationsEnabled = null;

  @SerializedName("announcementsLastSeen")
  private OffsetDateTime announcementsLastSeen = null;

  @SerializedName("chatChannelID")
  private Double chatChannelID = null;

  @SerializedName("colorTheme")
  private String colorTheme = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("debug")
  private Boolean debug = null;

  @SerializedName("disableEmails")
  private List<String> disableEmails = null;

  @SerializedName("disablePush")
  private List<String> disablePush = null;

  @SerializedName("displayCorpEnrollUpsell")
  private Boolean displayCorpEnrollUpsell = null;

  @SerializedName("equivalentCurrency")
  private String equivalentCurrency = null;

  @SerializedName("features")
  private List<String> features = null;

  @SerializedName("favourites")
  private List<String> favourites = null;

  @SerializedName("favouritesAssets")
  private List<String> favouritesAssets = null;

  @SerializedName("favouritesOrdered")
  private List<String> favouritesOrdered = null;

  @SerializedName("hideConfirmDialogs")
  private List<String> hideConfirmDialogs = null;

  @SerializedName("hideConnectionModal")
  private Boolean hideConnectionModal = null;

  @SerializedName("hideFromLeaderboard")
  private Boolean hideFromLeaderboard = false;

  @SerializedName("hideNameFromLeaderboard")
  private Boolean hideNameFromLeaderboard = true;

  @SerializedName("hideNotifications")
  private List<String> hideNotifications = null;

  @SerializedName("hidePhoneConfirm")
  private Boolean hidePhoneConfirm = false;

  @SerializedName("isSensitiveInfoVisible")
  private Boolean isSensitiveInfoVisible = null;

  @SerializedName("isWalletZeroBalanceHidden")
  private Boolean isWalletZeroBalanceHidden = null;

  @SerializedName("locale")
  private String locale = "en-US";

  @SerializedName("localeSetTime")
  private Double localeSetTime = null;

  @SerializedName("marginPnlRow")
  private String marginPnlRow = null;

  @SerializedName("marginPnlRowKind")
  private String marginPnlRowKind = null;

  @SerializedName("msgsSeen")
  private List<String> msgsSeen = null;

  @SerializedName("notifications")
  private Object notifications = null;

  @SerializedName("orderBookBinning")
  private Object orderBookBinning = null;

  @SerializedName("orderBookType")
  private String orderBookType = null;

  @SerializedName("orderClearImmediate")
  private Boolean orderClearImmediate = false;

  @SerializedName("orderControlsPlusMinus")
  private Boolean orderControlsPlusMinus = null;

  @SerializedName("platformLayout")
  private String platformLayout = null;

  @SerializedName("selectedFiatCurrency")
  private String selectedFiatCurrency = null;

  @SerializedName("showChartBottomToolbar")
  private Boolean showChartBottomToolbar = null;

  @SerializedName("showLocaleNumbers")
  private Boolean showLocaleNumbers = true;

  @SerializedName("sounds")
  private List<String> sounds = null;

  @SerializedName("strictIPCheck")
  private Boolean strictIPCheck = false;

  @SerializedName("strictTimeout")
  private Boolean strictTimeout = true;

  @SerializedName("tickerGroup")
  private String tickerGroup = null;

  @SerializedName("tickerPinned")
  private Boolean tickerPinned = null;

  @SerializedName("tradeLayout")
  private String tradeLayout = null;

  @SerializedName("userColor")
  private String userColor = null;

  public UserPreferences alertOnLiquidations(Boolean alertOnLiquidations) {
    this.alertOnLiquidations = alertOnLiquidations;
    return this;
  }

   /**
   * Get alertOnLiquidations
   * @return alertOnLiquidations
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlertOnLiquidations() {
    return alertOnLiquidations;
  }

  public void setAlertOnLiquidations(Boolean alertOnLiquidations) {
    this.alertOnLiquidations = alertOnLiquidations;
  }

  public UserPreferences animationsEnabled(Boolean animationsEnabled) {
    this.animationsEnabled = animationsEnabled;
    return this;
  }

   /**
   * Get animationsEnabled
   * @return animationsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnimationsEnabled() {
    return animationsEnabled;
  }

  public void setAnimationsEnabled(Boolean animationsEnabled) {
    this.animationsEnabled = animationsEnabled;
  }

  public UserPreferences announcementsLastSeen(OffsetDateTime announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
    return this;
  }

   /**
   * Get announcementsLastSeen
   * @return announcementsLastSeen
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }

  public void setAnnouncementsLastSeen(OffsetDateTime announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
  }

  public UserPreferences chatChannelID(Double chatChannelID) {
    this.chatChannelID = chatChannelID;
    return this;
  }

   /**
   * Get chatChannelID
   * @return chatChannelID
  **/
  @ApiModelProperty(value = "")
  public Double getChatChannelID() {
    return chatChannelID;
  }

  public void setChatChannelID(Double chatChannelID) {
    this.chatChannelID = chatChannelID;
  }

  public UserPreferences colorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
    return this;
  }

   /**
   * Get colorTheme
   * @return colorTheme
  **/
  @ApiModelProperty(value = "")
  public String getColorTheme() {
    return colorTheme;
  }

  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
  }

  public UserPreferences currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public UserPreferences debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @ApiModelProperty(value = "")
  public Boolean isDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public UserPreferences disableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
    return this;
  }

  public UserPreferences addDisableEmailsItem(String disableEmailsItem) {
    if (this.disableEmails == null) {
      this.disableEmails = new ArrayList<String>();
    }
    this.disableEmails.add(disableEmailsItem);
    return this;
  }

   /**
   * Get disableEmails
   * @return disableEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getDisableEmails() {
    return disableEmails;
  }

  public void setDisableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
  }

  public UserPreferences disablePush(List<String> disablePush) {
    this.disablePush = disablePush;
    return this;
  }

  public UserPreferences addDisablePushItem(String disablePushItem) {
    if (this.disablePush == null) {
      this.disablePush = new ArrayList<String>();
    }
    this.disablePush.add(disablePushItem);
    return this;
  }

   /**
   * Get disablePush
   * @return disablePush
  **/
  @ApiModelProperty(value = "")
  public List<String> getDisablePush() {
    return disablePush;
  }

  public void setDisablePush(List<String> disablePush) {
    this.disablePush = disablePush;
  }

  public UserPreferences displayCorpEnrollUpsell(Boolean displayCorpEnrollUpsell) {
    this.displayCorpEnrollUpsell = displayCorpEnrollUpsell;
    return this;
  }

   /**
   * Get displayCorpEnrollUpsell
   * @return displayCorpEnrollUpsell
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisplayCorpEnrollUpsell() {
    return displayCorpEnrollUpsell;
  }

  public void setDisplayCorpEnrollUpsell(Boolean displayCorpEnrollUpsell) {
    this.displayCorpEnrollUpsell = displayCorpEnrollUpsell;
  }

  public UserPreferences equivalentCurrency(String equivalentCurrency) {
    this.equivalentCurrency = equivalentCurrency;
    return this;
  }

   /**
   * Get equivalentCurrency
   * @return equivalentCurrency
  **/
  @ApiModelProperty(value = "")
  public String getEquivalentCurrency() {
    return equivalentCurrency;
  }

  public void setEquivalentCurrency(String equivalentCurrency) {
    this.equivalentCurrency = equivalentCurrency;
  }

  public UserPreferences features(List<String> features) {
    this.features = features;
    return this;
  }

  public UserPreferences addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public UserPreferences favourites(List<String> favourites) {
    this.favourites = favourites;
    return this;
  }

  public UserPreferences addFavouritesItem(String favouritesItem) {
    if (this.favourites == null) {
      this.favourites = new ArrayList<String>();
    }
    this.favourites.add(favouritesItem);
    return this;
  }

   /**
   * Get favourites
   * @return favourites
  **/
  @ApiModelProperty(value = "")
  public List<String> getFavourites() {
    return favourites;
  }

  public void setFavourites(List<String> favourites) {
    this.favourites = favourites;
  }

  public UserPreferences favouritesAssets(List<String> favouritesAssets) {
    this.favouritesAssets = favouritesAssets;
    return this;
  }

  public UserPreferences addFavouritesAssetsItem(String favouritesAssetsItem) {
    if (this.favouritesAssets == null) {
      this.favouritesAssets = new ArrayList<String>();
    }
    this.favouritesAssets.add(favouritesAssetsItem);
    return this;
  }

   /**
   * Get favouritesAssets
   * @return favouritesAssets
  **/
  @ApiModelProperty(value = "")
  public List<String> getFavouritesAssets() {
    return favouritesAssets;
  }

  public void setFavouritesAssets(List<String> favouritesAssets) {
    this.favouritesAssets = favouritesAssets;
  }

  public UserPreferences favouritesOrdered(List<String> favouritesOrdered) {
    this.favouritesOrdered = favouritesOrdered;
    return this;
  }

  public UserPreferences addFavouritesOrderedItem(String favouritesOrderedItem) {
    if (this.favouritesOrdered == null) {
      this.favouritesOrdered = new ArrayList<String>();
    }
    this.favouritesOrdered.add(favouritesOrderedItem);
    return this;
  }

   /**
   * Get favouritesOrdered
   * @return favouritesOrdered
  **/
  @ApiModelProperty(value = "")
  public List<String> getFavouritesOrdered() {
    return favouritesOrdered;
  }

  public void setFavouritesOrdered(List<String> favouritesOrdered) {
    this.favouritesOrdered = favouritesOrdered;
  }

  public UserPreferences hideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
    return this;
  }

  public UserPreferences addHideConfirmDialogsItem(String hideConfirmDialogsItem) {
    if (this.hideConfirmDialogs == null) {
      this.hideConfirmDialogs = new ArrayList<String>();
    }
    this.hideConfirmDialogs.add(hideConfirmDialogsItem);
    return this;
  }

   /**
   * Get hideConfirmDialogs
   * @return hideConfirmDialogs
  **/
  @ApiModelProperty(value = "")
  public List<String> getHideConfirmDialogs() {
    return hideConfirmDialogs;
  }

  public void setHideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
  }

  public UserPreferences hideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
    return this;
  }

   /**
   * Get hideConnectionModal
   * @return hideConnectionModal
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideConnectionModal() {
    return hideConnectionModal;
  }

  public void setHideConnectionModal(Boolean hideConnectionModal) {
    this.hideConnectionModal = hideConnectionModal;
  }

  public UserPreferences hideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
    return this;
  }

   /**
   * Get hideFromLeaderboard
   * @return hideFromLeaderboard
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideFromLeaderboard() {
    return hideFromLeaderboard;
  }

  public void setHideFromLeaderboard(Boolean hideFromLeaderboard) {
    this.hideFromLeaderboard = hideFromLeaderboard;
  }

  public UserPreferences hideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
    return this;
  }

   /**
   * Get hideNameFromLeaderboard
   * @return hideNameFromLeaderboard
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideNameFromLeaderboard() {
    return hideNameFromLeaderboard;
  }

  public void setHideNameFromLeaderboard(Boolean hideNameFromLeaderboard) {
    this.hideNameFromLeaderboard = hideNameFromLeaderboard;
  }

  public UserPreferences hideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
    return this;
  }

  public UserPreferences addHideNotificationsItem(String hideNotificationsItem) {
    if (this.hideNotifications == null) {
      this.hideNotifications = new ArrayList<String>();
    }
    this.hideNotifications.add(hideNotificationsItem);
    return this;
  }

   /**
   * Get hideNotifications
   * @return hideNotifications
  **/
  @ApiModelProperty(value = "")
  public List<String> getHideNotifications() {
    return hideNotifications;
  }

  public void setHideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
  }

  public UserPreferences hidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
    return this;
  }

   /**
   * Get hidePhoneConfirm
   * @return hidePhoneConfirm
  **/
  @ApiModelProperty(value = "")
  public Boolean isHidePhoneConfirm() {
    return hidePhoneConfirm;
  }

  public void setHidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
  }

  public UserPreferences isSensitiveInfoVisible(Boolean isSensitiveInfoVisible) {
    this.isSensitiveInfoVisible = isSensitiveInfoVisible;
    return this;
  }

   /**
   * Get isSensitiveInfoVisible
   * @return isSensitiveInfoVisible
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSensitiveInfoVisible() {
    return isSensitiveInfoVisible;
  }

  public void setIsSensitiveInfoVisible(Boolean isSensitiveInfoVisible) {
    this.isSensitiveInfoVisible = isSensitiveInfoVisible;
  }

  public UserPreferences isWalletZeroBalanceHidden(Boolean isWalletZeroBalanceHidden) {
    this.isWalletZeroBalanceHidden = isWalletZeroBalanceHidden;
    return this;
  }

   /**
   * Get isWalletZeroBalanceHidden
   * @return isWalletZeroBalanceHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsWalletZeroBalanceHidden() {
    return isWalletZeroBalanceHidden;
  }

  public void setIsWalletZeroBalanceHidden(Boolean isWalletZeroBalanceHidden) {
    this.isWalletZeroBalanceHidden = isWalletZeroBalanceHidden;
  }

  public UserPreferences locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserPreferences localeSetTime(Double localeSetTime) {
    this.localeSetTime = localeSetTime;
    return this;
  }

   /**
   * Get localeSetTime
   * @return localeSetTime
  **/
  @ApiModelProperty(value = "")
  public Double getLocaleSetTime() {
    return localeSetTime;
  }

  public void setLocaleSetTime(Double localeSetTime) {
    this.localeSetTime = localeSetTime;
  }

  public UserPreferences marginPnlRow(String marginPnlRow) {
    this.marginPnlRow = marginPnlRow;
    return this;
  }

   /**
   * Get marginPnlRow
   * @return marginPnlRow
  **/
  @ApiModelProperty(value = "")
  public String getMarginPnlRow() {
    return marginPnlRow;
  }

  public void setMarginPnlRow(String marginPnlRow) {
    this.marginPnlRow = marginPnlRow;
  }

  public UserPreferences marginPnlRowKind(String marginPnlRowKind) {
    this.marginPnlRowKind = marginPnlRowKind;
    return this;
  }

   /**
   * Get marginPnlRowKind
   * @return marginPnlRowKind
  **/
  @ApiModelProperty(value = "")
  public String getMarginPnlRowKind() {
    return marginPnlRowKind;
  }

  public void setMarginPnlRowKind(String marginPnlRowKind) {
    this.marginPnlRowKind = marginPnlRowKind;
  }

  public UserPreferences msgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
    return this;
  }

  public UserPreferences addMsgsSeenItem(String msgsSeenItem) {
    if (this.msgsSeen == null) {
      this.msgsSeen = new ArrayList<String>();
    }
    this.msgsSeen.add(msgsSeenItem);
    return this;
  }

   /**
   * Get msgsSeen
   * @return msgsSeen
  **/
  @ApiModelProperty(value = "")
  public List<String> getMsgsSeen() {
    return msgsSeen;
  }

  public void setMsgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
  }

  public UserPreferences notifications(Object notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @ApiModelProperty(value = "")
  public Object getNotifications() {
    return notifications;
  }

  public void setNotifications(Object notifications) {
    this.notifications = notifications;
  }

  public UserPreferences orderBookBinning(Object orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
    return this;
  }

   /**
   * Get orderBookBinning
   * @return orderBookBinning
  **/
  @ApiModelProperty(value = "")
  public Object getOrderBookBinning() {
    return orderBookBinning;
  }

  public void setOrderBookBinning(Object orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
  }

  public UserPreferences orderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
    return this;
  }

   /**
   * Get orderBookType
   * @return orderBookType
  **/
  @ApiModelProperty(value = "")
  public String getOrderBookType() {
    return orderBookType;
  }

  public void setOrderBookType(String orderBookType) {
    this.orderBookType = orderBookType;
  }

  public UserPreferences orderClearImmediate(Boolean orderClearImmediate) {
    this.orderClearImmediate = orderClearImmediate;
    return this;
  }

   /**
   * Get orderClearImmediate
   * @return orderClearImmediate
  **/
  @ApiModelProperty(value = "")
  public Boolean isOrderClearImmediate() {
    return orderClearImmediate;
  }

  public void setOrderClearImmediate(Boolean orderClearImmediate) {
    this.orderClearImmediate = orderClearImmediate;
  }

  public UserPreferences orderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
    return this;
  }

   /**
   * Get orderControlsPlusMinus
   * @return orderControlsPlusMinus
  **/
  @ApiModelProperty(value = "")
  public Boolean isOrderControlsPlusMinus() {
    return orderControlsPlusMinus;
  }

  public void setOrderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
  }

  public UserPreferences platformLayout(String platformLayout) {
    this.platformLayout = platformLayout;
    return this;
  }

   /**
   * Get platformLayout
   * @return platformLayout
  **/
  @ApiModelProperty(value = "")
  public String getPlatformLayout() {
    return platformLayout;
  }

  public void setPlatformLayout(String platformLayout) {
    this.platformLayout = platformLayout;
  }

  public UserPreferences selectedFiatCurrency(String selectedFiatCurrency) {
    this.selectedFiatCurrency = selectedFiatCurrency;
    return this;
  }

   /**
   * Get selectedFiatCurrency
   * @return selectedFiatCurrency
  **/
  @ApiModelProperty(value = "")
  public String getSelectedFiatCurrency() {
    return selectedFiatCurrency;
  }

  public void setSelectedFiatCurrency(String selectedFiatCurrency) {
    this.selectedFiatCurrency = selectedFiatCurrency;
  }

  public UserPreferences showChartBottomToolbar(Boolean showChartBottomToolbar) {
    this.showChartBottomToolbar = showChartBottomToolbar;
    return this;
  }

   /**
   * Get showChartBottomToolbar
   * @return showChartBottomToolbar
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowChartBottomToolbar() {
    return showChartBottomToolbar;
  }

  public void setShowChartBottomToolbar(Boolean showChartBottomToolbar) {
    this.showChartBottomToolbar = showChartBottomToolbar;
  }

  public UserPreferences showLocaleNumbers(Boolean showLocaleNumbers) {
    this.showLocaleNumbers = showLocaleNumbers;
    return this;
  }

   /**
   * Get showLocaleNumbers
   * @return showLocaleNumbers
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowLocaleNumbers() {
    return showLocaleNumbers;
  }

  public void setShowLocaleNumbers(Boolean showLocaleNumbers) {
    this.showLocaleNumbers = showLocaleNumbers;
  }

  public UserPreferences sounds(List<String> sounds) {
    this.sounds = sounds;
    return this;
  }

  public UserPreferences addSoundsItem(String soundsItem) {
    if (this.sounds == null) {
      this.sounds = new ArrayList<String>();
    }
    this.sounds.add(soundsItem);
    return this;
  }

   /**
   * Get sounds
   * @return sounds
  **/
  @ApiModelProperty(value = "")
  public List<String> getSounds() {
    return sounds;
  }

  public void setSounds(List<String> sounds) {
    this.sounds = sounds;
  }

  public UserPreferences strictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
    return this;
  }

   /**
   * Get strictIPCheck
   * @return strictIPCheck
  **/
  @ApiModelProperty(value = "")
  public Boolean isStrictIPCheck() {
    return strictIPCheck;
  }

  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  public UserPreferences strictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
    return this;
  }

   /**
   * Get strictTimeout
   * @return strictTimeout
  **/
  @ApiModelProperty(value = "")
  public Boolean isStrictTimeout() {
    return strictTimeout;
  }

  public void setStrictTimeout(Boolean strictTimeout) {
    this.strictTimeout = strictTimeout;
  }

  public UserPreferences tickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
    return this;
  }

   /**
   * Get tickerGroup
   * @return tickerGroup
  **/
  @ApiModelProperty(value = "")
  public String getTickerGroup() {
    return tickerGroup;
  }

  public void setTickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
  }

  public UserPreferences tickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
    return this;
  }

   /**
   * Get tickerPinned
   * @return tickerPinned
  **/
  @ApiModelProperty(value = "")
  public Boolean isTickerPinned() {
    return tickerPinned;
  }

  public void setTickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
  }

  public UserPreferences tradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
    return this;
  }

   /**
   * Get tradeLayout
   * @return tradeLayout
  **/
  @ApiModelProperty(value = "")
  public String getTradeLayout() {
    return tradeLayout;
  }

  public void setTradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
  }

  public UserPreferences userColor(String userColor) {
    this.userColor = userColor;
    return this;
  }

   /**
   * Get userColor
   * @return userColor
  **/
  @ApiModelProperty(value = "")
  public String getUserColor() {
    return userColor;
  }

  public void setUserColor(String userColor) {
    this.userColor = userColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return Objects.equals(this.alertOnLiquidations, userPreferences.alertOnLiquidations) &&
        Objects.equals(this.animationsEnabled, userPreferences.animationsEnabled) &&
        Objects.equals(this.announcementsLastSeen, userPreferences.announcementsLastSeen) &&
        Objects.equals(this.chatChannelID, userPreferences.chatChannelID) &&
        Objects.equals(this.colorTheme, userPreferences.colorTheme) &&
        Objects.equals(this.currency, userPreferences.currency) &&
        Objects.equals(this.debug, userPreferences.debug) &&
        Objects.equals(this.disableEmails, userPreferences.disableEmails) &&
        Objects.equals(this.disablePush, userPreferences.disablePush) &&
        Objects.equals(this.displayCorpEnrollUpsell, userPreferences.displayCorpEnrollUpsell) &&
        Objects.equals(this.equivalentCurrency, userPreferences.equivalentCurrency) &&
        Objects.equals(this.features, userPreferences.features) &&
        Objects.equals(this.favourites, userPreferences.favourites) &&
        Objects.equals(this.favouritesAssets, userPreferences.favouritesAssets) &&
        Objects.equals(this.favouritesOrdered, userPreferences.favouritesOrdered) &&
        Objects.equals(this.hideConfirmDialogs, userPreferences.hideConfirmDialogs) &&
        Objects.equals(this.hideConnectionModal, userPreferences.hideConnectionModal) &&
        Objects.equals(this.hideFromLeaderboard, userPreferences.hideFromLeaderboard) &&
        Objects.equals(this.hideNameFromLeaderboard, userPreferences.hideNameFromLeaderboard) &&
        Objects.equals(this.hideNotifications, userPreferences.hideNotifications) &&
        Objects.equals(this.hidePhoneConfirm, userPreferences.hidePhoneConfirm) &&
        Objects.equals(this.isSensitiveInfoVisible, userPreferences.isSensitiveInfoVisible) &&
        Objects.equals(this.isWalletZeroBalanceHidden, userPreferences.isWalletZeroBalanceHidden) &&
        Objects.equals(this.locale, userPreferences.locale) &&
        Objects.equals(this.localeSetTime, userPreferences.localeSetTime) &&
        Objects.equals(this.marginPnlRow, userPreferences.marginPnlRow) &&
        Objects.equals(this.marginPnlRowKind, userPreferences.marginPnlRowKind) &&
        Objects.equals(this.msgsSeen, userPreferences.msgsSeen) &&
        Objects.equals(this.notifications, userPreferences.notifications) &&
        Objects.equals(this.orderBookBinning, userPreferences.orderBookBinning) &&
        Objects.equals(this.orderBookType, userPreferences.orderBookType) &&
        Objects.equals(this.orderClearImmediate, userPreferences.orderClearImmediate) &&
        Objects.equals(this.orderControlsPlusMinus, userPreferences.orderControlsPlusMinus) &&
        Objects.equals(this.platformLayout, userPreferences.platformLayout) &&
        Objects.equals(this.selectedFiatCurrency, userPreferences.selectedFiatCurrency) &&
        Objects.equals(this.showChartBottomToolbar, userPreferences.showChartBottomToolbar) &&
        Objects.equals(this.showLocaleNumbers, userPreferences.showLocaleNumbers) &&
        Objects.equals(this.sounds, userPreferences.sounds) &&
        Objects.equals(this.strictIPCheck, userPreferences.strictIPCheck) &&
        Objects.equals(this.strictTimeout, userPreferences.strictTimeout) &&
        Objects.equals(this.tickerGroup, userPreferences.tickerGroup) &&
        Objects.equals(this.tickerPinned, userPreferences.tickerPinned) &&
        Objects.equals(this.tradeLayout, userPreferences.tradeLayout) &&
        Objects.equals(this.userColor, userPreferences.userColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOnLiquidations, animationsEnabled, announcementsLastSeen, chatChannelID, colorTheme, currency, debug, disableEmails, disablePush, displayCorpEnrollUpsell, equivalentCurrency, features, favourites, favouritesAssets, favouritesOrdered, hideConfirmDialogs, hideConnectionModal, hideFromLeaderboard, hideNameFromLeaderboard, hideNotifications, hidePhoneConfirm, isSensitiveInfoVisible, isWalletZeroBalanceHidden, locale, localeSetTime, marginPnlRow, marginPnlRowKind, msgsSeen, notifications, orderBookBinning, orderBookType, orderClearImmediate, orderControlsPlusMinus, platformLayout, selectedFiatCurrency, showChartBottomToolbar, showLocaleNumbers, sounds, strictIPCheck, strictTimeout, tickerGroup, tickerPinned, tradeLayout, userColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("    alertOnLiquidations: ").append(toIndentedString(alertOnLiquidations)).append("\n");
    sb.append("    animationsEnabled: ").append(toIndentedString(animationsEnabled)).append("\n");
    sb.append("    announcementsLastSeen: ").append(toIndentedString(announcementsLastSeen)).append("\n");
    sb.append("    chatChannelID: ").append(toIndentedString(chatChannelID)).append("\n");
    sb.append("    colorTheme: ").append(toIndentedString(colorTheme)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    disableEmails: ").append(toIndentedString(disableEmails)).append("\n");
    sb.append("    disablePush: ").append(toIndentedString(disablePush)).append("\n");
    sb.append("    displayCorpEnrollUpsell: ").append(toIndentedString(displayCorpEnrollUpsell)).append("\n");
    sb.append("    equivalentCurrency: ").append(toIndentedString(equivalentCurrency)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    favourites: ").append(toIndentedString(favourites)).append("\n");
    sb.append("    favouritesAssets: ").append(toIndentedString(favouritesAssets)).append("\n");
    sb.append("    favouritesOrdered: ").append(toIndentedString(favouritesOrdered)).append("\n");
    sb.append("    hideConfirmDialogs: ").append(toIndentedString(hideConfirmDialogs)).append("\n");
    sb.append("    hideConnectionModal: ").append(toIndentedString(hideConnectionModal)).append("\n");
    sb.append("    hideFromLeaderboard: ").append(toIndentedString(hideFromLeaderboard)).append("\n");
    sb.append("    hideNameFromLeaderboard: ").append(toIndentedString(hideNameFromLeaderboard)).append("\n");
    sb.append("    hideNotifications: ").append(toIndentedString(hideNotifications)).append("\n");
    sb.append("    hidePhoneConfirm: ").append(toIndentedString(hidePhoneConfirm)).append("\n");
    sb.append("    isSensitiveInfoVisible: ").append(toIndentedString(isSensitiveInfoVisible)).append("\n");
    sb.append("    isWalletZeroBalanceHidden: ").append(toIndentedString(isWalletZeroBalanceHidden)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    localeSetTime: ").append(toIndentedString(localeSetTime)).append("\n");
    sb.append("    marginPnlRow: ").append(toIndentedString(marginPnlRow)).append("\n");
    sb.append("    marginPnlRowKind: ").append(toIndentedString(marginPnlRowKind)).append("\n");
    sb.append("    msgsSeen: ").append(toIndentedString(msgsSeen)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    orderBookBinning: ").append(toIndentedString(orderBookBinning)).append("\n");
    sb.append("    orderBookType: ").append(toIndentedString(orderBookType)).append("\n");
    sb.append("    orderClearImmediate: ").append(toIndentedString(orderClearImmediate)).append("\n");
    sb.append("    orderControlsPlusMinus: ").append(toIndentedString(orderControlsPlusMinus)).append("\n");
    sb.append("    platformLayout: ").append(toIndentedString(platformLayout)).append("\n");
    sb.append("    selectedFiatCurrency: ").append(toIndentedString(selectedFiatCurrency)).append("\n");
    sb.append("    showChartBottomToolbar: ").append(toIndentedString(showChartBottomToolbar)).append("\n");
    sb.append("    showLocaleNumbers: ").append(toIndentedString(showLocaleNumbers)).append("\n");
    sb.append("    sounds: ").append(toIndentedString(sounds)).append("\n");
    sb.append("    strictIPCheck: ").append(toIndentedString(strictIPCheck)).append("\n");
    sb.append("    strictTimeout: ").append(toIndentedString(strictTimeout)).append("\n");
    sb.append("    tickerGroup: ").append(toIndentedString(tickerGroup)).append("\n");
    sb.append("    tickerPinned: ").append(toIndentedString(tickerPinned)).append("\n");
    sb.append("    tradeLayout: ").append(toIndentedString(tradeLayout)).append("\n");
    sb.append("    userColor: ").append(toIndentedString(userColor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

