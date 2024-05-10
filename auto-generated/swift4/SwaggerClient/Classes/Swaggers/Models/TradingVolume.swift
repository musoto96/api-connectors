//
// TradingVolume.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** 30 days USD average trading volume */

public struct TradingVolume: Codable {

    public var advUsd: Double
    public var advUsdSpot: Double?
    public var advUsdContract: Double?

    public init(advUsd: Double, advUsdSpot: Double?, advUsdContract: Double?) {
        self.advUsd = advUsd
        self.advUsdSpot = advUsdSpot
        self.advUsdContract = advUsdContract
    }


}

