// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/tco/tco.proto

package org.yamcs.protobuf;

public interface TcoStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.tco.TcoStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Currently used coefficients.
   * If not present, the synchronization is not established
   * </pre>
   *
   * <code>optional .yamcs.protobuf.tco.TcoCoefficients coefficients = 1;</code>
   * @return Whether the coefficients field is set.
   */
  boolean hasCoefficients();
  /**
   * <pre>
   *Currently used coefficients.
   * If not present, the synchronization is not established
   * </pre>
   *
   * <code>optional .yamcs.protobuf.tco.TcoCoefficients coefficients = 1;</code>
   * @return The coefficients.
   */
  org.yamcs.protobuf.TcoCoefficients getCoefficients();
  /**
   * <pre>
   *Currently used coefficients.
   * If not present, the synchronization is not established
   * </pre>
   *
   * <code>optional .yamcs.protobuf.tco.TcoCoefficients coefficients = 1;</code>
   */
  org.yamcs.protobuf.TcoCoefficientsOrBuilder getCoefficientsOrBuilder();

  /**
   * <pre>
   *The time when the coefficients have been computed
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp coefficientsTime = 2;</code>
   * @return Whether the coefficientsTime field is set.
   */
  boolean hasCoefficientsTime();
  /**
   * <pre>
   *The time when the coefficients have been computed
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp coefficientsTime = 2;</code>
   * @return The coefficientsTime.
   */
  com.google.protobuf.Timestamp getCoefficientsTime();
  /**
   * <pre>
   *The time when the coefficients have been computed
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp coefficientsTime = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCoefficientsTimeOrBuilder();

  /**
   * <pre>
   *The last computed deviation
   * </pre>
   *
   * <code>optional double deviation = 3;</code>
   * @return Whether the deviation field is set.
   */
  boolean hasDeviation();
  /**
   * <pre>
   *The last computed deviation
   * </pre>
   *
   * <code>optional double deviation = 3;</code>
   * @return The deviation.
   */
  double getDeviation();

  /**
   * <pre>
   *The last accumulated samples
   *These are not necessary those from which the coefficients 
   *have been calculated because the coefficients will only 
   *be recalculated when the deviation is higher than the accuracy settings
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TcoSample samples = 4;</code>
   */
  java.util.List<org.yamcs.protobuf.TcoSample> 
      getSamplesList();
  /**
   * <pre>
   *The last accumulated samples
   *These are not necessary those from which the coefficients 
   *have been calculated because the coefficients will only 
   *be recalculated when the deviation is higher than the accuracy settings
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TcoSample samples = 4;</code>
   */
  org.yamcs.protobuf.TcoSample getSamples(int index);
  /**
   * <pre>
   *The last accumulated samples
   *These are not necessary those from which the coefficients 
   *have been calculated because the coefficients will only 
   *be recalculated when the deviation is higher than the accuracy settings
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TcoSample samples = 4;</code>
   */
  int getSamplesCount();
  /**
   * <pre>
   *The last accumulated samples
   *These are not necessary those from which the coefficients 
   *have been calculated because the coefficients will only 
   *be recalculated when the deviation is higher than the accuracy settings
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TcoSample samples = 4;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.TcoSampleOrBuilder> 
      getSamplesOrBuilderList();
  /**
   * <pre>
   *The last accumulated samples
   *These are not necessary those from which the coefficients 
   *have been calculated because the coefficients will only 
   *be recalculated when the deviation is higher than the accuracy settings
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.tco.TcoSample samples = 4;</code>
   */
  org.yamcs.protobuf.TcoSampleOrBuilder getSamplesOrBuilder(
      int index);
}
