/**
 * SymbolInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class SymbolInfo  implements java.io.Serializable {
    private java.lang.String symbol;

    private java.lang.String description;

    private java.lang.String source;

    private java.lang.String currency;

    private int type;

    private int digits;

    private int trade;

    private int background_color;

    private int count;

    private int count_original;

    private org.jsoncloud.project.mt4_platform.soap.ExternalUnusedArray external_unused;

    private int realtime;

    private int starting;

    private int expiration;

    private org.jsoncloud.project.mt4_platform.soap.SessionsArray sessions;

    private int profit_mode;

    private int profit_reserved;

    private int filter;

    private int filter_counter;

    private double filter_limit;

    private double filter_smoothing;

    private double filter_reserved;

    private int logging;

    private int spread;

    private int spread_balance;

    private int exemode;

    private int swap_enable;

    private int swap_type;

    private double swap_long;

    private double swap_short;

    private int swap_rollover3Days;

    private double contract_size;

    private double tick_value;

    private double tick_size;

    private int stops_level;

    private int gtc_pendings;

    private int margin_mode;

    private double margin_initial;

    private double margin_maintenance;

    private double margin_hedged;

    private double margin_divider;

    private double point;

    private double multiply;

    private double bid_tickvalue;

    private double ask_tickvalue;

    private int long_only;

    private int instant_max_volume;

    private java.lang.String margin_currency;

    private int freeze_level;

    private int margin_hedged_strong;

    private int value_date;

    private int quotes_delay;

    private int swap_openprice;

    private org.jsoncloud.project.mt4_platform.soap.UnusedArray unused;

    public SymbolInfo() {
    }

    public SymbolInfo(
           java.lang.String symbol,
           java.lang.String description,
           java.lang.String source,
           java.lang.String currency,
           int type,
           int digits,
           int trade,
           int background_color,
           int count,
           int count_original,
           org.jsoncloud.project.mt4_platform.soap.ExternalUnusedArray external_unused,
           int realtime,
           int starting,
           int expiration,
           org.jsoncloud.project.mt4_platform.soap.SessionsArray sessions,
           int profit_mode,
           int profit_reserved,
           int filter,
           int filter_counter,
           double filter_limit,
           double filter_smoothing,
           double filter_reserved,
           int logging,
           int spread,
           int spread_balance,
           int exemode,
           int swap_enable,
           int swap_type,
           double swap_long,
           double swap_short,
           int swap_rollover3Days,
           double contract_size,
           double tick_value,
           double tick_size,
           int stops_level,
           int gtc_pendings,
           int margin_mode,
           double margin_initial,
           double margin_maintenance,
           double margin_hedged,
           double margin_divider,
           double point,
           double multiply,
           double bid_tickvalue,
           double ask_tickvalue,
           int long_only,
           int instant_max_volume,
           java.lang.String margin_currency,
           int freeze_level,
           int margin_hedged_strong,
           int value_date,
           int quotes_delay,
           int swap_openprice,
           org.jsoncloud.project.mt4_platform.soap.UnusedArray unused) {
           this.symbol = symbol;
           this.description = description;
           this.source = source;
           this.currency = currency;
           this.type = type;
           this.digits = digits;
           this.trade = trade;
           this.background_color = background_color;
           this.count = count;
           this.count_original = count_original;
           this.external_unused = external_unused;
           this.realtime = realtime;
           this.starting = starting;
           this.expiration = expiration;
           this.sessions = sessions;
           this.profit_mode = profit_mode;
           this.profit_reserved = profit_reserved;
           this.filter = filter;
           this.filter_counter = filter_counter;
           this.filter_limit = filter_limit;
           this.filter_smoothing = filter_smoothing;
           this.filter_reserved = filter_reserved;
           this.logging = logging;
           this.spread = spread;
           this.spread_balance = spread_balance;
           this.exemode = exemode;
           this.swap_enable = swap_enable;
           this.swap_type = swap_type;
           this.swap_long = swap_long;
           this.swap_short = swap_short;
           this.swap_rollover3Days = swap_rollover3Days;
           this.contract_size = contract_size;
           this.tick_value = tick_value;
           this.tick_size = tick_size;
           this.stops_level = stops_level;
           this.gtc_pendings = gtc_pendings;
           this.margin_mode = margin_mode;
           this.margin_initial = margin_initial;
           this.margin_maintenance = margin_maintenance;
           this.margin_hedged = margin_hedged;
           this.margin_divider = margin_divider;
           this.point = point;
           this.multiply = multiply;
           this.bid_tickvalue = bid_tickvalue;
           this.ask_tickvalue = ask_tickvalue;
           this.long_only = long_only;
           this.instant_max_volume = instant_max_volume;
           this.margin_currency = margin_currency;
           this.freeze_level = freeze_level;
           this.margin_hedged_strong = margin_hedged_strong;
           this.value_date = value_date;
           this.quotes_delay = quotes_delay;
           this.swap_openprice = swap_openprice;
           this.unused = unused;
    }


    /**
     * Gets the symbol value for this SymbolInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this SymbolInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the description value for this SymbolInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SymbolInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the source value for this SymbolInfo.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this SymbolInfo.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the currency value for this SymbolInfo.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this SymbolInfo.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the type value for this SymbolInfo.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this SymbolInfo.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the digits value for this SymbolInfo.
     * 
     * @return digits
     */
    public int getDigits() {
        return digits;
    }


    /**
     * Sets the digits value for this SymbolInfo.
     * 
     * @param digits
     */
    public void setDigits(int digits) {
        this.digits = digits;
    }


    /**
     * Gets the trade value for this SymbolInfo.
     * 
     * @return trade
     */
    public int getTrade() {
        return trade;
    }


    /**
     * Sets the trade value for this SymbolInfo.
     * 
     * @param trade
     */
    public void setTrade(int trade) {
        this.trade = trade;
    }


    /**
     * Gets the background_color value for this SymbolInfo.
     * 
     * @return background_color
     */
    public int getBackground_color() {
        return background_color;
    }


    /**
     * Sets the background_color value for this SymbolInfo.
     * 
     * @param background_color
     */
    public void setBackground_color(int background_color) {
        this.background_color = background_color;
    }


    /**
     * Gets the count value for this SymbolInfo.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this SymbolInfo.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the count_original value for this SymbolInfo.
     * 
     * @return count_original
     */
    public int getCount_original() {
        return count_original;
    }


    /**
     * Sets the count_original value for this SymbolInfo.
     * 
     * @param count_original
     */
    public void setCount_original(int count_original) {
        this.count_original = count_original;
    }


    /**
     * Gets the external_unused value for this SymbolInfo.
     * 
     * @return external_unused
     */
    public org.jsoncloud.project.mt4_platform.soap.ExternalUnusedArray getExternal_unused() {
        return external_unused;
    }


    /**
     * Sets the external_unused value for this SymbolInfo.
     * 
     * @param external_unused
     */
    public void setExternal_unused(org.jsoncloud.project.mt4_platform.soap.ExternalUnusedArray external_unused) {
        this.external_unused = external_unused;
    }


    /**
     * Gets the realtime value for this SymbolInfo.
     * 
     * @return realtime
     */
    public int getRealtime() {
        return realtime;
    }


    /**
     * Sets the realtime value for this SymbolInfo.
     * 
     * @param realtime
     */
    public void setRealtime(int realtime) {
        this.realtime = realtime;
    }


    /**
     * Gets the starting value for this SymbolInfo.
     * 
     * @return starting
     */
    public int getStarting() {
        return starting;
    }


    /**
     * Sets the starting value for this SymbolInfo.
     * 
     * @param starting
     */
    public void setStarting(int starting) {
        this.starting = starting;
    }


    /**
     * Gets the expiration value for this SymbolInfo.
     * 
     * @return expiration
     */
    public int getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this SymbolInfo.
     * 
     * @param expiration
     */
    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the sessions value for this SymbolInfo.
     * 
     * @return sessions
     */
    public org.jsoncloud.project.mt4_platform.soap.SessionsArray getSessions() {
        return sessions;
    }


    /**
     * Sets the sessions value for this SymbolInfo.
     * 
     * @param sessions
     */
    public void setSessions(org.jsoncloud.project.mt4_platform.soap.SessionsArray sessions) {
        this.sessions = sessions;
    }


    /**
     * Gets the profit_mode value for this SymbolInfo.
     * 
     * @return profit_mode
     */
    public int getProfit_mode() {
        return profit_mode;
    }


    /**
     * Sets the profit_mode value for this SymbolInfo.
     * 
     * @param profit_mode
     */
    public void setProfit_mode(int profit_mode) {
        this.profit_mode = profit_mode;
    }


    /**
     * Gets the profit_reserved value for this SymbolInfo.
     * 
     * @return profit_reserved
     */
    public int getProfit_reserved() {
        return profit_reserved;
    }


    /**
     * Sets the profit_reserved value for this SymbolInfo.
     * 
     * @param profit_reserved
     */
    public void setProfit_reserved(int profit_reserved) {
        this.profit_reserved = profit_reserved;
    }


    /**
     * Gets the filter value for this SymbolInfo.
     * 
     * @return filter
     */
    public int getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this SymbolInfo.
     * 
     * @param filter
     */
    public void setFilter(int filter) {
        this.filter = filter;
    }


    /**
     * Gets the filter_counter value for this SymbolInfo.
     * 
     * @return filter_counter
     */
    public int getFilter_counter() {
        return filter_counter;
    }


    /**
     * Sets the filter_counter value for this SymbolInfo.
     * 
     * @param filter_counter
     */
    public void setFilter_counter(int filter_counter) {
        this.filter_counter = filter_counter;
    }


    /**
     * Gets the filter_limit value for this SymbolInfo.
     * 
     * @return filter_limit
     */
    public double getFilter_limit() {
        return filter_limit;
    }


    /**
     * Sets the filter_limit value for this SymbolInfo.
     * 
     * @param filter_limit
     */
    public void setFilter_limit(double filter_limit) {
        this.filter_limit = filter_limit;
    }


    /**
     * Gets the filter_smoothing value for this SymbolInfo.
     * 
     * @return filter_smoothing
     */
    public double getFilter_smoothing() {
        return filter_smoothing;
    }


    /**
     * Sets the filter_smoothing value for this SymbolInfo.
     * 
     * @param filter_smoothing
     */
    public void setFilter_smoothing(double filter_smoothing) {
        this.filter_smoothing = filter_smoothing;
    }


    /**
     * Gets the filter_reserved value for this SymbolInfo.
     * 
     * @return filter_reserved
     */
    public double getFilter_reserved() {
        return filter_reserved;
    }


    /**
     * Sets the filter_reserved value for this SymbolInfo.
     * 
     * @param filter_reserved
     */
    public void setFilter_reserved(double filter_reserved) {
        this.filter_reserved = filter_reserved;
    }


    /**
     * Gets the logging value for this SymbolInfo.
     * 
     * @return logging
     */
    public int getLogging() {
        return logging;
    }


    /**
     * Sets the logging value for this SymbolInfo.
     * 
     * @param logging
     */
    public void setLogging(int logging) {
        this.logging = logging;
    }


    /**
     * Gets the spread value for this SymbolInfo.
     * 
     * @return spread
     */
    public int getSpread() {
        return spread;
    }


    /**
     * Sets the spread value for this SymbolInfo.
     * 
     * @param spread
     */
    public void setSpread(int spread) {
        this.spread = spread;
    }


    /**
     * Gets the spread_balance value for this SymbolInfo.
     * 
     * @return spread_balance
     */
    public int getSpread_balance() {
        return spread_balance;
    }


    /**
     * Sets the spread_balance value for this SymbolInfo.
     * 
     * @param spread_balance
     */
    public void setSpread_balance(int spread_balance) {
        this.spread_balance = spread_balance;
    }


    /**
     * Gets the exemode value for this SymbolInfo.
     * 
     * @return exemode
     */
    public int getExemode() {
        return exemode;
    }


    /**
     * Sets the exemode value for this SymbolInfo.
     * 
     * @param exemode
     */
    public void setExemode(int exemode) {
        this.exemode = exemode;
    }


    /**
     * Gets the swap_enable value for this SymbolInfo.
     * 
     * @return swap_enable
     */
    public int getSwap_enable() {
        return swap_enable;
    }


    /**
     * Sets the swap_enable value for this SymbolInfo.
     * 
     * @param swap_enable
     */
    public void setSwap_enable(int swap_enable) {
        this.swap_enable = swap_enable;
    }


    /**
     * Gets the swap_type value for this SymbolInfo.
     * 
     * @return swap_type
     */
    public int getSwap_type() {
        return swap_type;
    }


    /**
     * Sets the swap_type value for this SymbolInfo.
     * 
     * @param swap_type
     */
    public void setSwap_type(int swap_type) {
        this.swap_type = swap_type;
    }


    /**
     * Gets the swap_long value for this SymbolInfo.
     * 
     * @return swap_long
     */
    public double getSwap_long() {
        return swap_long;
    }


    /**
     * Sets the swap_long value for this SymbolInfo.
     * 
     * @param swap_long
     */
    public void setSwap_long(double swap_long) {
        this.swap_long = swap_long;
    }


    /**
     * Gets the swap_short value for this SymbolInfo.
     * 
     * @return swap_short
     */
    public double getSwap_short() {
        return swap_short;
    }


    /**
     * Sets the swap_short value for this SymbolInfo.
     * 
     * @param swap_short
     */
    public void setSwap_short(double swap_short) {
        this.swap_short = swap_short;
    }


    /**
     * Gets the swap_rollover3Days value for this SymbolInfo.
     * 
     * @return swap_rollover3Days
     */
    public int getSwap_rollover3Days() {
        return swap_rollover3Days;
    }


    /**
     * Sets the swap_rollover3Days value for this SymbolInfo.
     * 
     * @param swap_rollover3Days
     */
    public void setSwap_rollover3Days(int swap_rollover3Days) {
        this.swap_rollover3Days = swap_rollover3Days;
    }


    /**
     * Gets the contract_size value for this SymbolInfo.
     * 
     * @return contract_size
     */
    public double getContract_size() {
        return contract_size;
    }


    /**
     * Sets the contract_size value for this SymbolInfo.
     * 
     * @param contract_size
     */
    public void setContract_size(double contract_size) {
        this.contract_size = contract_size;
    }


    /**
     * Gets the tick_value value for this SymbolInfo.
     * 
     * @return tick_value
     */
    public double getTick_value() {
        return tick_value;
    }


    /**
     * Sets the tick_value value for this SymbolInfo.
     * 
     * @param tick_value
     */
    public void setTick_value(double tick_value) {
        this.tick_value = tick_value;
    }


    /**
     * Gets the tick_size value for this SymbolInfo.
     * 
     * @return tick_size
     */
    public double getTick_size() {
        return tick_size;
    }


    /**
     * Sets the tick_size value for this SymbolInfo.
     * 
     * @param tick_size
     */
    public void setTick_size(double tick_size) {
        this.tick_size = tick_size;
    }


    /**
     * Gets the stops_level value for this SymbolInfo.
     * 
     * @return stops_level
     */
    public int getStops_level() {
        return stops_level;
    }


    /**
     * Sets the stops_level value for this SymbolInfo.
     * 
     * @param stops_level
     */
    public void setStops_level(int stops_level) {
        this.stops_level = stops_level;
    }


    /**
     * Gets the gtc_pendings value for this SymbolInfo.
     * 
     * @return gtc_pendings
     */
    public int getGtc_pendings() {
        return gtc_pendings;
    }


    /**
     * Sets the gtc_pendings value for this SymbolInfo.
     * 
     * @param gtc_pendings
     */
    public void setGtc_pendings(int gtc_pendings) {
        this.gtc_pendings = gtc_pendings;
    }


    /**
     * Gets the margin_mode value for this SymbolInfo.
     * 
     * @return margin_mode
     */
    public int getMargin_mode() {
        return margin_mode;
    }


    /**
     * Sets the margin_mode value for this SymbolInfo.
     * 
     * @param margin_mode
     */
    public void setMargin_mode(int margin_mode) {
        this.margin_mode = margin_mode;
    }


    /**
     * Gets the margin_initial value for this SymbolInfo.
     * 
     * @return margin_initial
     */
    public double getMargin_initial() {
        return margin_initial;
    }


    /**
     * Sets the margin_initial value for this SymbolInfo.
     * 
     * @param margin_initial
     */
    public void setMargin_initial(double margin_initial) {
        this.margin_initial = margin_initial;
    }


    /**
     * Gets the margin_maintenance value for this SymbolInfo.
     * 
     * @return margin_maintenance
     */
    public double getMargin_maintenance() {
        return margin_maintenance;
    }


    /**
     * Sets the margin_maintenance value for this SymbolInfo.
     * 
     * @param margin_maintenance
     */
    public void setMargin_maintenance(double margin_maintenance) {
        this.margin_maintenance = margin_maintenance;
    }


    /**
     * Gets the margin_hedged value for this SymbolInfo.
     * 
     * @return margin_hedged
     */
    public double getMargin_hedged() {
        return margin_hedged;
    }


    /**
     * Sets the margin_hedged value for this SymbolInfo.
     * 
     * @param margin_hedged
     */
    public void setMargin_hedged(double margin_hedged) {
        this.margin_hedged = margin_hedged;
    }


    /**
     * Gets the margin_divider value for this SymbolInfo.
     * 
     * @return margin_divider
     */
    public double getMargin_divider() {
        return margin_divider;
    }


    /**
     * Sets the margin_divider value for this SymbolInfo.
     * 
     * @param margin_divider
     */
    public void setMargin_divider(double margin_divider) {
        this.margin_divider = margin_divider;
    }


    /**
     * Gets the point value for this SymbolInfo.
     * 
     * @return point
     */
    public double getPoint() {
        return point;
    }


    /**
     * Sets the point value for this SymbolInfo.
     * 
     * @param point
     */
    public void setPoint(double point) {
        this.point = point;
    }


    /**
     * Gets the multiply value for this SymbolInfo.
     * 
     * @return multiply
     */
    public double getMultiply() {
        return multiply;
    }


    /**
     * Sets the multiply value for this SymbolInfo.
     * 
     * @param multiply
     */
    public void setMultiply(double multiply) {
        this.multiply = multiply;
    }


    /**
     * Gets the bid_tickvalue value for this SymbolInfo.
     * 
     * @return bid_tickvalue
     */
    public double getBid_tickvalue() {
        return bid_tickvalue;
    }


    /**
     * Sets the bid_tickvalue value for this SymbolInfo.
     * 
     * @param bid_tickvalue
     */
    public void setBid_tickvalue(double bid_tickvalue) {
        this.bid_tickvalue = bid_tickvalue;
    }


    /**
     * Gets the ask_tickvalue value for this SymbolInfo.
     * 
     * @return ask_tickvalue
     */
    public double getAsk_tickvalue() {
        return ask_tickvalue;
    }


    /**
     * Sets the ask_tickvalue value for this SymbolInfo.
     * 
     * @param ask_tickvalue
     */
    public void setAsk_tickvalue(double ask_tickvalue) {
        this.ask_tickvalue = ask_tickvalue;
    }


    /**
     * Gets the long_only value for this SymbolInfo.
     * 
     * @return long_only
     */
    public int getLong_only() {
        return long_only;
    }


    /**
     * Sets the long_only value for this SymbolInfo.
     * 
     * @param long_only
     */
    public void setLong_only(int long_only) {
        this.long_only = long_only;
    }


    /**
     * Gets the instant_max_volume value for this SymbolInfo.
     * 
     * @return instant_max_volume
     */
    public int getInstant_max_volume() {
        return instant_max_volume;
    }


    /**
     * Sets the instant_max_volume value for this SymbolInfo.
     * 
     * @param instant_max_volume
     */
    public void setInstant_max_volume(int instant_max_volume) {
        this.instant_max_volume = instant_max_volume;
    }


    /**
     * Gets the margin_currency value for this SymbolInfo.
     * 
     * @return margin_currency
     */
    public java.lang.String getMargin_currency() {
        return margin_currency;
    }


    /**
     * Sets the margin_currency value for this SymbolInfo.
     * 
     * @param margin_currency
     */
    public void setMargin_currency(java.lang.String margin_currency) {
        this.margin_currency = margin_currency;
    }


    /**
     * Gets the freeze_level value for this SymbolInfo.
     * 
     * @return freeze_level
     */
    public int getFreeze_level() {
        return freeze_level;
    }


    /**
     * Sets the freeze_level value for this SymbolInfo.
     * 
     * @param freeze_level
     */
    public void setFreeze_level(int freeze_level) {
        this.freeze_level = freeze_level;
    }


    /**
     * Gets the margin_hedged_strong value for this SymbolInfo.
     * 
     * @return margin_hedged_strong
     */
    public int getMargin_hedged_strong() {
        return margin_hedged_strong;
    }


    /**
     * Sets the margin_hedged_strong value for this SymbolInfo.
     * 
     * @param margin_hedged_strong
     */
    public void setMargin_hedged_strong(int margin_hedged_strong) {
        this.margin_hedged_strong = margin_hedged_strong;
    }


    /**
     * Gets the value_date value for this SymbolInfo.
     * 
     * @return value_date
     */
    public int getValue_date() {
        return value_date;
    }


    /**
     * Sets the value_date value for this SymbolInfo.
     * 
     * @param value_date
     */
    public void setValue_date(int value_date) {
        this.value_date = value_date;
    }


    /**
     * Gets the quotes_delay value for this SymbolInfo.
     * 
     * @return quotes_delay
     */
    public int getQuotes_delay() {
        return quotes_delay;
    }


    /**
     * Sets the quotes_delay value for this SymbolInfo.
     * 
     * @param quotes_delay
     */
    public void setQuotes_delay(int quotes_delay) {
        this.quotes_delay = quotes_delay;
    }


    /**
     * Gets the swap_openprice value for this SymbolInfo.
     * 
     * @return swap_openprice
     */
    public int getSwap_openprice() {
        return swap_openprice;
    }


    /**
     * Sets the swap_openprice value for this SymbolInfo.
     * 
     * @param swap_openprice
     */
    public void setSwap_openprice(int swap_openprice) {
        this.swap_openprice = swap_openprice;
    }


    /**
     * Gets the unused value for this SymbolInfo.
     * 
     * @return unused
     */
    public org.jsoncloud.project.mt4_platform.soap.UnusedArray getUnused() {
        return unused;
    }


    /**
     * Sets the unused value for this SymbolInfo.
     * 
     * @param unused
     */
    public void setUnused(org.jsoncloud.project.mt4_platform.soap.UnusedArray unused) {
        this.unused = unused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SymbolInfo)) return false;
        SymbolInfo other = (SymbolInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            this.type == other.getType() &&
            this.digits == other.getDigits() &&
            this.trade == other.getTrade() &&
            this.background_color == other.getBackground_color() &&
            this.count == other.getCount() &&
            this.count_original == other.getCount_original() &&
            ((this.external_unused==null && other.getExternal_unused()==null) || 
             (this.external_unused!=null &&
              this.external_unused.equals(other.getExternal_unused()))) &&
            this.realtime == other.getRealtime() &&
            this.starting == other.getStarting() &&
            this.expiration == other.getExpiration() &&
            ((this.sessions==null && other.getSessions()==null) || 
             (this.sessions!=null &&
              this.sessions.equals(other.getSessions()))) &&
            this.profit_mode == other.getProfit_mode() &&
            this.profit_reserved == other.getProfit_reserved() &&
            this.filter == other.getFilter() &&
            this.filter_counter == other.getFilter_counter() &&
            this.filter_limit == other.getFilter_limit() &&
            this.filter_smoothing == other.getFilter_smoothing() &&
            this.filter_reserved == other.getFilter_reserved() &&
            this.logging == other.getLogging() &&
            this.spread == other.getSpread() &&
            this.spread_balance == other.getSpread_balance() &&
            this.exemode == other.getExemode() &&
            this.swap_enable == other.getSwap_enable() &&
            this.swap_type == other.getSwap_type() &&
            this.swap_long == other.getSwap_long() &&
            this.swap_short == other.getSwap_short() &&
            this.swap_rollover3Days == other.getSwap_rollover3Days() &&
            this.contract_size == other.getContract_size() &&
            this.tick_value == other.getTick_value() &&
            this.tick_size == other.getTick_size() &&
            this.stops_level == other.getStops_level() &&
            this.gtc_pendings == other.getGtc_pendings() &&
            this.margin_mode == other.getMargin_mode() &&
            this.margin_initial == other.getMargin_initial() &&
            this.margin_maintenance == other.getMargin_maintenance() &&
            this.margin_hedged == other.getMargin_hedged() &&
            this.margin_divider == other.getMargin_divider() &&
            this.point == other.getPoint() &&
            this.multiply == other.getMultiply() &&
            this.bid_tickvalue == other.getBid_tickvalue() &&
            this.ask_tickvalue == other.getAsk_tickvalue() &&
            this.long_only == other.getLong_only() &&
            this.instant_max_volume == other.getInstant_max_volume() &&
            ((this.margin_currency==null && other.getMargin_currency()==null) || 
             (this.margin_currency!=null &&
              this.margin_currency.equals(other.getMargin_currency()))) &&
            this.freeze_level == other.getFreeze_level() &&
            this.margin_hedged_strong == other.getMargin_hedged_strong() &&
            this.value_date == other.getValue_date() &&
            this.quotes_delay == other.getQuotes_delay() &&
            this.swap_openprice == other.getSwap_openprice() &&
            ((this.unused==null && other.getUnused()==null) || 
             (this.unused!=null &&
              this.unused.equals(other.getUnused())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        _hashCode += getType();
        _hashCode += getDigits();
        _hashCode += getTrade();
        _hashCode += getBackground_color();
        _hashCode += getCount();
        _hashCode += getCount_original();
        if (getExternal_unused() != null) {
            _hashCode += getExternal_unused().hashCode();
        }
        _hashCode += getRealtime();
        _hashCode += getStarting();
        _hashCode += getExpiration();
        if (getSessions() != null) {
            _hashCode += getSessions().hashCode();
        }
        _hashCode += getProfit_mode();
        _hashCode += getProfit_reserved();
        _hashCode += getFilter();
        _hashCode += getFilter_counter();
        _hashCode += new Double(getFilter_limit()).hashCode();
        _hashCode += new Double(getFilter_smoothing()).hashCode();
        _hashCode += new Double(getFilter_reserved()).hashCode();
        _hashCode += getLogging();
        _hashCode += getSpread();
        _hashCode += getSpread_balance();
        _hashCode += getExemode();
        _hashCode += getSwap_enable();
        _hashCode += getSwap_type();
        _hashCode += new Double(getSwap_long()).hashCode();
        _hashCode += new Double(getSwap_short()).hashCode();
        _hashCode += getSwap_rollover3Days();
        _hashCode += new Double(getContract_size()).hashCode();
        _hashCode += new Double(getTick_value()).hashCode();
        _hashCode += new Double(getTick_size()).hashCode();
        _hashCode += getStops_level();
        _hashCode += getGtc_pendings();
        _hashCode += getMargin_mode();
        _hashCode += new Double(getMargin_initial()).hashCode();
        _hashCode += new Double(getMargin_maintenance()).hashCode();
        _hashCode += new Double(getMargin_hedged()).hashCode();
        _hashCode += new Double(getMargin_divider()).hashCode();
        _hashCode += new Double(getPoint()).hashCode();
        _hashCode += new Double(getMultiply()).hashCode();
        _hashCode += new Double(getBid_tickvalue()).hashCode();
        _hashCode += new Double(getAsk_tickvalue()).hashCode();
        _hashCode += getLong_only();
        _hashCode += getInstant_max_volume();
        if (getMargin_currency() != null) {
            _hashCode += getMargin_currency().hashCode();
        }
        _hashCode += getFreeze_level();
        _hashCode += getMargin_hedged_strong();
        _hashCode += getValue_date();
        _hashCode += getQuotes_delay();
        _hashCode += getSwap_openprice();
        if (getUnused() != null) {
            _hashCode += getUnused().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SymbolInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "trade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "background_color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count_original");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "count_original"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("external_unused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "external_unused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ExternalUnusedArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "realtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "starting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "sessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "profit_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit_reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "profit_reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter_counter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter_counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter_smoothing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter_smoothing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter_reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter_reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spread");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "spread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spread_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "spread_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "exemode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_enable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_long");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_long"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_short");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_short"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_rollover3Days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_rollover3days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "contract_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tick_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "tick_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tick_size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "tick_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stops_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "stops_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gtc_pendings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "gtc_pendings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_initial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_initial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_maintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_maintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_hedged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_hedged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_divider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_divider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "multiply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid_tickvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "bid_tickvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ask_tickvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ask_tickvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("long_only");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "long_only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instant_max_volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "instant_max_volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeze_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "freeze_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_hedged_strong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_hedged_strong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "value_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotes_delay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "quotes_delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap_openprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "swap_openprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "unused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UnusedArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
