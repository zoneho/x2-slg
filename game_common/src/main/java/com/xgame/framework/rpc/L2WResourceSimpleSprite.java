/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xgame.framework.rpc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-19")
public class L2WResourceSimpleSprite implements org.apache.thrift.TBase<L2WResourceSimpleSprite, L2WResourceSimpleSprite._Fields>, java.io.Serializable, Cloneable, Comparable<L2WResourceSimpleSprite> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("L2WResourceSimpleSprite");

  private static final org.apache.thrift.protocol.TField RESOURCE_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceNum", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField USE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("useName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SUM_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("sumTime", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LIMIT_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("limitNum", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new L2WResourceSimpleSpriteStandardSchemeFactory());
    schemes.put(TupleScheme.class, new L2WResourceSimpleSpriteTupleSchemeFactory());
  }

  public long resourceNum; // required
  public long uid; // required
  public String useName; // required
  public int sumTime; // required
  public int startTime; // required
  public int limitNum; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_NUM((short)1, "resourceNum"),
    UID((short)2, "uid"),
    USE_NAME((short)3, "useName"),
    SUM_TIME((short)4, "sumTime"),
    START_TIME((short)5, "startTime"),
    LIMIT_NUM((short)6, "limitNum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESOURCE_NUM
          return RESOURCE_NUM;
        case 2: // UID
          return UID;
        case 3: // USE_NAME
          return USE_NAME;
        case 4: // SUM_TIME
          return SUM_TIME;
        case 5: // START_TIME
          return START_TIME;
        case 6: // LIMIT_NUM
          return LIMIT_NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RESOURCENUM_ISSET_ID = 0;
  private static final int __UID_ISSET_ID = 1;
  private static final int __SUMTIME_ISSET_ID = 2;
  private static final int __STARTTIME_ISSET_ID = 3;
  private static final int __LIMITNUM_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_NUM, new org.apache.thrift.meta_data.FieldMetaData("resourceNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USE_NAME, new org.apache.thrift.meta_data.FieldMetaData("useName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUM_TIME, new org.apache.thrift.meta_data.FieldMetaData("sumTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIMIT_NUM, new org.apache.thrift.meta_data.FieldMetaData("limitNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(L2WResourceSimpleSprite.class, metaDataMap);
  }

  public L2WResourceSimpleSprite() {
  }

  public L2WResourceSimpleSprite(
    long resourceNum,
    long uid,
    String useName,
    int sumTime,
    int startTime,
    int limitNum)
  {
    this();
    this.resourceNum = resourceNum;
    setResourceNumIsSet(true);
    this.uid = uid;
    setUidIsSet(true);
    this.useName = useName;
    this.sumTime = sumTime;
    setSumTimeIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.limitNum = limitNum;
    setLimitNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public L2WResourceSimpleSprite(L2WResourceSimpleSprite other) {
    __isset_bitfield = other.__isset_bitfield;
    this.resourceNum = other.resourceNum;
    this.uid = other.uid;
    if (other.isSetUseName()) {
      this.useName = other.useName;
    }
    this.sumTime = other.sumTime;
    this.startTime = other.startTime;
    this.limitNum = other.limitNum;
  }

  public L2WResourceSimpleSprite deepCopy() {
    return new L2WResourceSimpleSprite(this);
  }

  @Override
  public void clear() {
    setResourceNumIsSet(false);
    this.resourceNum = 0;
    setUidIsSet(false);
    this.uid = 0;
    this.useName = null;
    setSumTimeIsSet(false);
    this.sumTime = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setLimitNumIsSet(false);
    this.limitNum = 0;
  }

  public long getResourceNum() {
    return this.resourceNum;
  }

  public L2WResourceSimpleSprite setResourceNum(long resourceNum) {
    this.resourceNum = resourceNum;
    setResourceNumIsSet(true);
    return this;
  }

  public void unsetResourceNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESOURCENUM_ISSET_ID);
  }

  /** Returns true if field resourceNum is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceNum() {
    return EncodingUtils.testBit(__isset_bitfield, __RESOURCENUM_ISSET_ID);
  }

  public void setResourceNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESOURCENUM_ISSET_ID, value);
  }

  public long getUid() {
    return this.uid;
  }

  public L2WResourceSimpleSprite setUid(long uid) {
    this.uid = uid;
    setUidIsSet(true);
    return this;
  }

  public void unsetUid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UID_ISSET_ID);
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return EncodingUtils.testBit(__isset_bitfield, __UID_ISSET_ID);
  }

  public void setUidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UID_ISSET_ID, value);
  }

  public String getUseName() {
    return this.useName;
  }

  public L2WResourceSimpleSprite setUseName(String useName) {
    this.useName = useName;
    return this;
  }

  public void unsetUseName() {
    this.useName = null;
  }

  /** Returns true if field useName is set (has been assigned a value) and false otherwise */
  public boolean isSetUseName() {
    return this.useName != null;
  }

  public void setUseNameIsSet(boolean value) {
    if (!value) {
      this.useName = null;
    }
  }

  public int getSumTime() {
    return this.sumTime;
  }

  public L2WResourceSimpleSprite setSumTime(int sumTime) {
    this.sumTime = sumTime;
    setSumTimeIsSet(true);
    return this;
  }

  public void unsetSumTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUMTIME_ISSET_ID);
  }

  /** Returns true if field sumTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSumTime() {
    return EncodingUtils.testBit(__isset_bitfield, __SUMTIME_ISSET_ID);
  }

  public void setSumTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUMTIME_ISSET_ID, value);
  }

  public int getStartTime() {
    return this.startTime;
  }

  public L2WResourceSimpleSprite setStartTime(int startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public int getLimitNum() {
    return this.limitNum;
  }

  public L2WResourceSimpleSprite setLimitNum(int limitNum) {
    this.limitNum = limitNum;
    setLimitNumIsSet(true);
    return this;
  }

  public void unsetLimitNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIMITNUM_ISSET_ID);
  }

  /** Returns true if field limitNum is set (has been assigned a value) and false otherwise */
  public boolean isSetLimitNum() {
    return EncodingUtils.testBit(__isset_bitfield, __LIMITNUM_ISSET_ID);
  }

  public void setLimitNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIMITNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_NUM:
      if (value == null) {
        unsetResourceNum();
      } else {
        setResourceNum((Long)value);
      }
      break;

    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((Long)value);
      }
      break;

    case USE_NAME:
      if (value == null) {
        unsetUseName();
      } else {
        setUseName((String)value);
      }
      break;

    case SUM_TIME:
      if (value == null) {
        unsetSumTime();
      } else {
        setSumTime((Integer)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Integer)value);
      }
      break;

    case LIMIT_NUM:
      if (value == null) {
        unsetLimitNum();
      } else {
        setLimitNum((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_NUM:
      return getResourceNum();

    case UID:
      return getUid();

    case USE_NAME:
      return getUseName();

    case SUM_TIME:
      return getSumTime();

    case START_TIME:
      return getStartTime();

    case LIMIT_NUM:
      return getLimitNum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_NUM:
      return isSetResourceNum();
    case UID:
      return isSetUid();
    case USE_NAME:
      return isSetUseName();
    case SUM_TIME:
      return isSetSumTime();
    case START_TIME:
      return isSetStartTime();
    case LIMIT_NUM:
      return isSetLimitNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof L2WResourceSimpleSprite)
      return this.equals((L2WResourceSimpleSprite)that);
    return false;
  }

  public boolean equals(L2WResourceSimpleSprite that) {
    if (that == null)
      return false;

    boolean this_present_resourceNum = true;
    boolean that_present_resourceNum = true;
    if (this_present_resourceNum || that_present_resourceNum) {
      if (!(this_present_resourceNum && that_present_resourceNum))
        return false;
      if (this.resourceNum != that.resourceNum)
        return false;
    }

    boolean this_present_uid = true;
    boolean that_present_uid = true;
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (this.uid != that.uid)
        return false;
    }

    boolean this_present_useName = true && this.isSetUseName();
    boolean that_present_useName = true && that.isSetUseName();
    if (this_present_useName || that_present_useName) {
      if (!(this_present_useName && that_present_useName))
        return false;
      if (!this.useName.equals(that.useName))
        return false;
    }

    boolean this_present_sumTime = true;
    boolean that_present_sumTime = true;
    if (this_present_sumTime || that_present_sumTime) {
      if (!(this_present_sumTime && that_present_sumTime))
        return false;
      if (this.sumTime != that.sumTime)
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_limitNum = true;
    boolean that_present_limitNum = true;
    if (this_present_limitNum || that_present_limitNum) {
      if (!(this_present_limitNum && that_present_limitNum))
        return false;
      if (this.limitNum != that.limitNum)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceNum = true;
    list.add(present_resourceNum);
    if (present_resourceNum)
      list.add(resourceNum);

    boolean present_uid = true;
    list.add(present_uid);
    if (present_uid)
      list.add(uid);

    boolean present_useName = true && (isSetUseName());
    list.add(present_useName);
    if (present_useName)
      list.add(useName);

    boolean present_sumTime = true;
    list.add(present_sumTime);
    if (present_sumTime)
      list.add(sumTime);

    boolean present_startTime = true;
    list.add(present_startTime);
    if (present_startTime)
      list.add(startTime);

    boolean present_limitNum = true;
    list.add(present_limitNum);
    if (present_limitNum)
      list.add(limitNum);

    return list.hashCode();
  }

  @Override
  public int compareTo(L2WResourceSimpleSprite other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceNum()).compareTo(other.isSetResourceNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceNum, other.resourceNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUseName()).compareTo(other.isSetUseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useName, other.useName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSumTime()).compareTo(other.isSetSumTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSumTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sumTime, other.sumTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLimitNum()).compareTo(other.isSetLimitNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimitNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limitNum, other.limitNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("L2WResourceSimpleSprite(");
    boolean first = true;

    sb.append("resourceNum:");
    sb.append(this.resourceNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("useName:");
    if (this.useName == null) {
      sb.append("null");
    } else {
      sb.append(this.useName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sumTime:");
    sb.append(this.sumTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("limitNum:");
    sb.append(this.limitNum);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class L2WResourceSimpleSpriteStandardSchemeFactory implements SchemeFactory {
    public L2WResourceSimpleSpriteStandardScheme getScheme() {
      return new L2WResourceSimpleSpriteStandardScheme();
    }
  }

  private static class L2WResourceSimpleSpriteStandardScheme extends StandardScheme<L2WResourceSimpleSprite> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, L2WResourceSimpleSprite struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.resourceNum = iprot.readI64();
              struct.setResourceNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.uid = iprot.readI64();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.useName = iprot.readString();
              struct.setUseNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUM_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sumTime = iprot.readI32();
              struct.setSumTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.startTime = iprot.readI32();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LIMIT_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limitNum = iprot.readI32();
              struct.setLimitNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, L2WResourceSimpleSprite struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESOURCE_NUM_FIELD_DESC);
      oprot.writeI64(struct.resourceNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI64(struct.uid);
      oprot.writeFieldEnd();
      if (struct.useName != null) {
        oprot.writeFieldBegin(USE_NAME_FIELD_DESC);
        oprot.writeString(struct.useName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SUM_TIME_FIELD_DESC);
      oprot.writeI32(struct.sumTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI32(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LIMIT_NUM_FIELD_DESC);
      oprot.writeI32(struct.limitNum);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class L2WResourceSimpleSpriteTupleSchemeFactory implements SchemeFactory {
    public L2WResourceSimpleSpriteTupleScheme getScheme() {
      return new L2WResourceSimpleSpriteTupleScheme();
    }
  }

  private static class L2WResourceSimpleSpriteTupleScheme extends TupleScheme<L2WResourceSimpleSprite> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, L2WResourceSimpleSprite struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResourceNum()) {
        optionals.set(0);
      }
      if (struct.isSetUid()) {
        optionals.set(1);
      }
      if (struct.isSetUseName()) {
        optionals.set(2);
      }
      if (struct.isSetSumTime()) {
        optionals.set(3);
      }
      if (struct.isSetStartTime()) {
        optionals.set(4);
      }
      if (struct.isSetLimitNum()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetResourceNum()) {
        oprot.writeI64(struct.resourceNum);
      }
      if (struct.isSetUid()) {
        oprot.writeI64(struct.uid);
      }
      if (struct.isSetUseName()) {
        oprot.writeString(struct.useName);
      }
      if (struct.isSetSumTime()) {
        oprot.writeI32(struct.sumTime);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI32(struct.startTime);
      }
      if (struct.isSetLimitNum()) {
        oprot.writeI32(struct.limitNum);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, L2WResourceSimpleSprite struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.resourceNum = iprot.readI64();
        struct.setResourceNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uid = iprot.readI64();
        struct.setUidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.useName = iprot.readString();
        struct.setUseNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sumTime = iprot.readI32();
        struct.setSumTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.startTime = iprot.readI32();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.limitNum = iprot.readI32();
        struct.setLimitNumIsSet(true);
      }
    }
  }

}

