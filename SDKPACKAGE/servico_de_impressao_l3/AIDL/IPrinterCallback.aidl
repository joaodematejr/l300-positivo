// IPrinterCallback.aidl
package com.xcheng.printerservice;

// Declare any non-default types here with import statements

interface IPrinterCallback {
  oneway void onException(int code, String msg);
  oneway void onLength(long current, long total);
  oneway void onRealLength(double realCurrent, double realTotal);
  oneway void onComplete();
}
