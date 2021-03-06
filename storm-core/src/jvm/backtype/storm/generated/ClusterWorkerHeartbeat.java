/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-11")
public class ClusterWorkerHeartbeat implements org.apache.thrift.TBase<ClusterWorkerHeartbeat, ClusterWorkerHeartbeat._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterWorkerHeartbeat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterWorkerHeartbeat");

  private static final org.apache.thrift.protocol.TField STORM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storm_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXECUTOR_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("executor_stats", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("time_secs", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterWorkerHeartbeatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterWorkerHeartbeatTupleSchemeFactory());
  }

  private String storm_id; // required
  private Map<ExecutorInfo,ExecutorStats> executor_stats; // required
  private int time_secs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORM_ID((short)1, "storm_id"),
    EXECUTOR_STATS((short)2, "executor_stats"),
    TIME_SECS((short)3, "time_secs");

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
        case 1: // STORM_ID
          return STORM_ID;
        case 2: // EXECUTOR_STATS
          return EXECUTOR_STATS;
        case 3: // TIME_SECS
          return TIME_SECS;
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
  private static final int __TIME_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORM_ID, new org.apache.thrift.meta_data.FieldMetaData("storm_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTOR_STATS, new org.apache.thrift.meta_data.FieldMetaData("executor_stats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorInfo.class), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorStats.class))));
    tmpMap.put(_Fields.TIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("time_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterWorkerHeartbeat.class, metaDataMap);
  }

  public ClusterWorkerHeartbeat() {
  }

  public ClusterWorkerHeartbeat(
    String storm_id,
    Map<ExecutorInfo,ExecutorStats> executor_stats,
    int time_secs)
  {
    this();
    this.storm_id = storm_id;
    this.executor_stats = executor_stats;
    this.time_secs = time_secs;
    set_time_secs_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterWorkerHeartbeat(ClusterWorkerHeartbeat other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_storm_id()) {
      this.storm_id = other.storm_id;
    }
    if (other.is_set_executor_stats()) {
      Map<ExecutorInfo,ExecutorStats> __this__executor_stats = new HashMap<ExecutorInfo,ExecutorStats>(other.executor_stats.size());
      for (Map.Entry<ExecutorInfo, ExecutorStats> other_element : other.executor_stats.entrySet()) {

        ExecutorInfo other_element_key = other_element.getKey();
        ExecutorStats other_element_value = other_element.getValue();

        ExecutorInfo __this__executor_stats_copy_key = new ExecutorInfo(other_element_key);

        ExecutorStats __this__executor_stats_copy_value = new ExecutorStats(other_element_value);

        __this__executor_stats.put(__this__executor_stats_copy_key, __this__executor_stats_copy_value);
      }
      this.executor_stats = __this__executor_stats;
    }
    this.time_secs = other.time_secs;
  }

  public ClusterWorkerHeartbeat deepCopy() {
    return new ClusterWorkerHeartbeat(this);
  }

  @Override
  public void clear() {
    this.storm_id = null;
    this.executor_stats = null;
    set_time_secs_isSet(false);
    this.time_secs = 0;
  }

  public String get_storm_id() {
    return this.storm_id;
  }

  public void set_storm_id(String storm_id) {
    this.storm_id = storm_id;
  }

  public void unset_storm_id() {
    this.storm_id = null;
  }

  /** Returns true if field storm_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_storm_id() {
    return this.storm_id != null;
  }

  public void set_storm_id_isSet(boolean value) {
    if (!value) {
      this.storm_id = null;
    }
  }

  public int get_executor_stats_size() {
    return (this.executor_stats == null) ? 0 : this.executor_stats.size();
  }

  public void put_to_executor_stats(ExecutorInfo key, ExecutorStats val) {
    if (this.executor_stats == null) {
      this.executor_stats = new HashMap<ExecutorInfo,ExecutorStats>();
    }
    this.executor_stats.put(key, val);
  }

  public Map<ExecutorInfo,ExecutorStats> get_executor_stats() {
    return this.executor_stats;
  }

  public void set_executor_stats(Map<ExecutorInfo,ExecutorStats> executor_stats) {
    this.executor_stats = executor_stats;
  }

  public void unset_executor_stats() {
    this.executor_stats = null;
  }

  /** Returns true if field executor_stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_executor_stats() {
    return this.executor_stats != null;
  }

  public void set_executor_stats_isSet(boolean value) {
    if (!value) {
      this.executor_stats = null;
    }
  }

  public int get_time_secs() {
    return this.time_secs;
  }

  public void set_time_secs(int time_secs) {
    this.time_secs = time_secs;
    set_time_secs_isSet(true);
  }

  public void unset_time_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  /** Returns true if field time_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_time_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  public void set_time_secs_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORM_ID:
      if (value == null) {
        unset_storm_id();
      } else {
        set_storm_id((String)value);
      }
      break;

    case EXECUTOR_STATS:
      if (value == null) {
        unset_executor_stats();
      } else {
        set_executor_stats((Map<ExecutorInfo,ExecutorStats>)value);
      }
      break;

    case TIME_SECS:
      if (value == null) {
        unset_time_secs();
      } else {
        set_time_secs((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORM_ID:
      return get_storm_id();

    case EXECUTOR_STATS:
      return get_executor_stats();

    case TIME_SECS:
      return Integer.valueOf(get_time_secs());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORM_ID:
      return is_set_storm_id();
    case EXECUTOR_STATS:
      return is_set_executor_stats();
    case TIME_SECS:
      return is_set_time_secs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterWorkerHeartbeat)
      return this.equals((ClusterWorkerHeartbeat)that);
    return false;
  }

  public boolean equals(ClusterWorkerHeartbeat that) {
    if (that == null)
      return false;

    boolean this_present_storm_id = true && this.is_set_storm_id();
    boolean that_present_storm_id = true && that.is_set_storm_id();
    if (this_present_storm_id || that_present_storm_id) {
      if (!(this_present_storm_id && that_present_storm_id))
        return false;
      if (!this.storm_id.equals(that.storm_id))
        return false;
    }

    boolean this_present_executor_stats = true && this.is_set_executor_stats();
    boolean that_present_executor_stats = true && that.is_set_executor_stats();
    if (this_present_executor_stats || that_present_executor_stats) {
      if (!(this_present_executor_stats && that_present_executor_stats))
        return false;
      if (!this.executor_stats.equals(that.executor_stats))
        return false;
    }

    boolean this_present_time_secs = true;
    boolean that_present_time_secs = true;
    if (this_present_time_secs || that_present_time_secs) {
      if (!(this_present_time_secs && that_present_time_secs))
        return false;
      if (this.time_secs != that.time_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_storm_id = true && (is_set_storm_id());
    list.add(present_storm_id);
    if (present_storm_id)
      list.add(storm_id);

    boolean present_executor_stats = true && (is_set_executor_stats());
    list.add(present_executor_stats);
    if (present_executor_stats)
      list.add(executor_stats);

    boolean present_time_secs = true;
    list.add(present_time_secs);
    if (present_time_secs)
      list.add(time_secs);

    return list.hashCode();
  }

  @Override
  public int compareTo(ClusterWorkerHeartbeat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_storm_id()).compareTo(other.is_set_storm_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_storm_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storm_id, other.storm_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executor_stats()).compareTo(other.is_set_executor_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executor_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executor_stats, other.executor_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_time_secs()).compareTo(other.is_set_time_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_time_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_secs, other.time_secs);
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
    StringBuilder sb = new StringBuilder("ClusterWorkerHeartbeat(");
    boolean first = true;

    sb.append("storm_id:");
    if (this.storm_id == null) {
      sb.append("null");
    } else {
      sb.append(this.storm_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executor_stats:");
    if (this.executor_stats == null) {
      sb.append("null");
    } else {
      sb.append(this.executor_stats);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_secs:");
    sb.append(this.time_secs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_storm_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storm_id' is unset! Struct:" + toString());
    }

    if (!is_set_executor_stats()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executor_stats' is unset! Struct:" + toString());
    }

    if (!is_set_time_secs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_secs' is unset! Struct:" + toString());
    }

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

  private static class ClusterWorkerHeartbeatStandardSchemeFactory implements SchemeFactory {
    public ClusterWorkerHeartbeatStandardScheme getScheme() {
      return new ClusterWorkerHeartbeatStandardScheme();
    }
  }

  private static class ClusterWorkerHeartbeatStandardScheme extends StandardScheme<ClusterWorkerHeartbeat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterWorkerHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storm_id = iprot.readString();
              struct.set_storm_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXECUTOR_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map426 = iprot.readMapBegin();
                struct.executor_stats = new HashMap<ExecutorInfo,ExecutorStats>(2*_map426.size);
                ExecutorInfo _key427;
                ExecutorStats _val428;
                for (int _i429 = 0; _i429 < _map426.size; ++_i429)
                {
                  _key427 = new ExecutorInfo();
                  _key427.read(iprot);
                  _val428 = new ExecutorStats();
                  _val428.read(iprot);
                  struct.executor_stats.put(_key427, _val428);
                }
                iprot.readMapEnd();
              }
              struct.set_executor_stats_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time_secs = iprot.readI32();
              struct.set_time_secs_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterWorkerHeartbeat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storm_id != null) {
        oprot.writeFieldBegin(STORM_ID_FIELD_DESC);
        oprot.writeString(struct.storm_id);
        oprot.writeFieldEnd();
      }
      if (struct.executor_stats != null) {
        oprot.writeFieldBegin(EXECUTOR_STATS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, struct.executor_stats.size()));
          for (Map.Entry<ExecutorInfo, ExecutorStats> _iter430 : struct.executor_stats.entrySet())
          {
            _iter430.getKey().write(oprot);
            _iter430.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.time_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterWorkerHeartbeatTupleSchemeFactory implements SchemeFactory {
    public ClusterWorkerHeartbeatTupleScheme getScheme() {
      return new ClusterWorkerHeartbeatTupleScheme();
    }
  }

  private static class ClusterWorkerHeartbeatTupleScheme extends TupleScheme<ClusterWorkerHeartbeat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterWorkerHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.storm_id);
      {
        oprot.writeI32(struct.executor_stats.size());
        for (Map.Entry<ExecutorInfo, ExecutorStats> _iter431 : struct.executor_stats.entrySet())
        {
          _iter431.getKey().write(oprot);
          _iter431.getValue().write(oprot);
        }
      }
      oprot.writeI32(struct.time_secs);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterWorkerHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.storm_id = iprot.readString();
      struct.set_storm_id_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map432 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.executor_stats = new HashMap<ExecutorInfo,ExecutorStats>(2*_map432.size);
        ExecutorInfo _key433;
        ExecutorStats _val434;
        for (int _i435 = 0; _i435 < _map432.size; ++_i435)
        {
          _key433 = new ExecutorInfo();
          _key433.read(iprot);
          _val434 = new ExecutorStats();
          _val434.read(iprot);
          struct.executor_stats.put(_key433, _val434);
        }
      }
      struct.set_executor_stats_isSet(true);
      struct.time_secs = iprot.readI32();
      struct.set_time_secs_isSet(true);
    }
  }

}

