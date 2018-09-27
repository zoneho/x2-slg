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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-13")
public class W2lSoldierInfo implements org.apache.thrift.TBase<W2lSoldierInfo, W2lSoldierInfo._Fields>, java.io.Serializable, Cloneable, Comparable<W2lSoldierInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("W2lSoldierInfo");

  private static final org.apache.thrift.protocol.TField SID_FIELD_DESC = new org.apache.thrift.protocol.TField("sid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IS_SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("isSystem", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("num", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PEIJIANS_FIELD_DESC = new org.apache.thrift.protocol.TField("peijians", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new W2lSoldierInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new W2lSoldierInfoTupleSchemeFactory());
  }

  public int sid; // required
  public boolean isSystem; // required
  public int type; // required
  public int num; // required
  public int state; // required
  public String name; // required
  public List<W2lPeijianInfo> peijians; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SID((short)1, "sid"),
    IS_SYSTEM((short)2, "isSystem"),
    TYPE((short)3, "type"),
    NUM((short)4, "num"),
    STATE((short)5, "state"),
    NAME((short)6, "name"),
    PEIJIANS((short)7, "peijians");

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
        case 1: // SID
          return SID;
        case 2: // IS_SYSTEM
          return IS_SYSTEM;
        case 3: // TYPE
          return TYPE;
        case 4: // NUM
          return NUM;
        case 5: // STATE
          return STATE;
        case 6: // NAME
          return NAME;
        case 7: // PEIJIANS
          return PEIJIANS;
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
  private static final int __SID_ISSET_ID = 0;
  private static final int __ISSYSTEM_ISSET_ID = 1;
  private static final int __TYPE_ISSET_ID = 2;
  private static final int __NUM_ISSET_ID = 3;
  private static final int __STATE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SID, new org.apache.thrift.meta_data.FieldMetaData("sid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("isSystem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("num", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PEIJIANS, new org.apache.thrift.meta_data.FieldMetaData("peijians", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "W2lPeijianInfo"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(W2lSoldierInfo.class, metaDataMap);
  }

  public W2lSoldierInfo() {
  }

  public W2lSoldierInfo(
    int sid,
    boolean isSystem,
    int type,
    int num,
    int state,
    String name,
    List<W2lPeijianInfo> peijians)
  {
    this();
    this.sid = sid;
    setSidIsSet(true);
    this.isSystem = isSystem;
    setIsSystemIsSet(true);
    this.type = type;
    setTypeIsSet(true);
    this.num = num;
    setNumIsSet(true);
    this.state = state;
    setStateIsSet(true);
    this.name = name;
    this.peijians = peijians;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public W2lSoldierInfo(W2lSoldierInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sid = other.sid;
    this.isSystem = other.isSystem;
    this.type = other.type;
    this.num = other.num;
    this.state = other.state;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPeijians()) {
      List<W2lPeijianInfo> __this__peijians = new ArrayList<W2lPeijianInfo>(other.peijians.size());
      for (W2lPeijianInfo other_element : other.peijians) {
        __this__peijians.add(other_element);
      }
      this.peijians = __this__peijians;
    }
  }

  public W2lSoldierInfo deepCopy() {
    return new W2lSoldierInfo(this);
  }

  @Override
  public void clear() {
    setSidIsSet(false);
    this.sid = 0;
    setIsSystemIsSet(false);
    this.isSystem = false;
    setTypeIsSet(false);
    this.type = 0;
    setNumIsSet(false);
    this.num = 0;
    setStateIsSet(false);
    this.state = 0;
    this.name = null;
    this.peijians = null;
  }

  public int getSid() {
    return this.sid;
  }

  public W2lSoldierInfo setSid(int sid) {
    this.sid = sid;
    setSidIsSet(true);
    return this;
  }

  public void unsetSid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SID_ISSET_ID);
  }

  /** Returns true if field sid is set (has been assigned a value) and false otherwise */
  public boolean isSetSid() {
    return EncodingUtils.testBit(__isset_bitfield, __SID_ISSET_ID);
  }

  public void setSidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SID_ISSET_ID, value);
  }

  public boolean isIsSystem() {
    return this.isSystem;
  }

  public W2lSoldierInfo setIsSystem(boolean isSystem) {
    this.isSystem = isSystem;
    setIsSystemIsSet(true);
    return this;
  }

  public void unsetIsSystem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSYSTEM_ISSET_ID);
  }

  /** Returns true if field isSystem is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSystem() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSYSTEM_ISSET_ID);
  }

  public void setIsSystemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSYSTEM_ISSET_ID, value);
  }

  public int getType() {
    return this.type;
  }

  public W2lSoldierInfo setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public int getNum() {
    return this.num;
  }

  public W2lSoldierInfo setNum(int num) {
    this.num = num;
    setNumIsSet(true);
    return this;
  }

  public void unsetNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  /** Returns true if field num is set (has been assigned a value) and false otherwise */
  public boolean isSetNum() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  public void setNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
  }

  public int getState() {
    return this.state;
  }

  public W2lSoldierInfo setState(int state) {
    this.state = state;
    setStateIsSet(true);
    return this;
  }

  public void unsetState() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return EncodingUtils.testBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  public void setStateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATE_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public W2lSoldierInfo setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getPeijiansSize() {
    return (this.peijians == null) ? 0 : this.peijians.size();
  }

  public java.util.Iterator<W2lPeijianInfo> getPeijiansIterator() {
    return (this.peijians == null) ? null : this.peijians.iterator();
  }

  public void addToPeijians(W2lPeijianInfo elem) {
    if (this.peijians == null) {
      this.peijians = new ArrayList<W2lPeijianInfo>();
    }
    this.peijians.add(elem);
  }

  public List<W2lPeijianInfo> getPeijians() {
    return this.peijians;
  }

  public W2lSoldierInfo setPeijians(List<W2lPeijianInfo> peijians) {
    this.peijians = peijians;
    return this;
  }

  public void unsetPeijians() {
    this.peijians = null;
  }

  /** Returns true if field peijians is set (has been assigned a value) and false otherwise */
  public boolean isSetPeijians() {
    return this.peijians != null;
  }

  public void setPeijiansIsSet(boolean value) {
    if (!value) {
      this.peijians = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SID:
      if (value == null) {
        unsetSid();
      } else {
        setSid((Integer)value);
      }
      break;

    case IS_SYSTEM:
      if (value == null) {
        unsetIsSystem();
      } else {
        setIsSystem((Boolean)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case NUM:
      if (value == null) {
        unsetNum();
      } else {
        setNum((Integer)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PEIJIANS:
      if (value == null) {
        unsetPeijians();
      } else {
        setPeijians((List<W2lPeijianInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SID:
      return getSid();

    case IS_SYSTEM:
      return isIsSystem();

    case TYPE:
      return getType();

    case NUM:
      return getNum();

    case STATE:
      return getState();

    case NAME:
      return getName();

    case PEIJIANS:
      return getPeijians();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SID:
      return isSetSid();
    case IS_SYSTEM:
      return isSetIsSystem();
    case TYPE:
      return isSetType();
    case NUM:
      return isSetNum();
    case STATE:
      return isSetState();
    case NAME:
      return isSetName();
    case PEIJIANS:
      return isSetPeijians();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof W2lSoldierInfo)
      return this.equals((W2lSoldierInfo)that);
    return false;
  }

  public boolean equals(W2lSoldierInfo that) {
    if (that == null)
      return false;

    boolean this_present_sid = true;
    boolean that_present_sid = true;
    if (this_present_sid || that_present_sid) {
      if (!(this_present_sid && that_present_sid))
        return false;
      if (this.sid != that.sid)
        return false;
    }

    boolean this_present_isSystem = true;
    boolean that_present_isSystem = true;
    if (this_present_isSystem || that_present_isSystem) {
      if (!(this_present_isSystem && that_present_isSystem))
        return false;
      if (this.isSystem != that.isSystem)
        return false;
    }

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_num = true;
    boolean that_present_num = true;
    if (this_present_num || that_present_num) {
      if (!(this_present_num && that_present_num))
        return false;
      if (this.num != that.num)
        return false;
    }

    boolean this_present_state = true;
    boolean that_present_state = true;
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (this.state != that.state)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_peijians = true && this.isSetPeijians();
    boolean that_present_peijians = true && that.isSetPeijians();
    if (this_present_peijians || that_present_peijians) {
      if (!(this_present_peijians && that_present_peijians))
        return false;
      if (!this.peijians.equals(that.peijians))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_sid = true;
    list.add(present_sid);
    if (present_sid)
      list.add(sid);

    boolean present_isSystem = true;
    list.add(present_isSystem);
    if (present_isSystem)
      list.add(isSystem);

    boolean present_type = true;
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_num = true;
    list.add(present_num);
    if (present_num)
      list.add(num);

    boolean present_state = true;
    list.add(present_state);
    if (present_state)
      list.add(state);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_peijians = true && (isSetPeijians());
    list.add(present_peijians);
    if (present_peijians)
      list.add(peijians);

    return list.hashCode();
  }

  @Override
  public int compareTo(W2lSoldierInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSid()).compareTo(other.isSetSid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sid, other.sid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSystem()).compareTo(other.isSetIsSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSystem, other.isSystem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num, other.num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeijians()).compareTo(other.isSetPeijians());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeijians()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peijians, other.peijians);
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
    StringBuilder sb = new StringBuilder("W2lSoldierInfo(");
    boolean first = true;

    sb.append("sid:");
    sb.append(this.sid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isSystem:");
    sb.append(this.isSystem);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num:");
    sb.append(this.num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    sb.append(this.state);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("peijians:");
    if (this.peijians == null) {
      sb.append("null");
    } else {
      sb.append(this.peijians);
    }
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

  private static class W2lSoldierInfoStandardSchemeFactory implements SchemeFactory {
    public W2lSoldierInfoStandardScheme getScheme() {
      return new W2lSoldierInfoStandardScheme();
    }
  }

  private static class W2lSoldierInfoStandardScheme extends StandardScheme<W2lSoldierInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, W2lSoldierInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sid = iprot.readI32();
              struct.setSidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSystem = iprot.readBool();
              struct.setIsSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num = iprot.readI32();
              struct.setNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = iprot.readI32();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PEIJIANS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.peijians = new ArrayList<W2lPeijianInfo>(_list8.size);
                W2lPeijianInfo _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new W2lPeijianInfo();
                  _elem9.read(iprot);
                  struct.peijians.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setPeijiansIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, W2lSoldierInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SID_FIELD_DESC);
      oprot.writeI32(struct.sid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_SYSTEM_FIELD_DESC);
      oprot.writeBool(struct.isSystem);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_FIELD_DESC);
      oprot.writeI32(struct.num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeI32(struct.state);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.peijians != null) {
        oprot.writeFieldBegin(PEIJIANS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.peijians.size()));
          for (W2lPeijianInfo _iter11 : struct.peijians)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class W2lSoldierInfoTupleSchemeFactory implements SchemeFactory {
    public W2lSoldierInfoTupleScheme getScheme() {
      return new W2lSoldierInfoTupleScheme();
    }
  }

  private static class W2lSoldierInfoTupleScheme extends TupleScheme<W2lSoldierInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, W2lSoldierInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSid()) {
        optionals.set(0);
      }
      if (struct.isSetIsSystem()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetNum()) {
        optionals.set(3);
      }
      if (struct.isSetState()) {
        optionals.set(4);
      }
      if (struct.isSetName()) {
        optionals.set(5);
      }
      if (struct.isSetPeijians()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetSid()) {
        oprot.writeI32(struct.sid);
      }
      if (struct.isSetIsSystem()) {
        oprot.writeBool(struct.isSystem);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetNum()) {
        oprot.writeI32(struct.num);
      }
      if (struct.isSetState()) {
        oprot.writeI32(struct.state);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetPeijians()) {
        {
          oprot.writeI32(struct.peijians.size());
          for (W2lPeijianInfo _iter12 : struct.peijians)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, W2lSoldierInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.sid = iprot.readI32();
        struct.setSidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isSystem = iprot.readBool();
        struct.setIsSystemIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.num = iprot.readI32();
        struct.setNumIsSet(true);
      }
      if (incoming.get(4)) {
        struct.state = iprot.readI32();
        struct.setStateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.peijians = new ArrayList<W2lPeijianInfo>(_list13.size);
          W2lPeijianInfo _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new W2lPeijianInfo();
            _elem14.read(iprot);
            struct.peijians.add(_elem14);
          }
        }
        struct.setPeijiansIsSet(true);
      }
    }
  }

}

