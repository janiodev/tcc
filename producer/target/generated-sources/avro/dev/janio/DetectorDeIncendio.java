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

/** Contem os dados que podem ser capturados por um dos detectores de incendio. */
@org.apache.avro.specific.AvroGenerated
public class DetectorDeIncendio extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6605559907937887341L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DetectorDeIncendio\",\"namespace\":\"dev.janio\",\"doc\":\"Contem os dados que podem ser capturados por um dos detectores de incendio.\",\"fields\":[{\"name\":\"dht11\",\"type\":{\"type\":\"record\",\"name\":\"SensorDht11\",\"fields\":[{\"name\":\"umidade\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 20% a 90% RH | Acurácia: +/- 5% RH | Escala: 1% RH\",\"default\":null},{\"name\":\"temperatura\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 0 a 50 °C | Acurácia: +/- 2 °C | Escala: 1 °C\",\"default\":null}]},\"doc\":\"Sensor de umidade e temperatura | Frequência das medições: 6 segundos\",\"default\":{}},{\"name\":\"dht22\",\"type\":{\"type\":\"record\",\"name\":\"SensorDht22\",\"fields\":[{\"name\":\"umidade\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 0% a 100% RH | Acurácia: +/- 5% RH | Escala: 0,1% RH\",\"default\":null},{\"name\":\"temperatura\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: -40 a 80 °C | Acurácia: +/- 0,5 °C | Escala: 0,1 °C\",\"default\":null}]},\"doc\":\"Sensor de umidade e temperatura | Frequência das medições: 2 segundos\",\"default\":{}},{\"name\":\"flame01\",\"type\":{\"type\":\"record\",\"name\":\"SensorFlame01\",\"fields\":[{\"name\":\"espectroDeLuz\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 760 nm a 1100 nm | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null},{\"name\":\"temperatura\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: -25 °C a 85 °C | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null}]},\"doc\":\"Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida\",\"default\":{}},{\"name\":\"mq2\",\"type\":{\"type\":\"record\",\"name\":\"SensorMq2\",\"fields\":[{\"name\":\"gasCombustivel\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 300 a 10.000 ppm | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null}]},\"doc\":\"Detector de gases combustíveis e fumaça\",\"default\":{}},{\"name\":\"mq9\",\"type\":{\"type\":\"record\",\"name\":\"SensorMq9\",\"fields\":[{\"name\":\"gasCombustivel\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 100 a 10.000 ppm | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null},{\"name\":\"co2\",\"type\":[\"null\",\"int\"],\"doc\":\"Faixa de medição: 10 a 1.000 ppm | Acurácia: desconhecida | Escala: desconhecida\",\"default\":null}]},\"doc\":\"Detectar gases combustíveis e CO\",\"default\":{}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DetectorDeIncendio> ENCODER =
      new BinaryMessageEncoder<DetectorDeIncendio>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DetectorDeIncendio> DECODER =
      new BinaryMessageDecoder<DetectorDeIncendio>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DetectorDeIncendio> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DetectorDeIncendio> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DetectorDeIncendio> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DetectorDeIncendio>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DetectorDeIncendio to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DetectorDeIncendio from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DetectorDeIncendio instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DetectorDeIncendio fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Sensor de umidade e temperatura | Frequência das medições: 6 segundos */
   private dev.janio.SensorDht11 dht11;
  /** Sensor de umidade e temperatura | Frequência das medições: 2 segundos */
   private dev.janio.SensorDht22 dht22;
  /** Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida */
   private dev.janio.SensorFlame01 flame01;
  /** Detector de gases combustíveis e fumaça */
   private dev.janio.SensorMq2 mq2;
  /** Detectar gases combustíveis e CO */
   private dev.janio.SensorMq9 mq9;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DetectorDeIncendio() {}

  /**
   * All-args constructor.
   * @param dht11 Sensor de umidade e temperatura | Frequência das medições: 6 segundos
   * @param dht22 Sensor de umidade e temperatura | Frequência das medições: 2 segundos
   * @param flame01 Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
   * @param mq2 Detector de gases combustíveis e fumaça
   * @param mq9 Detectar gases combustíveis e CO
   */
  public DetectorDeIncendio(dev.janio.SensorDht11 dht11, dev.janio.SensorDht22 dht22, dev.janio.SensorFlame01 flame01, dev.janio.SensorMq2 mq2, dev.janio.SensorMq9 mq9) {
    this.dht11 = dht11;
    this.dht22 = dht22;
    this.flame01 = flame01;
    this.mq2 = mq2;
    this.mq9 = mq9;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dht11;
    case 1: return dht22;
    case 2: return flame01;
    case 3: return mq2;
    case 4: return mq9;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dht11 = (dev.janio.SensorDht11)value$; break;
    case 1: dht22 = (dev.janio.SensorDht22)value$; break;
    case 2: flame01 = (dev.janio.SensorFlame01)value$; break;
    case 3: mq2 = (dev.janio.SensorMq2)value$; break;
    case 4: mq9 = (dev.janio.SensorMq9)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'dht11' field.
   * @return Sensor de umidade e temperatura | Frequência das medições: 6 segundos
   */
  public dev.janio.SensorDht11 getDht11() {
    return dht11;
  }



  /**
   * Gets the value of the 'dht22' field.
   * @return Sensor de umidade e temperatura | Frequência das medições: 2 segundos
   */
  public dev.janio.SensorDht22 getDht22() {
    return dht22;
  }



  /**
   * Gets the value of the 'flame01' field.
   * @return Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
   */
  public dev.janio.SensorFlame01 getFlame01() {
    return flame01;
  }



  /**
   * Gets the value of the 'mq2' field.
   * @return Detector de gases combustíveis e fumaça
   */
  public dev.janio.SensorMq2 getMq2() {
    return mq2;
  }



  /**
   * Gets the value of the 'mq9' field.
   * @return Detectar gases combustíveis e CO
   */
  public dev.janio.SensorMq9 getMq9() {
    return mq9;
  }



  /**
   * Creates a new DetectorDeIncendio RecordBuilder.
   * @return A new DetectorDeIncendio RecordBuilder
   */
  public static dev.janio.DetectorDeIncendio.Builder newBuilder() {
    return new dev.janio.DetectorDeIncendio.Builder();
  }

  /**
   * Creates a new DetectorDeIncendio RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DetectorDeIncendio RecordBuilder
   */
  public static dev.janio.DetectorDeIncendio.Builder newBuilder(dev.janio.DetectorDeIncendio.Builder other) {
    if (other == null) {
      return new dev.janio.DetectorDeIncendio.Builder();
    } else {
      return new dev.janio.DetectorDeIncendio.Builder(other);
    }
  }

  /**
   * Creates a new DetectorDeIncendio RecordBuilder by copying an existing DetectorDeIncendio instance.
   * @param other The existing instance to copy.
   * @return A new DetectorDeIncendio RecordBuilder
   */
  public static dev.janio.DetectorDeIncendio.Builder newBuilder(dev.janio.DetectorDeIncendio other) {
    if (other == null) {
      return new dev.janio.DetectorDeIncendio.Builder();
    } else {
      return new dev.janio.DetectorDeIncendio.Builder(other);
    }
  }

  /**
   * RecordBuilder for DetectorDeIncendio instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DetectorDeIncendio>
    implements org.apache.avro.data.RecordBuilder<DetectorDeIncendio> {

    /** Sensor de umidade e temperatura | Frequência das medições: 6 segundos */
    private dev.janio.SensorDht11 dht11;
    private dev.janio.SensorDht11.Builder dht11Builder;
    /** Sensor de umidade e temperatura | Frequência das medições: 2 segundos */
    private dev.janio.SensorDht22 dht22;
    private dev.janio.SensorDht22.Builder dht22Builder;
    /** Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida */
    private dev.janio.SensorFlame01 flame01;
    private dev.janio.SensorFlame01.Builder flame01Builder;
    /** Detector de gases combustíveis e fumaça */
    private dev.janio.SensorMq2 mq2;
    private dev.janio.SensorMq2.Builder mq2Builder;
    /** Detectar gases combustíveis e CO */
    private dev.janio.SensorMq9 mq9;
    private dev.janio.SensorMq9.Builder mq9Builder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(dev.janio.DetectorDeIncendio.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dht11)) {
        this.dht11 = data().deepCopy(fields()[0].schema(), other.dht11);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasDht11Builder()) {
        this.dht11Builder = dev.janio.SensorDht11.newBuilder(other.getDht11Builder());
      }
      if (isValidValue(fields()[1], other.dht22)) {
        this.dht22 = data().deepCopy(fields()[1].schema(), other.dht22);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasDht22Builder()) {
        this.dht22Builder = dev.janio.SensorDht22.newBuilder(other.getDht22Builder());
      }
      if (isValidValue(fields()[2], other.flame01)) {
        this.flame01 = data().deepCopy(fields()[2].schema(), other.flame01);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasFlame01Builder()) {
        this.flame01Builder = dev.janio.SensorFlame01.newBuilder(other.getFlame01Builder());
      }
      if (isValidValue(fields()[3], other.mq2)) {
        this.mq2 = data().deepCopy(fields()[3].schema(), other.mq2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasMq2Builder()) {
        this.mq2Builder = dev.janio.SensorMq2.newBuilder(other.getMq2Builder());
      }
      if (isValidValue(fields()[4], other.mq9)) {
        this.mq9 = data().deepCopy(fields()[4].schema(), other.mq9);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasMq9Builder()) {
        this.mq9Builder = dev.janio.SensorMq9.newBuilder(other.getMq9Builder());
      }
    }

    /**
     * Creates a Builder by copying an existing DetectorDeIncendio instance
     * @param other The existing instance to copy.
     */
    private Builder(dev.janio.DetectorDeIncendio other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.dht11)) {
        this.dht11 = data().deepCopy(fields()[0].schema(), other.dht11);
        fieldSetFlags()[0] = true;
      }
      this.dht11Builder = null;
      if (isValidValue(fields()[1], other.dht22)) {
        this.dht22 = data().deepCopy(fields()[1].schema(), other.dht22);
        fieldSetFlags()[1] = true;
      }
      this.dht22Builder = null;
      if (isValidValue(fields()[2], other.flame01)) {
        this.flame01 = data().deepCopy(fields()[2].schema(), other.flame01);
        fieldSetFlags()[2] = true;
      }
      this.flame01Builder = null;
      if (isValidValue(fields()[3], other.mq2)) {
        this.mq2 = data().deepCopy(fields()[3].schema(), other.mq2);
        fieldSetFlags()[3] = true;
      }
      this.mq2Builder = null;
      if (isValidValue(fields()[4], other.mq9)) {
        this.mq9 = data().deepCopy(fields()[4].schema(), other.mq9);
        fieldSetFlags()[4] = true;
      }
      this.mq9Builder = null;
    }

    /**
      * Gets the value of the 'dht11' field.
      * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
      * @return The value.
      */
    public dev.janio.SensorDht11 getDht11() {
      return dht11;
    }


    /**
      * Sets the value of the 'dht11' field.
      * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
      * @param value The value of 'dht11'.
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder setDht11(dev.janio.SensorDht11 value) {
      validate(fields()[0], value);
      this.dht11Builder = null;
      this.dht11 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dht11' field has been set.
      * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
      * @return True if the 'dht11' field has been set, false otherwise.
      */
    public boolean hasDht11() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'dht11' field and creates one if it doesn't exist yet.
     * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
     * @return This builder.
     */
    public dev.janio.SensorDht11.Builder getDht11Builder() {
      if (dht11Builder == null) {
        if (hasDht11()) {
          setDht11Builder(dev.janio.SensorDht11.newBuilder(dht11));
        } else {
          setDht11Builder(dev.janio.SensorDht11.newBuilder());
        }
      }
      return dht11Builder;
    }

    /**
     * Sets the Builder instance for the 'dht11' field
     * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public dev.janio.DetectorDeIncendio.Builder setDht11Builder(dev.janio.SensorDht11.Builder value) {
      clearDht11();
      dht11Builder = value;
      return this;
    }

    /**
     * Checks whether the 'dht11' field has an active Builder instance
     * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
     * @return True if the 'dht11' field has an active Builder instance
     */
    public boolean hasDht11Builder() {
      return dht11Builder != null;
    }

    /**
      * Clears the value of the 'dht11' field.
      * Sensor de umidade e temperatura | Frequência das medições: 6 segundos
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder clearDht11() {
      dht11 = null;
      dht11Builder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'dht22' field.
      * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
      * @return The value.
      */
    public dev.janio.SensorDht22 getDht22() {
      return dht22;
    }


    /**
      * Sets the value of the 'dht22' field.
      * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
      * @param value The value of 'dht22'.
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder setDht22(dev.janio.SensorDht22 value) {
      validate(fields()[1], value);
      this.dht22Builder = null;
      this.dht22 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'dht22' field has been set.
      * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
      * @return True if the 'dht22' field has been set, false otherwise.
      */
    public boolean hasDht22() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'dht22' field and creates one if it doesn't exist yet.
     * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
     * @return This builder.
     */
    public dev.janio.SensorDht22.Builder getDht22Builder() {
      if (dht22Builder == null) {
        if (hasDht22()) {
          setDht22Builder(dev.janio.SensorDht22.newBuilder(dht22));
        } else {
          setDht22Builder(dev.janio.SensorDht22.newBuilder());
        }
      }
      return dht22Builder;
    }

    /**
     * Sets the Builder instance for the 'dht22' field
     * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public dev.janio.DetectorDeIncendio.Builder setDht22Builder(dev.janio.SensorDht22.Builder value) {
      clearDht22();
      dht22Builder = value;
      return this;
    }

    /**
     * Checks whether the 'dht22' field has an active Builder instance
     * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
     * @return True if the 'dht22' field has an active Builder instance
     */
    public boolean hasDht22Builder() {
      return dht22Builder != null;
    }

    /**
      * Clears the value of the 'dht22' field.
      * Sensor de umidade e temperatura | Frequência das medições: 2 segundos
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder clearDht22() {
      dht22 = null;
      dht22Builder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'flame01' field.
      * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
      * @return The value.
      */
    public dev.janio.SensorFlame01 getFlame01() {
      return flame01;
    }


    /**
      * Sets the value of the 'flame01' field.
      * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
      * @param value The value of 'flame01'.
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder setFlame01(dev.janio.SensorFlame01 value) {
      validate(fields()[2], value);
      this.flame01Builder = null;
      this.flame01 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'flame01' field has been set.
      * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
      * @return True if the 'flame01' field has been set, false otherwise.
      */
    public boolean hasFlame01() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'flame01' field and creates one if it doesn't exist yet.
     * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
     * @return This builder.
     */
    public dev.janio.SensorFlame01.Builder getFlame01Builder() {
      if (flame01Builder == null) {
        if (hasFlame01()) {
          setFlame01Builder(dev.janio.SensorFlame01.newBuilder(flame01));
        } else {
          setFlame01Builder(dev.janio.SensorFlame01.newBuilder());
        }
      }
      return flame01Builder;
    }

    /**
     * Sets the Builder instance for the 'flame01' field
     * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public dev.janio.DetectorDeIncendio.Builder setFlame01Builder(dev.janio.SensorFlame01.Builder value) {
      clearFlame01();
      flame01Builder = value;
      return this;
    }

    /**
     * Checks whether the 'flame01' field has an active Builder instance
     * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
     * @return True if the 'flame01' field has an active Builder instance
     */
    public boolean hasFlame01Builder() {
      return flame01Builder != null;
    }

    /**
      * Clears the value of the 'flame01' field.
      * Detector de variações no comprimento de onda de luz | Frequência de medições: desconhecida
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder clearFlame01() {
      flame01 = null;
      flame01Builder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'mq2' field.
      * Detector de gases combustíveis e fumaça
      * @return The value.
      */
    public dev.janio.SensorMq2 getMq2() {
      return mq2;
    }


    /**
      * Sets the value of the 'mq2' field.
      * Detector de gases combustíveis e fumaça
      * @param value The value of 'mq2'.
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder setMq2(dev.janio.SensorMq2 value) {
      validate(fields()[3], value);
      this.mq2Builder = null;
      this.mq2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'mq2' field has been set.
      * Detector de gases combustíveis e fumaça
      * @return True if the 'mq2' field has been set, false otherwise.
      */
    public boolean hasMq2() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'mq2' field and creates one if it doesn't exist yet.
     * Detector de gases combustíveis e fumaça
     * @return This builder.
     */
    public dev.janio.SensorMq2.Builder getMq2Builder() {
      if (mq2Builder == null) {
        if (hasMq2()) {
          setMq2Builder(dev.janio.SensorMq2.newBuilder(mq2));
        } else {
          setMq2Builder(dev.janio.SensorMq2.newBuilder());
        }
      }
      return mq2Builder;
    }

    /**
     * Sets the Builder instance for the 'mq2' field
     * Detector de gases combustíveis e fumaça
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public dev.janio.DetectorDeIncendio.Builder setMq2Builder(dev.janio.SensorMq2.Builder value) {
      clearMq2();
      mq2Builder = value;
      return this;
    }

    /**
     * Checks whether the 'mq2' field has an active Builder instance
     * Detector de gases combustíveis e fumaça
     * @return True if the 'mq2' field has an active Builder instance
     */
    public boolean hasMq2Builder() {
      return mq2Builder != null;
    }

    /**
      * Clears the value of the 'mq2' field.
      * Detector de gases combustíveis e fumaça
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder clearMq2() {
      mq2 = null;
      mq2Builder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'mq9' field.
      * Detectar gases combustíveis e CO
      * @return The value.
      */
    public dev.janio.SensorMq9 getMq9() {
      return mq9;
    }


    /**
      * Sets the value of the 'mq9' field.
      * Detectar gases combustíveis e CO
      * @param value The value of 'mq9'.
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder setMq9(dev.janio.SensorMq9 value) {
      validate(fields()[4], value);
      this.mq9Builder = null;
      this.mq9 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'mq9' field has been set.
      * Detectar gases combustíveis e CO
      * @return True if the 'mq9' field has been set, false otherwise.
      */
    public boolean hasMq9() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'mq9' field and creates one if it doesn't exist yet.
     * Detectar gases combustíveis e CO
     * @return This builder.
     */
    public dev.janio.SensorMq9.Builder getMq9Builder() {
      if (mq9Builder == null) {
        if (hasMq9()) {
          setMq9Builder(dev.janio.SensorMq9.newBuilder(mq9));
        } else {
          setMq9Builder(dev.janio.SensorMq9.newBuilder());
        }
      }
      return mq9Builder;
    }

    /**
     * Sets the Builder instance for the 'mq9' field
     * Detectar gases combustíveis e CO
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public dev.janio.DetectorDeIncendio.Builder setMq9Builder(dev.janio.SensorMq9.Builder value) {
      clearMq9();
      mq9Builder = value;
      return this;
    }

    /**
     * Checks whether the 'mq9' field has an active Builder instance
     * Detectar gases combustíveis e CO
     * @return True if the 'mq9' field has an active Builder instance
     */
    public boolean hasMq9Builder() {
      return mq9Builder != null;
    }

    /**
      * Clears the value of the 'mq9' field.
      * Detectar gases combustíveis e CO
      * @return This builder.
      */
    public dev.janio.DetectorDeIncendio.Builder clearMq9() {
      mq9 = null;
      mq9Builder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DetectorDeIncendio build() {
      try {
        DetectorDeIncendio record = new DetectorDeIncendio();
        if (dht11Builder != null) {
          try {
            record.dht11 = this.dht11Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("dht11"));
            throw e;
          }
        } else {
          record.dht11 = fieldSetFlags()[0] ? this.dht11 : (dev.janio.SensorDht11) defaultValue(fields()[0]);
        }
        if (dht22Builder != null) {
          try {
            record.dht22 = this.dht22Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("dht22"));
            throw e;
          }
        } else {
          record.dht22 = fieldSetFlags()[1] ? this.dht22 : (dev.janio.SensorDht22) defaultValue(fields()[1]);
        }
        if (flame01Builder != null) {
          try {
            record.flame01 = this.flame01Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("flame01"));
            throw e;
          }
        } else {
          record.flame01 = fieldSetFlags()[2] ? this.flame01 : (dev.janio.SensorFlame01) defaultValue(fields()[2]);
        }
        if (mq2Builder != null) {
          try {
            record.mq2 = this.mq2Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("mq2"));
            throw e;
          }
        } else {
          record.mq2 = fieldSetFlags()[3] ? this.mq2 : (dev.janio.SensorMq2) defaultValue(fields()[3]);
        }
        if (mq9Builder != null) {
          try {
            record.mq9 = this.mq9Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("mq9"));
            throw e;
          }
        } else {
          record.mq9 = fieldSetFlags()[4] ? this.mq9 : (dev.janio.SensorMq9) defaultValue(fields()[4]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DetectorDeIncendio>
    WRITER$ = (org.apache.avro.io.DatumWriter<DetectorDeIncendio>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DetectorDeIncendio>
    READER$ = (org.apache.avro.io.DatumReader<DetectorDeIncendio>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.dht11.customEncode(out);

    this.dht22.customEncode(out);

    this.flame01.customEncode(out);

    this.mq2.customEncode(out);

    this.mq9.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.dht11 == null) {
        this.dht11 = new dev.janio.SensorDht11();
      }
      this.dht11.customDecode(in);

      if (this.dht22 == null) {
        this.dht22 = new dev.janio.SensorDht22();
      }
      this.dht22.customDecode(in);

      if (this.flame01 == null) {
        this.flame01 = new dev.janio.SensorFlame01();
      }
      this.flame01.customDecode(in);

      if (this.mq2 == null) {
        this.mq2 = new dev.janio.SensorMq2();
      }
      this.mq2.customDecode(in);

      if (this.mq9 == null) {
        this.mq9 = new dev.janio.SensorMq9();
      }
      this.mq9.customDecode(in);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.dht11 == null) {
            this.dht11 = new dev.janio.SensorDht11();
          }
          this.dht11.customDecode(in);
          break;

        case 1:
          if (this.dht22 == null) {
            this.dht22 = new dev.janio.SensorDht22();
          }
          this.dht22.customDecode(in);
          break;

        case 2:
          if (this.flame01 == null) {
            this.flame01 = new dev.janio.SensorFlame01();
          }
          this.flame01.customDecode(in);
          break;

        case 3:
          if (this.mq2 == null) {
            this.mq2 = new dev.janio.SensorMq2();
          }
          this.mq2.customDecode(in);
          break;

        case 4:
          if (this.mq9 == null) {
            this.mq9 = new dev.janio.SensorMq9();
          }
          this.mq9.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










