/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.github.ogomezso.scs.infrastructure.model.ticket;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ScaleRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8866555828708918901L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ScaleRecord\",\"namespace\":\"org.github.ogomezso.scs.infrastructure.model.ticket\",\"fields\":[{\"name\":\"lineNumberScale\",\"type\":\"string\"},{\"name\":\"scaleDate\",\"type\":\"string\"},{\"name\":\"scaleHour\",\"type\":\"string\"},{\"name\":\"scaleId\",\"type\":\"string\"},{\"name\":\"groupId\",\"type\":\"string\"},{\"name\":\"scaleTicketId\",\"type\":\"string\"},{\"name\":\"scaleOperatorId\",\"type\":\"string\"},{\"name\":\"scaleAmount\",\"type\":\"string\"},{\"name\":\"scaleTicketType\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ScaleRecord> ENCODER =
      new BinaryMessageEncoder<ScaleRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ScaleRecord> DECODER =
      new BinaryMessageDecoder<ScaleRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ScaleRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ScaleRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ScaleRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ScaleRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ScaleRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ScaleRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ScaleRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ScaleRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence lineNumberScale;
  private java.lang.CharSequence scaleDate;
  private java.lang.CharSequence scaleHour;
  private java.lang.CharSequence scaleId;
  private java.lang.CharSequence groupId;
  private java.lang.CharSequence scaleTicketId;
  private java.lang.CharSequence scaleOperatorId;
  private java.lang.CharSequence scaleAmount;
  private java.lang.CharSequence scaleTicketType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ScaleRecord() {}

  /**
   * All-args constructor.
   * @param lineNumberScale The new value for lineNumberScale
   * @param scaleDate The new value for scaleDate
   * @param scaleHour The new value for scaleHour
   * @param scaleId The new value for scaleId
   * @param groupId The new value for groupId
   * @param scaleTicketId The new value for scaleTicketId
   * @param scaleOperatorId The new value for scaleOperatorId
   * @param scaleAmount The new value for scaleAmount
   * @param scaleTicketType The new value for scaleTicketType
   */
  public ScaleRecord(java.lang.CharSequence lineNumberScale, java.lang.CharSequence scaleDate, java.lang.CharSequence scaleHour, java.lang.CharSequence scaleId, java.lang.CharSequence groupId, java.lang.CharSequence scaleTicketId, java.lang.CharSequence scaleOperatorId, java.lang.CharSequence scaleAmount, java.lang.CharSequence scaleTicketType) {
    this.lineNumberScale = lineNumberScale;
    this.scaleDate = scaleDate;
    this.scaleHour = scaleHour;
    this.scaleId = scaleId;
    this.groupId = groupId;
    this.scaleTicketId = scaleTicketId;
    this.scaleOperatorId = scaleOperatorId;
    this.scaleAmount = scaleAmount;
    this.scaleTicketType = scaleTicketType;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return lineNumberScale;
    case 1: return scaleDate;
    case 2: return scaleHour;
    case 3: return scaleId;
    case 4: return groupId;
    case 5: return scaleTicketId;
    case 6: return scaleOperatorId;
    case 7: return scaleAmount;
    case 8: return scaleTicketType;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: lineNumberScale = (java.lang.CharSequence)value$; break;
    case 1: scaleDate = (java.lang.CharSequence)value$; break;
    case 2: scaleHour = (java.lang.CharSequence)value$; break;
    case 3: scaleId = (java.lang.CharSequence)value$; break;
    case 4: groupId = (java.lang.CharSequence)value$; break;
    case 5: scaleTicketId = (java.lang.CharSequence)value$; break;
    case 6: scaleOperatorId = (java.lang.CharSequence)value$; break;
    case 7: scaleAmount = (java.lang.CharSequence)value$; break;
    case 8: scaleTicketType = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'lineNumberScale' field.
   * @return The value of the 'lineNumberScale' field.
   */
  public java.lang.CharSequence getLineNumberScale() {
    return lineNumberScale;
  }


  /**
   * Sets the value of the 'lineNumberScale' field.
   * @param value the value to set.
   */
  public void setLineNumberScale(java.lang.CharSequence value) {
    this.lineNumberScale = value;
  }

  /**
   * Gets the value of the 'scaleDate' field.
   * @return The value of the 'scaleDate' field.
   */
  public java.lang.CharSequence getScaleDate() {
    return scaleDate;
  }


  /**
   * Sets the value of the 'scaleDate' field.
   * @param value the value to set.
   */
  public void setScaleDate(java.lang.CharSequence value) {
    this.scaleDate = value;
  }

  /**
   * Gets the value of the 'scaleHour' field.
   * @return The value of the 'scaleHour' field.
   */
  public java.lang.CharSequence getScaleHour() {
    return scaleHour;
  }


  /**
   * Sets the value of the 'scaleHour' field.
   * @param value the value to set.
   */
  public void setScaleHour(java.lang.CharSequence value) {
    this.scaleHour = value;
  }

  /**
   * Gets the value of the 'scaleId' field.
   * @return The value of the 'scaleId' field.
   */
  public java.lang.CharSequence getScaleId() {
    return scaleId;
  }


  /**
   * Sets the value of the 'scaleId' field.
   * @param value the value to set.
   */
  public void setScaleId(java.lang.CharSequence value) {
    this.scaleId = value;
  }

  /**
   * Gets the value of the 'groupId' field.
   * @return The value of the 'groupId' field.
   */
  public java.lang.CharSequence getGroupId() {
    return groupId;
  }


  /**
   * Sets the value of the 'groupId' field.
   * @param value the value to set.
   */
  public void setGroupId(java.lang.CharSequence value) {
    this.groupId = value;
  }

  /**
   * Gets the value of the 'scaleTicketId' field.
   * @return The value of the 'scaleTicketId' field.
   */
  public java.lang.CharSequence getScaleTicketId() {
    return scaleTicketId;
  }


  /**
   * Sets the value of the 'scaleTicketId' field.
   * @param value the value to set.
   */
  public void setScaleTicketId(java.lang.CharSequence value) {
    this.scaleTicketId = value;
  }

  /**
   * Gets the value of the 'scaleOperatorId' field.
   * @return The value of the 'scaleOperatorId' field.
   */
  public java.lang.CharSequence getScaleOperatorId() {
    return scaleOperatorId;
  }


  /**
   * Sets the value of the 'scaleOperatorId' field.
   * @param value the value to set.
   */
  public void setScaleOperatorId(java.lang.CharSequence value) {
    this.scaleOperatorId = value;
  }

  /**
   * Gets the value of the 'scaleAmount' field.
   * @return The value of the 'scaleAmount' field.
   */
  public java.lang.CharSequence getScaleAmount() {
    return scaleAmount;
  }


  /**
   * Sets the value of the 'scaleAmount' field.
   * @param value the value to set.
   */
  public void setScaleAmount(java.lang.CharSequence value) {
    this.scaleAmount = value;
  }

  /**
   * Gets the value of the 'scaleTicketType' field.
   * @return The value of the 'scaleTicketType' field.
   */
  public java.lang.CharSequence getScaleTicketType() {
    return scaleTicketType;
  }


  /**
   * Sets the value of the 'scaleTicketType' field.
   * @param value the value to set.
   */
  public void setScaleTicketType(java.lang.CharSequence value) {
    this.scaleTicketType = value;
  }

  /**
   * Creates a new ScaleRecord RecordBuilder.
   * @return A new ScaleRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder newBuilder() {
    return new org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder();
  }

  /**
   * Creates a new ScaleRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ScaleRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder newBuilder(org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder other) {
    if (other == null) {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder();
    } else {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder(other);
    }
  }

  /**
   * Creates a new ScaleRecord RecordBuilder by copying an existing ScaleRecord instance.
   * @param other The existing instance to copy.
   * @return A new ScaleRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder newBuilder(org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord other) {
    if (other == null) {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder();
    } else {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for ScaleRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ScaleRecord>
    implements org.apache.avro.data.RecordBuilder<ScaleRecord> {

    private java.lang.CharSequence lineNumberScale;
    private java.lang.CharSequence scaleDate;
    private java.lang.CharSequence scaleHour;
    private java.lang.CharSequence scaleId;
    private java.lang.CharSequence groupId;
    private java.lang.CharSequence scaleTicketId;
    private java.lang.CharSequence scaleOperatorId;
    private java.lang.CharSequence scaleAmount;
    private java.lang.CharSequence scaleTicketType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.lineNumberScale)) {
        this.lineNumberScale = data().deepCopy(fields()[0].schema(), other.lineNumberScale);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.scaleDate)) {
        this.scaleDate = data().deepCopy(fields()[1].schema(), other.scaleDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.scaleHour)) {
        this.scaleHour = data().deepCopy(fields()[2].schema(), other.scaleHour);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.scaleId)) {
        this.scaleId = data().deepCopy(fields()[3].schema(), other.scaleId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.groupId)) {
        this.groupId = data().deepCopy(fields()[4].schema(), other.groupId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.scaleTicketId)) {
        this.scaleTicketId = data().deepCopy(fields()[5].schema(), other.scaleTicketId);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.scaleOperatorId)) {
        this.scaleOperatorId = data().deepCopy(fields()[6].schema(), other.scaleOperatorId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.scaleAmount)) {
        this.scaleAmount = data().deepCopy(fields()[7].schema(), other.scaleAmount);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.scaleTicketType)) {
        this.scaleTicketType = data().deepCopy(fields()[8].schema(), other.scaleTicketType);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing ScaleRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.lineNumberScale)) {
        this.lineNumberScale = data().deepCopy(fields()[0].schema(), other.lineNumberScale);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.scaleDate)) {
        this.scaleDate = data().deepCopy(fields()[1].schema(), other.scaleDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.scaleHour)) {
        this.scaleHour = data().deepCopy(fields()[2].schema(), other.scaleHour);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.scaleId)) {
        this.scaleId = data().deepCopy(fields()[3].schema(), other.scaleId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.groupId)) {
        this.groupId = data().deepCopy(fields()[4].schema(), other.groupId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.scaleTicketId)) {
        this.scaleTicketId = data().deepCopy(fields()[5].schema(), other.scaleTicketId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.scaleOperatorId)) {
        this.scaleOperatorId = data().deepCopy(fields()[6].schema(), other.scaleOperatorId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.scaleAmount)) {
        this.scaleAmount = data().deepCopy(fields()[7].schema(), other.scaleAmount);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.scaleTicketType)) {
        this.scaleTicketType = data().deepCopy(fields()[8].schema(), other.scaleTicketType);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'lineNumberScale' field.
      * @return The value.
      */
    public java.lang.CharSequence getLineNumberScale() {
      return lineNumberScale;
    }


    /**
      * Sets the value of the 'lineNumberScale' field.
      * @param value The value of 'lineNumberScale'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setLineNumberScale(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.lineNumberScale = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'lineNumberScale' field has been set.
      * @return True if the 'lineNumberScale' field has been set, false otherwise.
      */
    public boolean hasLineNumberScale() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'lineNumberScale' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearLineNumberScale() {
      lineNumberScale = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleDate() {
      return scaleDate;
    }


    /**
      * Sets the value of the 'scaleDate' field.
      * @param value The value of 'scaleDate'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.scaleDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleDate' field has been set.
      * @return True if the 'scaleDate' field has been set, false otherwise.
      */
    public boolean hasScaleDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'scaleDate' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleDate() {
      scaleDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleHour' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleHour() {
      return scaleHour;
    }


    /**
      * Sets the value of the 'scaleHour' field.
      * @param value The value of 'scaleHour'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleHour(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.scaleHour = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleHour' field has been set.
      * @return True if the 'scaleHour' field has been set, false otherwise.
      */
    public boolean hasScaleHour() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'scaleHour' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleHour() {
      scaleHour = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleId' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleId() {
      return scaleId;
    }


    /**
      * Sets the value of the 'scaleId' field.
      * @param value The value of 'scaleId'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.scaleId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleId' field has been set.
      * @return True if the 'scaleId' field has been set, false otherwise.
      */
    public boolean hasScaleId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'scaleId' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleId() {
      scaleId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'groupId' field.
      * @return The value.
      */
    public java.lang.CharSequence getGroupId() {
      return groupId;
    }


    /**
      * Sets the value of the 'groupId' field.
      * @param value The value of 'groupId'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setGroupId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.groupId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'groupId' field has been set.
      * @return True if the 'groupId' field has been set, false otherwise.
      */
    public boolean hasGroupId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'groupId' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearGroupId() {
      groupId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleTicketId' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleTicketId() {
      return scaleTicketId;
    }


    /**
      * Sets the value of the 'scaleTicketId' field.
      * @param value The value of 'scaleTicketId'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleTicketId(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.scaleTicketId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleTicketId' field has been set.
      * @return True if the 'scaleTicketId' field has been set, false otherwise.
      */
    public boolean hasScaleTicketId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'scaleTicketId' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleTicketId() {
      scaleTicketId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleOperatorId' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleOperatorId() {
      return scaleOperatorId;
    }


    /**
      * Sets the value of the 'scaleOperatorId' field.
      * @param value The value of 'scaleOperatorId'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleOperatorId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.scaleOperatorId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleOperatorId' field has been set.
      * @return True if the 'scaleOperatorId' field has been set, false otherwise.
      */
    public boolean hasScaleOperatorId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'scaleOperatorId' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleOperatorId() {
      scaleOperatorId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleAmount' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleAmount() {
      return scaleAmount;
    }


    /**
      * Sets the value of the 'scaleAmount' field.
      * @param value The value of 'scaleAmount'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleAmount(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.scaleAmount = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleAmount' field has been set.
      * @return True if the 'scaleAmount' field has been set, false otherwise.
      */
    public boolean hasScaleAmount() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'scaleAmount' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleAmount() {
      scaleAmount = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'scaleTicketType' field.
      * @return The value.
      */
    public java.lang.CharSequence getScaleTicketType() {
      return scaleTicketType;
    }


    /**
      * Sets the value of the 'scaleTicketType' field.
      * @param value The value of 'scaleTicketType'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder setScaleTicketType(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.scaleTicketType = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'scaleTicketType' field has been set.
      * @return True if the 'scaleTicketType' field has been set, false otherwise.
      */
    public boolean hasScaleTicketType() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'scaleTicketType' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ScaleRecord.Builder clearScaleTicketType() {
      scaleTicketType = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ScaleRecord build() {
      try {
        ScaleRecord record = new ScaleRecord();
        record.lineNumberScale = fieldSetFlags()[0] ? this.lineNumberScale : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.scaleDate = fieldSetFlags()[1] ? this.scaleDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.scaleHour = fieldSetFlags()[2] ? this.scaleHour : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.scaleId = fieldSetFlags()[3] ? this.scaleId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.groupId = fieldSetFlags()[4] ? this.groupId : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.scaleTicketId = fieldSetFlags()[5] ? this.scaleTicketId : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.scaleOperatorId = fieldSetFlags()[6] ? this.scaleOperatorId : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.scaleAmount = fieldSetFlags()[7] ? this.scaleAmount : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.scaleTicketType = fieldSetFlags()[8] ? this.scaleTicketType : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ScaleRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<ScaleRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ScaleRecord>
    READER$ = (org.apache.avro.io.DatumReader<ScaleRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.lineNumberScale);

    out.writeString(this.scaleDate);

    out.writeString(this.scaleHour);

    out.writeString(this.scaleId);

    out.writeString(this.groupId);

    out.writeString(this.scaleTicketId);

    out.writeString(this.scaleOperatorId);

    out.writeString(this.scaleAmount);

    out.writeString(this.scaleTicketType);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.lineNumberScale = in.readString(this.lineNumberScale instanceof Utf8 ? (Utf8)this.lineNumberScale : null);

      this.scaleDate = in.readString(this.scaleDate instanceof Utf8 ? (Utf8)this.scaleDate : null);

      this.scaleHour = in.readString(this.scaleHour instanceof Utf8 ? (Utf8)this.scaleHour : null);

      this.scaleId = in.readString(this.scaleId instanceof Utf8 ? (Utf8)this.scaleId : null);

      this.groupId = in.readString(this.groupId instanceof Utf8 ? (Utf8)this.groupId : null);

      this.scaleTicketId = in.readString(this.scaleTicketId instanceof Utf8 ? (Utf8)this.scaleTicketId : null);

      this.scaleOperatorId = in.readString(this.scaleOperatorId instanceof Utf8 ? (Utf8)this.scaleOperatorId : null);

      this.scaleAmount = in.readString(this.scaleAmount instanceof Utf8 ? (Utf8)this.scaleAmount : null);

      this.scaleTicketType = in.readString(this.scaleTicketType instanceof Utf8 ? (Utf8)this.scaleTicketType : null);

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.lineNumberScale = in.readString(this.lineNumberScale instanceof Utf8 ? (Utf8)this.lineNumberScale : null);
          break;

        case 1:
          this.scaleDate = in.readString(this.scaleDate instanceof Utf8 ? (Utf8)this.scaleDate : null);
          break;

        case 2:
          this.scaleHour = in.readString(this.scaleHour instanceof Utf8 ? (Utf8)this.scaleHour : null);
          break;

        case 3:
          this.scaleId = in.readString(this.scaleId instanceof Utf8 ? (Utf8)this.scaleId : null);
          break;

        case 4:
          this.groupId = in.readString(this.groupId instanceof Utf8 ? (Utf8)this.groupId : null);
          break;

        case 5:
          this.scaleTicketId = in.readString(this.scaleTicketId instanceof Utf8 ? (Utf8)this.scaleTicketId : null);
          break;

        case 6:
          this.scaleOperatorId = in.readString(this.scaleOperatorId instanceof Utf8 ? (Utf8)this.scaleOperatorId : null);
          break;

        case 7:
          this.scaleAmount = in.readString(this.scaleAmount instanceof Utf8 ? (Utf8)this.scaleAmount : null);
          break;

        case 8:
          this.scaleTicketType = in.readString(this.scaleTicketType instanceof Utf8 ? (Utf8)this.scaleTicketType : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









