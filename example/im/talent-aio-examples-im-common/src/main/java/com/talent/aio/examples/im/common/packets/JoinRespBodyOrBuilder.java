// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/chat.proto

package com.talent.aio.examples.im.common.packets;

public interface JoinRespBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.talent.aio.examples.im.common.packets.JoinRespBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息发送时间
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  long getTime();

  /**
   * <code>.com.talent.aio.examples.im.common.packets.JoinGroupResult result = 2;</code>
   */
  int getResultValue();
  /**
   * <code>.com.talent.aio.examples.im.common.packets.JoinGroupResult result = 2;</code>
   */
  com.talent.aio.examples.im.common.packets.JoinGroupResult getResult();

  /**
   * <code>string group = 3;</code>
   */
  java.lang.String getGroup();
  /**
   * <code>string group = 3;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();
}