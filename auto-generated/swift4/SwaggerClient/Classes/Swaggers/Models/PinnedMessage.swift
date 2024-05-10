//
// PinnedMessage.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Pinned Messages */

public struct PinnedMessage: Codable {

    public var _id: Double
    public var channelID: Double
    public var messageId: Double
    public var created: Date?
    public var ended: Date?
    public var createdUserId: Double?
    public var endedUserId: Double?

    public init(_id: Double, channelID: Double, messageId: Double, created: Date?, ended: Date?, createdUserId: Double?, endedUserId: Double?) {
        self._id = _id
        self.channelID = channelID
        self.messageId = messageId
        self.created = created
        self.ended = ended
        self.createdUserId = createdUserId
        self.endedUserId = endedUserId
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case channelID
        case messageId
        case created
        case ended
        case createdUserId
        case endedUserId
    }


}

