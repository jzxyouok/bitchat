package io.bitchat.protocol.packet;

/**
 * @author houyi
 */
public interface PacketSymbols {

    int CARRIER_PACKET = 1;
    int REGISTER_REQUEST_PACKET = 1000;
    int LOGIN_REQUEST_PACKET = 1001;
    int LIST_ONLINE_USER_REQUEST_PACKET = 1002;
    int P2P_MSG_REQUEST_PACKET = 1003;
    int P2P_MSG_PUSH_PACKET = 1004;
    int PING_PACKET = 1100;
    int PONG_PACKET = 2100;

}