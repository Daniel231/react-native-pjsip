/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCallReplaceRequestParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallReplaceRequestParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallReplaceRequestParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnCallReplaceRequestParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRdata(SipRxData value) {
    pjsua2JNI.OnCallReplaceRequestParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnCallReplaceRequestParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  public void setStatusCode(pjsip_status_code value) {
    pjsua2JNI.OnCallReplaceRequestParam_statusCode_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_status_code getStatusCode() {
    return pjsip_status_code.swigToEnum(pjsua2JNI.OnCallReplaceRequestParam_statusCode_get(swigCPtr, this));
  }

  public void setReason(String value) {
    pjsua2JNI.OnCallReplaceRequestParam_reason_set(swigCPtr, this, value);
  }

  public String getReason() {
    return pjsua2JNI.OnCallReplaceRequestParam_reason_get(swigCPtr, this);
  }

  public void setOpt(CallSetting value) {
    pjsua2JNI.OnCallReplaceRequestParam_opt_set(swigCPtr, this, CallSetting.getCPtr(value), value);
  }

  public CallSetting getOpt() {
    long cPtr = pjsua2JNI.OnCallReplaceRequestParam_opt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CallSetting(cPtr, false);
  }

  public OnCallReplaceRequestParam() {
    this(pjsua2JNI.new_OnCallReplaceRequestParam(), true);
  }

}
