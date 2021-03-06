/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.github.ogomezso.springkafka.infrastructure.model.ticket;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PaymentMethodbankTransfer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1657367495893425495L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentMethodbankTransfer\",\"namespace\":\"org.github.ogomezso.springkafka.infrastructure.model.ticket\",\"fields\":[{\"name\":\"transferPayment\",\"type\":{\"type\":\"record\",\"name\":\"TransferPayment\",\"fields\":[{\"name\":\"paymentMethodId\",\"type\":\"string\"},{\"name\":\"paymentMethodAmount\",\"type\":\"string\"}]}},{\"name\":\"authorizedNif\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PaymentMethodbankTransfer> ENCODER =
      new BinaryMessageEncoder<PaymentMethodbankTransfer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PaymentMethodbankTransfer> DECODER =
      new BinaryMessageDecoder<PaymentMethodbankTransfer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PaymentMethodbankTransfer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PaymentMethodbankTransfer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PaymentMethodbankTransfer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PaymentMethodbankTransfer>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PaymentMethodbankTransfer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PaymentMethodbankTransfer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PaymentMethodbankTransfer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PaymentMethodbankTransfer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment transferPayment;
  private java.lang.CharSequence authorizedNif;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentMethodbankTransfer() {}

  /**
   * All-args constructor.
   * @param transferPayment The new value for transferPayment
   * @param authorizedNif The new value for authorizedNif
   */
  public PaymentMethodbankTransfer(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment transferPayment, java.lang.CharSequence authorizedNif) {
    this.transferPayment = transferPayment;
    this.authorizedNif = authorizedNif;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return transferPayment;
    case 1: return authorizedNif;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: transferPayment = (org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment)value$; break;
    case 1: authorizedNif = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'transferPayment' field.
   * @return The value of the 'transferPayment' field.
   */
  public org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment getTransferPayment() {
    return transferPayment;
  }


  /**
   * Sets the value of the 'transferPayment' field.
   * @param value the value to set.
   */
  public void setTransferPayment(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment value) {
    this.transferPayment = value;
  }

  /**
   * Gets the value of the 'authorizedNif' field.
   * @return The value of the 'authorizedNif' field.
   */
  public java.lang.CharSequence getAuthorizedNif() {
    return authorizedNif;
  }


  /**
   * Sets the value of the 'authorizedNif' field.
   * @param value the value to set.
   */
  public void setAuthorizedNif(java.lang.CharSequence value) {
    this.authorizedNif = value;
  }

  /**
   * Creates a new PaymentMethodbankTransfer RecordBuilder.
   * @return A new PaymentMethodbankTransfer RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder newBuilder() {
    return new org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder();
  }

  /**
   * Creates a new PaymentMethodbankTransfer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentMethodbankTransfer RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder newBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder other) {
    if (other == null) {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder();
    } else {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder(other);
    }
  }

  /**
   * Creates a new PaymentMethodbankTransfer RecordBuilder by copying an existing PaymentMethodbankTransfer instance.
   * @param other The existing instance to copy.
   * @return A new PaymentMethodbankTransfer RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder newBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer other) {
    if (other == null) {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder();
    } else {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder(other);
    }
  }

  /**
   * RecordBuilder for PaymentMethodbankTransfer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentMethodbankTransfer>
    implements org.apache.avro.data.RecordBuilder<PaymentMethodbankTransfer> {

    private org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment transferPayment;
    private org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.Builder transferPaymentBuilder;
    private java.lang.CharSequence authorizedNif;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.transferPayment)) {
        this.transferPayment = data().deepCopy(fields()[0].schema(), other.transferPayment);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasTransferPaymentBuilder()) {
        this.transferPaymentBuilder = org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.newBuilder(other.getTransferPaymentBuilder());
      }
      if (isValidValue(fields()[1], other.authorizedNif)) {
        this.authorizedNif = data().deepCopy(fields()[1].schema(), other.authorizedNif);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentMethodbankTransfer instance
     * @param other The existing instance to copy.
     */
    private Builder(org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.transferPayment)) {
        this.transferPayment = data().deepCopy(fields()[0].schema(), other.transferPayment);
        fieldSetFlags()[0] = true;
      }
      this.transferPaymentBuilder = null;
      if (isValidValue(fields()[1], other.authorizedNif)) {
        this.authorizedNif = data().deepCopy(fields()[1].schema(), other.authorizedNif);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'transferPayment' field.
      * @return The value.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment getTransferPayment() {
      return transferPayment;
    }


    /**
      * Sets the value of the 'transferPayment' field.
      * @param value The value of 'transferPayment'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder setTransferPayment(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment value) {
      validate(fields()[0], value);
      this.transferPaymentBuilder = null;
      this.transferPayment = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'transferPayment' field has been set.
      * @return True if the 'transferPayment' field has been set, false otherwise.
      */
    public boolean hasTransferPayment() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'transferPayment' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.Builder getTransferPaymentBuilder() {
      if (transferPaymentBuilder == null) {
        if (hasTransferPayment()) {
          setTransferPaymentBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.newBuilder(transferPayment));
        } else {
          setTransferPaymentBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.newBuilder());
        }
      }
      return transferPaymentBuilder;
    }

    /**
     * Sets the Builder instance for the 'transferPayment' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder setTransferPaymentBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment.Builder value) {
      clearTransferPayment();
      transferPaymentBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'transferPayment' field has an active Builder instance
     * @return True if the 'transferPayment' field has an active Builder instance
     */
    public boolean hasTransferPaymentBuilder() {
      return transferPaymentBuilder != null;
    }

    /**
      * Clears the value of the 'transferPayment' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder clearTransferPayment() {
      transferPayment = null;
      transferPaymentBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'authorizedNif' field.
      * @return The value.
      */
    public java.lang.CharSequence getAuthorizedNif() {
      return authorizedNif;
    }


    /**
      * Sets the value of the 'authorizedNif' field.
      * @param value The value of 'authorizedNif'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder setAuthorizedNif(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.authorizedNif = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'authorizedNif' field has been set.
      * @return True if the 'authorizedNif' field has been set, false otherwise.
      */
    public boolean hasAuthorizedNif() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'authorizedNif' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.PaymentMethodbankTransfer.Builder clearAuthorizedNif() {
      authorizedNif = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PaymentMethodbankTransfer build() {
      try {
        PaymentMethodbankTransfer record = new PaymentMethodbankTransfer();
        if (transferPaymentBuilder != null) {
          try {
            record.transferPayment = this.transferPaymentBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("transferPayment"));
            throw e;
          }
        } else {
          record.transferPayment = fieldSetFlags()[0] ? this.transferPayment : (org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment) defaultValue(fields()[0]);
        }
        record.authorizedNif = fieldSetFlags()[1] ? this.authorizedNif : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PaymentMethodbankTransfer>
    WRITER$ = (org.apache.avro.io.DatumWriter<PaymentMethodbankTransfer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PaymentMethodbankTransfer>
    READER$ = (org.apache.avro.io.DatumReader<PaymentMethodbankTransfer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.transferPayment.customEncode(out);

    out.writeString(this.authorizedNif);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.transferPayment == null) {
        this.transferPayment = new org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment();
      }
      this.transferPayment.customDecode(in);

      this.authorizedNif = in.readString(this.authorizedNif instanceof Utf8 ? (Utf8)this.authorizedNif : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.transferPayment == null) {
            this.transferPayment = new org.github.ogomezso.springkafka.infrastructure.model.ticket.TransferPayment();
          }
          this.transferPayment.customDecode(in);
          break;

        case 1:
          this.authorizedNif = in.readString(this.authorizedNif instanceof Utf8 ? (Utf8)this.authorizedNif : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










