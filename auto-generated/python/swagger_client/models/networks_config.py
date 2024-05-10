# coding: utf-8

"""
    BitMEX API

    ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section.   # noqa: E501

    OpenAPI spec version: 1.2.0
    Contact: support@bitmex.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.configuration import Configuration


class NetworksConfig(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'network': 'str',
        'name': 'str',
        'currency': 'str',
        'network_symbol': 'str',
        'transaction_explorer': 'str',
        'token_explorer': 'str',
        'deposit_confirmations': 'float',
        'enabled': 'bool'
    }

    attribute_map = {
        'network': 'network',
        'name': 'name',
        'currency': 'currency',
        'network_symbol': 'networkSymbol',
        'transaction_explorer': 'transactionExplorer',
        'token_explorer': 'tokenExplorer',
        'deposit_confirmations': 'depositConfirmations',
        'enabled': 'enabled'
    }

    def __init__(self, network='eth', name='Ethereum', currency='Gwei', network_symbol='ETH', transaction_explorer='https://etherscan.io/tx/', token_explorer='https://etherscan.io/token/', deposit_confirmations=None, enabled=True, _configuration=None):  # noqa: E501
        """NetworksConfig - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._network = None
        self._name = None
        self._currency = None
        self._network_symbol = None
        self._transaction_explorer = None
        self._token_explorer = None
        self._deposit_confirmations = None
        self._enabled = None
        self.discriminator = None

        self.network = network
        if name is not None:
            self.name = name
        if currency is not None:
            self.currency = currency
        if network_symbol is not None:
            self.network_symbol = network_symbol
        if transaction_explorer is not None:
            self.transaction_explorer = transaction_explorer
        if token_explorer is not None:
            self.token_explorer = token_explorer
        if deposit_confirmations is not None:
            self.deposit_confirmations = deposit_confirmations
        if enabled is not None:
            self.enabled = enabled

    @property
    def network(self):
        """Gets the network of this NetworksConfig.  # noqa: E501


        :return: The network of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._network

    @network.setter
    def network(self, network):
        """Sets the network of this NetworksConfig.


        :param network: The network of this NetworksConfig.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and network is None:
            raise ValueError("Invalid value for `network`, must not be `None`")  # noqa: E501

        self._network = network

    @property
    def name(self):
        """Gets the name of this NetworksConfig.  # noqa: E501


        :return: The name of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this NetworksConfig.


        :param name: The name of this NetworksConfig.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def currency(self):
        """Gets the currency of this NetworksConfig.  # noqa: E501


        :return: The currency of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this NetworksConfig.


        :param currency: The currency of this NetworksConfig.  # noqa: E501
        :type: str
        """

        self._currency = currency

    @property
    def network_symbol(self):
        """Gets the network_symbol of this NetworksConfig.  # noqa: E501


        :return: The network_symbol of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._network_symbol

    @network_symbol.setter
    def network_symbol(self, network_symbol):
        """Sets the network_symbol of this NetworksConfig.


        :param network_symbol: The network_symbol of this NetworksConfig.  # noqa: E501
        :type: str
        """

        self._network_symbol = network_symbol

    @property
    def transaction_explorer(self):
        """Gets the transaction_explorer of this NetworksConfig.  # noqa: E501


        :return: The transaction_explorer of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._transaction_explorer

    @transaction_explorer.setter
    def transaction_explorer(self, transaction_explorer):
        """Sets the transaction_explorer of this NetworksConfig.


        :param transaction_explorer: The transaction_explorer of this NetworksConfig.  # noqa: E501
        :type: str
        """

        self._transaction_explorer = transaction_explorer

    @property
    def token_explorer(self):
        """Gets the token_explorer of this NetworksConfig.  # noqa: E501


        :return: The token_explorer of this NetworksConfig.  # noqa: E501
        :rtype: str
        """
        return self._token_explorer

    @token_explorer.setter
    def token_explorer(self, token_explorer):
        """Sets the token_explorer of this NetworksConfig.


        :param token_explorer: The token_explorer of this NetworksConfig.  # noqa: E501
        :type: str
        """

        self._token_explorer = token_explorer

    @property
    def deposit_confirmations(self):
        """Gets the deposit_confirmations of this NetworksConfig.  # noqa: E501


        :return: The deposit_confirmations of this NetworksConfig.  # noqa: E501
        :rtype: float
        """
        return self._deposit_confirmations

    @deposit_confirmations.setter
    def deposit_confirmations(self, deposit_confirmations):
        """Sets the deposit_confirmations of this NetworksConfig.


        :param deposit_confirmations: The deposit_confirmations of this NetworksConfig.  # noqa: E501
        :type: float
        """

        self._deposit_confirmations = deposit_confirmations

    @property
    def enabled(self):
        """Gets the enabled of this NetworksConfig.  # noqa: E501


        :return: The enabled of this NetworksConfig.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this NetworksConfig.


        :param enabled: The enabled of this NetworksConfig.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(NetworksConfig, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, NetworksConfig):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, NetworksConfig):
            return True

        return self.to_dict() != other.to_dict()
