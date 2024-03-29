/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package dev.janio;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SensorFlame01 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -328882156615802832L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SensorFlame01\",\"namespace\":\"dev.janio\",\"fields\":[{\"name\":\"espectroDeLuz\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null},{\"name\":\"temperatura\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SensorFlame01> ENCODER =
      new BinaryMessageEncoder<SensorFlame01>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SensorFlame01> DECODER =
      new BinaryMessageDecoder<SensorFlame01>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SensorFlame01> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SensorFlame01> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SensorFlame01> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SensorFlame01>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SensorFlame01 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SensorFlame01 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SensorFlame01 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SensorFlame01 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida */
   private java.lang.Integer espectroDeLuz;
  /** Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida */
   private java.lang.Integer temperatura;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SensorFlame01() {}

  /**
   * All-args constructor.
   * @param espectroDeLuz Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
   * @param temperatura Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
   */
  public SensorFlame01(java.lang.Integer espectroDeLuz, java.lang.Integer temperatura) {
    this.espectroDeLuz = espectroDeLuz;
    this.temperatura = temperatura;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return espectroDeLuz;
    case 1: return temperatura;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: espectroDeLuz = (java.lang.Integer)value$; break;
    case 1: temperatura = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'espectroDeLuz' field.
   * @return Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
   */
  public java.lang.Integer getEspectroDeLuz() {
    return espectroDeLuz;
  }



  /**
   * Gets the value of the 'temperatura' field.
   * @return Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
   */
  public java.lang.Integer getTemperatura() {
    return temperatura;
  }



  /**
   * Creates a new SensorFlame01 RecordBuilder.
   * @return A new SensorFlame01 RecordBuilder
   */
  public static dev.janio.SensorFlame01.Builder newBuilder() {
    return new dev.janio.SensorFlame01.Builder();
  }

  /**
   * Creates a new SensorFlame01 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SensorFlame01 RecordBuilder
   */
  public static dev.janio.SensorFlame01.Builder newBuilder(dev.janio.SensorFlame01.Builder other) {
    if (other == null) {
      return new dev.janio.SensorFlame01.Builder();
    } else {
      return new dev.janio.SensorFlame01.Builder(other);
    }
  }

  /**
   * Creates a new SensorFlame01 RecordBuilder by copying an existing SensorFlame01 instance.
   * @param other The existing instance to copy.
   * @return A new SensorFlame01 RecordBuilder
   */
  public static dev.janio.SensorFlame01.Builder newBuilder(dev.janio.SensorFlame01 other) {
    if (other == null) {
      return new dev.janio.SensorFlame01.Builder();
    } else {
      return new dev.janio.SensorFlame01.Builder(other);
    }
  }

  /**
   * RecordBuilder for SensorFlame01 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SensorFlame01>
    implements org.apache.avro.data.RecordBuilder<SensorFlame01> {

    /** Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida */
    private java.lang.Integer espectroDeLuz;
    /** Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida */
    private java.lang.Integer temperatura;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(dev.janio.SensorFlame01.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.espectroDeLuz)) {
        this.espectroDeLuz = data().deepCopy(fields()[0].schema(), other.espectroDeLuz);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.temperatura)) {
        this.temperatura = data().deepCopy(fields()[1].schema(), other.temperatura);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SensorFlame01 instance
     * @param other The existing instance to copy.
     */
    private Builder(dev.janio.SensorFlame01 other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.espectroDeLuz)) {
        this.espectroDeLuz = data().deepCopy(fields()[0].schema(), other.espectroDeLuz);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.temperatura)) {
        this.temperatura = data().deepCopy(fields()[1].schema(), other.temperatura);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'espectroDeLuz' field.
      * Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
      * @return The value.
      */
    public java.lang.Integer getEspectroDeLuz() {
      return espectroDeLuz;
    }


    /**
      * Sets the value of the 'espectroDeLuz' field.
      * Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
      * @param value The value of 'espectroDeLuz'.
      * @return This builder.
      */
    public dev.janio.SensorFlame01.Builder setEspectroDeLuz(java.lang.Integer value) {
      validate(fields()[0], value);
      this.espectroDeLuz = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'espectroDeLuz' field has been set.
      * Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
      * @return True if the 'espectroDeLuz' field has been set, false otherwise.
      */
    public boolean hasEspectroDeLuz() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'espectroDeLuz' field.
      * Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida
      * @return This builder.
      */
    public dev.janio.SensorFlame01.Builder clearEspectroDeLuz() {
      espectroDeLuz = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'temperatura' field.
      * Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
      * @return The value.
      */
    public java.lang.Integer getTemperatura() {
      return temperatura;
    }


    /**
      * Sets the value of the 'temperatura' field.
      * Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
      * @param value The value of 'temperatura'.
      * @return This builder.
      */
    public dev.janio.SensorFlame01.Builder setTemperatura(java.lang.Integer value) {
      validate(fields()[1], value);
      this.temperatura = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'temperatura' field has been set.
      * Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
      * @return True if the 'temperatura' field has been set, false otherwise.
      */
    public boolean hasTemperatura() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'temperatura' field.
      * Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida
      * @return This builder.
      */
    public dev.janio.SensorFlame01.Builder clearTemperatura() {
      temperatura = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SensorFlame01 build() {
      try {
        SensorFlame01 record = new SensorFlame01();
        record.espectroDeLuz = fieldSetFlags()[0] ? this.espectroDeLuz : (java.lang.Integer) defaultValue(fields()[0]);
        record.temperatura = fieldSetFlags()[1] ? this.temperatura : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SensorFlame01>
    WRITER$ = (org.apache.avro.io.DatumWriter<SensorFlame01>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SensorFlame01>
    READER$ = (org.apache.avro.io.DatumReader<SensorFlame01>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.espectroDeLuz == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.espectroDeLuz);
    }

    if (this.temperatura == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.temperatura);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.espectroDeLuz = null;
      } else {
        this.espectroDeLuz = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.temperatura = null;
      } else {
        this.temperatura = in.readInt();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.espectroDeLuz = null;
          } else {
            this.espectroDeLuz = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.temperatura = null;
          } else {
            this.temperatura = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










