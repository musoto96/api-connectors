=begin
#BitMEX API

### REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 

OpenAPI spec version: 1.2.0
Contact: support@bitmex.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.38-SNAPSHOT

=end

require 'date'

module SwaggerClient
  # Individual & Bucketed Trades
  class Trade
    attr_accessor :timestamp

    attr_accessor :symbol

    attr_accessor :side

    attr_accessor :size

    attr_accessor :price

    attr_accessor :tick_direction

    attr_accessor :trd_match_id

    attr_accessor :gross_value

    attr_accessor :home_notional

    attr_accessor :foreign_notional

    attr_accessor :trd_type

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'timestamp' => :'timestamp',
        :'symbol' => :'symbol',
        :'side' => :'side',
        :'size' => :'size',
        :'price' => :'price',
        :'tick_direction' => :'tickDirection',
        :'trd_match_id' => :'trdMatchID',
        :'gross_value' => :'grossValue',
        :'home_notional' => :'homeNotional',
        :'foreign_notional' => :'foreignNotional',
        :'trd_type' => :'trdType'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'timestamp' => :'DateTime',
        :'symbol' => :'String',
        :'side' => :'String',
        :'size' => :'Float',
        :'price' => :'Float',
        :'tick_direction' => :'String',
        :'trd_match_id' => :'String',
        :'gross_value' => :'Float',
        :'home_notional' => :'Float',
        :'foreign_notional' => :'Float',
        :'trd_type' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.has_key?(:'symbol')
        self.symbol = attributes[:'symbol']
      end

      if attributes.has_key?(:'side')
        self.side = attributes[:'side']
      end

      if attributes.has_key?(:'size')
        self.size = attributes[:'size']
      end

      if attributes.has_key?(:'price')
        self.price = attributes[:'price']
      end

      if attributes.has_key?(:'tickDirection')
        self.tick_direction = attributes[:'tickDirection']
      end

      if attributes.has_key?(:'trdMatchID')
        self.trd_match_id = attributes[:'trdMatchID']
      end

      if attributes.has_key?(:'grossValue')
        self.gross_value = attributes[:'grossValue']
      end

      if attributes.has_key?(:'homeNotional')
        self.home_notional = attributes[:'homeNotional']
      end

      if attributes.has_key?(:'foreignNotional')
        self.foreign_notional = attributes[:'foreignNotional']
      end

      if attributes.has_key?(:'trdType')
        self.trd_type = attributes[:'trdType']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @timestamp.nil?
        invalid_properties.push('invalid value for "timestamp", timestamp cannot be nil.')
      end

      if @symbol.nil?
        invalid_properties.push('invalid value for "symbol", symbol cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @timestamp.nil?
      return false if @symbol.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          timestamp == o.timestamp &&
          symbol == o.symbol &&
          side == o.side &&
          size == o.size &&
          price == o.price &&
          tick_direction == o.tick_direction &&
          trd_match_id == o.trd_match_id &&
          gross_value == o.gross_value &&
          home_notional == o.home_notional &&
          foreign_notional == o.foreign_notional &&
          trd_type == o.trd_type
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [timestamp, symbol, side, size, price, tick_direction, trd_match_id, gross_value, home_notional, foreign_notional, trd_type].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end
end
